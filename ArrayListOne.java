import java.util.Collections;
import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>(7);
        arr.add(21);
        arr.add(22);
        arr.add(23);
        arr.add(24);
        arr.add(25);
        arr.add(26);
        arr.add(27);
        Collections.sort(arr,Collections.reverseOrder());//desc
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        for(Integer i:arr){      //for-each loop
            System.out.println(i);
        }

    }
    
}