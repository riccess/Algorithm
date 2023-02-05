import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	// A: 인접 리스트 그래프
	static ArrayList<Integer>[] A;
	// visited: 방문 기록 저장 배열
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		// 노드의 개수(n)만큼 arrayList 생성
		for(int i = 1; i<n+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		// 엣지의 개수(m)만큼 인접 리스트에 값 삽입
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		
		int count = 0;
		for(int i=1; i<n+1; i++) {
			// 방문하지 않은 노드가 없을 때까지 반복하기
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	// 깊이 우선 탐색 구현
	static void DFS(int v) {
		if(visited[v]) {
			return;
		} else {
			visited[v] = true;
			for(int i : A[v]) {
				if(visited[i]==false) {
					DFS(i);
				}
			}
		}
	}
}
