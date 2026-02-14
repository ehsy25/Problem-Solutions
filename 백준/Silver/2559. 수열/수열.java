import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int k =  sc.nextInt();
        int[] temps = new int[n];

        for(int i = 0; i < n; i++){
            temps[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = k-1;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += temps[i];
        }
        max = sum;
        for(int i = k; i < n; i++) {
            sum = sum - temps[i-k] + temps[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }

}