package Competetive_programming;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class FibannociPrime {
    static{
        System.out.println("Enter the range");
    }
   
    void meth(int m,int n){
        ArrayList<Integer> prime=new ArrayList<Integer>();
        
        for(int i=m;i<=n;i++){
             int count =0;
             for(int j=1;j<=i;j++){
                if(i%j==0){
                   count=count+1;   
                } 
           }
           if(count==2){
            prime.add(i);
        }
        
        }
        System.out.println("prime numbers are");
        System.out.println(prime);
        int len=prime.size();
        //finding combinations
       int[] inte=new int[len];
       for(int i=0;i<prime.size();i++){
           inte[i]=prime.get(i);
       }
       //changing int array to string array
       String[] str=new String[inte.length];
       for(int i=0;i<str.length;i++){
            str[i]=String.valueOf(inte[i]);
       }
         ArrayList<String> comb=new ArrayList<String>();
       //finding combinations
        for(int i=0;i<len;i++){
           String temp=str[i];
            for(int j=0;j<len;j++){
                if(i==j){
                    continue;
                }
                else{
              comb.add(temp.concat(str[j]));
            }
        }
        }
       //changing to integer again
        ArrayList<Integer> change=new ArrayList<Integer>();
       for(int i=0;i<comb.size();i++){
           
          change.add(Integer.parseInt(comb.get(i)));
       }
       System.out.println("the combinations are "+change);
       //finding primes of combinations
       ArrayList<Integer> newprime=new ArrayList<Integer>();
       for(int i=0;i<change.size();i++){
           int count=0;
           for(int j=1;j<=change.get(i);j++){
               if(change.get(i)%j==0){
                   count=count+1;
               }
               
           }
           if(count==2){
                newprime.add(change.get(i));
           }
       }
       Collections.sort(newprime);
       System.out.println("the new primes are "+newprime);
       int l=newprime.size();
       int small=newprime.get(0);
       int large=newprime.get(newprime.size()-1);
       System.out.println(l);
       //printing last fibannoci
       ArrayList<Integer> fib= new ArrayList<Integer>();
        fib.add(small);
        fib.add(large);
        int sum;
        for(int i=2;i<l;i++){
            sum=fib.get(i-1)+fib.get(i-2);
            fib.add(sum);
           
        }

        System.out.println("the last number of fibanocci series is "+fib.get(l-1));




        

    }
    public static void main(String args[]){
        FibannociPrime obj=new FibannociPrime();
        Scanner sc=new Scanner(System.in);
       obj.meth(sc.nextInt(),sc.nextInt());
       sc.close();
    }
}