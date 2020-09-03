package Array_programs;
import java.util.Scanner;
import java.util.Arrays;
public class SortArray {
    void ascend(int[] arr,int n){
        int temp;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++)
           if(arr[i]>arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
       }
       System.out.println(Arrays.toString(arr));
    }
    void descend(int[] arr,int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
      
        int[] arr=new int[n];
        System.out.printf("Enter %d values",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SortArray obj=new SortArray();
        System.out.println("Sorting array in ascending");
        obj.ascend(arr,n);
        System.out.println("sorting in descending order");
        obj.descend(arr,n);
        sc.close();
    }
    
}
