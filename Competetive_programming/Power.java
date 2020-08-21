/*Give two numbers n and k, find the kth power of n 

Sample: 
Input  : 2 3
Output : 8
Input  : 3 2
Output : 9
 */
package Competetive_programming;
import java.util.Scanner;
import java.lang.Math;
public class Power {
    int pow(double n,double k){
        double ans=Math.pow(n,k);
       int val=(int)ans;
        return val;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Power obj=new Power();
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.printf("Enter the power for %d ",n);
        int k=sc.nextInt();
       System.out.println( obj.pow(n,k));

        sc.close();
    }
    
}