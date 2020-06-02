package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.ItemsDAO;
import web.model.shop.item.Item;
import web.model.user.User;

import java.util.List;

@Service
public class ShopService {
    //Field
    @Autowired
    private ItemsDAO itemsDAO;
    //Constructor

    //Function

    //Getter and Setter
    public List<Item> getListItems() {
        return itemsDAO.getItemsList();
    }

}
