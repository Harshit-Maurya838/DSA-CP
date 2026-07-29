import java.util.Scanner;
 
public final class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(y == (x+1)){
                System.out.println("YES");
            }else if((x-y+1) % 9 == 0 && (x - y + 1) >= 9){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            
            n--;    
        }
        
        sc.close();
    }
}