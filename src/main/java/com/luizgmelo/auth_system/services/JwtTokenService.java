package com.luizgmelo.auth_system.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.luizgmelo.auth_system.models.UserDetailsImpl;
import org.springframework.stereotype.Service;

import java.time.*;

@Service
public class JwtTokenService {
    private static final String SECRET_KEY = "secret";

    private static final String ISSUER = "auth-system";

    public String generateToken(UserDetailsImpl user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
            return JWT.create()
                    .withIssuedAt(generateIssuedDate())
                    .withIssuer(ISSUER)
                    .withSubject(user.getUsername())
                    .withExpiresAt(generateExpirationDate())
                    .sign(algorithm);
        } catch (JWTCreationException e) {
            throw new JWTCreationException("Error when generating token", e);
        }
    }

    public String validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
            return JWT.require(algorithm)
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException e) {
            throw new JWTVerificationException("Token invalid or expired", e);
        }
    }

    public Instant generateIssuedDate() {
        return ZonedDateTime.now(ZoneId.of("America/Recife")).toInstant();
    }

    public Instant generateExpirationDate() {
        return ZonedDateTime.now(ZoneId.of("America/Recife")).plusHours(4).toInstant();
    }
}
