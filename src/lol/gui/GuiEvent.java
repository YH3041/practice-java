package lol.gui;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lol.Main;
import lol.champion.Ashe;
import lol.champion.Garen;
import lol.champion.Leblanc;
import lol.champion.LeeSin;
import lol.champion.Lulu;
import lol.champion.Nocturn;
import lol.champion.Rakan;
import lol.champion.Ryze;

public class GuiEvent {

    // 챔피언을 사용하기 위한 객체화
    Ashe ashe = new Ashe();
    Garen garen = new Garen();
    Leblanc leblanc = new Leblanc();
    LeeSin leeSin = new LeeSin();
    Lulu lulu = new Lulu();
    Nocturn nocturn = new Nocturn();
    Rakan rakan = new Rakan();
    Ryze ryze = new Ryze();

    // 챔피언 선택 이벤트를 위한 championImgList
    JButton[] championImgList = new JButton[8];

    // 선택된 캐릭터 정보를 불러오기 위한 변수
    String player = "";
    String computer = "";

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

    // 챔피언 선택 Panel 보여주는 메소드
    public void choicePanel(Frame frame) {
        JPanel panel = new JPanel();

        panel.setLayout(null);

        JLabel infoLabel = new JLabel("플레이어 챔피언 선택");

        JButton characterImg = new JButton();
        JLabel characterInfo = new JLabel(leblanc.name);

        JButton characterImg2 = new JButton();
        JLabel characterInfo2 = new JLabel(leeSin.name);

        JButton characterImg3 = new JButton();
        JLabel characterInfo3 = new JLabel(ashe.name);

        JButton characterImg4 = new JButton();
        JLabel characterInfo4 = new JLabel(rakan.name);

        JButton characterImg5 = new JButton();
        JLabel characterInfo5 = new JLabel(garen.name);

        JButton characterImg6 = new JButton();
        JLabel characterInfo6 = new JLabel(lulu.name);

        JButton characterImg7 = new JButton();
        JLabel characterInfo7 = new JLabel(nocturn.name);

        JButton characterImg8 = new JButton();
        JLabel characterInfo8 = new JLabel(ryze.name);

        JLabel background = new JLabel();

        JLabel choiceInfo = new JLabel("Player ");
        JLabel choiceInfoBox = new JLabel();
        JLabel choiceInfo2 = new JLabel("Computer ");
        JLabel choiceInfoBox2 = new JLabel();

        // infoLabel 크기 설정 및 폰트 설정
        infoLabel.setBounds(250, 30, 620, 50);
        infoLabel.setFont(new Font("Courier", Font.BOLD, 32));

        // 이미지 생성 및 챔피언 정보 크기 설정
        createImage(characterImg, "./image/leblanc/leblanc.jpeg", 160, 240);
        characterImg.setName("Leblanc");
        characterImg.setBounds(40, 120, 160, 240);
        characterImg.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo.setBounds(75, 360, 160, 50);
        characterInfo.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg2, "./image/leesin/leesin.jpeg", 160, 240);
        characterImg2.setName("Leesin");
        characterImg2.setBounds(220, 120, 160, 240);
        characterImg2.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo2.setBounds(260, 360, 160, 50);
        characterInfo2.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg3, "./image/ashe/ashe.jpeg", 160, 240);
        characterImg3.setName("Ashe");
        characterImg3.setBounds(400, 120, 160, 240);
        characterImg3.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo3.setBounds(455, 360, 160, 50);
        characterInfo3.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg4, "./image/rakan/rakan.jpeg", 160, 240);
        characterImg4.setName("Rakan");
        characterImg4.setBounds(580, 120, 160, 240);
        characterImg4.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo4.setBounds(625, 360, 160, 50);
        characterInfo4.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg5, "./image/garen/garen.jpeg", 160, 240);
        characterImg5.setName("Garen");
        characterImg5.setBounds(40, 420, 160, 240);
        characterImg5.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo5.setBounds(85, 660, 160, 50);
        characterInfo5.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg6, "./image/lulu/lulu.jpeg", 160, 240);
        characterImg6.setName("Lulu");
        characterImg6.setBounds(220, 420, 160, 240);
        characterImg6.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo6.setBounds(265, 660, 160, 50);
        characterInfo6.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg7, "./image/nocturn/nocturn.jpeg", 160, 240);
        characterImg7.setName("Nocturn");
        characterImg7.setBounds(400, 420, 160, 240);
        characterImg7.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo7.setBounds(430, 660, 160, 50);
        characterInfo7.setFont(new Font("Courier", Font.BOLD, 24));

        createImage(characterImg8, "./image/ryze/ryze.jpeg", 160, 240);
        characterImg8.setName("Ryze");
        characterImg8.setBounds(580, 420, 160, 240);
        characterImg8.setBorder(new LineBorder(Color.BLACK, 3));
        characterInfo8.setBounds(630, 660, 160, 50);
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
        clickEvent(characterImg, panel, frame);
        clickEvent(characterImg2, panel, frame);
        clickEvent(characterImg3, panel, frame);
        clickEvent(characterImg4, panel, frame);
        clickEvent(characterImg5, panel, frame);
        clickEvent(characterImg6, panel, frame);
        clickEvent(characterImg7, panel, frame);
        clickEvent(characterImg8, panel, frame);

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
    public void clickEvent(JButton button, JPanel panel, Frame frame) {
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

                    player = championImgList[0].getName();
                    computer = championImgList[randomNum].getName();

                    try {
                        // 선택 후 로딩창까지 딜레이를 위한 Schedule
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        executorService.scheduleAtFixedRate(new Runnable() {
                            @Override
                            public void run() {
                                if (player != (computer)) {
                                    panel.setVisible(false);
                                }
                            }
                        }, 2, 1, TimeUnit.SECONDS);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    // 챔피언 선택 결과를 보여주는 메소드
                    showChampionInfoPanel(frame, button);
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

                    player = championImgList[1].getName();
                    computer = championImgList[randomNum].getName();

                    try {
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        executorService.scheduleAtFixedRate(new Runnable() {
                            @Override
                            public void run() {
                                if (player != (computer)) {
                                    panel.setVisible(false);
                                }
                            }
                        }, 2, 1, TimeUnit.SECONDS);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    showChampionInfoPanel(frame, button);
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

                    player = championImgList[2].getName();
                    computer = championImgList[randomNum].getName();

                    try {
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        executorService.scheduleAtFixedRate(new Runnable() {
                            @Override
                            public void run() {
                                if (player != (computer)) {
                                    panel.setVisible(false);
                                }
                            }
                        }, 2, 1, TimeUnit.SECONDS);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    showChampionInfoPanel(frame, button);
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

                    player = championImgList[3].getName();
                    computer = championImgList[randomNum].getName();

                    try {
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        executorService.scheduleAtFixedRate(new Runnable() {
                            @Override
                            public void run() {
                                if (player != (computer)) {
                                    panel.setVisible(false);
                                }
                            }
                        }, 2, 1, TimeUnit.SECONDS);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    showChampionInfoPanel(frame, button);
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

                    player = championImgList[4].getName();
                    computer = championImgList[randomNum].getName();

                    try {
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        executorService.scheduleAtFixedRate(new Runnable() {
                            @Override
                            public void run() {
                                if (player != (computer)) {
                                    panel.setVisible(false);
                                }
                            }
                        }, 2, 1, TimeUnit.SECONDS);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    showChampionInfoPanel(frame, button);
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

                    player = championImgList[5].getName();
                    computer = championImgList[randomNum].getName();

                    try {
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        executorService.scheduleAtFixedRate(new Runnable() {
                            @Override
                            public void run() {
                                if (player != (computer)) {
                                    panel.setVisible(false);
                                }
                            }
                        }, 2, 1, TimeUnit.SECONDS);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    showChampionInfoPanel(frame, button);

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

                    player = championImgList[6].getName();
                    computer = championImgList[randomNum].getName();

                    try {
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        executorService.scheduleAtFixedRate(new Runnable() {
                            @Override
                            public void run() {
                                if (player != (computer)) {
                                    panel.setVisible(false);
                                }
                            }
                        }, 2, 1, TimeUnit.SECONDS);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    showChampionInfoPanel(frame, button);
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

                    player = championImgList[7].getName();
                    computer = championImgList[randomNum].getName();

                    try {
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        executorService.scheduleAtFixedRate(new Runnable() {
                            @Override
                            public void run() {
                                if (player != (computer)) {
                                    panel.setVisible(false);
                                }
                            }
                        }, 2, 1, TimeUnit.SECONDS);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    showChampionInfoPanel(frame, button);
                }

            }
        });

    }

    // 챔피언 선택 후 챔피언 정보 Panel 보여주기 메소드
    public void showChampionInfoPanel(Frame frame, JButton button) {

        JPanel newPanel = new JPanel();

        JLabel playerInfo = new JLabel("Player");
        JLabel characterImg = new JLabel();
        JLabel characterInfo = new JLabel(player);

        JLabel vs = new JLabel("vs");

        JLabel computerInfo = new JLabel("Computer");
        JLabel characterImg2 = new JLabel();
        JLabel characterInfo2 = new JLabel(computer);

        JLabel loading = new JLabel("Loading...");

        JLabel background = new JLabel();

        newPanel.setLayout(null);

        // 선택된 캐릭터 정보 이미지 가져오기
        if (button.getName().equals(player)) {

            playerInfo.setBounds(145, 90, 180, 70);
            playerInfo.setFont(new Font("Courier", Font.BOLD, 28));
            createImage(characterImg, "./image/" + player + "/" + player + ".jpeg", 300, 350);
            characterImg.setBounds(70, 150, 250, 350);
            characterImg.setBorder(new LineBorder(Color.RED, 3));
            characterInfo.setBounds(153, 500, 120, 50);
            characterInfo.setFont(new Font("Courier", Font.BOLD, 28));

            vs.setBounds(370, 260, 100, 100);
            vs.setFont(new Font("Courier", Font.BOLD, 50));

            computerInfo.setBounds(546, 90, 180, 70);
            computerInfo.setFont(new Font("Courier", Font.BOLD, 28));
            createImage(characterImg2, "./image/" + computer + "/" + computer + ".jpeg", 300, 350);
            characterImg2.setBounds(480, 150, 250, 350);
            characterImg2.setBorder(new LineBorder(Color.BLUE, 3));
            characterInfo2.setBounds(566, 500, 120, 50);
            characterInfo2.setFont(new Font("Courier", Font.BOLD, 28));

            loading.setBounds(312, 600, 250, 70);
            loading.setFont(new Font("Courier", Font.BOLD, 40));

        }

        // 배경 이미지 크기 설정
        createImage(background, "./image/backImg.jpeg", 800, 800);
        background.setBounds(0, 1, 800, 800);

        newPanel.add(playerInfo);
        newPanel.add(characterImg);
        newPanel.add(characterInfo);
        newPanel.add(vs);
        newPanel.add(computerInfo);
        newPanel.add(characterImg2);
        newPanel.add(characterInfo2);
        newPanel.add(loading);
        newPanel.add(background);

        frame.add(newPanel);

        newPanel.setVisible(true);

        try {
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    newPanel.setVisible(false);
                    executorService.shutdown();
                    newPanel.setVisible(true);
                    showMatchPanel(frame);
                    newPanel.setVisible(false);
                    showMatchPanel(frame);
                }
            }, 4, 1, TimeUnit.SECONDS);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    // 대전을 보여주는 Panel 메소드
    public void showMatchPanel(Frame frame) {

        Panel newPanel = new Panel();

        newPanel.setVisible(true);

        JLabel playerInfo = new JLabel("Player");
        JLabel playerImg = new JLabel();

        JLabel vs = new JLabel("vs");

        JLabel computerInfo = new JLabel("Computer");
        JLabel computerImg = new JLabel();

        JLabel actionContainer = new JLabel();

        JLabel attackInfo = new JLabel("공격");
        JButton attackButton = new JButton();

        JLabel missInfo = new JLabel("방어");
        JButton missButton = new JButton();

        JLabel itemInfo = new JLabel("아이템");
        JButton useItemButton = new JButton();

        JLabel skillInfo1 = new JLabel("스킬1");
        JButton skillButton1 = new JButton();

        JLabel skillInfo2 = new JLabel("스킬2");
        JButton skillButton2 = new JButton();

        JLabel skillInfo3 = new JLabel("스킬3");
        JButton skillButton3 = new JButton();

        JLabel skillInfo4 = new JLabel("스킬4");
        JButton skillButton4 = new JButton();

        JLabel background = new JLabel();

        newPanel.setLayout(null);

        // 선택된 캐릭터 정보 이미지 가져오기
        playerInfo.setBounds(112, 367, 120, 70);
        playerInfo.setForeground(Color.RED);
        playerInfo.setFont(new Font("Courier", Font.ITALIC, 28));
        createImage(playerImg, "./image/" + player + "/" + player + ".jpeg", 300, 350);
        playerImg.setBounds(20, 420, 280, 320);
        playerImg.setBorder(new LineBorder(Color.BLACK, 2));

        vs.setBounds(355, 325, 100, 100);
        vs.setFont(new Font("Courier", Font.BOLD, 50));

        computerInfo.setBounds(563, -18, 140, 70);
        computerInfo.setForeground(Color.BLUE);
        computerInfo.setFont(new Font("Courier", Font.ITALIC, 28));
        createImage(computerImg, "./image/" + computer + "/" + computer + ".jpeg", 300, 350);
        computerImg.setBounds(488, 35, 280, 320);
        computerImg.setBorder(new LineBorder(Color.BLACK, 2));


        // 플레이어의 공격 및 스킬 Label, Button 설정
        actionContainer.setBounds(430,421, 340, 318);
        actionContainer.setBorder(new LineBorder(Color.BLACK, 1));

        attackInfo.setBounds(480, 435, 70, 70);
        attackInfo.setFont(new Font("Courier", Font.BOLD, 18));
        attackButton.setBounds(460, 480, 70, 70);
        attackButton.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(attackButton, "./image/attack.png", 70, 70);

        missInfo.setBounds(585, 435, 70, 70);
        missInfo.setFont(new Font("Courier", Font.BOLD, 18));
        missButton.setBounds(565, 480, 70, 70);
        missButton.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(missButton, "./image/miss.png", 70, 70);

        itemInfo.setBounds(682, 435, 70, 70);
        itemInfo.setFont(new Font("Courier", Font.BOLD, 18));
        useItemButton.setBounds(670, 480, 70, 70);
        useItemButton.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(useItemButton, "./image/red_potion.png", 70, 70);

        skillInfo1.setBounds(455, 570, 70, 70);
        skillInfo1.setFont(new Font("Courier", Font.BOLD, 18));
        skillButton1.setBounds(440, 615, 70, 70);
        skillButton1.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(skillButton1, "./image/" + player +  "/" + player + "_skill1.png", 70, 70);

        skillInfo2.setBounds(540, 570, 70, 70);
        skillInfo2.setFont(new Font("Courier", Font.BOLD, 18));
        skillButton2.setBounds(525, 615, 70, 70);
        skillButton2.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(skillButton2, "./image/" + player +  "/" + player + "_skill2.png", 70, 70);

        skillInfo3.setBounds(625, 570, 70, 70);
        skillInfo3.setFont(new Font("Courier", Font.BOLD, 18));
        skillButton3.setBounds(610, 615, 70, 70);
        skillButton3.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(skillButton3, "./image/" + player +  "/" + player + "_skill3.png", 70, 70);

        skillInfo4.setBounds(705, 570, 70, 70);
        skillInfo4.setFont(new Font("Courier", Font.BOLD, 18));
        skillButton4.setBounds(690, 615, 70, 70);
        skillButton4.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(skillButton4, "./image/" + player +  "/" + player + "_skill4.png", 70, 70);


        // 배경 이미지 크기 설정
        createImage(background, "./image/backImg.jpeg", 800, 800);
        background.setBounds(0, 1, 800, 800);

        newPanel.add(playerInfo);
        newPanel.add(playerImg);

        newPanel.add(actionContainer);

        newPanel.add(attackInfo);
        newPanel.add(missInfo);
        newPanel.add(itemInfo);
        newPanel.add(attackButton);
        newPanel.add(missButton);
        newPanel.add(useItemButton);

        newPanel.add(skillInfo1);
        newPanel.add(skillInfo2);
        newPanel.add(skillInfo3);
        newPanel.add(skillInfo4);
        newPanel.add(skillButton1);
        newPanel.add(skillButton2);
        newPanel.add(skillButton3);
        newPanel.add(skillButton4);

        newPanel.add(vs);

        newPanel.add(computerInfo);
        newPanel.add(computerImg);

        newPanel.add(background);

        frame.add(newPanel);

    }
}
