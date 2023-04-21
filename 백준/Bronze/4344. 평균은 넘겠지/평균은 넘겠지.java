import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int arr[];

        for(int i = 0; i < testCase; i++) {
            int numberOfStudents = sc.nextInt();  //학생 수 입력 //1번
            arr = new int [numberOfStudents];

            double sum =0; //성적 누적 합 변수

            //성적입력
            for(int j=0; j<numberOfStudents; j++) {
                int score = sc.nextInt(); //점수 입력
                arr[j] = score; //점수 배열에 저장
                sum += score;   //성적 전체 합
            }

            double average = sum/numberOfStudents;  //평균
            double count =0;   //점수가 평균보다 높은 학생 수 변수 선언

            for(int j=0; j < numberOfStudents; j++){
                if(arr[j] > average){
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/numberOfStudents) * 100);
        }
    }
}
