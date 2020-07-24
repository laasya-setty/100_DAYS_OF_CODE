/*Sum of n terms in a AP */

class Arth{
    void ap(int n,int a,int d){
        int sum=0;
     for (int i = 1; i <= n; i++){  
        System.out.println(a+" "); 
         sum=sum+a;
         a=a+d; 

    }
    System.out.println("sum of n terms is"+sum);
    
    
}
}
    public class ApTwo {
    public static void main(String args[]){
        Arth obj=new Arth();
        obj.ap(10, 5, 2);
        
    }
     
    }
    
