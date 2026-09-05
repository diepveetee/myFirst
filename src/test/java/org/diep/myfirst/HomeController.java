package org.diep.myfirst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping
    public String home(){
        return "index.html";
    }
    @RequestMapping
    public String about(){
        return "about.html";
    }

}
