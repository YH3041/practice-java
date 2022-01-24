package lol.position;

import lol.Champion;

public class Wizard extends Champion {

    // 챔피언 포지션
    public String position;

    public Wizard(String name, int power, int armor, int magicResistance, int health, int mana, int criticalDamage) {
        super(name, power, armor, magicResistance, health, mana, criticalDamage);
        this.position = "마법사";
    }

    // 전용 스킬 마법 강화 사용 메소드
    public void skillDamageBuff() {
    }

}
