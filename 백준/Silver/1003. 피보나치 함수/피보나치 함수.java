import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[][] fiboArr = new int[41][2];
        int[] arr = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        fiboArr[0][0] = 1;
        fiboArr[0][1] = 0;
        fiboArr[1][0] = 0;
        fiboArr[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            fiboArr[i][0] = fiboArr[i-1][0] + fiboArr[i-2][0];
            fiboArr[i][1] = fiboArr[i-1][1] + fiboArr[i-2][1];
        }

        for (int num : arr){
            bw.write(Integer.toString(fiboArr[num][0])+ " " + Integer.toString(fiboArr[num][1])+ "\n");
        }

        bw.flush();
        bw.close();
    }

}
