import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();


         for(int i = 0; i < testCase; i++){
             int val = sc.nextInt();
             String binary = Integer.toBinaryString(val);

             for(int k = binary.length() - 1; k >= 0; k--){
                 if(binary.charAt(k) == '1'){
                     System.out.printf("%d ",binary.length() - k - 1);
                 }
             }
         }
    }
}