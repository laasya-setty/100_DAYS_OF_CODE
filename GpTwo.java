/* Sum of n terms in geometric progression*/
class T{
    void Sum(int a,double r,int n){
        
        int numer= a*((int)Math.pow(r,n)-1);
        int deno=(int)r-1;
        if(r<1){
            int numerator=a*(1-(int)Math.pow(r,n));
        int denominator=1-(int)r;
            System.out.println(numerator/denominator);

        }
        else if(r==1){
            System.out.println(a*n); // r will be 1 only if series is like 1,1,1 or 2,2,2,2 etc

        }
        else{
            
            System.out.println(numer/deno);
        }
        
    }
    
}

public class GpTwo {
    public static void main(String args[]) {
        T obj=new T();
        obj.Sum(2,2,4);
        obj.Sum(2,0.5,4);
        obj.Sum(2,1,4);

    }

}