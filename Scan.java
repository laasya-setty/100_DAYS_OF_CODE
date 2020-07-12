import java.util.Scanner;

public class Scan {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter username");
      String username=sc.nextLine();
      System.out.println("username is"+username);
      sc.close();

      
    }
    
}