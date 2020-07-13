import java.util.*;
public class Primefactors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        sc.close();
        System.out.printf("prime factors of %d are \n",num);
        for(int i=2;i<=num;i++){
            while(num%i==0){
                System.out.println(i+" ");
                num=num/i;
            }

        }
        if(num<=1){
            System.out.println("these are the factors");
        }

    }
}