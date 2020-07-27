
import java.util.Scanner;
class Fact{
    
    
    long getfact(long n){
        if(n==0){
            return 1;
        }
        return n*getfact(n-1);
    }
}
public class Factorial {
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           Fact f=new Fact();
           System.out.println("enter a number");
           System.out.println(f.getfact(sc.nextInt()));
           sc.close();

    }
}