/*Given an array arr of size N and an integer K,
 the task is to find the maximum for each and every contiguous subarray of size K. 
 arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
Output: 3 3 4 5 5 5 6
All ccontigious subarrays of size k are
{1, 2, 3} => 3
{2, 3, 1} => 3
{3, 1, 4} => 4
{1, 4, 5} => 5
{4, 5, 2} => 5
{5, 2, 3} => 5
{2, 3, 6} => 6*/
package Array_programs;
import java.util.Scanner;


public class WindowSlidingTwo {
    void meth(int[] arr,int n,int k){
    if(k==1){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    int p=0;
    int q=k-1;
    int t=p;
    int max=arr[k-1];
    while(q<=n-1){
        if(arr[p]>max)
        {
            max=arr[p];
        }
        p++;
        if(q==p && p!=n ){
         System.out.print(max+" ");
         q++;
         p=++t;
        }
        if(q<n){
            max=arr[q];
        }
    }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();   
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elements in each subarray");
        int k =sc.nextInt();
        WindowSlidingTwo obj=new WindowSlidingTwo();
        obj.meth(arr,n,k);
        sc.close();
    }
}
