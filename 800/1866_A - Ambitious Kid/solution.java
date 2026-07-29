import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
 
        while(t-- > 0){
            int num = sc.nextInt();
            int positiveNum = Math.abs(num);
            if(positiveNum < smallest){
                smallest = positiveNum;
            }
        }
 
        System.out.println(smallest);
        sc.close();
    }
}