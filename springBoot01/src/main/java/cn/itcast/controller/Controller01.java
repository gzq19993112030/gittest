package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class Controller01 {
   @RequestMapping("/find")
   @ResponseBody
    public String show(){
        return "tom";
    }

}
