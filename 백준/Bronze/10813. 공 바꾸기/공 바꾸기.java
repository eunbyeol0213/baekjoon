
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm = br.readLine();
        String[] testCase = nm.split(" ");

        int numOfBaskets = Integer.parseInt(testCase[0]);
        int change = Integer.parseInt(testCase[1]);

        Integer[] basketArr = new Integer[numOfBaskets + 1];
        for (int i = 1; i < basketArr.length; i++) {
            basketArr[i] = i;
        }

        for (int i = 0; i < change; i++) {
            String str = br.readLine();
            String[] ballExchange = str.split(" ");

            int basket1 = Integer.parseInt(ballExchange[0]);
            int basket2 = Integer.parseInt(ballExchange[1]);

            int temp = basketArr[basket2];
            basketArr[basket2] = basketArr[basket1];
            basketArr[basket1] = temp;
        }

        for (int i = 1; i < basketArr.length; i++) {
            System.out.printf("%d ", basketArr[i]);
        }
    }
}
