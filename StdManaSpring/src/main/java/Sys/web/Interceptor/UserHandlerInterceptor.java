package Sys.web.Interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by tanjian on 16/9/14.
 *  拦截器，用于检测用户是否登陆，控制权限
 */

public class UserHandlerInterceptor extends HandlerInterceptorAdapter {

    //此处一般继承HandlerInterceptorAdapter适配器即可

    //TODO：拦截器实现...
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("===========HandlerInterceptor preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("===========HandlerInterceptor postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println("===========HandlerInterceptor afterCompletion");
    }
}  