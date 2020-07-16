import java.lang.Thread;
public class ThreadOne extends Thread {
    public void run(){
        System.out.println("Here we are getting original name of thread "+Thread.currentThread().getName());
        Thread.currentThread().setName("laasya");
        System.out.println("new name is "+Thread.currentThread().getName());
        //Thread.currentThread().setPriority(7);
        System.out.println("original priority of main thread"+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
       ThreadOne t=new ThreadOne();
       ThreadOne t1=new ThreadOne();
       t.setPriority(2);
       t.start();
       t1.start();
      
       


    }
}