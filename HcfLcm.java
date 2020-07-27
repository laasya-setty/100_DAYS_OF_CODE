
class Gcd{
    int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
        return a;
        }
        if(a>b){
            return gcd(a-b,b); 
        }
        else{
            return gcd(a,b-a);
        }

    }


    int lcm(int a,int b){
        int l=(a*b)/gcd(a,b) ;
        return l;         //product of 2 numbers is lcm*hcf
        }
}

public class HcfLcm {
    public static void main(String args[]){
        
      Gcd obj=new Gcd();
      System.out.println(obj.gcd(98,56));
      System.out.println(obj.lcm(2,4));
        }
    }
    
