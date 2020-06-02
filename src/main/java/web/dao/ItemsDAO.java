package web.dao;

import org.springframework.stereotype.Repository;
import web.model.shop.item.Item;
import web.model.user.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemsDAO {
    //Field
    private List<Item> itemsList;

    //Constructor

    //Function
    @PostConstruct
    private List <Item> createList(){
        itemsList = new ArrayList<>();
        itemsList.add(new Item(1L, "Milk", 56.70F));
        itemsList.add(new Item(2L, "Cake", 24.30F));
        itemsList.add(new Item(3L, "Chocolate", 99.00F));
        return itemsList;
    }

    //Getter and Setter

    public List<Item> getItemsList() {
        return itemsList;
    }
}
