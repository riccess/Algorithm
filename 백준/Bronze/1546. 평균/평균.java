import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] arr = new int[count];
		
		for(int i = 0; i<count; i++) {
			arr[i] = scan.nextInt();
		}
		
		long max = 0;
		long sum = 0;
		
		for(int i = 0;  i<count; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			sum = sum+arr[i];
		}
		System.out.println(sum*100.0/max/count);
		scan.close();
	}
}