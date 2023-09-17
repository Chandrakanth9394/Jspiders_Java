package arrays;
import java.util.*;

public class ArmstrongNumberArray {
    public static int count(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            int a = temp % 10;
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int power(int m, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= m;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int sum = 0;
            int digit = count(n);
            int temp = n;
            
            while (temp != 0) {
                int a = temp % 10;
                sum = sum + power(a, digit);
                temp /= 10;
            }
            
            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}
