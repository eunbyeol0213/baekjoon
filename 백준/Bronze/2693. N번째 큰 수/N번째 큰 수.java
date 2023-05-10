import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int[] arr = new int[10];

        for(int i = 0; i < val; i++){
            for(int j = 0; j < arr.length; j ++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[arr.length - 3]);
        }
    }
}
