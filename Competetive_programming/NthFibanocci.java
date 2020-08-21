package Competetive_programming;
import java.util.Scanner;
import java.util.ArrayList;
public class NthFibanocci {
    int fib(int n){
     ArrayList<Integer> arr=new ArrayList<Integer>();
     arr.add(0);
     arr.add(1);
     for(int i=2;i<n;i++){
         int sum=arr.get(i-1)+arr.get(i-2);
         arr.add(sum);
     }
     int val=arr.get(n-1);
     return val;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     System.out.println("enter which fibanocci number do you want?");
     int n=sc.nextInt();    
     NthFibanocci obj=new NthFibanocci();
     System.out.println(obj.fib(n));
     sc.close();    
    }
    
}