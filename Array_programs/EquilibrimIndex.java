
/*Using the concept of prefix sum array
a[] = {-7, 1, 5, 2, -4, 3, 0}. 
Here, a[0] + a[1] + a[2] = a[4] + a[5] + a[6].
 Hence, 3 is the equilibrium index.*/

 package Array_programs;
import java.util.Scanner;
public class EquilibrimIndex {
    int index(int[] arr,int n){
        int sum=0;
        int left_sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        for(int i=0;i<n;i++){
          sum=sum-arr[i];
          if(sum==left_sum){
              return i;

          }
          else{
              left_sum=left_sum+arr[i];
          }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();   
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         EquilibrimIndex obj=new EquilibrimIndex();
       System.out.println("Equlibrium index is "+obj.index(arr,n));
        sc.close();
    }
}
