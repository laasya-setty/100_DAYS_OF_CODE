package Competetive_programming;
import java.util.*;
public class HexawareTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String type=sc.nextLine();
        int people=sc.nextInt();
        sc.nextLine();
        char paid=sc.next().charAt(0);
        sc.nextLine();
        double d=sc.nextDouble();
        System.out.println("Event Name : "+name);
        System.out.println("Event Type : "+type);
        System.out.println("Expected Count : "+people);
        System.out.println("Paid Entry : "+paid);
        System.out.println("Projected Expense : "+d+"L");
        sc.close();
    }
}
