import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int gcd = gcd(val1, val2);
        System.out.println(gcd);
        System.out.println((val1 * val2) / gcd);


    }

/*   유클리드 호제법: 2개의 최대공약수를 구하는 알고리즘
    a를 b로 나눈 나머지 = r
    a, b에 대한 최대공약수 = b와 r의 최대공약수*/
    public static int gcd(int val1, int val2){
        if(val2 == 0) return val1;
        return gcd(val2, val1 % val2);

    }
}
