package Array_programs;

import java.util.Scanner;
import java.util.Arrays;
public class RightRotation {
    void rotate(int arr[],int n,int r){
        
        int[] temp=new int[n]; 
        int pos=n-r,cnt=0;
        for(int i=pos;i<n;i++){
              temp[cnt]=arr[i];
              cnt++;
        }
        System.out.println(Arrays.toString(temp));
        cnt=0;
        
        cnt=0;
        for(int i=r;i<n;i++){
             temp[i]=arr[cnt];
             cnt++;
        }
        System.out.println(Arrays.toString(temp));

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.printf("Enter %d elements",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array is"+Arrays.toString(arr));
        RightRotation obj=new RightRotation();
        System.out.println("Enter the pos from where it has to be right rotated");
        int r=sc.nextInt();
        obj.rotate(arr,n,r);
      
        sc.close();
    }
    
}
