
import java.util.ArrayList;
public class ArraylistTwo {
    public static void main(String args[]){
        ArrayList<Integer> arr= new ArrayList<Integer>(4);
        arr.add(25); //0
        arr.add(16); //1
        arr.add(77);  //2                            
        /*if we remove an element from middle then the array adjusts itself by moving left*/
        System.out.println(arr.size());
        arr.remove(1);
        System.out.println(arr);
        System.out.println(arr.indexOf(77)); //as array elements move left the index of 77 changes from 2 to 1.
        System.out.println(arr.size());
    }
}