
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] haveCard = br.readLine().split(" ");
        //key = 카드 값, value = 해당 카드를 가지고 있는 갯수
        Map<Integer, Integer> hsm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int cardVal = Integer.parseInt(haveCard[i]);
            //카드 값이 포함되어 있으면 value + 1
            if (hsm.containsKey(cardVal)){
                hsm.put(cardVal, hsm.get(cardVal) + 1);
            }
            //카드 값이 포함되어 있지 않으면 value를 1로 설정
            else {
                hsm.put(cardVal, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        String[] findCard = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int cardVal = Integer.parseInt(findCard[i]);
            //카드 값이 포함되어 있으면 value 값 출력
            if (hsm.containsKey(cardVal)){
                bw.write(hsm.get(cardVal) + " ");
            }
            //카드 값이 포함되어 있지 않으면 0 출력
            else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();

    }
}

