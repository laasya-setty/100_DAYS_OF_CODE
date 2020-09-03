package Array_programs;
import java.util.Arrays;
import java.util.Scanner;
public class Deletion {
    int[] delete(int[] arr,int n,int k){
        //searching for element
        int flag=0,pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                 pos=i;
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            for(int i=pos+1;i<n;i++){
                arr[i-1]=arr[i];
            }
            n=n-1;
         }
         //i is updated here
         int[] temp=new int[n];
         int b;
         for(int j=0;j<n;j++){
             b=arr[j];
             temp[j]=b;  
         }
        
        return temp;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.printf("Enter %d elements",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Deletion obj=new Deletion();
        System.out.println("Do you want delete element? 1/0");
        int req=sc.nextInt();
        if(req!=1){
            System.out.println("final array"+Arrays.toString(arr));
        }
        else{
            System.out.println("enter the value to be deleted");
            int k=sc.nextInt();
         arr=obj.delete(arr,n,k);
        System.out.println("Array after deletion"+Arrays.toString(arr));
        }
        sc.close();
          
    }
}
