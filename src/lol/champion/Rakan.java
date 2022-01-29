package lol.champion;

public class Rakan extends Champion {

    int gleamingQuillDamage = 70;
    int gleamingQuillMana = 60;

    int grandEntranceDamage = 70;
    int grandEntranceMana = 60;

    int battleDanceDamage = 100;
    int battleDanceMana = 100;

    int theQuicknessDamage = 120;
    int theQuicknessMana = 100;

    public Rakan() {
        super("Rakan", 62, 32, 32, 540, 300, (int)(62 * 1.75));
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
        System.out.println("라칸이 스킬(빛나는 깃털)을 사용한다.");
        if (player.mp <= 0 || player.mp < gleamingQuillMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= gleamingQuillDamage;
            player.mp -= gleamingQuillMana;
        }
    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer) {
        System.out.println("라칸이 스킬(화려한 등장)을 사용한다.");
        if (player.mp <= 0 || player.mp < grandEntranceMana) {
            computer.hp += 0;
            player.mp -= 0;
        } else {
            computer.hp -= grandEntranceDamage;
            player.mp -= grandEntranceMana;
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer) {
        System.out.println("라칸이 스킬(전쟁무도)을 사용한다.");
        if (player.mp <= 0 || player.mp < battleDanceMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= battleDanceDamage;
            player.mp -= battleDanceMana;
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer) {
        System.out.println("라칸이 스킬(매혹의 질주)을 사용한다.");
        if (player.mp <= 0 || player.mp < theQuicknessMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else  {
            computer.hp -= theQuicknessDamage;
            player.mp -= theQuicknessMana;
        }
    }
}
