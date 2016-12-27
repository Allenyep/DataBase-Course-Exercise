package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by tanjian on 2016/12/19.
 * 登录控制器
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "",method = GET)
    public String login(){
        return "login";
    }
}
