import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int A = scan.nextInt();
		
		for(int i = 1; i<N; i++) {
			int B = scan.nextInt();
			int maxG = gcd(A, B);
			int x = A/maxG;
			int y = B/maxG;
			System.out.printf("%d/%d", x, y);
			System.out.println();
		}
		scan.close();
	}
	
	public static int gcd(int A, int B) {
		if(B==0) {
			return A;
		}
		else {
			return gcd(B, A%B);
		}
	}
}
