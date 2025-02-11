package com.sparta.springauth.jwt;


import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Base64;

@Component
public class JwtUtil {
    // Header KEY 값
    public static final String AUTHORIZATION_HEADER = "Authorization";
    // 사용자 권한 값의 KEY
    public static final String AUTHORIZATION_KEY = "auth";
    // Token 식별자
    public static final String BEARER_PREFIX = "Bearer ";
    // 토큰 만료시간
    private final long TOKEN_TIME = 60 * 60 * 1000L; // 60분

    @Value("${jwt.secret.key}") // Base64 Encode 한 SecretKey
    private String secretKey;
    private Key key;
    private final SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

    // 로그 설정
    public static final Logger logger = LoggerFactory.getLogger("JWT 관련 로그");

    @PostConstruct
    public void init() {
        byte[] bytes = Base64.getDecoder().decode(secretKey);
        key = Keys.hmacShaKeyFor(bytes);
    }

    //JWT 데이터
    // 토큰 생성
    public String createToken(String username, UserRoleEnum role) {
        Date date = new Date();

        return BEARER_PREFIX +
                Jwts.builder()
                        .setSubject(username) // 사용자 식별자값(ID)
                        .claim(AUTHORIZATION_KEY, role) // 사용자 권한
                        .setExpiration(new Date(date.getTime() + TOKEN_TIME)) // 만료 시간
                        .setIssuedAt(date) // 발급일
                        .signWith(key, signatureAlgorithm) // 암호화 알고리즘
                        .compact…

    //JWT 생성

    //생성된 JWT를 Cookie에 저장

        public void addJwtToCookie(String token, HttpServletResponse res) {
            try {
                token = URLEncoder.encode(token, "utf-8").replaceAll("\\+", "%20"); // Cookie Value 에는 공백이 불가능해서 encoding 진행

                Cookie cookie = new Cookie(AUTHORIZATION_HEADER, token); // Name-Value
                cookie.setPath("/");

                // Response 객체에 Cookie 추가
                res.addCookie(cookie);
            } catch (UnsupportedEncodingException e) {
                logger.error(e.getMessage());
            }
        }

    //Cookie에 들어있던 JWT 토큰을 Substring

        public String substringToken(String tokenValue) {
            if (StringUtils.hasText(tokenValue) && tokenValue.startsWith(BEARER_PREFIX)) {
                return tokenValue.substring(7);
            }
            logger.error("Not Found Token");
            throw new NullPointerException("Not Found Token");
        }
    //JWT 검증

    //JWT에서 사용자 정보 가져오기

}