import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //<파일 이름, 중복된 파일 갯수>
        Map<String, Integer> hsm = new HashMap<>();

        String fileName;

        for (int i = 0; i < N; i++) {
            fileName = br.readLine().split("\\.")[1];

            if (hsm.containsKey(fileName)) {
                hsm.put(fileName, hsm.get(fileName) + 1);
            } else {
                hsm.put(fileName, 1);
            }
        }
        //사전순으로 키 정렬
        Map<String, Integer> sortedMap = new TreeMap<>(hsm);

        //Map key,value 출력
        Set<String> keySet = sortedMap.keySet();
        for (String key : keySet) {
            bw.write(key + " " + sortedMap.get(key) + "\n");
        }

        bw.flush();
        bw.close();
    }


}


