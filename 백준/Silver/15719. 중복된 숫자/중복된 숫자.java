import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long length = Integer.parseInt(br.readLine());
        //1부터 N - 1까지의 정수가 하나씩 정렬되지 않은 채로 저장
        StringTokenizer st = new StringTokenizer(br.readLine());


        long seq = length * (length - 1) / 2;    //등차수열
        long sum = 0;

        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        //배열 합에서 등차수열 합을 빼면 중복 값 나옴
        System.out.println(sum - seq);

    }
}