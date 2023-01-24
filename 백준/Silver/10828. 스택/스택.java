import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> st = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int i=1;i<=N;i++) {
			String[] call = br.readLine().split(" ");
			if(call[0].equals("push")) {
				st.push(Integer.parseInt(call[1]));
			}
			else if(call[0].equals("pop")) {
				if(st.isEmpty()) {
					bw.write(-1+"\n");
				}
				else {
					bw.write(st.pop()+"\n");
				}
			}
			else if(call[0].equals("size")) {
				bw.write(st.size()+"\n");
			}
			else if(call[0].equals("empty")) {
				if(st.empty()) {
					bw.write(1+"\n");
				}
				else {
					bw.write(0+"\n");
				}
			}
			else if(call[0].equals("top")) {
				if(st.isEmpty()) {
					bw.write(-1+"\n");
				}
				else {
					bw.write(st.peek()+"\n");
				}
			}
		}
		bw.flush();
	}
}
