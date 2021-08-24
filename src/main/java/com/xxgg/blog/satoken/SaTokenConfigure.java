package com.xxgg.blog.satoken;

import com.xxgg.blog.result.ResultJSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.interceptor.SaAnnotationInterceptor;


/**
 * [Sa-Token 权限认证] 配置类 
 * @author kong
 *
 */
@Configuration
@Slf4j
public class SaTokenConfigure implements WebMvcConfigurer {

	/**
	 * 注册sa-token的拦截器，打开注解式鉴权功能 
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 注册注解拦截器 
		registry.addInterceptor(new SaAnnotationInterceptor()).addPathPatterns("/**").excludePathPatterns("");
	}
	
	/**
     * 注册 [sa-token全局过滤器] 
     */
    @Bean
    public SaServletFilter getSaServletFilter() {
        return new SaServletFilter()
        		// 指定 [拦截路由] 与 [放行路由]，如.addExclude("/favicon.ico")
        		.addInclude("/**")
        		
        		// 认证函数: 每次请求执行 
        		.setAuth(r -> {
        			log.info("---------- sa全局认证");
                    // SaRouter.match("/test/test", () -> new Object());
        		})
        		
        		// 异常处理函数：每次认证函数发生异常时执行此函数 
        		.setError(e -> {
					log.error("---------- 全局异常 ");
        			return ResultJSON.error(e.getMessage());
        		})
        		
        		// 前置函数：在每次认证函数之前执行
        		.setBeforeAuth(r -> {
        			// ---------- 设置一些安全响应头 ----------
        			SaHolder.getResponse()
        			// 服务器名称（先谢郭嘉）
						.setServer("xxgg-server")
        			// 是否可以在iframe显示视图： DENY=不可以 | SAMEORIGIN=同域下可以 | ALLOW-FROM uri=指定域名下可以 
        			.setHeader("X-Frame-Options", "SAMEORIGIN")
        			// 是否启用浏览器默认XSS防护： 0=禁用 | 1=启用 | 1; mode=block 启用, 并在检查到XSS攻击时，停止渲染页面
        			.setHeader("X-XSS-Protection", "1; mode=block")
        			// 禁用浏览器内容嗅探 
        			.setHeader("X-Content-Type-Options", "nosniff");
        		});
    }

}
