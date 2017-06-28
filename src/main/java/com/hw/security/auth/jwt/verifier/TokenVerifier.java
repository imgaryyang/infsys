package com.hw.security.auth.jwt.verifier;

/**
 * Created by pandehua on 2017/6/27.
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
