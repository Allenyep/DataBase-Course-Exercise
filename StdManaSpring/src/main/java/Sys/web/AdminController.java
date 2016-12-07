package Sys.web;

import Sys.data.db.xsxxRepository;
import Sys.data.db.zgRepository;
import Sys.data.domain.xsxx;
import Sys.data.domain.zg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by tanjian on 16/12/5.
 * 管理员控制器
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "",method = GET)
    public String adminIndex(){
        return "admin";
    }

    @RequestMapping(value = "/add",method = GET)
    public String addUser(){
        return "add";
    }

    @ResponseBody
    @RequestMapping(value = "/stulist",method = GET,produces = {"application/json;charset=GBK"})
    public String findAllStu(){
        List<xsxx> lists=new xsxxRepository().findAll();
        StringBuffer jsonBuffer=new StringBuffer();
        for(xsxx item:lists){
            jsonBuffer.append(item.toString()+",");
        }
        return jsonBuffer.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/alladmin",method = GET)
    public String findallAdmin(){
        StringBuffer stringBuffer=new StringBuffer();
        List<zg> lists=new zgRepository().findAll();
        for(zg item:lists){
            stringBuffer.append(item.toString()+",");
        }
        return stringBuffer.toString();
    }
}
