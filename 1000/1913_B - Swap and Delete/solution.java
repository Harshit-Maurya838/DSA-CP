import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
 
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            int num0 = 0;
            int num1 = 0;
 
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == '0'){
                    num0++;
                }else{
                    num1++;
                }
            }
 
            boolean finished = true;
 
            for(int i = 0; i < n; i++){
                if (s.charAt(i) == '0') {
                    if(num1 > 0) {
                        num1--;
                    } else {
                        System.out.println(n - i);
                        finished = false;
                        break;
                    }
                } else {
                    if(num0 > 0){
                        num0--;
                    }else{
                        System.out.println(n - i);
                        finished = false;
                        break;
                    }
                }
            }
            if(finished){
                System.out.println(0);
            }
        }
    }
}