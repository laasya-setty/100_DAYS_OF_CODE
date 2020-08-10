/*this is used for constructor chaining
    It is a process of calling one constructor from another
     */
package this_keyword;

public class Four {
    Four(int a,String s){
        this(10);
    }
    Four(){
    this(10,"laasya");
        System.out.println("default");
    }
    Four(int a){
        System.out.println("this is chaining");
    }

    
    public static void main(String args[]){
        new Four();

    }
    
}