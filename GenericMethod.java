public class GenericMethod {
String name="laasya";
    <E> void meth(E[] name){
          for(E i:name){
             System.out.println(i);
          }
    }
    void disp(){
     System.out.println(name);
    }
    public static void main(String args[]){
        GenericMethod obj=new GenericMethod();
    Integer[] arr={1,4,5,6,7,8,9,0,2,4,5,6,7,8}; //should not use int,char must use Integer,Character
    /*because here in generic classes and methods the type parameters like(T,E...etc) are not primitive types
    they are objects so we use Integer,Character,Boolean ....etc */
     obj.meth(arr);
     obj.disp();
    }
    
}