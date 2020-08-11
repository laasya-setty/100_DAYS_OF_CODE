/*to pass this as an argument in constructor call 
it is useful if we use one object for multiple classes*/
package this_keyword;

 class T {
   Seven obj;
    T(Seven obj){
      this.obj=obj;
    }
    void display(){
        System.out.println(obj.a);
    }
}
 public class Seven{
     int a=10;
     Seven(){
         T t=new T(this);
         t.display();
     }
    
     public static void main(String args[]){
      new Seven();
    }
    
}