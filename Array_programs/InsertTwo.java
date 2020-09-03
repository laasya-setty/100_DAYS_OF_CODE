/*Inserting element in a specific position */
package Array_programs;
import java.util.*;
public class InsertTwo {
    Integer[] insert(Integer[] arr,int n,int pos,int val){
        Integer[] temp=new Integer[n+1];
        for(int i=0;i<n+1;i++){
            if(i<pos-1){
                temp[i]=arr[i];
            }
            else if(i==pos-1){
                temp[i]=val;
            }
            else{
                temp[i]=arr[i-1];
            }
        }
        
      return temp;
    }
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        System.out.printf("Enter %d elements",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        InsertTwo obj=new InsertTwo();
        System.out.println("Do you want to insert new element:1/0");
        int req=sc.nextInt();
        if(req!=1){
            System.out.print("Final array is"+Arrays.toString(arr));
        }
        else{
            System.out.println("Enter position");
            int pos=sc.nextInt();
            System.out.println("Enter value");
            int val=sc.nextInt();
        arr=obj.insert(arr, n,pos,val);
        System.out.print("Array after updating "+Arrays.toString(arr));
    }
        sc.close();
    }
    
}