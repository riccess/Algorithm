import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder("");
        int n=Integer.parseInt(st.nextToken());
        int t=Integer.parseInt(st.nextToken());
        int nums[]=new int[n];
        st=new StringTokenizer(br.readLine());
        nums[0]=Integer.parseInt(st.nextToken());
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<t;i++){
            st=new StringTokenizer(br.readLine());
            int l=Integer.parseInt(st.nextToken())-1;
            int r=Integer.parseInt(st.nextToken())-1;
            if(l==0){
                ans.append(nums[r]).append("\n");
            }
            else{
                ans.append(nums[r]-nums[l-1]).append("\n");
            }
        }
        System.out.println(ans);
    }

}