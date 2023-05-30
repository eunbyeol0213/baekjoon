import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        //높은 숫자가 우선 순위인 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        //배열에 값 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            //배열 값이 0 일때
            if (arr[i] == 0){
                //큐 사이즈가 0 이면 0 출력
                if (priorityQueueHighest.size() == 0) bw.write(Integer.toString(0) + "\n");
                    //사이즈가 0 아니면 첫번째 값 반환하고 제거
                else  bw.write(Integer.toString(priorityQueueHighest.poll()) + "\n");
            }else {
                //배열 값이 0 아닐때 큐에 값 삽입
                //값을 삽일할때 add() 보다 offer()를 사용하는 것이 예외처리에 더 안전하다
                priorityQueueHighest.offer(arr[i]);
            }
        }
        bw.flush();
        bw.close();


    }
}
