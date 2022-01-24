package lol.position;

import lol.Champion;

public class Assassin extends Champion {

    // 챔피언 포지션
    public String position;

    public Assassin(String name, int power, int armor, int magicResistance, int health, int mana, int criticalDamage) {
        super(name, power, armor, magicResistance, health, mana, criticalDamage);
        this.position = "어썌신";
    }

    // 크리티컬 버프 사용 메소드
    public void criticalDamageBuff() {
        criticalDamage = Math.round(criticalDamage + (criticalDamage * 15 / 100));
    }
}
