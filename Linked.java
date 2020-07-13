import java.util.LinkedList;
import java.util.Collections;
public class Linked {
    public static void main(String args[]){
    LinkedList<String> l=new LinkedList<String>();
    l.add("zeebra");
    l.addFirst("lassi");
    l.addLast("setty");
    l.remove(0);
    l.set(1,"Zeebra");
    System.out.println(l);
    Collections.sort(l);
    System.out.println(l.toString());    

}


}