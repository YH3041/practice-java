import java.util.Scanner;

public class GoToWork {

    public static void main(String[] args) {

        int totalCash = 10000;
        int totalCardAmount = 50000;
        int weight;
        boolean setAlarm;
        boolean isWater;
        boolean isArrive;
        String wayToGo;
        String payments;

        Scanner input = new Scanner(System.in);

        System.out.println("---------학원 가는 길---------");

        System.out.println("알람을 맞췄나?");
        setAlarm = input.nextBoolean();

        // 알람 유무
        if (setAlarm) {
            System.out.println("알람을 듣고 일어난다.");
            System.out.println("침대를 정리한다.");
            System.out.println("계단을 내려간다.");

            System.out.println("체중을 잰다 오늘의 체중은?");
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

                System.out.println("무엇을 타고 갈 것인가?(1.버스 | 2.지하철)");
                wayToGo = input.next();

                switch (wayToGo) {

                    //가는 방법(버스)
                    case "버스":
                        System.out.println("버스");
                        System.out.println("신발을 신고 버스정류장으로 걸어간다.");
                        System.out.println("바로 버스가 있는가?");
                        isArrive = input.nextBoolean();

                        if(isArrive) {
                            System.out.println("버스 탑승");

                            System.out.println("자불 방법은? (1.카드 | 2.현금)");
                            payments = input.next();

                            switch (payments) {
                                case "카드":
                                    System.out.println("카드로 결제한다.");
                                    totalCardAmount = totalCardAmount - 1200;
                                    System.out.println("결제 후 카드잔액(테스트 1번) : " + totalCardAmount);
                                    break;
                                case "현금":
                                    System.out.println("현금으로 결제한다.");
                                    totalCash = totalCash - 1200;
                                    System.out.println("결제 후 현금잔액(테스트 2번) : " + totalCash);
                                    break;
                            }

                            System.out.println("도착한 정류장에서 내린다.");

                            if (payments == "카드") {
                                System.out.println("카드에 돈이 많으니 택시를 탄다.");
                                totalCardAmount = totalCardAmount - 4000;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("현금잔액이 별로 없으니 걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        } else {
                            totalCash = 10000;
                            totalCardAmount = 50000;

                            System.out.println("버스를 기다린다.");
                            System.out.println("버스가 오면 탄다.");

                            System.out.println("자불 방법은? (1.카드 | 2.현금)");
                            payments = input.next();

                            switch (payments) {
                                case "카드":
                                    System.out.println("카드로 결제한다.");
                                    totalCardAmount = totalCardAmount - 1200;
                                    System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                    break;
                                case "현금":
                                    System.out.println("현금으로 결제한다.");
                                    totalCash = totalCash - 1200;
                                    System.out.println("결제 후 현금잔액 : " + totalCash);
                                    break;
                            }

                            System.out.println("도착한 정류장에서 내린다.");

                            if (payments == "카드") {
                                System.out.println("카드에 돈이 많으니 택시를 탄다.");
                                totalCardAmount = totalCardAmount - 4000;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("현금잔액이 별로 없으니 걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        }
                        break;

                    // 가는 방법(지하철)
                    case "지하철":
                        System.out.println("지하철");
                        System.out.println("신발을 신고 전철역으로 걸어간다.");
                        System.out.println("바로 전철이 있는가?");
                        isArrive = input.nextBoolean();

                        // 지하철이 바로 있는지 여부
                        if(isArrive) {
                            totalCash = 10000;
                            totalCardAmount = 50000;

                            System.out.println("지하철 탑승");

                            System.out.println("자불 방법은? (1.카드 | 2.현금)");
                            payments = input.next();

                            switch (payments) {
                                case "카드":
                                    System.out.println("카드로 결제한다.");
                                    totalCardAmount = totalCardAmount - 1200;
                                    System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                    break;
                                case "현금":
                                    System.out.println("현금으로 결제한다.");
                                    totalCash = totalCash - 1200;
                                    System.out.println("결제 후 현금잔액 : " + totalCash);
                                    break;
                            }

                            System.out.println("도착한 역에서 내린다.");

                            if (payments == "카드") {
                                System.out.println("카드에 돈이 많으니 택시를 탄다.");
                                totalCardAmount = totalCardAmount - 4000;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("현금잔액이 별로 없으니 걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        }
                        // 바로 지하철이 없을 떄
                        else {
                            totalCash = 10000;
                            totalCardAmount = 50000;

                            System.out.println("지하철을 기다린다.");
                            System.out.println("도착한 지하철 탑승");

                            System.out.println("자불 방법은? (1.카드 | 2.현금)");
                            payments = input.next();

                            switch (payments) {
                                case "카드":
                                    System.out.println("카드로 결제한다.");
                                    totalCardAmount = totalCardAmount - 1200;
                                    System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                    break;
                                case "현금":
                                    System.out.println("현금으로 결제한다.");
                                    totalCash = totalCash - 1200;
                                    System.out.println("결제 후 현금잔액 : " + totalCash);
                                    break;
                            }

                            System.out.println("도착한 역에서 내린다.");

                            if (payments == "카드") {
                                System.out.println("카드에 돈이 많으니 택시를 탄다.");
                                totalCardAmount = totalCardAmount - 4000;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("현금잔액이 별로 없으니 걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        }
                        break;
                    default:
                        System.out.println("그외에 후보는 없다.");
                }
                // 물이 없을 떄
            } else {
                System.out.println("냉장고에 채워넣고 나중에 마신다.");
                System.out.println("양치를 하고 씻는다.");
                System.out.println("수건을 꺼내서 물기를 닦는다.");
                System.out.println("드라이기로 머리를 말린다.");
                System.out.println("옷을 입는다.");

                System.out.println("무엇을 타고 갈 것인가?(1.버스 | 2.지하철)");
                wayToGo = input.next();

                // 물을 없는 상황에서 가는 방법
                switch (wayToGo) {

                    // 버스 이용
                    case "버스":
                        totalCash = 10000;
                        totalCardAmount = 50000;

                        System.out.println("버스");
                        System.out.println("신발을 신고 버스정류장으로 걸어간다.");
                        System.out.println("바로 버스가 있는가?");
                        isArrive = input.nextBoolean();
                        if(isArrive) {
                            System.out.println("버스 탑승");

                            System.out.println("자불 방법은? (1.카드 | 2.현금)");
                            payments = input.next();

                            switch (payments) {
                                case "카드":
                                    System.out.println("카드로 결제한다.");
                                    totalCardAmount = totalCardAmount - 1200;
                                    System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                    break;
                                case "현금":
                                    System.out.println("현금으로 결제한다.");
                                    totalCash = totalCash - 1200;
                                    System.out.println("결제 후 현금잔액 : " + totalCash);
                                    break;
                            }

                            System.out.println("도착한 정류장에서 내린다.");

                            if (payments == "카드") {
                                System.out.println("카드에 돈이 많으니 택시를 탄다.");
                                totalCardAmount = totalCardAmount - 4000;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("현금잔액이 별로 없으니 걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        } else {
                            totalCash = 10000;
                            totalCardAmount = 50000;

                            System.out.println("전철을 기다린다.");
                            System.out.println("전철이 오면 탄다.");

                            System.out.println("자불 방법은? (1.카드 | 2.현금)");
                            payments = input.next();

                            switch (payments) {
                                case "카드":
                                    System.out.println("카드로 결제한다.");
                                    totalCardAmount = totalCardAmount - 1200;
                                    System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                    break;
                                case "현금":
                                    System.out.println("현금으로 결제한다.");
                                    totalCash = totalCash - 1200;
                                    System.out.println("결제 후 현금잔액 : " + totalCash);
                                    break;
                            }

                            System.out.println("도착한 역에서 내린다.");

                            if (payments == "카드") {
                                System.out.println("카드에 돈이 많으니 택시를 탄다.");
                                totalCardAmount = totalCardAmount - 4000;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("현금잔액이 별로 없으니 걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        }
                        break;

                    // 지하철 이용
                    case "지하철":
                        System.out.println("지하철");
                        System.out.println("신발을 신고 전철역으로 걸어간다.");
                        System.out.println("바로 전철이 있는가?");
                        isArrive = input.nextBoolean();
                        if(isArrive) {
                            totalCash = 10000;
                            totalCardAmount = 50000;

                            System.out.println("전철 탑승");

                            System.out.println("자불 방법은? (1.카드 | 2.현금)");
                            payments = input.next();

                            switch (payments) {
                                case "카드":
                                    System.out.println("카드로 결제한다.");
                                    totalCardAmount = totalCardAmount - 1200;
                                    System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                    break;
                                case "현금":
                                    System.out.println("현금으로 결제한다.");
                                    totalCash = totalCash - 1200;
                                    System.out.println("결제 후 현금잔액 : " + totalCash);
                                    break;
                            }

                            System.out.println("도착한 역에서 내린다.");

                            if (payments == "카드") {
                                System.out.println("카드에 돈이 많으니 택시를 탄다.");
                                totalCardAmount = totalCardAmount - 4000;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("현금잔액이 별로 없으니 걸어서 간다.");
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            }
                        } else {
                            totalCash = 10000;
                            totalCardAmount = 50000;

                            System.out.println("전철을 기다린다.");
                            System.out.println("전철이 오면 탄다.");

                            System.out.println("자불 방법은? (1.카드 | 2.현금)");
                            payments = input.next();

                            switch (payments) {
                                case "카드":
                                    System.out.println("카드로 결제한다.");
                                    totalCardAmount = totalCardAmount - 1200;
                                    System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                    break;
                                case "현금":
                                    System.out.println("현금으로 결제한다.");
                                    totalCash = totalCash - 1200;
                                    System.out.println("결제 후 현금잔액 : " + totalCash);
                                    break;
                            }

                            System.out.println("도착한 역에서 내린다.");

                            if (payments == "카드") {
                                System.out.println("카드에 돈이 많으니 택시를 탄다.");
                                totalCardAmount = totalCardAmount - 4000;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                            } else {
                                System.out.println("현금잔액이 별로 없으니 걸어서 간다.");
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

            System.out.println("무엇을 타고 갈 것인가?(1.버스 | 2.지하철)");
            wayToGo = input.next();


            // 지각한 상황에서 가는 방법
            switch (wayToGo) {

                // 버스 이용
                case "버스":
                    System.out.println("버스");
                    System.out.println("신발을 신고 버스정류장으로 뛰어간다.");

                    System.out.println("바로 버스가 있는가?");
                    isArrive = input.nextBoolean();

                    if(isArrive) {
                        totalCash = 10000;
                        totalCardAmount = 50000;

                        System.out.println("버스 탑승");

                        System.out.println("자불 방법은? (1.카드 | 2.현금)");
                        payments = input.next();

                        switch (payments) {
                            case "카드":
                                System.out.println("카드로 결제한다.");
                                totalCardAmount = totalCardAmount - 1200;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                break;
                            case "현금":
                                System.out.println("현금으로 결제한다.");
                                totalCash = totalCash - 1200;
                                System.out.println("결제 후 현금잔액 : " + totalCash);
                                break;
                        }

                        System.out.println("도착한 정류장에서 내린다.");

                        System.out.println("늦었으니 그냥 택시를 탄다.");
                        totalCardAmount = totalCardAmount - 4000;
                        System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                        System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");

                    } else {
                        totalCash = 10000;
                        totalCardAmount = 50000;

                        System.out.println("버스를 기다린다.");
                        System.out.println("버스가 오면 탄다.");

                        System.out.println("자불 방법은? (1.카드 | 2.현금)");
                        payments = input.next();

                        switch (payments) {
                            case "카드":
                                System.out.println("카드로 결제한다.");
                                totalCardAmount = totalCardAmount - 1200;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                break;
                            case "현금":
                                System.out.println("현금으로 결제한다.");
                                totalCash = totalCash - 1200;
                                System.out.println("결제 후 현금잔액 : " + totalCash);
                                break;
                        }

                        System.out.println("도착한 정류장에서 내린다.");

                        System.out.println("늦었으니 그냥 택시를 탄다.");
                        totalCardAmount = totalCardAmount - 4000;
                        System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                        System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                    }
                    break;

                // 지하철 이용
                case "지하철":
                    System.out.println("지하철");
                    System.out.println("신발을 신고 전철역으로 걸어간다.");
                    System.out.println("바로 전철이 있는가?");
                    isArrive = input.nextBoolean();
                    if(isArrive) {
                        totalCash = 10000;
                        totalCardAmount = 50000;

                        System.out.println("전철 탑승");
                        System.out.println("도착한 역에서 내린다.");

                        System.out.println("자불 방법은? (1.카드 | 2.현금)");
                        payments = input.next();

                        switch (payments) {
                            case "카드":
                                System.out.println("카드로 결제한다.");
                                totalCardAmount = totalCardAmount - 1200;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                break;
                            case "현금":
                                System.out.println("현금으로 결제한다.");
                                totalCash = totalCash - 1200;
                                System.out.println("결제 후 현금잔액 : " + totalCash);
                                break;
                        }

                        System.out.println("도착한 역에서 내린다.");

                        System.out.println("늦었으니 그냥 택시를 탄다.");
                        totalCardAmount = totalCardAmount - 4000;
                        System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                        System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                    } else {
                        totalCash = 10000;
                        totalCardAmount = 50000;

                        System.out.println("전철을 기다린다.");
                        System.out.println("전철이 오면 탄다.");

                        System.out.println("자불 방법은? (1.카드 | 2.현금)");
                        payments = input.next();

                        switch (payments) {
                            case "카드":
                                System.out.println("카드로 결제한다.");
                                totalCardAmount = totalCardAmount - 1200;
                                System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                                break;
                            case "현금":
                                System.out.println("현금으로 결제한다.");
                                totalCash = totalCash - 1200;
                                System.out.println("결제 후 현금잔액 : " + totalCash);
                                break;
                        }

                        System.out.println("도착한 역에서 내린다.");

                        System.out.println("늦었으니 그냥 택시를 탄다.");
                        totalCardAmount = totalCardAmount - 4000;
                        System.out.println("결제 후 카드잔액 : " + totalCardAmount);
                        System.out.println("도착해서 의자에 앉아 가방에서 노트북을 꺼낸다.");
                    }
                    break;
                default:
                    System.out.println("그외에 후보는 없다.");
            }
        }
    }

}
