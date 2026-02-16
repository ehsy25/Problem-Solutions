import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        long n =  sc.nextLong();
        String proto = "";
        long start = 1;

        while ( (start *2) <= n){
            start *= 2;
        }

        long sum = 0;
        while(start != 0){

            if(sum + start <= n){
                sum += start;
                start /= 2;
                proto += 1;
            }
            else{
                start /= 2;
                proto += 0;
            }
        }
        System.out.println(proto);
    }
}