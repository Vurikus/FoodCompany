package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class UserInfoController {
    //Field

    //Constructor

    //Function
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getInfoUser(@RequestParam(value = "id") Long id, Model model){
        model.addAttribute("id", id);
        return "userInfo";
    }
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
    //Getter and Setter
}
