package per.alex.highlight_springmvc4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
