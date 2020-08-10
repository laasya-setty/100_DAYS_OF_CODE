/*this can be used to invoke a class constructor */
package this_keyword;

public class Two {
    Two(int a,int b){
        
        System.out.println("Parametrised constructor");
        
    }
    Two(){
        this(25,32);  //Constructor call should always be the first statment in constructor.
        System.out.println("default constructor");
        
    }

    public static void main(String args[]){
     new Two();   
    }
    
}