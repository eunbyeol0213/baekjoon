import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] == 0){
                if (priorityQueueLowest.size() == 0) bw.write(Integer.toString(0) + "\n");
                else  bw.write(Integer.toString(priorityQueueLowest.poll()) + "\n");
            }else {
                priorityQueueLowest.add(arr[i]);
            }
        }
        bw.flush();
        bw.close();


    }
}
