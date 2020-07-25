import java.util.*;
class Med{
    Scanner sc=new Scanner(System.in);
    void median(int n){
       System.out.printf("enter %d numbers",n);
       List<Integer> list=new ArrayList<Integer>();
       while(n!=0){
        list.add(sc.nextInt());
        n--;
    }
    if(n%2!=0){
       int median=list.get(n/2);
       System.out.println("median is "+median);
    }
    else{
        int median=list.get(n/2)+list.get((n/2)+1);
        System.out.println("median is"+median);
    }

       
    }
}
public class Median {
    public static void main(String args[]){
        Med obj=new Med();
       obj.median(7);
       obj.median(8);

    }
}