package lol;

import javax.swing.*;
import java.awt.*;
import lol.champion.Leblanc;
import lol.champion.LeeSin;
import lol.gui.GuiEvent;
import lol.item.BluePotion;
import lol.item.RedPotion;

public class Main {

    // 컴퓨터는 캐릭터 랜덤 선택
    // 플레이어가 캐릭터 선택과정에서 클릭시 info 자동으로 나옴
    // 플레이 우선순위 정하기(나중에)
    // 대전에서 플레이어 or 컴퓨터는 공격 or 스킬 1번만 가능(버프 후 공격 가능)
    // 마나가 0이면 스킬 사용 불가
    // 상대 체력이 0이 되면 win

    // 현재 문제점 Image 때문에 label 텍스트가 묻힌다.

    public static void main(String[] args) {

        // GuiEvent 클래스 객체화
        GuiEvent event = new GuiEvent();

        // 아이템 클래스 객체화
        RedPotion redPotion = new RedPotion();
        BluePotion bluePotion = new BluePotion();

        // 챔피언 클래스 객체화
        LeeSin leeSin = new LeeSin();
        Leblanc leblanc = new Leblanc();

        // GUI 변수 선언
        JFrame frame = new JFrame("리그 오브 레전드");

        // Frame 사이즈 설정
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Panel 객체화
        JPanel infoPanel = new JPanel();

        // JLabel 객체화
        JLabel imageLabel = new JLabel();
        JLabel gameInfoLabel = new JLabel("리그 오브 레전드에 오신 것을 환영합니다.");
        gameInfoLabel.setFont(new Font("Courier", Font.BOLD, 34));

        JLabel startInfoLabel = new JLabel("게임을 시작하시겠습니까?");
        startInfoLabel.setFont(new Font("Courier", Font.BOLD, 28));

        // Button 객체화
        JButton startBtn = new JButton("시작");
        JButton endBtn = new JButton("종료");

        // button, label 자유로운 위치 설정을 위한 null 설정
        infoPanel.setLayout(null);

        // button, label 위치 및 크기 지정
        gameInfoLabel.setBounds(105, 40, 620, 50);
        startInfoLabel.setBounds(262, 470, 400, 50);
        startBtn.setBounds( 280, 600, 100, 50);
        endBtn.setBounds(440, 600, 100, 50);

        // 이미지 가져오기
        ImageIcon background = new ImageIcon(Main.class.getResource("./image/img.jpg"));

        // ImageIcon 객체에서 Image 추출
        Image img = background.getImage();

        // 추출된 Image 크기를 조절하여 새로운 Image 객체 생성
        Image tempImg = img.getScaledInstance(800, 800, Image.SCALE_SMOOTH);

        // 새로운 ImageIcon 객체에 넣기
        ImageIcon updatedImg = new ImageIcon(tempImg);

        // 이미지 set 및 크기 설정
        imageLabel.setIcon(updatedImg);
        imageLabel.setBounds(0, 1, 800, 800);

        // Panel에 Label, Btn 추가
        infoPanel.add(gameInfoLabel);
        infoPanel.add(startInfoLabel);
        infoPanel.add(startBtn);
        infoPanel.add(endBtn);
        infoPanel.add(imageLabel);


        // 시작 이벤트
        event.startEvent(startBtn, infoPanel, frame);

        // 종료 이벤트
        event.endEvent(endBtn);


        frame.add(infoPanel);
        frame.setVisible(true);


        // 아이템 사용법
        leeSin.useItem(bluePotion, bluePotion.manaPlus);



//        System.out.println("---------------------------------------");
//        System.out.println("환영합니다.");
//        System.out.println("---------------------------------------");
//
//        System.out.println();
//
//        System.out.println("게임을 시작하시겠습니까?");
//
//
//        System.out.println("모드를 선택해주세요");
//
//        System.out.println();
//
//        System.out.println("---------------------------------------");
//        System.out.println("컴퓨터가 캐릭터를 선택합니다!");
//        System.out.println("캐릭터 선택 완료 - 르블랑");
//        leblanc.info();
//
//
//        System.out.println();
//
//        System.out.println("---------------------------------------");
//        System.out.println("플레이어가 캐릭터를 선택합니다!");
//        System.out.println("캐릭터를 선택해주세요!");
//        System.out.println("캐릭터 선택 완료 - 리신");
//        leeSin.info();
//
//        System.out.println();
//
//        System.out.println("---------------------------------------");
//        System.out.println("게임을 시작합니다!");
//        System.out.println("---------------------------------------");

    }
}
