import java.util.Scanner;
 
public final class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
 
            for(int i=0; i<n; i++){
                arr[i] =  sc.nextLong();
            }
 
            for(int i=0; i<n; i++){
                int a = 0;
                int b = 0;
 
                long curr = arr[i];
 
                for(int j = i+1; j<n; j++){
                    if(curr > arr[j]){
                        a++;
                    }else if(curr < arr[j]){
                        b++;
                    }
                }
                
                arr[i] = Math.max(a,b);
            }
 
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
 
            t--;
        }
    }
}