import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
        char[] stringNum = num.toCharArray();
        int sum = 0;
        for(int i = 0; i<stringNum.length; i++) {
            sum += stringNum[i] -'0';
        }
        System.out.print(sum);
    }
}