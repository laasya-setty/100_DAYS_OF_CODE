/*using this to "return" current class instance
Note: return type of method must be class name
Syntax: return_type method_name(){} */
package this_keyword;


public class Six {
   int age;
   Six(){
     age =20;
   }
    Six meth(){
        return this;
    }
    void display(){
        meth();
        System.out.println(age);
    }
    public static void main(String args[]){
Six obj=new Six();
obj.display();
    }
}
