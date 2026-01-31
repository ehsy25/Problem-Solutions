import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
 Scanner sc = new Scanner(System.in);
        // 숫자의 개수
        int n = sc.nextInt();
        // 실행 횟수
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] index = new int[m][2];
        for (int i = 0; i < m; i++) {
            index[i][0] = sc.nextInt();
            index[i][1] = sc.nextInt();
        }

        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        for(int i = 0; i < m; i++){       
        int start = index[i][0];
        int end = index[i][1];
        System.out.println(prefixSum[end]-prefixSum[start-1]);
        }
    }
}