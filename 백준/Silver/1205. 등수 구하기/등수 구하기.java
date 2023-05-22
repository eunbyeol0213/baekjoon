import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //0 <= N <= P
        //10 <= P <= 50
        int N = sc.nextInt();
        int score = sc.nextInt();
        int P  = sc.nextInt();

        int[] rankingList = new int[P];
        int rank = 1;   //등수

        for (int i = 0; i < N; i++) {
            rankingList[i] = sc.nextInt();
        }

        //랭킹리스트에 올라갈수 있는 점수의 개수(P)와 랭킹리스에 있는 점수 갯수(N)가 같은 경우 && 태수의 새로운 점수 <= 배열의 마지막 값
        if(P == N && score <= rankingList[N - 1]){
            System.out.println("-1");
        } else {
            for (int i = 0; i < rankingList.length; i++) {
                if(score < rankingList[i]){     //점수가 배열의 값보다 작을 경우 등수를 증가시키고 반복문 진행
                    rank++;
                }else { //점수가 배열의 값보다 같거나 클 경우 반복분 종료
                    break;
                }
            }
            System.out.println(rank);
        }
    }
}
