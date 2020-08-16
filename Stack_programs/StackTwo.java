/*Using arraylist implementation */
package Stack_programs;
import java.util.*;
 class StackEmptyException extends Exception {
    
     public StackEmptyException(String message) {
        super(message);
    }
}

public class StackTwo<T> {
    List<T> stack=new ArrayList<T>();
    void push(T val){
        stack.add(val);           /*no need to check stack is full or not beacuse we didnot give a limit*/ 
    }
    T pop() throws Exception {
        
        if(stack.isEmpty()){
            
            throw new StackEmptyException("Stack is empty cant pop");

        
    }
    
    T value=stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
       return value;
    }
    void display(){
        System.out.println(stack);
    }
    public static void main(String args[]) throws Exception {
        StackTwo<Integer> obj=new StackTwo<Integer>(); //specify type here
         obj.push(10);
         obj.push(20);
         obj.push(40);
         obj.display();
        System.out.println("popped "+ obj.pop());
        System.out.println("popped "+ obj.pop());
        System.out.println( "popped "+obj.pop());
        obj.display();
        System.out.println( "popped "+obj.pop());
       

        
    }
    
}