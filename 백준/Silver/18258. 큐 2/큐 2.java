import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int last = 0;   //마지막 값

        for (int i = 0; i < N; i++) {
            String[] com = br.readLine().split(" ");

            switch (com[0]){
                case "push":
                    last = Integer.parseInt(com[1]);
                    queue.add(last);
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        buf.write("-1" + "\n");
                    }else{
                        //큐의 front 가 가리키는 값을 반환하고 삭제
                        buf.write(Integer.toString(queue.poll()) + "\n");
                    }
                    break;
                case "size":
                    buf.write(Integer.toString(queue.size()) + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()){
                        buf.write("1" + "\n");
                    }else {
                        buf.write("0" + "\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()){
                        buf.write("-1" + "\n");
                    }else {
                        buf.write(Integer.toString(queue.peek()) + "\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()){
                        buf.write("-1" + "\n");
                    }else {
                        buf.write(Integer.toString(last) + "\n");
                    }
                    break;
            }
        }
        buf.flush();
        buf.close();

    }
}
