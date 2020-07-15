import java.util.HashSet;
public class Hashset {
     public static void main(String[] args) {
        HashSet<Character> h=new HashSet<Character>();
        h.add('a');
        h.add('v');
        h.add('h');              //gives size as 5(as no duplicates allowed in hashset.)
        h.add('m');
        h.add('v');
        h.add('z');
        for(char i='a';i<'z';i++){
            if(h.contains(i)){
                System.out.println(i+ " found");
            }
            else{
                System.out.println(i +" not found");
            }
        }
        System.out.println(h.size());
            
    
        
    }
    
}