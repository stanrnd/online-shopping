package com.stanrnd.account.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JwtTokenProvider {

    private final String SECRET_KEY = "stalin@123"; // Use a secure key

    @Autowired
    private JwtEncoder jwtEncoder;

    @Autowired
    private JwtDecoder jwtDecoder;

    public String generateToken(String username, Set<String> roles) {
         JwtClaimsSet claimsSet = JwtClaimsSet.builder()
                .issuer("http://localhost:8080") // Set your issuer
                .subject(username)
                .claim("roles", roles)
                .issuedAt(Instant.now())
                .expiresAt(Instant.now().plus(1, ChronoUnit.DAYS)) // 1 day expiration
                .build();

        return jwtEncoder.encode(JwtEncoderParameters.from(claimsSet)).getTokenValue();
    }

    public org.springframework.security.oauth2.jwt.Jwt validateToken(String token) {
        return jwtDecoder.decode(token);
    }

}
