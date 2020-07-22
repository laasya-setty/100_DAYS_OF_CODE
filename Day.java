
import java.util.*;

public class Day {
    public static void main(String args[]) {
        HashMap<Integer,String> dayname= new HashMap<>();
        dayname.put(1,"Sunday"); dayname.put(2,"Monday"); dayname.put(3,"Tuesday"); dayname.put(4,"Wednesday");
        dayname.put(6,"Thursday"); dayname.put(6,"Friday"); dayname.put(7,"Saturday");
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
       System.out.println(dayname.get(dayofWeek));
        ;

    }

}