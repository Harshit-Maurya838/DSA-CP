import java.util.Scanner;
 
public final class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < 25; i++){
            int value = sc.nextInt();
            
            if(value == 1){
                y = (i / 5) + 1;
                x = (i % 5) + 1;
                break;
            }
        }
        
        System.out.println(Math.abs(x - 3) + Math.abs(y - 3));
        
        sc.close();
    }
}