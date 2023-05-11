import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        int[] arr = new int[val2];
        int index= 0;

        for(int i = 1; i <= val2; i++){
            for (int j = 0; j < i; j++){
                //정해진 배열 사이즈와 같아지면 반복문 빠져나오기
                if(index == val2) break;
                arr[index] = i;
                index++;
            }
        }

        int sum = 0;
        for(int i = val1; i <= val2; i++){
            sum += arr[i - 1];
        }
        System.out.println(sum);
    }
}
