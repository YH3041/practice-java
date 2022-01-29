package lol.item;

import lol.champion.Champion;

public class BluePotion extends Item {

    public int manaPlus = 50;

    public BluePotion() {
        super("bluePotion", "MP +50");
    }

    @Override
    public void useItem(Champion player, Champion computer, String name, int playerUseCount, int computerUseCount) {
        if (name == "player") {
            player.mp += manaPlus;
            computer.mp -= 0;
        } else {
            computer.mp += manaPlus;
            player.mp -= 0;
        }
    }
}
