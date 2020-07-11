abstract class Bike{
   public abstract void sound();

}
class Re extends Bike{
    public void sound(){
        System.out.println("dug dug dug");
    }
}
public class Abstract {
    public static void main(String args[]){
        Re obj=new Re();
        obj.sound();
    }
    
}