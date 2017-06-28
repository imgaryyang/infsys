package com.hw;

import com.hw.Dao.UserRepository;
import com.hw.domain.Role;
import com.hw.domain.User;
import com.hw.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public FilterRegistrationBean jwtFilterRegistrationBean(){
//		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//		HTTPBearerAuthorizeAttribute httpBearerFilter = new HTTPBearerAuthorizeAttribute();
//		registrationBean.setFilter(httpBearerFilter);
//		List<String> urlPatterns = new ArrayList<String>();
//		urlPatterns.add("/hxb/*");
//		registrationBean.setUrlPatterns(urlPatterns);
//		return registrationBean;
//	}
}
