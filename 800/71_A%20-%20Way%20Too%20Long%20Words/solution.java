import java.util.Scanner;
 
public final class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        
        String[] words = new String[num];
        
        for(int i=0; i<num; i++){
            String word = sc.nextLine();
            
            if(word.length() > 10){
                int n = word.length();
                words[i] = "" + word.charAt(0) + (n-2) + word.charAt(n-1);
            }else {
                words[i] = word;
            }
        }
        
        for(int i=0; i<num; i++){
            System.out.println(words[i]);
        }
        
        sc.close();
        
    }
}