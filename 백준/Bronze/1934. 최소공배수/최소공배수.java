import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i<T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int answer = A*B/maxG(A, B);
			System.out.println(answer);
		}
		scan.close();
	}

	public static int maxG(int A, int B) {		
		if(B!=0) {
			return maxG(B, A%B);
		}else {
			return A;
		}
	}
}