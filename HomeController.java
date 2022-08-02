package com.example.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("home")
    public String home( Map<String,Object> model){
        model.put("message"," Hi Jane");
        return "home";
    }
}
