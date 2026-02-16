import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream(
        // "C:\\Users\\Eric\\Documents\\PP\\Problem_Solutions\\Problems\\src\\main\\java\\com\\E\\input.txt"));

        //BJ2839 설탕 배달

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bags = 0;

        for(int i = n/5; i >= 0; i--) { 
            int rest = n - (i * 5);
            if(rest % 3 == 0) {
                bags = i + rest/3;
                System.out.println(bags);
                return;
            }
        }
        System.out.println(-1);
    }
}
