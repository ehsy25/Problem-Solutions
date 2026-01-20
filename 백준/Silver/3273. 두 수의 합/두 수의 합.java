import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        int left = 0;
        int right = n-1;
        int count = 0;

        Arrays.sort(arr);

        while(left < right){
            if(arr[left] + arr[right] == sum){
                count++;
                left++;
                right--;
            }else if (arr[left] + arr[right] > sum){
                right--;
            }
            else left++;
        }

        System.out.println(count);
    }
}