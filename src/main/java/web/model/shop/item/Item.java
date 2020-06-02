package web.model.shop.item;

public class Item {
    //Field
    private Long idItems;
    private Float price;
    private String nameItems;
    private String description;

    //Constructor

    public Item() {}

    public Item(Long idItems, String nameItems, Float price) {
        this.idItems = idItems;
        this.price = price;
        this.nameItems = nameItems;
    }
    //Function

    @Override
    public String toString() {
        return "Name: " + nameItems +
                ", price = " + price;
    }


    //Getter and Setter

    public Long getIdItems() {
        return idItems;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getNameItems() {
        return nameItems;
    }

    public void setNameItems(String nameItems) {
        this.nameItems = nameItems;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
