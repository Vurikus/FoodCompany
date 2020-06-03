package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.shop.basket.Basket;
import web.model.shop.item.Item;
import web.service.BasketService;

import java.util.List;

@Controller
@RequestMapping("/basket")
public class BasketController {
    //Field
    @Autowired
    private BasketService basketService;

    //Constructor

    //Function
    @GetMapping
    public String getBasketPage (@RequestParam(value = "id") Long id, Model model){
        Basket basket = basketService.showUserBasket(id);
        List <Item> listBasket = basket.getBasketItemsList();
        model.addAttribute("basket", listBasket);
        Float totalPrice = basket.getTotalPrice();
        model.addAttribute("totalPrice", totalPrice);
        return "shop/basket";
    }

    //Getter and Setter
}
