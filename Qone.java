/*Here the output is 1 because, we  declared  value to the index in parent class to 1 and it is now pointing to the 
index varibale in child class which in turn will give us a value 1 */

class One{
    int index=1;
}
class Two extends One{
    public Two(int index){
        index=index;
    }
}
public class Qone {
    public static void main(String args[]){
       
        Two obj=new Two(10);
        System.out.println(obj.index);

    }

    
}