import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int count = 0;
        do {

            int preRight = 0;
            
            if (x > 10) {
                preRight = x;
            }
            int left = x / 10;
            preRight = x % 10;
            int sum = left + preRight;
            if (sum >= 10) {
                sum = sum % 10;
            }
            String chimera = String.valueOf(preRight) + String.valueOf(sum);
            x = Integer.valueOf(chimera);
            count++;
        } while (x != n);
        System.out.println(count);
    }
}