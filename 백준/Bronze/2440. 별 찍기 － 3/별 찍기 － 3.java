import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        for(int i=0; i<val; i++){
            for (int j=0; j<val-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
