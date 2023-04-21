import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfColoredPaper = sc.nextInt();    //색종이 개수
        int[][] arr = new int[100][100];    //가로,세로 크기가 100인 도화지

        int count = 0;
        for (int i = 0; i < numberOfColoredPaper; i++) {
            int X = sc.nextInt();   //X축
            int Y = sc.nextInt();   //Y축
            for (int a = X; a < X + 10; a++) {
                for (int b = Y; b < Y + 10; b++) {
                    arr[a][b] = 1;  //색종이의 면적을 1로 지정
                }
            }
        }

        for(int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                if(arr[i][j] == 1){
                    count++;    //1의 갯수 세기
                }
            }
        }
        System.out.println(count);
    }
}