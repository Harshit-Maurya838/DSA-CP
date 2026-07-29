import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int testCases = sc.nextInt();
 
        while(testCases-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int[] arr = new int[n];
 
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
 
            int maxTank = arr[0] - 0;
 
            for(int i=1; i<n; i++){
                if((arr[i] - arr[i-1]) > maxTank){
                    maxTank = arr[i] - arr[i-1];
                }
            }
 
            maxTank = (2 * (x - arr[n-1])) > maxTank ? (2 * (x - arr[n-1])) : maxTank; 
 
            System.out.println(maxTank);
        }
 
        sc.close();
    }
}