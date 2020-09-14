package Competetive_programming;
import java.util.*;
public class HexawareSeven {
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   
   int n=sc.nextInt();
   sc.nextLine();
   Map<String, Integer> hm = new HashMap<String, Integer>(n); 
   for(int i=0;i<n;i++){
       String a=sc.nextLine();
       int b=sc.nextInt();
       hm.put(a,b);
       sc.nextLine();
   }
   System.out.println(hm.toString());
   String s=sc.nextLine();
   int v=sc.nextInt();

   hm.replace(s,v);
System.out.println(hm.toString());
sc.close();
}
}
