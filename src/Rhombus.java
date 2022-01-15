import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("마름모 그리기(홀수만 입력 가능)");

        int n = input.nextInt();

        for (int i = 0; i < n - i; i++) {

            for (int j = 0; j < n - 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + i + 1 ; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - 2 - i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n - i - 1; i++) {

            for (int j = 0; j < n / 2 + i; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k < n - i - i; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - 3 + i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
