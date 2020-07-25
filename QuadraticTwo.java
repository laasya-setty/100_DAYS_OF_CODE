/*Finding roots of a quadratic equation */
class Qua{
    void check(int a,int b,int c){
        if (a == 0) 
     { 
        System.out.println("Invalid"); 
        return; 
     } 
   
     int d  = b*b - 4*a*c; 
     double sqrt_val = Math.sqrt(Math.abs(d)); 
          
         if(d<0){
           System.out.println("The roots are complex");
           System.out.println("the roots are"+(double)(-b + sqrt_val) / (2 * a) + "\n" 
           + (double)(-b - sqrt_val) / (2 * a));

       }
       else if(d>0){
           System.out.println("The roots are real");
           System.out.println("the roots are"+-(double)b / ( 2 * a ) + " + i" 
           + sqrt_val + "\n"  + -(double)b / ( 2 * a ) 
           + " - i" + sqrt_val);
       }
       else{
           System.out.println("The roots are equal");
           System.out.println("the roots are"+(double)(-b + sqrt_val) / (2 * a));


       }
    }
}

public class QuadraticTwo {
    public static void main(String args[]){
        Qua obj=new Qua();
        obj.check(1,-2,1);
      obj.check(1,7,12);
      obj.check(1,1,1);
    }
    }
    
