package lol;

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
    public int health;

    // 마나
    public int mana;

    // 치명타 데미지
    public int criticalDamage;


    public Champion(String name, int power, int armor, int magicResistance, int health, int mana, int criticalDamage) {
        this.name = name;
        this.power = power;
        this.armor = armor;
        this.magicResistance = magicResistance;
        this.health = health;
        this.mana = mana;
        this.criticalDamage = criticalDamage;
    }

    // 공격 사용 메소드
    public void attack() {
        System.out.println("공격");
    }

    // 회피 사용 메소드
    public void miss() {
        System.out.println("회피");
    }

    // 아이템 사용 메소드
    public void useItem() {
        System.out.println("아이템 사용");
    }
}
