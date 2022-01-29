package lol.item;

import lol.champion.Champion;

public class RedPotion extends Item {

    public int healthPlus = 50;

    public RedPotion() {
        super("redPotion", "HP +50");
    }

    @Override
    public void useItem(Champion player, Champion computer, String name, int playerUseCount, int computerUseCount) {
        if (name == "player") {
            player.hp += healthPlus;
            computer.hp -= 0;
        } else {
            computer.hp += healthPlus;
            player.hp -= 0;
        }
    }
}
