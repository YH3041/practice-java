package lol.champion;

public class Garen extends Champion {

    int decisiveStrikeDamage = 50;
    int decisiveStrikeMana = 50;

    int courageGuard = 50;
    int courageGuardMana = 50;

    int judgmentDamage = 100;
    int judgmentMana = 80;

    int demacianJusticeDamage = 150;
    int demacianJusticeMana = 1000;

    public Garen() {
        super("Garen", 66, 36, 32, 620, 200, (int)(66 * 1.75));
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
        System.out.println("가렌이 스킬(결정타)을 사용한다.");
        if (player.mp <= 0 || player.mp < decisiveStrikeMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= decisiveStrikeDamage;
            player.mp -= decisiveStrikeMana;
        }
    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer) {
        System.out.println("가렌이 스킬(용기)을 사용한다.");
        if (player.mp <= 0 || player.mp < courageGuardMana) {
            computer.hp += 0;
            player.mp -= 0;
        } else {
            player.hp += courageGuard;
            player.mp -= courageGuardMana;
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer) {
        System.out.println("가렌이 스킬(심판)을 사용한다.");
        if (player.mp <= 0 || player.mp < judgmentMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= judgmentDamage;
            player.mp -= judgmentMana;
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer) {
        System.out.println("가렌이 스킬(데마시아의 정의)을 사용한다.");
        if (player.mp <= 0 || player.mp < demacianJusticeMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else  {
            computer.hp -= demacianJusticeDamage;
            player.mp -= demacianJusticeMana;
        }
    }
}
