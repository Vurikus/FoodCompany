package web.dao;

import org.springframework.stereotype.Repository;
import web.model.shop.basket.Basket;
import web.model.shop.item.Item;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BasketDAO {
    //Field
    private List<Basket> basketList;

    //Constructor

    //Function

    @PostConstruct
    private List <Basket> createList(){
        basketList = new ArrayList<>();
        Basket basket = new Basket();
        basket.createBasketList();
        basketList.add(basket);
        return basketList;
    }

    public void putItemToUserBasket (Long userId, Item item){
        basketList.get(userId.intValue()).putItem(item);
    }

    public Basket showUserBasket (Long userId){
        return basketList.get(userId.intValue());
    }

    //Getter and Setter
    public List<Basket> getBasketList() {
        return basketList;
    }
}
