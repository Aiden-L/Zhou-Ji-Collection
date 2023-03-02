package com.xzr.webdemo.config;

import com.xzr.webdemo.interceptor.LoginJudge;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MainConfig implements WebMvcConfigurer {
    /**
     * 配置检测登陆状态的拦截器
     * @param registry 注册器
    */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginJudge())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/index","/login","/indexpage/**","/signuppage/**");
        // 放行static/x下的所有: /x/**
    }
}
