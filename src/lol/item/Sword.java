package lol.item;

import lol.champion.Champion;

public class Sword extends Item {

    int plusDamage = 10;

    public Sword() {
        super("sword", "공격력 +10");
    }

    @Override
    public void useItem(Champion player, Champion computer, String name, int playerUseCount, int computerUseCount) {
        if (name == "player") {
            player.power += plusDamage;
        } else {
            computer.power += plusDamage;
        }
    }
}
