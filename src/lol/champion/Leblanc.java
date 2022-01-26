package lol.champion;

import lol.position.Wizard;

public class Leblanc extends Wizard {

    // 스킬 1 데미지
    int sealOfMaliceDamage = 70;

    // 스킬 2 데미지
    int distortionDamage = 80;

    // 스킬 3 데미지
    int etherealChain = 80;

    // 스킬 4 데미지
    int Mimic = 180;

    public Leblanc() {
        super("Leblanc", 55, 22, 30, 530, 330, (int)(55 * 1.75));
    }


    // 캐릭터 정보 가져오기
    public void info() {
        System.out.println("캐릭터 정보를 가져옵니다");
        System.out.println("---------------------------------------");
        System.out.println("챔피언명 : 르블랑");
        System.out.println("포지션 : 마법사");
        System.out.println("공격력 : 55");
        System.out.println("방어력 : 22");
        System.out.println("마법저항력 : 30");
        System.out.println("체력 : 530");
        System.out.println("마나 : 330");
        System.out.println("크리티컬 데미지 : 95");
        System.out.println("스킬 1(악의의 인장) - 데미지 70 | 마나소모 60");
        System.out.println("스킬 2(왜곡) - 데미지 80 | 마나소모 70");
        System.out.println("스킬 3(환영사슬) - 데미지 80 | 마나소모 60");
        System.out.println("스킬 4(모방) - 데미지 180 | 마나소모 100");
        System.out.println("---------------------------------------");
    }

    // 상위 클래스의 공격 메소드 오버라이딩
    @Override
    public void attack() {
        System.out.println("르블랑이 공격합니다. 데미지 " + power);
        super.attack();
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
        etherealChain = 80 + (80 * 10 / 100);
        Mimic = 180 + (180 * 10 / 100);
        System.out.println("르블랑이 마법사 전용 스킬 마법 강화를 사용합나다.(모든 스킬 데미지 10% 상승)");
    }

    // 1번 스킬 사용 메소드
    public void sealOfMalice() {
        System.out.println("르블랑이 스킬 악의의 인장을 사용한다.");
    }

    // 2번 스킬 사용 메소드
    public void distortion() {
        System.out.println("르블랑이 스킬 왜곡를 사용한다.");
    }

    // 3번 스킬 사용 메소드
    public void etherealChain() {
        System.out.println("르블랑이 스킬 환영사슬을 사용한다.");
    }

    // 4번 스킬 사용 메소드
    public void Mimic() {
        System.out.println("르블랑이 스킬 모방을 사용한다.");
    }
}
