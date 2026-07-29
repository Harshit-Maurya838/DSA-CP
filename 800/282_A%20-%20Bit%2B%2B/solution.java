import java.util.Scanner;
 
public final class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int value = 0;
        
        for(int i=0; i<n; i++){
            String operation = sc.next();
            if(operation.contains("++")){
                value++;
            }else if(operation.contains("--")){
                value--;
            }
        }
        
        System.out.println(value);
        
        sc.close();
    }
}