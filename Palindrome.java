import java.util.*;

public class Palindrome {
    int sum = 0, rem;

    int check(int num) {
        if (num != 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
            check(num);
        }
        return sum;
    }

    public static void main(String args[]) {
        Palindrome obj = new Palindrome();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = obj.check(n);
        if (a == n) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

}