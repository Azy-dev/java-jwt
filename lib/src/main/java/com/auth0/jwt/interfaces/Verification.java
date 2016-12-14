package com.auth0.jwt.interfaces;

import com.auth0.jwt.JWTVerifier;

/**
 * Created by lbalmaceda on 12/14/16.
 */
public interface Verification {
    Verification withIssuer(String issuer);

    Verification withSubject(String subject);

    Verification withAudience(String... audience);

    Verification acceptLeeway(long leeway) throws IllegalArgumentException;

    Verification acceptExpiresAt(long leeway) throws IllegalArgumentException;

    Verification acceptNotBefore(long leeway) throws IllegalArgumentException;

    Verification acceptIssuedAt(long leeway) throws IllegalArgumentException;

    Verification withJWTId(String jwtId);

    Verification withClaim(String name, Object value) throws IllegalArgumentException;

    JWTVerifier build();
}
