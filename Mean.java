/*Finding mean or average of given numbers */
import java.util.Scanner;
class Avg{
    void average(int n){
        Scanner sc=new Scanner(System.in);
        float sum=0;
       System.out.printf("Enter %d numbers",n);        
       for(int i=1;i<=n;i++){
           sum=sum+sc.nextInt();
           
       }
       System.out.println("the average is "+sum/n);
       sc.close();
    }
    
}
public class Mean {
    public static void main(String args[]){
      
      Avg obj= new Avg();
      obj.average(6);

    }
}