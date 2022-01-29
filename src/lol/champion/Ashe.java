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
    public void attack(Champion player, Champion computer) {
        if (computer.hp <= 0) {
            computer.hp -= 0;
        } else {
            computer.hp -= player.power;
        }
    }

    // 스킬 1 사용 메소드
    @Override
    public void skill1(Champion player, Champion computer) {
        System.out.println("애쉬가 스킬(궁사의 집중)을 사용한다.");
        if (player.mp <= 0 || player.mp < RangerFocusMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= RangerFocusDamage;
            player.mp -= RangerFocusMana;
        }
    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer) {
        System.out.println("애쉬가 스킬(일제사격)을 사용한다.");
        if (player.mp <= 0 || player.mp < VolleyMana) {
            computer.hp += 0;
            player.mp -= 0;
        } else {
            computer.hp -= VolleyDamage;
            player.mp -= VolleyMana;
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer) {
        System.out.println("애쉬가 스킬(매)을 사용한다.");
        if (player.mp <= 0 || player.mp < hawkShotMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= hawkShotDamage;
            player.mp -= hawkShotMana;
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer) {
        System.out.println("애쉬가 스킬(수정화살)을 사용한다.");
        if (player.mp <= 0 || player.mp < crystalArrowMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else  {
            computer.hp -= crystalArrowDamage;
            player.mp -= crystalArrowMana;
        }
    }
}
