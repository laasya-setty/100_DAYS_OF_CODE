import java.util.*;
public class Factors {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.printf("Factors of %d are\n",num);
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" ");
            }
        }
    }
}