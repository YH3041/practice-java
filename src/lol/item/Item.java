package lol.item;

import lol.champion.Champion;

public class Item {

    public String name;
    public String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void useItem(Champion player, Champion computer, String name, int playerUseCount, int computerUseCount) {

    }
}
