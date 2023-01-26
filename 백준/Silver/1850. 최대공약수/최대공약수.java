import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long A = scan.nextLong();
		long B = scan.nextLong();
		long answer = maxG(A,B);
		
		while(answer>0) {
			bw.write("1");
			answer--;
		}
		bw.flush();
		bw.close();
		
		scan.close();
	}
	
	public static long maxG(long A, long B) {
		if(B!=0) {
			return maxG(B, A%B);
		} else {
			return A;
		}
	}

}