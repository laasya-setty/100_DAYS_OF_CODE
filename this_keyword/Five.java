/*this can be passed as an argument in the method call */
package this_keyword;

public class Five {
    void methodOne(Five object){
        System.out.println("method one");

    }
    void methodTwo(){
        methodOne(this);
    }
    public static void main(String args[]){
 Five f=new Five();
 f.methodTwo();
    }
}