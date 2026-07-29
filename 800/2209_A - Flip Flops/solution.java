import java.util.Scanner;
import java.util.Arrays;
 
public final class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            long c = sc.nextInt();
            long k = sc.nextInt();
            
            long[] a = new long[n];
            
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            
            for(int i=0; i<n; i++){
                if(a[i] > c){
                    break;
                }
                
                long x = Math.min(c-a[i], k);
                k -= x;
                c += a[i] + x;
            }
            
            System.out.println(c);
            t--;
            
        }
        
        sc.close();
    }
}