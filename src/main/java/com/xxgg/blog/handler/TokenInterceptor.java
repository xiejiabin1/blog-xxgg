package com.xxgg.blog.handler;

import com.xxgg.blog.utils.TokenUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 拦截器类
 * @date 2021/3/11
 */
@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 跨域请求会首先发一个option请求，直接返回正常状态并通过拦截器
        if(request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }

        response.setCharacterEncoding("utf-8");
        String token = request.getHeader("token");

        if (token != null){
            boolean result = TokenUtil.verify(token);
            if (result){
                System.out.println("认证成功，通过拦截器");
                return true;
            }
        }

        response.setContentType("application/json; charset=utf-8");
        System.out.println("认证失败，未通过拦截器");
        return false;
    }
}
