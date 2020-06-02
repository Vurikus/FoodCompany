package web.controllers;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.ShopService;

import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {
    //Field
    @Autowired
    private ShopService shopService;
    //Constructor

    //Function
    @GetMapping
    public String showShopPage(Model model){
        List list = shopService.getListItems();
        model.addAttribute("items", list);
        return "shop/shopPage";
    }

    //Getter and Setter
}
