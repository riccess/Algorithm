import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 1;
		int startC = 1;
		int endC = 1;
		int sum = 1;
		while(endC != N) {
			if(sum == N) {
				// 조건 부합으로 answer 증가
				answer++;
				// 다음 조건 탐색을 위해 endC 증가
				endC++;
				// endC가 증가했기 때문에 endC만큼 sum도 증가
				sum = sum + endC;
			} else if(sum < N) {
				// 수가 증가해야하기 때문에 endC를 증가
				endC++;
				// endC가 증가했기 때문에 sum도 똑같이 증가
				sum = sum + endC;
			} else {
				// sum이 N보다 커졌기 때문에 startC를 증가시켜 값을 줄여보기
				sum = sum - startC;
				startC++;
			}
		}
		System.out.println(answer);
	}
}