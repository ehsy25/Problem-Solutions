import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(true){
            if(prime(n)&&palindrome(n)){
                System.out.println(n);
                break;
            }
            n++;
        }
    }

    public static boolean palindrome(int n) {
        String s = Integer.toString(n);
        int [] arr = new int [Integer.toString(n).length()];
        StringBuilder sb = new StringBuilder();
        String reverse = "";

        for(int i = 0; i < Integer.toString(n).length(); i++){
            arr[i] = s.charAt(i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append((char)arr[i]);
        }
        reverse = sb.toString();
        
        if (!s.equals(reverse)) {
            return false;
        }

        return true;
    }

    public static boolean prime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}