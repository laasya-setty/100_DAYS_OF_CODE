import java.util.Scanner;
public class NumofDigits {
    public static void main(String args[]){
        int digitcount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int num=sc.nextInt();
        sc.close();
        while(num!=0){
            digitcount+=1;
            num/=10;

        }
  System.out.println("number of digits in given number are "+digitcount);
   

    }
}