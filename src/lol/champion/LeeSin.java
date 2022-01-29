package lol.champion;

import lol.item.Item;
import lol.position.Assassin;

public class LeeSin extends Assassin {

    // 스킬 1 데미지
    int sonicWaveDamage = 50;
    int sonicWaveMana = 50;

    // 스킬 2 데미지
    int safeGuardArmor = 50;
    int safeGuardMana = 30;

    // 스킬 3 데미지
    int tempestDamage = 100;
    int tempestMana = 50;

    // 스킬 4 데미지
    int dragonRageDamage = 150;
    int dragonRageMana = 100;

    public LeeSin() {
        super("Leesin", 68, 36, 32, 575, 250, (int)(68 * 1.75));
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

    // 상위 클래스의 회피 메소드 오버라이딩
    @Override
    public void miss() {
        System.out.println("리신이 공격을 회피합니다. miss");
        super.miss();
    }

    // 상위 클래스의 크리티컬 데미지 메소드 오버라이딩
    @Override
    public void criticalDamageBuff() {
        super.criticalDamageBuff();
        System.out.println("리신이 어쌔신 전용 스킬 크리티컬 버프를 사용합나다.(크리티컬 데미지 15% 상승)");
    }

    @Override
    public void useItem(Item item, int effect) {
        super.useItem(item, effect);
        switch (item.name) {
            case "빨간물약":
                hp += effect;
                break;
            case "파란물약":
                mp += effect;
                break;
        }
    }

    // 스킬 1 사용 메소드
    @Override
    public void skill1(Champion player, Champion computer) {
        System.out.println("리신이 스킬(음파)을 사용한다.");
        if (player.mp <= 0 || player.mp < sonicWaveMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= sonicWaveDamage;
            player.mp -= sonicWaveMana;
        }
    }

    // 스킬 2 사용 메소드
    @Override
    public void skill2(Champion player, Champion computer) {
        System.out.println("리신이 스킬(방호)을 사용한다.");
        if (player.mp <= 0 || player.mp < safeGuardMana) {
            computer.hp += 0;
            player.mp -= 0;
        } else {
            player.hp += safeGuardArmor;
            player.mp -= safeGuardMana;
        }
    }

    // 스킬 3 사용 메소드
    @Override
    public void skill3(Champion player, Champion computer) {
        System.out.println("리신이 스킬(폭풍)을 사용한다.");
        if (player.mp <= 0 || player.mp < tempestMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else {
            computer.hp -= tempestDamage;
            player.mp -= tempestMana;
        }
    }

    // 스킬 4 사용 메소드
    @Override
    public void skill4(Champion player, Champion computer) {
        System.out.println("리신이 스킬(용의분노)을 사용한다.");
        if (player.mp <= 0 || player.mp < dragonRageMana) {
            computer.hp -= 0;
            player.mp -= 0;
        } else  {
            computer.hp -= dragonRageDamage;
            player.mp -= dragonRageMana;
        }
    }

}
