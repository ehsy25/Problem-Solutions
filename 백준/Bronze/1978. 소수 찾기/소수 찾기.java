import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            }

        for(int i = 0; i < n; i++){
        if(isPrime(arr[i])){
            count++;
        }
    }
            System.out.println(count);
}

 public static boolean isPrime(int n){
            if(n == 1 || n == 0){
                return false;  
            } 
            for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n % i == 0){
                        return false;
                    }
                }
            return true;
    }
}