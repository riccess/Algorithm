import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		long t = scan.nextInt();
		
		// t만큼 반복 출력
		for(int i = 0; i<t; i++) {
			int n = scan.nextInt();
			
			long[] arr = new long[n];
			for(int j = 0; j<n; j++) {
				arr[j] = scan.nextLong();
			}
			
			long answer = solution(arr);
			
			System.out.println(answer);
		}
		scan.close();
	}
	
	// 최대 공약수 구하기
	public static long gcd(long A, long B) {
		if(B==0) {
			return A;
		}
		else {
			return gcd(B, A%B);
		}
	}
	
	public static long solution(long[] arr) {
		int n = arr.length;

		long answer=0;
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				answer += gcd(arr[i], arr[j]);
			}
		}
		return answer;
	}

}
