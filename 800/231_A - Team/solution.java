import java.util.Scanner;
 
public final class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int totalSolved = 0;
        
        for(int i=0; i<n; i++){
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();
            
            if(p1+p2+p3 >= 2){
                totalSolved++;
            }
        }
        
        System.out.println(totalSolved);
        
        sc.close();
    }
}