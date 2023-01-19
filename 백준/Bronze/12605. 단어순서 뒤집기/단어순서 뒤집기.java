import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		StringBuffer answer = new StringBuffer();
		for(int i = 0; i<N; i++) {
			answer.append("Case #"+(i+1)+":");
			Stack<String> stack = new Stack<>();
			
			// 토큰으로 분리
			StringTokenizer token = new StringTokenizer(reader.readLine());
			// 분리한 값 stack에 넣기
			int tokenCnt = token.countTokens();
			for(int j = 0; j<tokenCnt; j++) {
				stack.push(" "+token.nextToken());
			}
			// stack에서 하나씩 꺼내 answer에 넣기
			for(int j = 0; j<tokenCnt; j++) {
				answer.append(stack.pop());
			}
			answer.append("\n");
		}
		System.out.println(answer);
	}

}
