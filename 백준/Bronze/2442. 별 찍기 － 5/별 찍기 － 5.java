import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        for (int i=0; i< dan; i++){
            for (int j=0; j < dan - i -1; j++){
                System.out.print(" ");
            }
            for(int j=0; j < i * 2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
