import java.util.*;
import java.util.Arrays;
public class Array {
    public static void main(String args[]){

    System.out.println("enter the number of elements in a array");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    System.out.println(Arrays.toString(arr));
    

    

   
    }
}