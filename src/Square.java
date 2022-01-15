import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("열 입력");
        int column = input.nextInt();

        System.out.println("행 입력");
        int row = input.nextInt();

        String[][] arr = new String[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = " * ";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
