package com.xzr.webdemo.interceptor;

import com.xzr.webdemo.dto.UserHolder;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 检测登陆状态的拦截器，失败则重定向到主页
 */
public class LoginJudgeInterception implements HandlerInterceptor {
    /**
     * 登录用户可访问
     *
     * @param request  request
     * @param response response
     * @param handler  handler
     * @return true-放行；false-驳回；
     * @throws Exception exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // token验证
        String token = request.getHeader("authorization");
        if (token == null) {
            // 状态码-401：未认证，前端发送请求到/login
            response.setStatus(401);
            System.out.println("未认证");
            return false;
        }
        System.out.println("放行");
        String userID = request.getSession().getAttribute("userID").toString();
        // TODO：② theadloacl在后续redis中会用到
        UserHolder.saveUser(userID); // 后续会有用的
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        UserHolder.removeUser();
    }
}