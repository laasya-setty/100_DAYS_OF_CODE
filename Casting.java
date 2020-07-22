import java.util.*;
 class Parnt{
    int a= 15;
    int b=20;
     void meth(){
        System.out.println("parent's method");
    }
    void parentmeth(){
        System.out.println("Only parents method");
    }

}
class Chld extends Parnt{
    int a=25;

     void meth(){
System.out.println("child's method(overridden)");
    }
    void method(){
        System.out.println("only childs method");
    }

}


public class Casting {
    public static void main(String args[]){
       Parnt p=new Chld();    //parent obj referencing child
             p.meth(); 
              p.parentmeth();
              //p.method();   //error
             System.out.println(p.a);       //since p is referencing child it return childs method
             Chld ch=(Chld)p;   //ch (child obj)is referencing to p(parent obj) which is referencing to child
             ch.meth();
             p.meth();
             System.out.println(ch.a); 
             ch.method();
             ch.parentmeth();
             System.out.println(ch.b); 


    }
}