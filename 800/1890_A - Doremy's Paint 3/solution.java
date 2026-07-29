import java.util.Scanner;
import java.util.HashSet;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int testCases = sc.nextInt();
 
        while(testCases-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> uniqueSet = new HashSet<>();
 
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                uniqueSet.add(arr[i]);
            }
 
            if(uniqueSet.size() >= 3){
                System.out.println("No");
            }else if(uniqueSet.size() == 1){
                System.out.println("Yes");
            }else if(uniqueSet.size() == 2){
                int target = uniqueSet.iterator().next();
                int count = 0;
                
                for(int num : arr){
                    if(num == target){
                        count++;
                    }
                }
 
                if(count >= n / 2 && count <= (n + 1) / 2){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
 
 
        sc.close();
    }
}