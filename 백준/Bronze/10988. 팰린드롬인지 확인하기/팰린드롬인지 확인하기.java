
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        StringBuilder palindrome = new StringBuilder(word);

        palindrome.reverse();

        int result = (word.equals(palindrome.toString())) ? 1 : 0;

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();

    }
}
