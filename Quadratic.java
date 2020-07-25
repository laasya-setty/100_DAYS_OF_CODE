/*A quadratic equation will be in the form of ax^2+bx+c=0
A program to check whether the roots are complex,equal or real */
class Q{
    void check(int a,int b,int c){
        int bsquare=b*b;
        int d=4*a*c;
       if(bsquare<d){
           System.out.println("The roots are complex");
       }
       else if(bsquare>d){
           System.out.println("The roots are real");
       }
       else{
           System.out.println("The roots are equal");
       }
    }
}
public class Quadratic {
    public static void main(String args[]){
      Q obj=new Q();
      obj.check(1,-2,1);
      obj.check(1,7,12);
      obj.check(1,1,1);
    }
    
}