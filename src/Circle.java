import java.util.Scanner;

public class Circle {

    // n을 중심으로 n * n 보다 작으면 별찍고 크면 공백

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("n 값 입력");
        int n = input.nextInt();

        for (int i = -n; i <= n; i++) {

            for (int j = -n; j <= n; j++) {

                if ((i * i) + (j * j) <= n * n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
