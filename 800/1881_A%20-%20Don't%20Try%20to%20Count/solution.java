import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            String x = sc.next();
            String s = sc.next();
 
            int count = 0;
            boolean found = false;
 
            while(count <= 6){
                if(x.contains(s)){
                    System.out.println(count);
                    found = true;
                    break;
                }
                x += x;
                count++;
            }
 
            if(!found){
                System.out.println(-1);
            }
 
        }
 
 
        sc.close();
    }
}