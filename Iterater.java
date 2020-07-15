import java.util.Iterator;
import java.util.ArrayList;
public class Iterater {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(3);
        arr.add(7);
        arr.add(10);
        arr.add(27);
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}