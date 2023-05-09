import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] arr = new int[10];

        for (int i = 1; i <= 10; i++){
            int getOffCnt = sc.nextInt();
            int getInCnt = sc.nextInt();

            if(i == 1){
                cnt += getInCnt;
                arr[i - 1] = cnt;
            } else if (i == 10) {
                cnt -= getOffCnt;
                arr[i -1] = cnt;
            } else {
                cnt -= getOffCnt;
                cnt += getInCnt;
                arr[i -1] = cnt;
            }
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
          }
        }

        System.out.println(max);

    }
}
