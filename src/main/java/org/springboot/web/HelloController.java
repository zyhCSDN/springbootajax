package org.springboot.web;

import org.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
//
@Controller
@RequestMapping("/hello")
public class HelloController {

    //单个Controller 反回的是网页（index） @RequestController 返回的是数据
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
       modelMap.put("msg", "SpringBoot Ajax 示例");

        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {

        return "home";
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    @ResponseBody
    public List<User> data() {
        List<User> list = new ArrayList<User>();

        User user;

        for (int i = 0; i < 15; i++) {
            user = new User();
            user.setId(i + 1);
            user.setName("springboot" + i);
            user.setSex("男");
            user.setAge(i + 1);
            user.setRole("developer");

            list.add(user);
        }

        return list;
    }

    public static void main(String[] args) {
        int a =30;
        int b =a++;
        int c = ++a;
        System.out.println("a============"+a);
        System.out.println("b============"+b);
        System.out.println("c============"+c);

    }
}
