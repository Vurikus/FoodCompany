package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.BasketDAO;
import web.dao.ItemsDAO;
import web.model.shop.item.Item;
import web.model.user.User;

import java.util.List;

@Service
public class ShopService {
    //Field
    @Autowired
    private ItemsDAO itemsDAO;
    @Autowired
    private BasketDAO basketDAO;
    @Autowired
    private UserService userService;

    //Constructor

    public ShopService() {}

    //Function
    public void putItemToUserBasket(Long userID, Item item){
        basketDAO.putItemToUserBasket(userID, item);
    }

    //Getter and Setter
    public List<Item> getListItems() {
        return itemsDAO.getItemsList();
    }

}
