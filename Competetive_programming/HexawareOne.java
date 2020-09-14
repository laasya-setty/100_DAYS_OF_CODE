package Competetive_programming;
import java.util.*;
public class HexawareOne {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int[] a=new int[n];
     int[] b=new int[n];
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
       int[] c=new int[n];
       c[0]=a[0];
        for(int i=1;i<n;i++){
            int diff=0;
            int temp=a[i-1];
          diff=a[i]-temp;
          c[i]=diff;
        }
        System.out.println(Arrays.toString(c));
       int cnt=0;
       for(int i=0;i<n;i++){
           if(c[i]==b[i]){
               cnt=cnt+1;

           }
           else if(c[i]>b[i]){
               cnt=cnt+1;
           }
           else{
               continue;
           }
       }
       System.out.println(cnt);
        sc.close();
    }
    }
