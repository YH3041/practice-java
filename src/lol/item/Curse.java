package lol.item;

import lol.champion.Champion;

public class Curse extends Item {

    int enemyPowerMinus = 10;

    public Curse() {
        super("marble", "상대 공격력 -10");
    }

    @Override
    public void useItem(Champion player, Champion computer, String name, int playerUseCount, int computerUseCount) {
        if (name == "player") {
            computer.power = -enemyPowerMinus;
        } else {
            player.power = -enemyPowerMinus;
        }
    }
}
