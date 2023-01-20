import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		long answer = 0;
		
		for(int i = 1; i<=K; i++) {
			int a = scan.nextInt();
			if(a!=0) {
				stack.push(a);
			} else {
				stack.pop();
			}
		}
		while(!stack.isEmpty()) {
			int b = stack.pop();
			answer += b;
		}
		System.out.println(answer);
		scan.close();
	}
}