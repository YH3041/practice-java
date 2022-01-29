package lol.champion;

import lol.item.Item;

public class Champion {

    // 이름
    public String name;

    // 공격력
    public int power;

    // 방어력
    public int armor;

    // 마법 저항력
    public int magicResistance;

    // 체력
    public int hp;

    // 마나
    public int mp;

    // 치명타 데미지
    public int criticalDamage;


    public Champion(String name, int power, int armor, int magicResistance, int hp, int mp, int criticalDamage) {
        this.name = name;
        this.power = power;
        this.armor = armor;
        this.magicResistance = magicResistance;
        this.hp = hp;
        this.mp = mp;
        this.criticalDamage = criticalDamage;
    }

    // 공격 사용 메소드
    public void attack(Champion player, Champion computer) {
        System.out.println("공격");
    }

    // 회피 사용 메소드
    public void miss() {
        System.out.println("회피");
    }

    // 아이템 사용 메소드
    public void useItem(Item item, int effect) {
        System.out.println("아이템 사용");
    }


    public void skill1(Champion player, Champion computer) {
        System.out.println("스킬 1 사용");
    }

    public void skill2(Champion player, Champion computer) {
        System.out.println("스킬 2 사용");
    }

    public void skill3(Champion player, Champion computer) {
        System.out.println("스킬 3 사용");
    }

    public void skill4(Champion player, Champion computer) {
        System.out.println("스킬 4 사용");
    }
}
