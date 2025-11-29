import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 방 크기
        sc.nextLine();

        // 방 배열 만들기
        char[][] room = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            room[i] = s.toCharArray();
        }
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            int row = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == ('.')) {
                    row++;
                } else {
                    if (row >= 2) {
                        x++;
                    }
                    row = 0;
                }
            }

            if (row >= 2) {
                x++;
            }
        }

        for (int i = 0; i < n; i++) {
            int col = 0;
            for (int j = 0; j < n; j++) {
                if (room[j][i] == ('.')) {
                    col++;
                } else {
                    if (col >= 2) {
                        y++;
                    }
                    col = 0;
                }
            }
            if (col >= 2) {
                y++;
            }
        }
        System.out.println(x + " " + y);
    }

}