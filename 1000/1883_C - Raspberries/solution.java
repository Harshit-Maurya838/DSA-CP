import java.io.*;
import java.util.StringTokenizer;
 
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
 
        StringBuilder sb = new StringBuilder();
 
        while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
 
            int minOpsSingle = k; 
            int evenCount = 0;
            
 
            for(int i = 0; i < n; i++){
                int a = Integer.parseInt(st.nextToken());
                
                int remainder = a % k;
                int ops = (remainder == 0) ? 0 : k - remainder;
                minOpsSingle = Math.min(minOpsSingle, ops);
                
                if (a % 2 == 0) {
                    evenCount++;
                }
            }
 
            if(k == 4){
                int opsForTwoEvens = Math.max(0, 2 - evenCount);
                sb.append(Math.min(minOpsSingle, opsForTwoEvens)).append("
");
            }else{
                sb.append(minOpsSingle).append("
");
            }
        }
 
        System.out.print(sb.toString());
    }
}