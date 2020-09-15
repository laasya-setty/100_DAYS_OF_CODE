package Array_programs;
import java.util.Scanner;


public class WindowSliding {
    void window(int[] arr,int n,int k){
        int max_sum=0;
        for(int i=0;i<k;i++){
            max_sum=max_sum+arr[i];
        }

        int sum=max_sum;
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
            max_sum=Math.max(max_sum,sum);
        }
        System.out.println("maxsum is"+max_sum);    

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();   
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        WindowSliding obj =new WindowSliding();
        System.out.println("Find maximun sum for how many elemnts");
        int k=sc.nextInt();
        obj.window(arr,n,k);
        sc.close();


    }
}
