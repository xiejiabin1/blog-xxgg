package com.xxgg.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//扫描dao包，（如果不使用扫描包的方式，可以在dao包中的每个Mapper接口前，加上@Mapper注解）
@MapperScan("com.xxgg.blog.mapper")
public class BlogApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	// 用于构建war文件并进行部署，需继承SpringBootServletInitializer类
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BlogApplication.class);
	}
}
