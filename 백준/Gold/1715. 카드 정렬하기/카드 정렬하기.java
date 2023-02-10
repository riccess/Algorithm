import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < N; i++) {
			pq.add(scan.nextInt());
		}

		int answer = 0;
		while (pq.size()>1) {
			int tmp = pq.poll() + pq.poll();
			answer += tmp;
			pq.add(tmp);
		}
		System.out.println(answer);
	}

}
