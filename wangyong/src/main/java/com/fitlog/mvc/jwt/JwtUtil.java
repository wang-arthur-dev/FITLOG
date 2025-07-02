package com.fitlog.mvc.jwt;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class JwtUtil {
    @Value("${JWT_SECRET_KEY:default-secret-key-change-in-production}")
    private String key;
    
    private SecretKey secretKey;
    private final long expiration = 1000 * 60 * 60; // 1시간
    //private final long expiration = 1000 * 20; // 20초 (test용)

    // SecretKey 초기화를 위한 메서드
    private SecretKey getSecretKey() {
        if (secretKey == null) {
            secretKey = Keys.hmacShaKeyFor(key.getBytes(StandardCharsets.UTF_8));
        }
        return secretKey;
    }

    //토큰생성
    public String generateToken(String userId) {
        return Jwts.builder().setSubject(userId).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+expiration))
                .signWith(getSecretKey(), SignatureAlgorithm.HS256).compact();
    }

    //토큰유효성검사
    public Jws<Claims> validateToken(String token) {
            return Jwts.parser().verifyWith(getSecretKey()).build().parseSignedClaims(token);

    }


    public String getUserIdFromToken(String token) {
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }

        Claims claims = Jwts.parser()
                .verifyWith(getSecretKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();

        return claims.getSubject(); // sub에 userId를 저장했으므로 이렇게 꺼냄
    }

}
