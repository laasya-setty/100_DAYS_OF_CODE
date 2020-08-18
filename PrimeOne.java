import java.util.*;
public class PrimeOne {
 static  boolean check(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    void meth(int n){
        ArrayList<Integer> prime=new ArrayList<Integer>();
         int end=n+50;
        for(int i=n;i<=end;i++){
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
    System.out.printf("The next three prime nums of %d are",n);
    for(int i=0;i<=3;i++){
        System.out.println(prime.get(i));
    }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      PrimeOne obj=new PrimeOne();
      int n=sc.nextInt();
     if(check(n)){
         obj.meth(n);
     }
     else{
         while(!check(n)){
         System.out.println("please enter a prime number");
          n=sc.nextInt();
        }
        obj.meth(n);

     }
      sc.close();
    }
}