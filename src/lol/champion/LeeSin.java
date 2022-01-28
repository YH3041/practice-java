package lol.champion;

import lol.item.Item;
import lol.position.Assassin;

public class LeeSin extends Assassin {

    // 스킬 1 데미지
    int sonicWaveDamage = 80;

    // 스킬 2 데미지
    int safeGuardArmor = 50;

    // 스킬 3 데미지
    int tempestDamage = 100;

    // 스킬 4 데미지
    int dragonRageDamage = 180;

    public LeeSin() {
        super("Leesin", 68, 36, 32, 575, 250, (int)(68 * 1.75));
    }

    // 캐릭터 정보 가져오기
    public void info() {
        System.out.println("캐릭터 정보를 가져옵니다");
        System.out.println("---------------------------------------");
        System.out.println("챔피언명 : 리신");
        System.out.println("포지션 : 어쌔신");
        System.out.println("공격력 : 68");
        System.out.println("방어력 : 36");
        System.out.println("마법저항력 : 32");
        System.out.println("체력 : 575");
        System.out.println("마나 : 200");
        System.out.println("크리티컬 데미지 : 119");
        System.out.println("스킬 1(음파) - 데미지 80 | 마나소모 50");
        System.out.println("스킬 2(방호) - 방어막 50 | 마나소모 30");
        System.out.println("스킬 3(폭풍) - 데미지 100 | 마나소모 50");
        System.out.println("스킬 4(용의분노) - 데미지 180 | 마나소모 100");
        System.out.println("---------------------------------------");
    }

    // 상위 클래스의 공격 메소드 오버라이딩
    @Override
    public void attack() {
        System.out.println("리신이 공격합니다. 데미지 " + power);
        super.attack();
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

    // 1번 스킬 사용 메소드
    public void SonicWave() {
        System.out.println("리신이 스킬 음파를 사용한다.");
    }

    // 2번 스킬 사용 메소드
    public void SafeGuard() {
        System.out.println("리신이 스킬 방호를 사용한다.");
    }

    // 3번 스킬 사용 메소드
    public void Tempest() {
        System.out.println("리신이 스킬 폭풍을 사용한다.");
    }

    // 4번 스킬 사용 메소드
    public void DragonRage() {
        System.out.println("리신이 스킬 용의분노를 사용한다.");
    }
}
