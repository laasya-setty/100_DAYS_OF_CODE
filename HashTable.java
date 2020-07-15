/* clear()
object.clone()
computeIfAbsent(key,function)
contains()
containsKey()
containsValue()
entrySet()-returns view of table*/ 

import java.util.Hashtable;
public class HashTable {
    public static void main(String args[]){
        Hashtable<String,Integer> h=new Hashtable<String,Integer>();
        h.put("laasya",20);
        h.put("vineela",21);
        h.put("bestfriend",15);
        Hashtable<String,Integer> h1=new Hashtable<String,Integer>();
        h1=(Hashtable<String,Integer>)h.clone(); 
        System.out.println(h1);
        h.computeIfAbsent("jack",v->25);
        System.out.println(h);
        if(h1.contains("jack")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println(h1.entrySet());

    }
    
}