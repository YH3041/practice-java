package lol.champion;


public class Lulu extends Champion {

    int glitterlanceDamage = 50;
    int glitterlanceMana = 50;

    int whimsyDamage = 50;
    int whimsyDamageMana = 65;

    int helpPixDamage = 100;
    int helpPixMana = 60;

    int wildGrowthGuard = 100;
    int wildGrowthMana = 150;

    public Lulu() {
        super("Lulu", 47, 29, 30, 525, 350, (int)(47 * 1.75));
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
        System.out.println("룰루가 스킬(반짝반짝 창)을 사용한다.");

        if (name == "palyer") {
            if (player.mp <= 0 || player.mp < glitterlanceMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else {
                computer.hp -= glitterlanceDamage;
                player.mp -= glitterlanceMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < glitterlanceMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else {
                player.hp -= glitterlanceDamage;
                computer.mp -= glitterlanceMana;
            }
        }

    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer, String name) {
        System.out.println("룰루가 스킬(변덕쟁이)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < whimsyDamageMana) {
                computer.hp += 0;
                player.mp -= 0;
            } else {
                computer.hp -= whimsyDamage;
                player.mp -= whimsyDamageMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < whimsyDamageMana) {
                player.hp += 0;
                computer.mp -= 0;
            } else {
                player.hp -= whimsyDamage;
                computer.mp -= whimsyDamageMana;
            }
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer, String name) {
        System.out.println("룰루가 스킬(도와줘 픽스!)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < helpPixMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else {
                computer.hp -= helpPixDamage;
                player.mp -= helpPixMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < helpPixMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else {
                player.hp -= helpPixDamage;
                computer.mp -= helpPixMana;
            }
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer, String name) {
        System.out.println("룰루가 스킬(급성장)을 사용한다.");

        if (name == "player") {
            if (player.mp <= 0 || player.mp < wildGrowthMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else  {
                player.hp += wildGrowthGuard;
                player.mp -= wildGrowthMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < wildGrowthMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else  {
                computer.hp += wildGrowthGuard;
                computer.mp -= wildGrowthMana;
            }
        }
    }
}
