/*Given first term (a), common difference (d) and a integer n of the 
Arithmetic Progression series, the task is to print the series. */
import java.util.*;
public class Ap {
     static int a,d=0,n;
    List<Integer> artmeticprog(int n){     //method
        List<Integer> series=new ArrayList<Integer>();
        series.add(a);
        while(n-1!=0){
         //using list as it preserves the order.
            a=a+d;                                      //arraylist implements list interface
            series.add(a);
            n--;
        }
        return series;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first term");
        a=sc.nextInt();
        System.out.println("Enter common difference");
        d=sc.nextInt();
        sc.close();
        Ap obj=new Ap();
       System.out.println( obj.artmeticprog(10));

    }
    
}