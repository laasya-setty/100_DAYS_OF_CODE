package Competetive_programming;
import java.util.*;
public class HexawareSix {
    static int cal(String[] s,int n){
        int flag=0;
     for(int i=0;i<n;i++){
      
         if(s[i]=="cookie"){
             if(s[i+1]=="juice"){
                 flag=1;
                 
             }
             
         }
         else{
             continue;
         }
         
     }
     System.out.println(flag);
     return flag;
          
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
           s[i]=sc.nextLine();
        }
        
        System.out.println(Arrays.toString(s));
        int c=cal(s,n);
        System.out.println(c);
        if(c==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        sc.close();
    }
}
