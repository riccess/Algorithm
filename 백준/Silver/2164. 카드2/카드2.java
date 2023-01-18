import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		Queue<Integer> qu = new LinkedList<>();
		for(int i = 1; i<=N; i++) {
			qu.add(i);
		}
		
		while(qu.size()!=1) {
			qu.poll();
			int n = qu.poll();
			qu.add(n);
		}
		int answer = qu.poll();
		System.out.println(answer);
		scan.close();
	}

}