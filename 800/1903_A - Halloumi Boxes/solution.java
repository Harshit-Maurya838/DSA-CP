import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int testCases = sc.nextInt();
 
        while(testCases-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
 
            if(k >= 2){
                System.out.println("YES");
            }else {
                if(isSorted(arr)) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
 
        sc.close();
    }
 
    private static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}