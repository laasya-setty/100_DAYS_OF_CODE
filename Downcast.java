
class Parent{
    String name;
   static void method(){
       System.out.println("Parent method");
   }
}
class Child extends Parent{
    int id;
    static void meth(){
        System.out.println("own child method");
        
    }
    
    static void method(){
        System.out.println("overriding parent method");
    }
}
public class Downcast{
    public static void main(String args[]){
    Parent p=new Child(); //upcast
        Child c=(Child)p;//downcast //superclass to subclass
        c.name="laasya";
        c.id=10;
        System.out.println(c.id);
    
    }
}