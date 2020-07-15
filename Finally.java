
public class Finally {
    static void method(){
        try{
            System.out.println("hai");
        }
        catch(Exception e){
            System.out.println("there is an exception");

        }
        finally{
            System.out.println("hai");                  //writing this program to check if there is same info in 
                                                        // both try and finally will it print 2 times or once
        }                                               //it works:)
    }
    public static void main(String args[]){
      method();
    }
}