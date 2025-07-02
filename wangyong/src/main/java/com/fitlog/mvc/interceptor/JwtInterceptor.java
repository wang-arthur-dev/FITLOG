package com.fitlog.mvc.interceptor;

import com.fitlog.mvc.jwt.JwtUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class JwtInterceptor implements HandlerInterceptor {
    private JwtUtil jwtUtil;
    public JwtInterceptor(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authHeader = request.getHeader("Authorization");

        // 토큰이 있는 경우에만 검증
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            try {
                String token = authHeader.substring(7);
                Jws<Claims> claims = jwtUtil.validateToken(token);		// 토큰 유효성 검사
                String userId = claims.getBody().getSubject();
            } catch (Exception e) {
                // Token validation failed
                return false;
            }
        }

        // 토큰이 없는 요청은 그대로 통과
        return true;
    }
}


