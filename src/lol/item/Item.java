package lol.item;

public class Item {

    public String name;
    public int price;
    public String description;

    public Item() {
    }

    public Item(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
