import java.util.Scanner;
 
public final class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 
    String string1 = sc.nextLine();
    String string2 = sc.nextLine();
 
    int result = string1.toLowerCase().compareTo(string2.toLowerCase());
    if(result > 0){
      result = 1;
    }else if(result < 0){
      result = -1;
    }else{
      result = 0;
    }
 
    System.out.println(result);
 
    sc.close();
  }
}