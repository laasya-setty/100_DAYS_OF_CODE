/*Program to check whther a number is prime or not */




public class PrimeNum {

  static  boolean check(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }    
    public static void main(String[] args) {  
    if(check(12)){
        System.out.println("is a prime");

    }
    else{
        System.out.println("is not a prime");
    }
    
    }

}