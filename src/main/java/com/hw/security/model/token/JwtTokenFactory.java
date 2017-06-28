package com.hw.security.model.token;

import com.hw.security.config.JwtSettings;
import com.hw.security.model.Scopes;
import com.hw.security.model.UserContext;
import com.hw.security.model.token.AccessJwtToken;
import com.hw.security.model.token.JwtToken;
import com.hw.utils.StrUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created by pandehua on 2017/6/27.
 */
@Component
public class JwtTokenFactory {
    private final JwtSettings settings;

    @Autowired
    public JwtTokenFactory(JwtSettings settings) {
        this.settings = settings;
    }

    /**
     * Factory method for issuing new JWT Tokens.
     *
     * @param username
     * @param roles
     * @return
     */
    public AccessJwtToken createAccessJwtToken(UserContext userContext) {
        if (StrUtil.isBlank(userContext.getUsername()))
            throw new IllegalArgumentException("Cannot create JWT Token without username");

        if (userContext.getAuthorities() == null || userContext.getAuthorities().isEmpty())
            throw new IllegalArgumentException("User doesn't have any privileges");

        Claims claims = Jwts.claims().setSubject(userContext.getUsername());
        claims.put("scopes", userContext.getAuthorities().stream().map(s -> s.toString()).collect(Collectors.toList()));

        LocalDateTime currentTime = LocalDateTime.now();

        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer(settings.getTokenIssuer())
                .setIssuedAt(Date.from(currentTime.atZone(ZoneId.systemDefault()).toInstant()))
                .setExpiration(Date.from(currentTime
                        .plusMinutes(settings.getTokenExpirationTime())
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .signWith(SignatureAlgorithm.HS512, settings.getTokenSigningKey())
                .compact();

        return new AccessJwtToken(token, claims);
    }

    public JwtToken createRefreshToken(UserContext userContext) {
        if (StrUtil.isBlank(userContext.getUsername())) {
            throw new IllegalArgumentException("Cannot create JWT Token without username");
        }

        LocalDateTime currentTime = LocalDateTime.now();

        Claims claims = Jwts.claims().setSubject(userContext.getUsername());
        claims.put("scopes", Arrays.asList(Scopes.REFRESH_TOKEN.authority()));

        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer(settings.getTokenIssuer())
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(currentTime.atZone(ZoneId.systemDefault()).toInstant()))
                .setExpiration(Date.from(currentTime
                        .plusMinutes(settings.getRefreshTokenExpTime())
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .signWith(SignatureAlgorithm.HS512, settings.getTokenSigningKey())
                .compact();

        return new AccessJwtToken(token, claims);
    }
}

