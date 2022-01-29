package lol.champion;

public class Nocturn extends Champion {

    int duskBringerDamage = 65;
    int duskBringerMana = 60;

    int shroudOfDarknessDamage = 50;
    int shroudOfDarknessMana = 50;

    int unspeakableHorrorDamage = 80;
    int unspeakableHorrorMana = 60;

    int paranoiaDamage = 150;
    int paranoiaMana = 100;


    public Nocturn() {
        super("Nocturn", 62, 38, 32, 585, 270, (int)(62 * 1.75));
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
        System.out.println("녹턴이 스킬(황혼의 인도자)을 사용한다.");
        if (player.mp <= 0 || player.mp < duskBringerMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= duskBringerDamage;
            player.mp -= duskBringerMana;
        }
    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer) {
        System.out.println("녹턴이 스킬(어둠의 장막)을 사용한다.");
        if (player.mp <= 0 || player.mp < shroudOfDarknessMana) {
            computer.hp += 0;
            player.mp -= 0;
        } else {
            computer.hp -= shroudOfDarknessDamage;
            player.mp -= shroudOfDarknessMana;
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer) {
        System.out.println("녹턴이 스킬(말할 수 없느 공포)을 사용한다.");
        if (player.mp <= 0 || player.mp < unspeakableHorrorMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= unspeakableHorrorDamage;
            player.mp -= unspeakableHorrorMana;
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer) {
        System.out.println("녹턴이 스킬(피해망상)을 사용한다.");
        if (player.mp <= 0 || player.mp < paranoiaMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else  {
            computer.hp -= paranoiaDamage;
            player.mp -= paranoiaMana;
        }
    }
}
