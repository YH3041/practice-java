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
import lol.champion.Champion;
import lol.champion.Garen;
import lol.champion.Leblanc;
import lol.champion.LeeSin;
import lol.champion.Lulu;
import lol.champion.Nocturn;
import lol.champion.Rakan;
import lol.champion.Ryze;

public class GuiEvent {

    // 선택된 챔피언 정보를 가져오기 위한 객체 리스트
    Champion[] championList = new Champion[8];

    // 챔피언 선택 이벤트를 위한 championImgList
    JButton[] championImgList = new JButton[8];

    // 챔피언을 사용하기 위한 객체화
    Ashe ashe = new Ashe();
    Garen garen = new Garen();
    Leblanc leblanc = new Leblanc();
    LeeSin leeSin = new LeeSin();
    Lulu lulu = new Lulu();
    Nocturn nocturn = new Nocturn();
    Rakan rakan = new Rakan();
    Ryze ryze = new Ryze();

    // 선택된 캐릭터 정보를 불러오기 위한 변수
    String player = "";
    String computer = "";
    Champion currentPlayerChampion = null;
    Champion currentComputerChampion = null;


    // 공격턴을 관리하기 위한 변수
    int attackCount = 1;
    boolean playerTurn = true;

    // 시작 버튼 이벤트 메소드
    public void startEvent(JButton button, JPanel panel, Frame frame) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // List에 각 챔피언 객체 할당
                championList[0] = (ashe);
                championList[1] = (garen);
                championList[2] = (leblanc);
                championList[3] = (leeSin);
                championList[4] = (lulu);
                championList[5] = (nocturn);
                championList[6] = (rakan);
                championList[7] = (ryze);

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


        // championImgList 배열에 각 챔피언 이미지 값 할당
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

                    // 선택된 챔피언 할당을 위한 for문
                    for (int i = 0; i < championList.length; i++) {
                        if (player.equals(championList[i].name)) {
                            currentPlayerChampion = championList[i];
                        }
                        if (computer.equals(championList[i].name)) {
                            currentComputerChampion = championList[i];
                        }
                    }

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

                    for (int i = 0; i < championList.length; i++) {
                        if (player.equals(championList[i].name)) {
                            currentPlayerChampion = championList[i];
                        }
                        if (computer.equals(championList[i].name)) {
                            currentComputerChampion = championList[i];
                        }
                    }

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

                    for (int i = 0; i < championList.length; i++) {
                        if (player.equals(championList[i].name)) {
                            currentPlayerChampion = championList[i];
                        }
                        if (computer.equals(championList[i].name)) {
                            currentComputerChampion = championList[i];
                        }
                    }

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

                    for (int i = 0; i < championList.length; i++) {
                        if (player.equals(championList[i].name)) {
                            currentPlayerChampion = championList[i];
                        }
                        if (computer.equals(championList[i].name)) {
                            currentComputerChampion = championList[i];
                        }
                    }

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

                    for (int i = 0; i < championList.length; i++) {
                        if (player.equals(championList[i].name)) {
                            currentPlayerChampion = championList[i];
                        }
                        if (computer.equals(championList[i].name)) {
                            currentComputerChampion = championList[i];
                        }
                    }

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

                    for (int i = 0; i < championList.length; i++) {
                        if (player.equals(championList[i].name)) {
                            currentPlayerChampion = championList[i];
                        }
                        if (computer.equals(championList[i].name)) {
                            currentComputerChampion = championList[i];
                        }
                    }

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

                    for (int i = 0; i < championList.length; i++) {
                        if (player.equals(championList[i].name)) {
                            currentPlayerChampion = championList[i];
                        }
                        if (computer.equals(championList[i].name)) {
                            currentComputerChampion = championList[i];
                        }
                    }

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

                    for (int i = 0; i < championList.length; i++) {
                        if (player.equals(championList[i].name)) {
                            currentPlayerChampion = championList[i];
                        }
                        if (computer.equals(championList[i].name)) {
                            currentComputerChampion = championList[i];
                        }
                    }

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

        newPanel.setVisible(true);

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

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                newPanel.setVisible(false);
                showMatchPanel(frame);
            }
        });
        timer.setRepeats(false);
        timer.start();

    }

    // 대전 화면을 보여주는 메소드
    public void showMatchPanel(Frame frame) {

        Panel panel = new Panel();

        panel.setLayout(null);

        JLabel playerInfo = new JLabel("Player");
        JLabel playerImg = new JLabel();

        JLabel playerHpInfo = new JLabel("HP");
        JLabel playerHp = new JLabel(String.valueOf(currentPlayerChampion.hp));
        JLabel playerMpInfo = new JLabel("MP");
        JLabel playerMp = new JLabel(String.valueOf(currentPlayerChampion.mp));

        JLabel vs = new JLabel("vs");

        JLabel computerInfo = new JLabel("Computer");
        JLabel computerImg = new JLabel();

        JLabel computerHpInfo = new JLabel("HP");
        JLabel computerHp = new JLabel(String.valueOf(currentComputerChampion.hp));
        JLabel computerMpInfo = new JLabel("MP");
        JLabel computerMp = new JLabel(String.valueOf(currentComputerChampion.mp));

        JLabel actionContainer = new JLabel();

        JLabel attackTitle = new JLabel("공격");
        JButton attackButton = new JButton();

        JLabel missTitle = new JLabel("방어");
        JButton missButton = new JButton();

        JLabel itemTitle = new JLabel("아이템");
        JButton useItemButton = new JButton();

        JLabel skillTitle1 = new JLabel("스킬1");
        JButton skillButton1 = new JButton();

        JLabel skillTitle2 = new JLabel("스킬2");
        JButton skillButton2 = new JButton();

        JLabel skillTitle3 = new JLabel("스킬3");
        JButton skillButton3 = new JButton();

        JLabel skillTitle4 = new JLabel("스킬4");
        JButton skillButton4 = new JButton();

        JLabel battleInfo = new JLabel("대전을 시작합니다.");
        JLabel battleInfo2 = new JLabel("");

        JLabel background = new JLabel();

        playerHpInfo.setBounds(320, 385, 100, 100);
        playerHpInfo.setFont(new Font("Courier", Font.BOLD, 30));
        playerHp.setBounds(321, 415, 100, 100);
        playerHp.setFont(new Font("Courier", Font.ITALIC, 28));

        playerMpInfo.setBounds(320, 450, 100, 100);
        playerMpInfo.setFont(new Font("Courier", Font.BOLD, 30));
        playerMp.setBounds(321, 480, 100, 100);
        playerMp.setFont(new Font("Courier", Font.ITALIC, 28));

        // 선택된 캐릭터 정보 이미지 가져오기
        playerInfo.setBounds(112, 367, 120, 70);
        playerInfo.setForeground(Color.RED);
        playerInfo.setFont(new Font("Courier", Font.ITALIC, 28));
        createImage(playerImg, "./image/" + player + "/" + player + ".jpeg", 300, 350);
        playerImg.setBounds(20, 420, 280, 320);
        playerImg.setBorder(new LineBorder(Color.BLACK, 2));

        playerHpInfo.setBounds(320, 385, 100, 100);
        playerHpInfo.setFont(new Font("Courier", Font.BOLD, 30));
        playerHp.setBounds(321, 415, 100, 100);
        playerHp.setFont(new Font("Courier", Font.ITALIC, 28));

        playerMpInfo.setBounds(320, 450, 100, 100);
        playerMpInfo.setFont(new Font("Courier", Font.BOLD, 30));
        playerMp.setBounds(321, 480, 100, 100);
        playerMp.setFont(new Font("Courier", Font.ITALIC, 28));

        vs.setBounds(350, 330, 100, 100);
        vs.setFont(new Font("Courier", Font.BOLD, 50));

        computerInfo.setBounds(563, -18, 140, 70);
        computerInfo.setForeground(Color.BLUE);
        computerInfo.setFont(new Font("Courier", Font.ITALIC, 28));
        createImage(computerImg, "./image/" + computer + "/" + computer + ".jpeg", 300, 350);
        computerImg.setBounds(488, 35, 280, 320);
        computerImg.setBorder(new LineBorder(Color.BLACK, 2));

        computerHpInfo.setBounds(420, 0, 100, 100);
        computerHpInfo.setFont(new Font("Courier", Font.BOLD, 30));
        computerHp.setBounds(420, 25, 100, 100);
        computerHp.setFont(new Font("Courier", Font.ITALIC, 28));

        computerMpInfo.setBounds(420, 65, 100, 100);
        computerMpInfo.setFont(new Font("Courier", Font.BOLD, 30));
        computerMp.setBounds(420, 90, 100, 100);
        computerMp.setFont(new Font("Courier", Font.ITALIC, 28));


        // 플레이어의 공격 및 스킬 Label, Button 설정(위치 등)
        actionContainer.setBounds(430,421, 340, 318);
        actionContainer.setBorder(new LineBorder(Color.BLACK, 1));

        attackTitle.setBounds(480, 435, 70, 70);
        attackTitle.setFont(new Font("Courier", Font.BOLD, 18));
        attackButton.setBounds(460, 480, 70, 70);
        attackButton.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(attackButton, "./image/attack.png", 70, 70);

        missTitle.setBounds(585, 435, 70, 70);
        missTitle.setFont(new Font("Courier", Font.BOLD, 18));
        missButton.setBounds(565, 480, 70, 70);
        missButton.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(missButton, "./image/miss.png", 70, 70);

        itemTitle.setBounds(682, 435, 70, 70);
        itemTitle.setFont(new Font("Courier", Font.BOLD, 18));
        useItemButton.setBounds(670, 480, 70, 70);
        useItemButton.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(useItemButton, "./image/red_potion.png", 70, 70);

        skillTitle1.setBounds(455, 570, 70, 70);
        skillTitle1.setFont(new Font("Courier", Font.BOLD, 18));
        skillButton1.setBounds(440, 615, 70, 70);
        skillButton1.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(skillButton1, "./image/" + player +  "/" + player + "_skill1.png", 70, 70);

        skillTitle2.setBounds(540, 570, 70, 70);
        skillTitle2.setFont(new Font("Courier", Font.BOLD, 18));
        skillButton2.setBounds(525, 615, 70, 70);
        skillButton2.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(skillButton2, "./image/" + player +  "/" + player + "_skill2.png", 70, 70);

        skillTitle3.setBounds(625, 570, 70, 70);
        skillTitle3.setFont(new Font("Courier", Font.BOLD, 18));
        skillButton3.setBounds(610, 615, 70, 70);
        skillButton3.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(skillButton3, "./image/" + player +  "/" + player + "_skill3.png", 70, 70);

        skillTitle4.setBounds(705, 570, 70, 70);
        skillTitle4.setFont(new Font("Courier", Font.BOLD, 18));
        skillButton4.setBounds(690, 615, 70, 70);
        skillButton4.setBorder(new LineBorder(Color.BLACK, 1));
        createImage(skillButton4, "./image/" + player +  "/" + player + "_skill4.png", 70, 70);

        battleInfo.setBounds(60, 50, 440, 280);
        battleInfo.setFont(new Font("Courier", Font.BOLD, 30));
        battleInfo2.setBounds(60, 100, 440, 280);
        battleInfo2.setFont(new Font("Courier", Font.ITALIC, 26));

        // 배경 이미지 크기 설정
        createImage(background, "./image/backImg.jpeg", 800, 800);
        background.setBounds(0, 1, 800, 800);

        panel.add(playerInfo);
        panel.add(playerImg);
        panel.add(playerHpInfo);
        panel.add(playerHp);
        panel.add(playerMpInfo);
        panel.add(playerMp);

        panel.add(actionContainer);

        panel.add(attackTitle);
        panel.add(missTitle);
        panel.add(itemTitle);
        panel.add(attackButton);
        panel.add(missButton);
        panel.add(useItemButton);

        panel.add(skillTitle1);
        panel.add(skillTitle2);
        panel.add(skillTitle3);
        panel.add(skillTitle4);
        panel.add(skillButton1);
        panel.add(skillButton2);
        panel.add(skillButton3);
        panel.add(skillButton4);

        panel.add(vs);

        panel.add(computerInfo);
        panel.add(computerImg);
        panel.add(computerHpInfo);
        panel.add(computerHp);
        panel.add(computerMpInfo);
        panel.add(computerMp);

        panel.add(battleInfo);
        panel.add(battleInfo2);

        panel.add(background);

        frame.add(panel);


        // 플레이어 공격 메소드
        attackEvent(frame, panel, attackButton, computerHp, battleInfo, battleInfo2);
        skillEvent(skillButton1, skillButton2, skillButton3, skillButton4, computerHp, playerMp,
                battleInfo, battleInfo2, frame, panel);


        // 특정 시간마다 컴퓨터의 공격을 위한 스케줄러
        try {
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    // 컴퓨터 공격 메소드
                    randomAttackComputerEvent(playerHp, battleInfo, battleInfo2, frame, panel);
                }
            }, 6, 1, TimeUnit.SECONDS);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


    // 플레이어 공격 버튼 이벤트 메소드
    public void attackEvent(Frame frame, Panel panel, JButton button, JLabel computerHp, JLabel battleInfo, JLabel battleInfo2) {
        if (attackCount == 1 && playerTurn == true) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentPlayerChampion.attack(currentPlayerChampion, currentComputerChampion);
                    computerHp.setText(String.valueOf(currentComputerChampion.hp));
                    attackCount = 0;
                    playerTurn = false;
                    battleInfo2.setForeground(Color.RED);
                    battleInfo2.setText(currentPlayerChampion.name + "의 공격 데미지 : " + currentPlayerChampion.power);
                    battleInfo.setText("컴퓨터 공격 준비중...");
                    if (currentComputerChampion.hp <= 0) {
                        currentComputerChampion.hp = 0;
                        battleInfo.setText("Game Over");
                        battleInfo2.setText("잠시 후 Winner 페이지로 넘어 갑니다.");
                        Timer timer = new Timer(2000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent arg0) {
                                panel.setVisible(false);
                                winnerPanel(frame);
                            }
                        });
                        timer.setRepeats(false);
                        timer.start();
                    }
                }
            });
        } else {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    battleInfo.setText("컴퓨터가 공격할 차례입니다.");
                }
            });
        }

    }

    // 플레이어 스킬 버튼 이벤트 메소드
    public void skillEvent(JButton skillBtn1, JButton skillBtn2, JButton skillBtn3, JButton skillBtn4,
                           JLabel computerHp , JLabel playerMp, JLabel battleInfo, JLabel battleInfo2,
                           Frame frame, Panel panel) {

        skillBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (attackCount == 1 && playerTurn == true) {

                    if (currentPlayerChampion.mp <= 0) {
                        computerHp.setText(String.valueOf(0));
                        battleInfo2.setText("마나가 부족합니다.");
                    } else {
                        currentPlayerChampion.skill1(currentPlayerChampion, currentComputerChampion);
                        computerHp.setText(String.valueOf(currentComputerChampion.hp));
                        playerMp.setText(String.valueOf(currentPlayerChampion.mp));
                        attackCount = 0;
                        playerTurn = false;
                        battleInfo2.setForeground(Color.RED);
                        battleInfo2.setText(currentPlayerChampion.name + "의 스킬 1 데미지 : " + 50);
                        battleInfo.setText("컴퓨터 공격 준비중...");
                    }
                } else {
                    battleInfo.setText("컴퓨터가 공격할 차례입니다.");
                }
                if (currentComputerChampion.hp <= 0) {
                    battleInfo.setText("Game Over");
                    battleInfo2.setText("잠시 후 Winner 페이지로 넘어 갑니다.");
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
        });

        skillBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (attackCount == 1 && playerTurn == true) {

                    if (currentPlayerChampion.mp <= 0) {
                        computerHp.setText(String.valueOf(0));
                        battleInfo2.setText("마나가 부족합니다.");
                    } else {
                        currentPlayerChampion.skill2(currentPlayerChampion, currentComputerChampion);
                        computerHp.setText(String.valueOf(currentComputerChampion.hp));
                        playerMp.setText(String.valueOf(currentPlayerChampion.mp));
                        attackCount = 0;
                        playerTurn = false;
                        battleInfo2.setForeground(Color.RED);
                        battleInfo2.setText(currentPlayerChampion.name + "의 스킬 2 데미지 : " + 50);
                        battleInfo.setText("컴퓨터 공격 준비중...");
                    }
                } else {
                    battleInfo.setText("컴퓨터가 공격할 차례입니다.");
                }
                if (currentComputerChampion.hp <= 0) {
                    battleInfo.setText("Game Over");
                    battleInfo2.setText("잠시 후 Winner 페이지로 넘어 갑니다.");
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
        });

        skillBtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (attackCount == 1 && playerTurn == true) {

                    if (currentPlayerChampion.mp <= 0) {
                        computerHp.setText(String.valueOf(0));
                        battleInfo2.setText("마나가 부족합니다.");
                    } else {
                        currentPlayerChampion.skill3(currentPlayerChampion, currentComputerChampion);
                        computerHp.setText(String.valueOf(currentComputerChampion.hp));
                        playerMp.setText(String.valueOf(currentPlayerChampion.mp));
                        attackCount = 0;
                        playerTurn = false;
                        battleInfo2.setForeground(Color.RED);
                        battleInfo2.setText(currentPlayerChampion.name + "의 스킬 3 데미지 : " + 100);
                        battleInfo.setText("컴퓨터 공격 준비중...");
                    }
                } else {
                    battleInfo.setText("컴퓨터가 공격할 차례입니다.");
                }
                if (currentComputerChampion.hp <= 0) {
                    battleInfo.setText("Game Over");
                    battleInfo2.setText("잠시 후 Winner 페이지로 넘어 갑니다.");
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }

            }
        });

        skillBtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (attackCount == 1 && playerTurn == true) {

                    if (currentPlayerChampion.mp <= 0) {
                        computerHp.setText(String.valueOf(0));
                        battleInfo2.setText("마나가 부족합니다.");
                    } else {
                        currentPlayerChampion.skill4(currentPlayerChampion, currentComputerChampion);
                        computerHp.setText(String.valueOf(currentComputerChampion.hp));
                        playerMp.setText(String.valueOf(currentPlayerChampion.mp));
                        attackCount = 0;
                        playerTurn = false;
                        battleInfo2.setForeground(Color.RED);
                        battleInfo2.setText(currentPlayerChampion.name + "의 스킬 4 데미지 : " + 150);
                        battleInfo.setText("컴퓨터 공격 준비중...");
                    }
                } else {
                    battleInfo.setText("컴퓨터가 공격할 차례입니다.");
                }
                if (currentComputerChampion.hp <= 0) {
                    battleInfo.setText("Game Over");
                    battleInfo2.setText("잠시 후 Winner 페이지로 넘어 갑니다.");
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
        });
    }

    // 컴퓨터 랜덤 공격 이벤트 메소드
    public void randomAttackComputerEvent(JLabel playerInfo, JLabel battleInfo, JLabel battleInfo2, Frame frame, Panel panel) {
        int randomNum = (int)Math.random() * 5;

        switch (randomNum) {
            case 0:
                if (attackCount == 0 && playerTurn == false) {
                    currentComputerChampion.attack(currentPlayerChampion, currentComputerChampion);
                    currentPlayerChampion.hp -= currentComputerChampion.power;
                    if (currentPlayerChampion.hp <= 0) {
                        playerInfo.setText(String.valueOf(0));
                    }
                    playerInfo.setText(String.valueOf(currentPlayerChampion.hp));
                    attackCount = 1;
                    playerTurn = true;
                    battleInfo2.setForeground(Color.BLUE);
                    battleInfo2.setText(currentComputerChampion.name + "의 공격 데미지 : " + currentComputerChampion.power);
                    battleInfo.setText("플레이어 공격으로 턴이 넘어갑니다.");
                    break;
                } else {
                    battleInfo.setText("플레이어가 공격할 차례입니다.");
                }
                if (currentPlayerChampion.hp <= 0 || currentPlayerChampion.hp <= 0) {
                    playerInfo.setText("0");
                    currentPlayerChampion.hp = 0;
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    break;
                }
            case 1:
                if (attackCount == 0 && playerTurn == false) {
                    currentComputerChampion.skill1(currentPlayerChampion, currentComputerChampion);
                    playerInfo.setText(String.valueOf(currentPlayerChampion.hp));
                    attackCount = 1;
                    playerTurn = true;
                    battleInfo2.setForeground(Color.BLUE);
                    battleInfo2.setText(currentComputerChampion.name + "의 스킬 1 데미지 : " + 50);
                    battleInfo.setText("플레이어 공격으로 턴이 넘어갑니다.");
                    break;
                } else {
                    battleInfo.setText("플레이어가 공격할 차례입니다.");
                }
                if (currentPlayerChampion.hp <= 0 || currentPlayerChampion.hp <= 0) {
                    playerInfo.setText("0");
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    break;
                }
            case 2:
                if (attackCount == 0 && playerTurn == false) {
                    currentComputerChampion.skill2(currentPlayerChampion, currentComputerChampion);
                    playerInfo.setText(String.valueOf(currentPlayerChampion.hp));
                    attackCount = 1;
                    playerTurn = true;
                    battleInfo2.setForeground(Color.BLUE);
                    battleInfo2.setText(currentComputerChampion.name + "의 스킬 1 데미지 : " + 50);
                    battleInfo.setText("플레이어 공격으로 턴이 넘어갑니다.");
                    break;
                } else {
                    battleInfo.setText("플레이어가 공격할 차례입니다.");
                }
                if (currentPlayerChampion.hp <= 0 || currentPlayerChampion.hp <= 0) {
                    playerInfo.setText("0");
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    break;
                }
            case 3:
                if (attackCount == 0 && playerTurn == false) {
                    currentComputerChampion.skill3(currentPlayerChampion, currentComputerChampion);
                    playerInfo.setText(String.valueOf(currentPlayerChampion.hp));
                    attackCount = 1;
                    playerTurn = true;
                    battleInfo2.setForeground(Color.BLUE);
                    battleInfo2.setText(currentComputerChampion.name + "의 스킬 1 데미지 : " + 100);
                    battleInfo.setText("플레이어 공격으로 턴이 넘어갑니다.");
                    break;
                } else {
                    battleInfo.setText("플레이어가 공격할 차례입니다.");
                }
                if (currentPlayerChampion.hp <= 0 || currentPlayerChampion.hp <= 0) {
                    playerInfo.setText("0");
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    break;
                }
            case 4:
                if (attackCount == 0 && playerTurn == false) {
                    currentComputerChampion.skill4(currentPlayerChampion, currentComputerChampion);
                    playerInfo.setText(String.valueOf(currentPlayerChampion.hp));
                    attackCount = 1;
                    playerTurn = true;
                    battleInfo2.setForeground(Color.BLUE);
                    battleInfo2.setText(currentComputerChampion.name + "의 스킬 1 데미지 : " + 150);
                    battleInfo.setText("플레이어 공격으로 턴이 넘어갑니다.");
                    break;
                } else {
                    battleInfo.setText("플레이어가 공격할 차례입니다.");
                }
                if (currentPlayerChampion.hp <= 0 || currentPlayerChampion.hp <= 0) {
                    playerInfo.setText("0");
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            panel.setVisible(false);
                            winnerPanel(frame);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    break;
                }
        }
    }

    public void winnerPanel(Frame frame) {

        Panel panel = new Panel();

        JLabel result = new JLabel("Game Over");
        JLabel background = new JLabel();

        panel.setVisible(true);

        panel.setLayout(null);

        result.setBounds(100, 300, 700, 500);
        result.setFont(new Font("Courier", Font.BOLD, 90));

        createImage(background, "./image/victory.jpeg", 800, 800);
        background.setBounds(0, 1, 800, 800);

        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (currentComputerChampion.hp <= 0) {
                    result.setText("Player Win");
                } else {
                    result.setText("Computer Win");
                }
            }
        });
        timer.setRepeats(false);
        timer.start();

        panel.add(result);
        panel.add(background);

        frame.add(panel);
    }

//    public void missEvent(JButton button, ) {
//
//    }
}
