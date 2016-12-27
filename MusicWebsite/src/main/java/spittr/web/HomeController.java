package spittr.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by tanjian on 16/9/14.
 * 首页控制器
 */
@ComponentScan
@Controller
public class HomeController {
    @RequestMapping(value = "/index",method = GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/playlist",method = GET)
    public String playlist(){
        return "playlist";
    }

    @RequestMapping(value = "/",method = GET)
    public String home(){
        return "home";
    }
}
