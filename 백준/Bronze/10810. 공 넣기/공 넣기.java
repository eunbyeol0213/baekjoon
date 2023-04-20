import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];

        for(int i=0; i<M; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            for(int j=a-1; j<b; j++){
                basket[j] = c;
            }
        }

        for(int i=0; i<basket.length; i++) {
            System.out.print(basket[i] + " ");
        }

    }
}