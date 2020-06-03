package web.model.shop.basket;


import web.model.shop.item.Item;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    //Field
    private static List<Item> basketItemsList;
    private static Float totalPrice;

    //Constructor

    //Function

    public void createBasketList(){
        basketItemsList = new ArrayList<>();
        basketItemsList.add(new Item(1L, "Milk", 56.70F));
        basketItemsList.add(new Item(2L, "J7", 77.80F));
    }

    public void putItem (Item item){
        basketItemsList.add(item);
    }

    //Getter and Setter

    public List<Item> getBasketItemsList() {
        return basketItemsList;
    }

    public Float getTotalPrice() {
        if (totalPrice != null) {
            for (Item i: basketItemsList) {
                totalPrice += i.getPrice();
            }
            return totalPrice;
        }
        else return totalPrice = 0F;
    }

    public static void setTotalPrice(Float f) {
        totalPrice = f;
    }
}
