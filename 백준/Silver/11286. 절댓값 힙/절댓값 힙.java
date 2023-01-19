import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		// 우선순위 지정된 queue
		PriorityQueue<Integer> myQu = new PriorityQueue<>((o1, o2) -> {
			// 두개의 변수 모두 절댓값으로 변경
			int fAbs = Math.abs(o1);
			int sAbs = Math.abs(o2);
			// 절댓값이 같을 경우 오름차순(음수 우선) 정렬
			if(fAbs == sAbs) {
				return o1>o2 ? 1:-1;
			}
			// 절댓값을 기준으로 정렬
			else {
				return fAbs - sAbs;
			}
		});
		
		for (int i = 0; i<N; i++) {
			int request = Integer.parseInt(reader.readLine());
			// 요청 값이 0일 경우 출력
			if(request == 0) {
				// queue이 비어있을 때 => 0 출력
				if(myQu.size()==0) {
					System.out.println(0);
				}
				// 비어있지 않을 때 => 가장 작은 수 출력
				else {
					System.out.println(myQu.poll());
				}
			}
			// 
			else {
				myQu.offer(request);
			}
		}
	}
}