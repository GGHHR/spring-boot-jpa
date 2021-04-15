package com.guo.demo.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器-基于springmvc
 * @ClassName: CustomInterceptor
 * @Description: springMVC项目中的拦截器，它拦截的目标是请求的地址，比MethodInterceptor先执行。
 *                 该拦截器只能过滤action请求，SPring允许多个拦截器同时存在，通过拦截器链管理。
 *                 当preHandle return true时，执行下一个拦截器，直到所有拦截器执行完，再运行被拦截的请求。
 *                 当preHandle return false时, 不再执行后续的拦截器链及被拦截的请求。
 * @author OnlyMate
 * @Date 2018年8月28日 下午2:30:22
 *
 */
public class Interceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println(1);
        // TODO Auto-generated method stub
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

}
