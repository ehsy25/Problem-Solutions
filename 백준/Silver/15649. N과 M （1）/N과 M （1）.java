import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int n;
    private static int m;
    private static boolean[] v;
    private static int [] result;

    public static void main(String[] args) throws FileNotFoundException {  
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();// n 까지
        m = sc.nextInt();// 수열 길이
        v = new boolean[n + 1];
        result = new int [m];
        back(0, 0);
    }
    public static void back(int num, int depth) {

        if (depth == m) {
            for(int i = 0; i < m; i++) {
                System.out.print(result[i] + " ");
            }
                            System.out.println();

            return;
        }
        for (int i = 1; i <= n; i++) {
            if (v[i]) {
                continue;
            }
            v[i] = true;
            result[depth] = i;
            back(num, depth+1);
            v[i] = false;
        }
    }
}