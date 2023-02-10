import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/* 백준 2075
 * N번째 큰 수
 */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i<N; i++) {
			st  = new StringTokenizer(br.readLine());
			for(int j = 0; j<N; j++) {
				pq.add(Integer.parseInt(st.nextToken()));
			}
		}
		for(int i =1; i<N; i++) {
			pq.poll();
		}
		System.out.println(pq.poll());
	}

}
