import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String com = br.readLine();

            if (com.contains("push")){
                String[] str = com.split(" ");
                stack.push(Integer.parseInt(str[1]));
            } else if (com.contains("top")) {
                if(stack.empty()){
                    System.out.println("-1");
                }else {
                    System.out.println(stack.peek());
                }
            } else if (com.contains("size")) {
                System.out.println(stack.size());
            } else if (com.contains("empty")) {
                if(stack.empty()){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            } else if (com.contains("pop")) {
                if(stack.empty()){
                    System.out.println("-1");
                }else {
                    System.out.println(stack.pop());
                }
            }
        }



    }
}
