class Outer{
    int n=10;
    static void method(){
        System.out.println("outer class");
    }
      class Inner{
          int m=12;
        void prints(int x,int y){
        x=n;
        y=m;
        System.out.println(x+y);
    }
}
    void display(){
       Inner i=new Inner();
       i.prints(15,20);
    }

    }


public class Innerclass {
    public static void main(String args[]){
        Outer o=new Outer();
        o.display();
             
    }
    
}