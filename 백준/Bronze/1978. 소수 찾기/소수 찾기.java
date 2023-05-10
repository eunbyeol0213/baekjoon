import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int factors = 0;    //소수의 개수

        for (int i = 0; i < N; i++){
            int val = sc.nextInt();
            boolean isPrime = true;

            //1이면 소수가 아니므로 다음 반복문으로 이동
            if(val == 1) continue;

            for(int j = 2; j <= val/2; j++){
                if(val % j == 0){
                    isPrime = false;    //소수가 아니므로 false
                    break;
                }
            }
            //소수일 경우 조건문 실행
            if (isPrime) factors++;
        }
        System.out.println(factors);

    }
}