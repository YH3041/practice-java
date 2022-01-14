import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int column = input.nextInt(); // 열
        int row = input.nextInt(); // 행

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
