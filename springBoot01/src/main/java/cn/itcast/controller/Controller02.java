package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user2")
public class Controller02 {
    @Value("${name}")
    private String name;
    @Value("${student.age}")
    private Integer age;
    @Value("${person.age}")
    private Integer page;
    @Value("${students[0].name}")
    private String name1;

   @RequestMapping("/find")
   @ResponseBody
    public String show(){
       //System.out.println(name+":"+age+"=="+page);
       System.out.println(name+":"+age);
       System.out.println(page);
       System.out.println(name1);
        return "tom";
    }

}
