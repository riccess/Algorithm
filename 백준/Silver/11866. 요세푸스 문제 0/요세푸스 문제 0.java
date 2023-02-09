import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedWriter answer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		Queue<Integer> qu = new LinkedList<Integer>();
		for(int i = 1; i<=N; i++) {
			qu.add(i);
		}
		
		int count = 1;
		answer.write("<");
		while(qu.size() != 1) {
			if(count!=K) {
				qu.add(qu.poll());
			} else {
				answer.write(qu.poll()+", ");
				count = 0;
			}
			count++;
		}
		answer.write(qu.poll()+"");
		answer.write(">");
		
		answer.flush();
		
		scan.close();
	}
}