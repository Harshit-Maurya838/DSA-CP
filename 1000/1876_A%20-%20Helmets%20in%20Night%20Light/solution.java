import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
 
public class Main{
    static class Resident implements Comparable<Resident>{
        int capacity;
        long cost;
 
        public Resident(int capacity,  long cost){
            this.capacity = capacity;
            this.cost = cost;
        }
        @Override
        public int compareTo(Resident other){
            return Long.compare(this.cost, other.cost);
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
 
        while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long p = Long.parseLong(st.nextToken());
 
            int[] capacities = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                capacities[i] = Integer.parseInt(st.nextToken());
            }
 
            long[] costs = new long[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                costs[i] = Long.parseLong(st.nextToken());
            }
 
            Resident[] residents = new Resident[n];
            for(int i = 0; i < n; i++){
                residents[i] = new Resident(capacities[i], costs[i]);
            }
            Arrays.sort(residents);
 
            long totalCost = p;
            long remainingToNotify = n - 1;
 
            for(int i = 0; i < n && remainingToNotify > 0; i++){
                if(residents[i].cost >= p){
                    break;
                }
                long take = Math.min(remainingToNotify, residents[i].capacity);
                
                totalCost += take * residents[i].cost;
                remainingToNotify -= take;
            }
            
            if (remainingToNotify > 0) {
                totalCost += remainingToNotify * p;
            }
            
            System.out.println(totalCost);
        }
    }
}