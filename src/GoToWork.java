import java.util.Scanner;

public class GoToWork {

    // 사용 문법 switch, 다양한 입력 값
    // 추가할 내용 체중

    public static void main(String[] args) {

        int weight;
        int wayToGo;
        boolean setAlarm;
        boolean isWater;
        boolean isArrive;
        boolean aLotOfMoney;

        Scanner input = new Scanner(System.in); // 객체 생성

        System.out.println("---------학원 가는 길---------");

        System.out.println("알람을 맞췄나?");
        setAlarm = input.nextBoolean();

        if (setAlarm) {
            System.out.println("알람을 듣고 일어난다.");
            System.out.println("침대를 정리한다.");
            System.out.println("계단을 내려간다.");

            System.out.println("체중을 잰다 오늘의 체중은?.");
            weight = input.nextInt();
            if (weight < 65) {
                System.out.println("기분이 좋다!");
            } else {
                System.out.println("기분이 별로다.");
            }

            System.out.println("냉장고에 물이 있나?");
            isWater = input.nextBoolean();
            if (isWater) {
                System.out.println("물을 마신다.");
                System.out.println("양치를 하고 씻는다.");
                System.out.println("수건을 꺼내서 물기를 닦는다.");
                System.out.println("드라이기로 머리를 말린다.");
                System.out.println("옷을 입는다.");

                System.out.println("무엇을 타고 갈 것인가?(1.버스, 2.지하철)");
                wayToGo = input.nextInt();

                switch (wayToGo) {
                    case 1:
                        System.out.println("버스");
                        System.out.println("신발을 신고 버스정류장으로 걸어간다.");
                        System.out.println("바로 버스가 있는가?");
                        isArrive = input.nextBoolean();
                        if(isArrive) {
                            System.out.println("버스 탑승");
                            System.out.println("도착한 정류장에서 내린다.");

                            System.out.println("현재 돈이 많은가?");
                            aLotOfMoney = input.nextBoolean();
                            if (aLotOfMoney) {
                                System.out.println("택시를 탄다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        } else {
                            System.out.println("전철을 기다린다.");
                            System.out.println("전철이 오면 탄다.");

                            System.out.println("현재 돈이 많은가?");
                            aLotOfMoney = input.nextBoolean();
                            if (aLotOfMoney) {
                                System.out.println("택시를 탄다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("지하철");
                        System.out.println("신발을 신고 전철역으로 걸어간다.");
                        System.out.println("바로 전철이 있는가?");
                        isArrive = input.nextBoolean();
                        if(isArrive) {
                            System.out.println("전철 탑승");
                            System.out.println("도착한 역에서 내린다.");

                            System.out.println("현재 돈이 많은가?");
                            aLotOfMoney = input.nextBoolean();
                            if (aLotOfMoney) {
                                System.out.println("택시를 탄다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        } else {
                            System.out.println("전철을 기다린다.");
                            System.out.println("전철이 오면 탄다.");

                            System.out.println("현재 돈이 많은가?");
                            aLotOfMoney = input.nextBoolean();
                            if (aLotOfMoney) {
                                System.out.println("택시를 탄다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        }
                        break;
                    default:
                        System.out.println("그외에 후보는 없다.");
                }
                } else {
                System.out.println("냉장고에 채워넣고 나중에 마신다.");
                System.out.println("양치를 하고 씻는다.");
                System.out.println("수건을 꺼내서 물기를 닦는다.");
                System.out.println("드라이기로 머리를 말린다.");
                System.out.println("옷을 입는다.");

                System.out.println("무엇을 타고 갈 것인가?(1.버스, 2.지하철)");
                wayToGo = input.nextInt();

                switch (wayToGo) {
                    case 1:
                        System.out.println("버스");
                        System.out.println("신발을 신고 버스정류장으로 걸어간다.");
                        System.out.println("바로 버스가 있는가?");
                        isArrive = input.nextBoolean();
                        if(isArrive) {
                            System.out.println("버스 탑승");
                            System.out.println("도착한 정류장에서 내린다.");

                            System.out.println("현재 돈이 많은가?");
                            aLotOfMoney = input.nextBoolean();
                            if (aLotOfMoney) {
                                System.out.println("택시를 탄다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        } else {
                            System.out.println("전철을 기다린다.");
                            System.out.println("전철이 오면 탄다.");

                            System.out.println("현재 돈이 많은가?");
                            aLotOfMoney = input.nextBoolean();
                            if (aLotOfMoney) {
                                System.out.println("택시를 탄다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("지하철");
                        System.out.println("신발을 신고 전철역으로 걸어간다.");
                        System.out.println("바로 전철이 있는가?");
                        isArrive = input.nextBoolean();
                        if(isArrive) {
                            System.out.println("전철 탑승");
                            System.out.println("도착한 역에서 내린다.");

                            System.out.println("현재 돈이 많은가?");
                            aLotOfMoney = input.nextBoolean();
                            if (aLotOfMoney) {
                                System.out.println("택시를 탄다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        } else {
                            System.out.println("전철을 기다린다.");
                            System.out.println("전철이 오면 탄다.");

                            System.out.println("현재 돈이 많은가?");
                            aLotOfMoney = input.nextBoolean();
                            if (aLotOfMoney) {
                                System.out.println("택시를 탄다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        }
                        break;
                    default:
                        System.out.println("그외에 후보는 없다.");
                }
            }
        } else {
            System.out.println("지각");
            System.out.println("이무 옷이나 꺼내 입고 모자를 쓴다.");

            System.out.println("무엇을 타고 갈 것인가?(1.버스, 2.지하철)");
            wayToGo = input.nextInt();

            switch (wayToGo) {
                case 1:
                    System.out.println("버스");
                    System.out.println("신발을 신고 버스정류장으로 뛰어간다.");
                    System.out.println("바로 버스가 있는가?");
                    isArrive = input.nextBoolean();
                    if(isArrive) {
                        System.out.println("버스 탑승");
                        System.out.println("도착한 정류장에서 내린다.");

                        System.out.println("현재 돈이 많은가?");
                        aLotOfMoney = input.nextBoolean();
                        if (aLotOfMoney) {
                            System.out.println("택시를 탄다.");
                            System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                        } else {
                            System.out.println("뛰어서 간다.");
                            System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                        }
                    } else {
                        System.out.println("전철을 기다린다.");
                        System.out.println("전철이 오면 탄다.");

                        System.out.println("현재 돈이 많은가?");
                        aLotOfMoney = input.nextBoolean();
                        if (aLotOfMoney) {
                            System.out.println("택시를 탄다.");
                            System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                        } else {
                            System.out.println("뛰어서 간다.");
                            System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("지하철");
                    System.out.println("신발을 신고 전철역으로 걸어간다.");
                    System.out.println("바로 전철이 있는가?");
                    isArrive = input.nextBoolean();
                    if(isArrive) {
                        System.out.println("전철 탑승");
                        System.out.println("도착한 역에서 내린다.");

                        System.out.println("현재 돈이 많은가?");
                        aLotOfMoney = input.nextBoolean();
                        if (aLotOfMoney) {
                            System.out.println("택시를 탄다.");
                            System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                        } else {
                            System.out.println("걸어서 간다.");
                            System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                        }
                    } else {
                        System.out.println("전철을 기다린다.");
                        System.out.println("전철이 오면 탄다.");

                        System.out.println("현재 돈이 많은가?");
                        aLotOfMoney = input.nextBoolean();
                        if (aLotOfMoney) {
                            System.out.println("택시를 탄다.");
                            System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                        } else {
                            System.out.println("걸어서 간다.");
                            System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                        }
                    }
                    break;
                default:
                    System.out.println("그외에 후보는 없다.");
            }
        }
    }

}
