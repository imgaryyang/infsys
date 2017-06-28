package com.hw;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hw.Dao.UserRepository;
import com.hw.domain.Role;
import com.hw.domain.User;
import com.hw.domain.UserRole;
import com.hw.jwt.*;
import com.hw.security.RestAuthenticationEntryPoint;
import com.hw.security.auth.ajax.AjaxAuthenticationProvider;
import com.hw.security.auth.ajax.AjaxLoginProcessingFilter;
import com.hw.security.auth.jwt.JwtAuthenticationProvider;
import com.hw.security.auth.jwt.JwtTokenAuthenticationProcessingFilter;
import com.hw.security.auth.jwt.SkipPathRequestMatcher;
import com.hw.security.auth.jwt.extractor.TokenExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    public static final String JWT_TOKEN_HEADER_PARAM = "X-Authorization";
    public static final String FORM_BASED_LOGIN_ENTRY_POINT = "/api/auth/login";
    public static final String TOKEN_BASED_AUTH_ENTRY_POINT = "/api/**";
    public static final String TOKEN_REFRESH_ENTRY_POINT = "/api/auth/token";

    @Autowired
    private UserRepository userRepositoy;
    @Autowired private RestAuthenticationEntryPoint authenticationEntryPoint;
    @Autowired private AuthenticationSuccessHandler successHandler;
    @Autowired private AuthenticationFailureHandler failureHandler;
    @Autowired private AjaxAuthenticationProvider ajaxAuthenticationProvider;
   @Autowired private JwtAuthenticationProvider jwtAuthenticationProvider;

    @Autowired private TokenExtractor tokenExtractor;

    @Autowired private AuthenticationManager authenticationManager;
    @Autowired private ObjectMapper objectMapper;
//    // 设置 HTTP 验证规则
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 关闭csrf验证
//        http.csrf().disable()
//                // 对请求进行认证
//                .authorizeRequests()
//                // 所有 / 的所有请求 都放行
//                .antMatchers(
//                        HttpMethod.GET,
//                        "/",
//                        "/*.html",
//                        "/favicon.ico",
//                        "/**/*.html",
//                        "/**/*.css",
//                        "/**/*.js"
//                ).permitAll()
//                .antMatchers("/oauth/*").permitAll()
////                // 添加权限检测
////                .antMatchers("/hxb/*").authenticated()
////                // 角色检测
////                .antMatchers("/user/*").hasRole("ADMIN")
//                // 所有请求需要身份认证
//                .anyRequest().authenticated();
//        http.addFilterBefore(new HTTPBearerAuthorizeAttribute(),
//                UsernamePasswordAuthenticationFilter.class);
//        // disable page caching
//        http.headers().cacheControl();
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 使用自定义身份验证组件
        auth.authenticationProvider(ajaxAuthenticationProvider);
        auth.authenticationProvider(jwtAuthenticationProvider);

        User user = userRepositoy.findFirstByUsername("ADMIN");
        if (user == null)
        {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode("hwsappay");
            List<UserRole> Roles = new ArrayList<UserRole>();
            UserRole userRole = new UserRole();
            userRole.setRole(Role.BANKPAY);
            Roles.add(userRole);
            User nuser =new User();
            nuser.setUsername("ADMIN");
            nuser.setPassword(hashedPassword);
            nuser.setCreatedate(new Date());
            nuser.setRoles(Roles);
            userRepositoy.save(nuser);
        }
    }
    protected AjaxLoginProcessingFilter buildAjaxLoginProcessingFilter() throws Exception {
        AjaxLoginProcessingFilter filter = new AjaxLoginProcessingFilter(FORM_BASED_LOGIN_ENTRY_POINT, successHandler, failureHandler, objectMapper);
        filter.setAuthenticationManager(this.authenticationManager);
        return filter;
    }

    protected JwtTokenAuthenticationProcessingFilter buildJwtTokenAuthenticationProcessingFilter() throws Exception {
        List<String> pathsToSkip = Arrays.asList(TOKEN_REFRESH_ENTRY_POINT, FORM_BASED_LOGIN_ENTRY_POINT);
        SkipPathRequestMatcher matcher = new SkipPathRequestMatcher(pathsToSkip, TOKEN_BASED_AUTH_ENTRY_POINT);
        JwtTokenAuthenticationProcessingFilter filter
                = new JwtTokenAuthenticationProcessingFilter(failureHandler, tokenExtractor, matcher);
        filter.setAuthenticationManager(this.authenticationManager);
        return filter;
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // We don't need CSRF for JWT based authentication
                .exceptionHandling()
                .authenticationEntryPoint(this.authenticationEntryPoint)

                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)

                .and()
                .authorizeRequests()
                .antMatchers(FORM_BASED_LOGIN_ENTRY_POINT).permitAll() // Login end-point
                .antMatchers(TOKEN_REFRESH_ENTRY_POINT).permitAll() // Token refresh end-point
                .and()
                .authorizeRequests()
                .antMatchers(TOKEN_BASED_AUTH_ENTRY_POINT).authenticated() // Protected API End-points
                .and()
                .addFilterBefore(new CustomCorsFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(buildAjaxLoginProcessingFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(buildJwtTokenAuthenticationProcessingFilter(), UsernamePasswordAuthenticationFilter.class)
                //.addFilterBefore(new HTTPBearerAuthorizeAttribute(),UsernamePasswordAuthenticationFilter.class)
        ;
    }
}
