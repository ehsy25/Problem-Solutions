import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] sorted = new int [n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int[] copy = Arrays.copyOf(b, n);

        max(copy, c, 0);


        for(int i = 0; i < n; i++) {
            sorted[c[i]] = a[i];
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sorted[i] * b[i];
        }

        System.out.println(sum);

    }

    public static void max(int[] copy, int[] n, int depth) {
        if(depth == copy.length) {
            return;
        }
        int max = -1;
        int idx = -1;

        // Find max
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] > max) {
                idx = i;
                max = copy[i];
            }
        }

        n[depth] = idx;
        copy[idx] = -1;
        max(copy, n, depth + 1);
      
    }

}