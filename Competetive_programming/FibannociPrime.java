*Problem Description

Given two numbers n1 and n2

Find prime numbers between n1 and n2, then

Make all possible unique combinations of numbers from the list of the prime numbers you found in step 1. 

From this new list, again find all prime numbers.

Find the smallest (a) and largest (b) number from the 2nd generated list, also count of this list.

Consider the smallest and largest number as the 1st and 2nd number to generate the Fibonacci series respectively till the count (number of primes in the 2nd list).

Print the last number of a Fibonacci series as an output


Constraints
2 <= n1, n2 <= 100

n2 - n1 >= 35


Input Format
One line containing two space-separated integers n1 and n2.


Output
The last number of a generated Fibonacci series.


Timeout
1


Test Case
Example 1:


Input:

2 40
Output:

13158006689
Example 2:


Input:

30 70
Output:

2027041 
Explanation:


1st prime list=[31, 37, 41, 43, 47, 53, 59, 61, 67]


2nd prime list generated form combination of 1st prime list = [3137, 5953, 5347, 6761, 3761, 4337, 6737, 6131, 3767, 4759, 4153, 3167, 4159, 6143]


the smallest prime in 2nd list=3137

the largest prime in 2nd list=6761


Therefore, the last number of a Fibonacci series i.e. 14th Fibonacci number in the series that has 3137 and 6761 as the first 2 numbers is 2027041

 */



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
