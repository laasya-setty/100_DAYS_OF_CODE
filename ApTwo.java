/*Sum of n terms in a AP 
Formula :n/2(2a+(n-1)d)*/

class Arth{
    void ap(int n,int a,int d){
        int sum=0;
     for (int i = 1; i <= n; i++){  
        System.out.println(a+" "); 
         sum=sum+a;
         a=a+d; 

    }
    System.out.println("sum of n terms is "+sum);
    
    
}
void formula(int num,int first,int diff){
    float firsthalf=num/2;
    float secondhalf=(num-1)*diff;
    float middle=2*first;
    float sum= firsthalf*(middle+secondhalf);
    System.out.println(sum);
}
}
    public class ApTwo {
    public static void main(String args[]){
        Arth obj=new Arth();
        obj.ap(10, 5, 2);
        obj.formula(10,5,2);
        
    }
     
    }
    
