import java.util.Scanner;
 
public final class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] scores = new int[n];
        for(int i=0; i<n; i++){
            scores[i] = sc.nextInt();
        }
        
        int nextRParticipants = 0;
        int cutOff = scores[k-1];
        
        for(int i=0; i<n; i++){
            if(scores[i] >= cutOff && scores[i] > 0){
                nextRParticipants++;
            }else{
                break;
            }
        }
        
        System.out.println(nextRParticipants);
        
        sc.close();
    }
}