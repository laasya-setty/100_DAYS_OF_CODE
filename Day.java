
import java.util.*;

public class Day {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter date");
        int date = sc.nextInt();
        System.out.println("enter month"); // january=0 sunday=1
        int month = sc.nextInt();
        System.out.println("enter year");
        int year = sc.nextInt();
        sc.close();
        System.out.println(date + " " + month + " " + year);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);
        cal.set(Calendar.YEAR, year);
        int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayofWeek);

    }

}