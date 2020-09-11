/*Right rotation */
package Array_programs;
import java.util.Scanner;
import java.util.Arrays;
public class jugglingAlgTwo {
    int  gcd(int n,int k){
        
        if(n==0){
            return k;
        }
        if(k==0){
            return n;
        }
        if(n>k){
            return gcd(n-k,k);
        }
        else{
            return gcd(n,k-n);
        }
        
    }
    void juggle(int[] arr,int n,int k){
        int g=gcd(n,k);
        int temp,m,j;
        for(int i=0;i<g;i++){
          temp=arr[i];
          j=i;
          while(true){  //true
           m=j+k;
           if(m>=n){
               m=m-n;
           }
           if(m==i){
               break;
           }
           arr[j]=arr[m];
          
           j=m;
          
          }
         arr[j]=temp;  
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();   
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the shift/number of rotations");
        int k=sc.nextInt();
        Jugglingalg obj=new Jugglingalg();
               
        obj.juggle(arr,n,n-k);
        sc.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    /*int  gcd(int n,int k){

        if(n==0){
            return k;
        }
        if(k==0){
            return n;
        }
        if(n>k){
            return gcd(n-k,k);
        }
        else{
            return gcd(n,k-n);
        }
        
    }
    void juggle(int[] arr,int n,int k){
         int[] a =new int[n];
        int g=gcd(n,k);
        int temp,m,j;
        for(int i=g;i<0;i--){
          temp=arr[i];
          j=i;
          while(true){  //true
           m=j+k;
           if(m>=n){
               m=m-n;
           }
           if(m==i){
              break;
           }
           a[m]=arr[j];
           j=m;
          
          }
          arr[j]=arr[m];  
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();   
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the shift/number of rotations");
        int k=sc.nextInt();
        Jugglingalg obj=new Jugglingalg();
               
        obj.juggle(arr,n,k);
        sc.close();
    }*/
}
