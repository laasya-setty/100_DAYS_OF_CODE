/*sum of prefixes
input : [1,2,3,4,5]
output:[1,3,6,10,15] */
package Array_programs;
import java.util.Arrays;
import java.util.Scanner;
public class Prefixsum{
    void prefix(int[] arr,int n){
        int temp[] =new int[n];
         temp[0]=arr[0];
         for(int i=1;i<n;i++){
            temp[i]=arr[i]+temp[i-1];
         }
         System.out.println(Arrays.toString(temp));
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();   
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Prefixsum obj=new Prefixsum();
        obj.prefix(arr,n);
        sc.close();
    }
}