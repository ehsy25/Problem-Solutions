import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] memo = new int[100];
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = fibo(n);
            System.out.println(a);
    }

    private static int fibo(int n){              
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(memo[n] != 0){
            return memo[n];
        }
        
        memo[n] = fibo(n-1)+fibo(n-2);
        return memo[n];
    }    
}