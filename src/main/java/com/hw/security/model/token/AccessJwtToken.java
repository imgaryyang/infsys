package com.hw.security.model.token;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hw.security.model.token.JwtToken;
import io.jsonwebtoken.Claims;

/**
 * Created by pandehua on 2017/6/27.
 */
public final class AccessJwtToken implements JwtToken {
    private final String rawToken;
    @JsonIgnore
    private Claims claims;

    protected AccessJwtToken(final String token, Claims claims) {
        this.rawToken = token;
        this.claims = claims;
    }

    public String getToken() {
        return this.rawToken;
    }

    public Claims getClaims() {
        return claims;
    }
}

