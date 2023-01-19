import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		// 정답
		StringBuffer answer = new StringBuffer();
		answer.append("<");
		
		Queue<Integer> mq = new LinkedList<Integer>();
		for(int i = 1; i<=N; i++) {
			mq.add(i);
		}
		while(mq.size() != 1) {
			for(int i = 1; i<K; i++) {
				int a = mq.poll();
				mq.add(a);
			}
			int b = mq.poll();
			answer.append(b+", ");
		}
		answer.append(mq.poll()+">");
		System.out.println(answer);
		scan.close();
	}

}
