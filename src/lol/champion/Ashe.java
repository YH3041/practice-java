package lol.champion;

public class Ashe extends Champion {

    int RangerFocusDamage = 50;
    int RangerFocusMana = 50;

    int VolleyDamage = 50;
    int VolleyMana = 70;

    int hawkShotDamage = 100;
    int hawkShotMana = 80;

    int crystalArrowDamage = 150;
    int crystalArrowMana = 100;


    public Ashe() {
        super("Ashe", 59, 26, 30, 570, 280, (int)(59 * 1.75));
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
        System.out.println("애쉬가 스킬(궁사의 집중)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < RangerFocusMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else {
                computer.hp -= RangerFocusDamage;
                player.mp -= RangerFocusMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < RangerFocusMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else {
                player.hp -= RangerFocusDamage;
                computer.mp -= RangerFocusMana;
            }
        }
    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer, String name) {
        System.out.println("애쉬가 스킬(일제사격)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < VolleyMana) {
                computer.hp += 0;
                player.mp -= 0;
            } else {
                computer.hp -= VolleyDamage;
                player.mp -= VolleyMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < VolleyMana) {
                player.hp += 0;
                computer.mp -= 0;
            } else {
                player.hp -= VolleyDamage;
                computer.mp -= VolleyMana;
            }
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer, String name) {
        System.out.println("애쉬가 스킬(매)을 사용한다.");
        if (name == "player") {
            if (computer.mp <= 0 || computer.mp < hawkShotMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else {
                player.hp -= hawkShotDamage;
                computer.mp -= hawkShotMana;
            }
        } else if(name == "computer") {
            if (player.mp <= 0 || player.mp < hawkShotMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else {
                computer.hp -= hawkShotDamage;
                player.mp -= hawkShotMana;
            }
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer, String name) {
        System.out.println("애쉬가 스킬(수정화살)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < crystalArrowMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else  {
                computer.hp -= crystalArrowDamage;
                player.mp -= crystalArrowMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < crystalArrowMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else  {
                player.hp -= crystalArrowDamage;
                computer.mp -= crystalArrowMana;
            }
        }
    }
}
