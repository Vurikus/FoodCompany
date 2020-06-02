package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;
import web.model.user.User;

@Controller
public class UserInfoController {
    //Field
    @Autowired
    private UserService userService;

    //Constructor

    //Function
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getInfoUser(@RequestParam(value = "id") Long id, Model model){
        User user = userService.getUserFromID(id);
        model.addAttribute("user", user);
        return "user/userInfo";
    }
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
    //Getter and Setter
}
