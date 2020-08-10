/*using to invoke the current class method */
package this_keyword;
public class Three{
    void check(){
        System.out.println("method one");
    }
    void checkTwo(){
        System.out.println("another method");
        check();       //here we can also use this.check() which is same as check()
    }
    public static void main(String args[]){
Three obj=new Three();
    obj.checkTwo();
    }
}