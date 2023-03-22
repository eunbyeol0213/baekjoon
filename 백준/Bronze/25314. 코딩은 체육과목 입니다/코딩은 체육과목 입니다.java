import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N =scan.nextInt();
		
		if(N%4==0) {
			int M = N/4;
			for(int i=0; i<M; i++) {
				System.out.print("long"+" ");
			}
			System.out.println("int");
		}

		

	}

}