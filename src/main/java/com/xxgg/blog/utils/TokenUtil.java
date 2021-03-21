package com.xxgg.blog.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.xxgg.blog.model.po.User;

import java.util.Date;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: token 工具类
 * @date 2021/3/11
 */
public class TokenUtil {
    /**
     * 密钥盐
     */
    private static final String TOKEN_SECRET="xiejiabin";

    /**
     * 生产token
     * @param user 用户实体类
     * @param time token 过期时间  60*60*1000 1小时
     * @return
     */
    public static String sign(User user, Long time){
        String token = null;
        try {
            Date expireAt = new Date(System.currentTimeMillis() + time);
            token = JWT.create()
                    //发行人
                    .withIssuer("先谢郭嘉")
                    //存放数据
                    .withClaim("userName",user.getUserName())
                    //过期时间
                    .withExpiresAt(expireAt)
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (IllegalArgumentException| JWTCreationException e) {
            e.printStackTrace();
        }
        return token;
    }

    public static Boolean verify(String token){

        try {
            //创建token验证器
            JWTVerifier jwtVerifier=JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("先谢郭嘉").build();
            DecodedJWT decodedJWT = jwtVerifier.verify(token);
            System.out.println("验证通过");
            System.out.println("userName: " + decodedJWT.getClaim("userName").asString());
            System.out.println("过期时间：      " + decodedJWT.getExpiresAt());
        } catch (IllegalArgumentException | JWTVerificationException e) {
            //抛出错误即为验证不通过
            return false;
        }
        return true;
    }

}
