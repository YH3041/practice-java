import java.util.Scanner;

public class Logo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("n 값 입력");
        int n = input.nextInt();

        n = n + 5;

        String[][] arr = new String[n][n];


        for (int i = 0; i < n; i++) {

            // 공백 찍기
            for (int j = 0; j < n; j++) {
                arr[i][j] = "   ";
            }

            // 별 찍기
            for (int k = 0; k < n - 1; k++) {

                arr[k][0] = " * ";
                arr[k][1] = " * ";

                for (int l = 0; l < n - 3; l++) {
                    arr[l + 1][l + 2] = " * ";
                }

                arr[k][k] = " * ";

                arr[k][n - 2] = " * ";
                arr[k][n - 1] = " * ";
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
