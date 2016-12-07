package Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by tanjian on 16/12/7.
 * 首页控制器
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    //将学生登陆页面作为网站首页
    @RequestMapping(value = "",method = GET)
    public String index(){
        return "login-std";
    }
}
