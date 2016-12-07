package Sys.web;

import Sys.data.db.xsxxRepository;
import Sys.data.db.zgRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by tanjian on 16/9/14.
 * 登录首页控制器
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    /*默认进入学生登陆界面*/
    @RequestMapping(value = "",method = GET)
    public String loginPage(){
        return "login-std";
    }

    @RequestMapping(value = "/admin",method = GET)
    public String adminLoginPage(){
        return "login-admin";
    }

    @ResponseBody
    @RequestMapping(value = "/getone",method = GET,produces = {"application/json;charset=GBK"})
    public String printString(){
        return "{"+ new xsxxRepository().fondOneById("631406010122") +"}";
    }

    @ResponseBody
    @RequestMapping(value = "/validate/std",method = POST,produces = {"application/json;charset=GBK"})
    public String processStdValidate(String name,String pwd){
        if( new xsxxRepository().loginValidate(name,pwd)){
            return "true";
        }else {
            return "false";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/validate/zg",method = POST,produces = {"application/json;charset=GBK"})
    public String processZgValidate(String name,String pwd){
        if( new zgRepository().loginValidate(name,pwd)){
            return "true";
        }else {
            return "false";
        }
    }
}
