package lol.champion;


public class Ryze extends Champion {

    int overLoadDamage = 75;
    int overLoadMana = 40;

    int runePrisonDamage = 80;
    int runePrisonMana = 50;

    int spellFluxDamage = 60;
    int spellFluxMana = 50;

    int realmWarpDamage = 120;
    int realmWarpMana = 120;


    public Ryze() {
        super("Ryze", 58, 22, 36, 575, 300, (int)(58 * 1.75));
    }

    // 상위 클래스의 공격 메소드 오버라이딩
    @Override
    public void attack(Champion player, Champion computer, int attackCount) {
        if (computer.hp <= 0 || attackCount == 0) {
            computer.hp -= 0;
        } else {
            computer.hp -= player.power;
        }
    }

    // 스킬 1 사용 메소드
    @Override
    public void skill1(Champion player, Champion computer, String name) {
        System.out.println("라이즈가 스킬(과부하)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < overLoadMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else {
                computer.hp -= overLoadDamage;
                player.mp -= overLoadMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < overLoadMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else {
                player.hp -= overLoadDamage;
                computer.mp -= overLoadMana;
            }
        }
    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer, String name) {
        System.out.println("라이즈가 스킬(룬감옥)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < runePrisonMana) {
                computer.hp += 0;
                player.mp -= 0;
            } else {
                computer.hp -= runePrisonDamage;
                player.mp -= runePrisonMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < runePrisonMana) {
                player.hp += 0;
                computer.mp -= 0;
            } else {
                player.hp -= runePrisonDamage;
                computer.mp -= runePrisonMana;
            }
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer, String name) {
        System.out.println("라이즈가 스킬(주문 전이)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < spellFluxMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else {
                computer.hp -= spellFluxDamage;
                player.mp -= spellFluxMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < spellFluxMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else {
                player.hp -= spellFluxDamage;
                computer.mp -= spellFluxMana;
            }
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer, String name) {
        System.out.println("라이즈가 스킬(공간 왜곡)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < realmWarpMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else  {
                computer.hp -= realmWarpDamage;
                player.mp -= realmWarpMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < realmWarpMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else  {
                player.hp -= realmWarpDamage;
                computer.mp -= realmWarpMana;
            }
        }
    }
}
