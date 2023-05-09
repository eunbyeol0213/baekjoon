import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        int[] arr = new int[21];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= val; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[val]);
    }
}
