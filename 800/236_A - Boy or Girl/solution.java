import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
 
public final class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String username = sc.nextLine();
        Set<Character> distinctChar = new LinkedHashSet<>();
 
        for(char ch : username.toCharArray()){
            distinctChar.add(ch);
        }
 
        if(distinctChar.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
 
        sc.close();
    }
}