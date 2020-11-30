package com.xxgg.blog.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @description: MD5工具类
 * @author: 先谢郭嘉
 * @create: 2020-10-02 11:42
 **/
public class MD5Util {
    public static String encode(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());

            byte[] byteDigest = md.digest();

            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }

            // 32位加密
            return buf.toString();
            // 16位加密
            // return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
