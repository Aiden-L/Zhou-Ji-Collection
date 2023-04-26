package com.xzr.webdemo.config;

import com.xzr.webdemo.interceptor.LoginJudgeInterception;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    /**
     * 配置检测登陆状态的拦截器
     *
     * @param registry 注册器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginJudgeInterception())
                .addPathPatterns("/**")
                // 放行下列请求路径
                .excludePathPatterns(
                        "/",
                        "/shop/**",
                        "/index",
                        "/login",
                        "/indexpage/**",
                        "/signuppage/**",
                        "/error" // 访问路径不存在时会跳转error界面
                );
    }
}
