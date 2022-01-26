package lol.gui;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lol.Main;

public class GuiEvent {

    // 챔피언 선택 이벤트를 위한 championImgList
    JButton[] championImgList = new JButton[8];

    // 시작 버튼 이벤트 메소드
    public void startEvent(JButton button, JPanel panel, Frame frame) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                choicePanel(frame);
            }
        });
    }

    // 종료 버튼 이벤트 메소드
    public void endEvent(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    // 챔피언 선택 Panel
    public void choicePanel(Frame frame) {

        JPanel panel = new JPanel();

        panel.setLayout(null);

        JLabel infoLabel = new JLabel("플레이어 챔피언 선택");

        JButton characterImg = new JButton();
        JLabel characterInfo = new JLabel("르블랑");

        JButton characterImg2 = new JButton();
        JLabel characterInfo2 = new JLabel("리 신");

        JButton characterImg3 = new JButton();
        JLabel characterInfo3 = new JLabel("애 쉬");

        JButton characterImg4 = new JButton();
        JLabel characterInfo4 = new JLabel("라 칸");

        JButton characterImg5 = new JButton();
        JLabel characterInfo5 = new JLabel("가 렌");

        JButton characterImg6 = new JButton();
        JLabel characterInfo6 = new JLabel("룰 루");

        JButton characterImg7 = new JButton();
        JLabel characterInfo7 = new JLabel("녹 턴");

        JButton characterImg8 = new JButton();
        JLabel characterInfo8 = new JLabel("라이즈");

        JLabel background = new JLabel();

        JLabel choiceInfo = new JLabel("Player ");
        JLabel choiceInfoBox = new JLabel();
        JLabel choiceInfo2 = new JLabel("Computer ");
        JLabel choiceInfoBox2 = new JLabel();

        // infoLabel 크기 설정 및 폰트 설정
        infoLabel.setBounds(250, 30, 620, 50);
        infoLabel.setFont(new Font("Courier", Font.BOLD, 32));

        // 이미지 생성 및 챔피언 정보 크기 설정
        createImage(characterImg, "./image/Leblanc.jpeg", 160, 240);
        characterImg.setBounds(40, 120, 160, 240);
        characterImg.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo.setBounds(92, 360, 160, 50);
        characterInfo.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg2, "./image/Leesin.jpeg", 160, 240);
        characterImg2.setBounds(220, 120, 160, 240);
        characterImg2.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo2.setBounds(270, 360, 160, 50);
        characterInfo2.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg3, "./image/Ashe.jpeg", 160, 240);
        characterImg3.setBounds(400, 120, 160, 240);
        characterImg3.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo3.setBounds(455, 360, 160, 50);
        characterInfo3.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg4, "./image/Rakan.jpeg", 160, 240);
        characterImg4.setBounds(580, 120, 160, 240);
        characterImg4.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo4.setBounds(630, 360, 160, 50);
        characterInfo4.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg5, "./image/Garen.jpeg", 160, 240);
        characterImg5.setBounds(40, 420, 160, 240);
        characterImg5.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo5.setBounds(90, 660, 160, 50);
        characterInfo5.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg6, "./image/Lulu.jpeg", 160, 240);
        characterImg6.setBounds(220, 420, 160, 240);
        characterImg6.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo6.setBounds(270, 660, 160, 50);
        characterInfo6.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg7, "./image/Nocturne.jpeg", 160, 240);
        characterImg7.setBounds(400, 420, 160, 240);
        characterImg7.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo7.setBounds(455, 660, 160, 50);
        characterInfo7.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg8, "./image/Ryze.jpeg", 160, 240);
        characterImg8.setBounds(580, 420, 160, 240);
        characterImg8.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo8.setBounds(625, 660, 160, 50);
        characterInfo8.setFont(new Font("Courier", Font.BOLD, 24));

        // 캐릭터 선택 크기 설정
        choiceInfo.setBounds(590, 62, 70, 60);
        choiceInfo.setFont(new Font("Courier", Font.BOLD, 10));
        choiceInfoBox.setBounds(632, 86, 20, 12);
        choiceInfoBox.setBorder(new LineBorder(Color.RED, 2));

        choiceInfo2.setBounds(663, 62, 70, 60);
        choiceInfo2.setFont(new Font("Courier", Font.BOLD, 10));
        choiceInfoBox2.setBounds(715, 86, 20, 12);
        choiceInfoBox2.setBorder(new LineBorder(Color.BLUE, 2));

        // 배경 이미지 크기 설정
        createImage(background, "./image/backImg.jpeg", 800, 800);
        background.setBounds(0, 1, 800, 800);


        // championImgList 배열에 값 할당
        championImgList[0] = characterImg;
        championImgList[1] = characterImg2;
        championImgList[2] = characterImg3;
        championImgList[3] = characterImg4;
        championImgList[4] = characterImg5;
        championImgList[5] = characterImg6;
        championImgList[6] = characterImg7;
        championImgList[7] = characterImg8;


        // panel에 추가
        panel.add(infoLabel);

        panel.add(characterImg);
        panel.add(characterInfo);
        panel.add(characterImg2);
        panel.add(characterInfo2);
        panel.add(characterImg3);
        panel.add(characterInfo3);
        panel.add(characterImg4);
        panel.add(characterInfo4);
        panel.add(characterImg5);
        panel.add(characterInfo5);
        panel.add(characterImg6);
        panel.add(characterInfo6);
        panel.add(characterImg7);
        panel.add(characterInfo7);
        panel.add(characterImg8);
        panel.add(characterInfo8);

        panel.add(choiceInfo);
        panel.add(choiceInfoBox);
        panel.add(choiceInfo2);
        panel.add(choiceInfoBox2);

        panel.add(background);

        // frame에 추가
        frame.add(panel);


        // 컴퓨터 및 플레이어 챔피언 선택
        clickEvent(characterImg);
        clickEvent(characterImg2);
        clickEvent(characterImg3);
        clickEvent(characterImg4);
        clickEvent(characterImg5);
        clickEvent(characterImg6);
        clickEvent(characterImg7);
        clickEvent(characterImg8);


        panel.setVisible(true);

    }

    // Button 이미지 생성 메소드
    public void createImage(JButton button, String imgUrl, int width, int height) {

        // 이미지 가져오기
        ImageIcon imageIcon = new ImageIcon(Main.class.getResource(imgUrl));

        // ImageIcon 객체에서 Image 추출
        Image image = imageIcon.getImage();

        // 추출된 Image 크기를 조절하여 새로운 Image 객체 생성
        Image tempImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // 새로운 ImageIcon 객체에 넣기
        ImageIcon newImage = new ImageIcon(tempImage);

        // 이미지 set
        button.setIcon(newImage);
    }

    // Label(background) 이미지 생성 메소드
    public void createImage(JLabel label, String imgUrl, int width, int height) {

        JButton jButton = new JButton();

        // 이미지 가져오기
        ImageIcon imageIcon = new ImageIcon(Main.class.getResource(imgUrl));

        // ImageIcon 객체에서 Image 추출
        Image image = imageIcon.getImage();

        // 추출된 Image 크기를 조절하여 새로운 Image 객체 생성
        Image tempImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // 새로운 ImageIcon 객체에 넣기
        ImageIcon newImage = new ImageIcon(tempImage);

        // 이미지 set
        label.setIcon(newImage);
    }


    // 플레이어 챔피언 선택시 이벤트 메소드
    public void clickEvent(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int randomNum = (int)(Math.random() * 8);

                if (e.getSource().equals(championImgList[0]) && championImgList[0] != championImgList[randomNum]) {
                    championImgList[1].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[2].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[3].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[4].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[5].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[6].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[7].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[0].setBorder(new LineBorder(Color.RED, 3));
                    championImgList[randomNum].setBorder(new LineBorder(Color.BLUE, 3));

                    // 게임 시작 Panal로 넘어간다.
                }
                if (e.getSource().equals(championImgList[1]) && championImgList[0] != championImgList[randomNum]) {
                    championImgList[0].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[2].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[3].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[4].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[5].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[6].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[7].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[1].setBorder(new LineBorder(Color.RED, 3));
                    championImgList[randomNum].setBorder(new LineBorder(Color.BLUE, 3));

                    // 게임 시작 Panal로 넘어간다.
                }
                if (e.getSource().equals(championImgList[2]) && championImgList[0] != championImgList[randomNum]) {
                    championImgList[0].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[1].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[3].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[4].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[5].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[6].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[7].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[2].setBorder(new LineBorder(Color.RED, 3));
                    championImgList[randomNum].setBorder(new LineBorder(Color.BLUE, 3));

                    // 게임 시작 Panal로 넘어간다.
                }
                if (e.getSource().equals(championImgList[3]) && championImgList[0] != championImgList[randomNum]) {
                    championImgList[0].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[1].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[2].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[4].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[5].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[6].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[7].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[3].setBorder(new LineBorder(Color.RED, 3));
                    championImgList[randomNum].setBorder(new LineBorder(Color.BLUE, 3));

                    // 게임 시작 Panal로 넘어간다.
                }
                if (e.getSource().equals(championImgList[4]) && championImgList[0] != championImgList[randomNum]) {
                    championImgList[0].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[1].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[2].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[3].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[5].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[6].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[7].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[4].setBorder(new LineBorder(Color.RED, 3));
                    championImgList[randomNum].setBorder(new LineBorder(Color.BLUE, 3));

                    // 게임 시작 Panal로 넘어간다.
                }
                if (e.getSource().equals(championImgList[5]) && championImgList[0] != championImgList[randomNum]) {
                    championImgList[0].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[1].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[2].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[3].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[4].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[6].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[7].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[5].setBorder(new LineBorder(Color.RED, 3));
                    championImgList[randomNum].setBorder(new LineBorder(Color.BLUE, 3));

                    // 게임 시작 Panal로 넘어간다.
                }
                if (e.getSource().equals(championImgList[6]) && championImgList[0] != championImgList[randomNum]) {
                    championImgList[0].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[1].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[2].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[3].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[4].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[5].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[7].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[6].setBorder(new LineBorder(Color.RED, 3));
                    championImgList[randomNum].setBorder(new LineBorder(Color.BLUE, 3));

                    // 게임 시작 Panal로 넘어간다.
                }
                if (e.getSource().equals(championImgList[7]) && championImgList[0] != championImgList[randomNum]) {
                    championImgList[0].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[1].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[2].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[3].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[4].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[5].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[6].setBorder(new LineBorder(Color.BLACK, 3));
                    championImgList[7].setBorder(new LineBorder(Color.RED, 3));
                    championImgList[randomNum].setBorder(new LineBorder(Color.BLUE, 3));

                    // 게임 시작 Panal로 넘어간다.
                }

            }
        });

    }
}
