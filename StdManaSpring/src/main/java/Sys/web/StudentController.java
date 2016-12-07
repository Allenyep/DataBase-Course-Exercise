package Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by tanjian on 16/12/5.
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @RequestMapping(value = "",method = GET)
    public String studentIndex(){
        return "stuDetails";
    }
}
