import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                    //Hashset은 중복제거 해주기 때문에 중복값 비교 안해줘도 됨
                    result.add(S.substring(i,j+1));
            }
        }
        System.out.println(result.size());
    }
}
