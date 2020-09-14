package Competetive_programming;
import java.util.*;
public class HexawareFive {
        static int calculate(int x,int n){
        int y=0;
            for(int i=1;i<=n;i++){
                int z=(int)Math.pow(x,i);
            y=y+z ;
        }
        return y;
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int n=sc.nextInt();
      
       System.out.println( calculate(x, n));
       sc.close();
    }
}
