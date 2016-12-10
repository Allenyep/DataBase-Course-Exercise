package Sys.web;

import Sys.data.db.xsxxRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by tanjian on 16/12/5.
 */
@Controller
@RequestMapping(value = "/student",produces = {"application/json;charset=GBK"})
public class StudentController {
    @RequestMapping(value = "",method = GET)
    public String studentIndex(){
        return "stdPersonal";
    }

    @ResponseBody
    @RequestMapping(value = "/personal-info",method = GET)
    public String getPersonalInfo(){
        //TODO:发布时，应该根据Session来返回当前用户的个人信息
        return "{"+ new xsxxRepository().fondOneById("631406010122") +"}";
    }

    @ResponseBody
    @RequestMapping(value = "/getNotifylist",method = GET)
    public String getNotifylist(){
       // return
        return "";
    }
}
