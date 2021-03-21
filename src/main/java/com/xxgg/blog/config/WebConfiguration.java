package com.xxgg.blog.config;

import com.xxgg.blog.handler.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 配置拦截器
 * @date 2021/3/11
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Resource
    private TokenInterceptor tokenInterceptor;

    /**
     * 解决跨域请求
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowCredentials(true);
    }

    /**
     * 异步请求配置
     * @param configurer
     */
    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setTaskExecutor(new ConcurrentTaskExecutor(Executors.newFixedThreadPool(3)));
        configurer.setDefaultTimeout(30000);
    }

    /**
     * 配置拦截器、拦截路径
     * 每次请求到拦截的路径，就会去执行拦截器中的方法
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> excludePath = new ArrayList<>();
        //排除拦截
        //登录
        excludePath.add("/user/login");
        //注册
        excludePath.add("/user/register");

        //接口文档
        excludePath.add("/doc.html");
        excludePath.add("/swagger-resources");
        excludePath.add("/webjars/**");
        excludePath.add("/favicon.ico");
        excludePath.add("/error");
        //连接池
        excludePath.add("/druid/**");
        //静态资源
        excludePath.add("/static/**");
        excludePath.add("/assets/**");

        registry.addInterceptor(tokenInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(excludePath);
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
