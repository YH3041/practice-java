import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class StopWatch {

    // reset 후 다시 start 문제점 보완
    // stop 후 다시 start 문제점 보완
    // reset 기능 고장

    public static void main(String[] args) {

        String[] hours = {"선택", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] minutes = {"선택", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60"};
        String[] seconds = {"선택", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60"};

        final int[] hour = new int[1];
        final int[] minute = new int[1];
        final int[] second = new int[1];

        Timer timer = new Timer();
        JFrame fr = new JFrame();
        JPanel pnl = new JPanel();

        // Hour
        JComboBox hoursBox = new JComboBox(hours);
        JScrollPane hoursScrollPnl = new JScrollPane(hoursBox);

        // Minute
        JComboBox minuteBox = new JComboBox(minutes);
        JScrollPane minuteScrollPnl = new JScrollPane(minuteBox);

        // Seconds
        JComboBox secondBox = new JComboBox(seconds);
        JScrollPane secondScrollPnl = new JScrollPane(secondBox);

        // comboBox에서 선택하여 시간 가져오는 이벤트
        hoursBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = hoursBox.getSelectedItem().toString();
                hour[0] = Integer.parseInt(number);
            }
        });

        minuteBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = minuteBox.getSelectedItem().toString();
                minute[0] = Integer.parseInt(number);
            }
        });

        secondBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = secondBox.getSelectedItem().toString();
                second[0] = Integer.parseInt(number);
            }
        });


        JLabel jLabel = new JLabel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();

        JLabel text = new JLabel("시");
        JLabel text2 = new JLabel("분");
        JLabel text3 = new JLabel("초");

        JButton jBtn1 = new JButton("START");
        JButton jBtn2 = new JButton("RESET");
        JButton jBtn3 = new JButton("STOP");

        // START 이벤트
        jBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jb = (JButton)e.getSource();
                if (jb.getText().equals("START")) {
                    TimerTask task = new TimerTask() {

                        int h = hour[0];
                        int m = minute[0];
                        int s = second[0];

                        @Override
                        public void run() {
                            if (h == 0 && m == 0 && s == 0) {
                                jLabel.setText("타이머 종료");
                                timer.cancel();
                            }

                            if (h != 0 && m == 0) {
                                m = 60;
                            }

                            if (m != 0 && s == 0) {
                                s = 60;
                            }

                            s--;

                            if (s == 0) {
                                m--;
                            }

                            if (m == 0) {
                                h--;
                            }

                            jLabel.setText("타이머가 시작됩니다.");
                            jLabel1.setText(h + "" + "시");
                            jLabel2.setText(m + "" + "분");
                            jLabel3.setText(s + "" + "초");
                        }
                    };
                    timer.schedule(task, 0, 1000);
                }
            }
        });


        // RESET 이벤트
        jBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JButton jb = (JButton) e.getSource();
                if (jb.getText().equals("RESET")) {
                    jLabel.setText("타이머가 리셋됩니다.");
                    jLabel1.setText("0시");
                    jLabel2.setText("0분");
                    jLabel3.setText("0초");
                    timer.cancel();

                    jLabel.setText("타이머를 새로 시작해주세요.");

                    TimerTask newTask = new TimerTask() {

                        int h = hour[0];
                        int m = minute[0];
                        int s = second[0];

                        @Override
                        public void run() {
                            if (h == 0 && m == 0 && s == 0) {
                                jLabel.setText("타이머 종료");
                                timer.cancel();
                            }

                            if (h != 0 && m == 0) {
                                m = 60;
                            }

                            if (m != 0 && s == 0) {
                                s = 60;
                            }

                            s--;

                            if (s == 0) {
                                m--;
                            }

                            if (m == 0) {
                                h--;
                            }

                            jLabel.setText("타이머가 시작됩니다.");
                            jLabel1.setText(h + "" + "시");
                            jLabel2.setText(m + "" + "분");
                            jLabel3.setText(s + "" + "초");
                        }
                    };
                    Timer newTimer = new Timer();
                    newTimer.schedule(newTask, 0, 1000);
                }
            }
        });


        jBtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jb = (JButton) e.getSource();
                if (jb.getText().equals("STOP")) {
                    jLabel.setText("타이머가 멈춥니다.");
                    timer.cancel();
                }
            }
        });

        // 시간 선택
        // Hour
        pnl.add(hoursScrollPnl);
        pnl.add(text);

        // Minute
        pnl.add(minuteScrollPnl);
        pnl.add(text2);

        // Seconds
        pnl.add(secondScrollPnl);
        pnl.add(text3);

        // Btn
        pnl.add(jBtn1);
        pnl.add(jBtn2);
        pnl.add(jBtn3);

        // Text
        pnl.add(jLabel);

        pnl.add(jLabel1);
        pnl.add(jLabel2);
        pnl.add(jLabel3);

        fr.add(pnl);

        fr.setTitle("타이머");
        fr.setSize(310, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

    }

}
