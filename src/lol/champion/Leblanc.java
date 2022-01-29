package lol.champion;
import lol.position.Wizard;

public class Leblanc extends Wizard {

    // 스킬 1 데미지
    int sealOfMaliceDamage = 70;
    int sealOfMaliceMana = 50;

    // 스킬 2 데미지
    int distortionDamage = 80;
    int distortionMana = 60;

    // 스킬 3 데미지
    int etherealChainDamage = 80;
    int etherealChainMana = 50;

    // 스킬 4 데미지
    int mimicDamage = 150;
    int mimicMana = 80;

    public Leblanc() {
        super("Leblanc", 55, 22, 30, 530, 330, (int)(55 * 1.75));
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
    // 상위 클래스의 회피 메소드 오버라이딩
    @Override
    public void miss() {
        System.out.println("르블랑이 공격을 회피합니다. miss");
        super.miss();
    }

    // 상위 클래스의 마법 강화 메소드 오버라이딩
    @Override
    public void skillDamageBuff() {
        super.skillDamageBuff();
        sealOfMaliceDamage = 70 + (70 * 10 / 100);
        distortionDamage = 80 + (80 * 10 / 100);
        etherealChainDamage = 80 + (80 * 10 / 100);
        mimicDamage = 150 + (150 * 10 / 100);
        System.out.println("르블랑이 마법사 전용 스킬 마법 강화를 사용합나다.(모든 스킬 데미지 10% 상승)");
    }

    // 스킬 1 사용 메소드
    @Override
    public void skill1(Champion player, Champion computer, String name) {
        System.out.println("르블랑이 스킬(악의의 인장)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < sealOfMaliceMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else {
                computer.hp -= sealOfMaliceDamage;
                player.mp -= sealOfMaliceMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < sealOfMaliceMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else {
                player.hp -= sealOfMaliceDamage;
                computer.mp -= sealOfMaliceMana;
            }
        }
    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer, String name) {
        System.out.println("르블랑이 스킬(왜곡)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < distortionMana) {
                computer.hp += 0;
                player.mp -= 0;
            } else {
                computer.hp -= distortionDamage;
                player.mp -= distortionMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < distortionMana) {
                player.hp += 0;
                computer.mp -= 0;
            } else {
                player.hp -= distortionDamage;
                computer.mp -= distortionMana;
            }
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer, String name) {
        System.out.println("르블랑이 스킬(환영사슬)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < etherealChainMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else {
                computer.hp -= etherealChainDamage;
                player.mp -= etherealChainMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < etherealChainMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else {
                player.hp -= etherealChainDamage;
                computer.mp -= etherealChainMana;
            }
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer, String name) {
        System.out.println("르블랑이 스킬(모방)을 사용한다.");
        if (name == "player") {
            if (player.mp <= 0 || player.mp < mimicMana) {
                computer.hp -= 0;
                player.mp -= 0;
            } else  {
                computer.hp -= mimicDamage;
                player.mp -= mimicMana;
            }
        } else if(name == "computer") {
            if (computer.mp <= 0 || computer.mp < mimicMana) {
                player.hp -= 0;
                computer.mp -= 0;
            } else  {
                player.hp -= mimicDamage;
                computer.mp -= mimicMana;
            }
        }
    }
}
