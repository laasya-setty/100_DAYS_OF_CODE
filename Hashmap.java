import java.util.HashMap;
import java.util.Iterator;

public class Hashmap{

    public static void main(String args[]){
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        h.put(1,"laasya");
        h.put(2,"chakri");
        h.put(3,"vinne");
        System.out.println(h.keySet());
       for(Integer i:h.keySet()){
           System.out.println("id is "+i+" name is "+h.get(i));
       }
       for(String s:h.values()){
           System.out.println("values are "+s);
       }
       Iterator i=h.entrySet().iterator();               //using iterator
       while(i.hasNext()){
           System.out.println(i.next());
       }


    }
}