import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int order = sc.nextInt();
        List<Integer> divisor = new ArrayList<>();

        for(int i = 1; i <= val ; i++){
            if(val % i == 0){
               divisor.add(i);
            }
        }
        
       if(divisor.size() < order){
            System.out.println(0);
        } else {
            System.out.println(divisor.get(order - 1));
        }
    }
}