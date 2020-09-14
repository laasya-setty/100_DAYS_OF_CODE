package Competetive_programming;
import java.util.*;
public class HexawareFour {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int sum=a+b+c;
      if(sum==180){
          System.out.println("Prize 1");
      }
      else if(sum==180 && (a==90||b==90||c==90)){
          System.out.println("Prize 2");
      }
      else if(a==60&&b==60&&c==60){
          System.out.println("Prize 3");
      }
      else{
          System.out.println(" No Prize");
      }
       sc.close();
    }
}
