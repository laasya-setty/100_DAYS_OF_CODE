public class FinallyBlock {
    public static void main(String args[]) {
       try {
          System.out.println("I am in try block");
          System.exit(0);                             //whether it may be a succesful termination(System.exit(0))
       } catch(Exception ex){                         //or unsucessful termination in try block, finally will not work.
          ex.printStackTrace();
       } finally {
          System.out.println("I am in finally block");
       }
    }
 }