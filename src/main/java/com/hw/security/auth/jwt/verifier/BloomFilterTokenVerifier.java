package com.hw.security.auth.jwt.verifier;

import org.springframework.stereotype.Component;

/**
 * Created by pandehua on 2017/6/27.
 */
@Component
public class BloomFilterTokenVerifier implements TokenVerifier {
    @Override
    public boolean verify(String jti) {
        return true;
    }
}