package spittr.web;

import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;
/**
 * Created by tanjian on 2016/12/25.
 * 用户控制器
 */
@RequestMapping(value = "/personal")
public class PersonalController {
    @RequestMapping(value = "",method = GET)
    public String personal(){
        return "personal";
    }
}
