import java.util.*;
import java.lang.String;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int testCases = sc.nextInt();
 
        while(testCases-- > 0){
            int n = sc.nextInt();
            String s = sc.next(); 
            
            if (s.contains("...")) {
                System.out.println(2);
            } else {
                int emptyCount = 0;
                for(int i = 0; i < n; i++){
                    if(s.charAt(i) == '.'){
                        emptyCount++;
                    }
                }
                System.out.println(emptyCount);
            }
 
        }
 
        sc.close();
    }
}