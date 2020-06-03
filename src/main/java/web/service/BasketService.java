package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.BasketDAO;
import web.model.shop.basket.Basket;

@Service
public class BasketService {

    //Field
    @Autowired
    private BasketDAO basketDAO;

    //Constructor

    //Function
    public Basket showUserBasket(Long userID){
        return basketDAO.showUserBasket(userID);
    }

    //Getter and Setter
}
