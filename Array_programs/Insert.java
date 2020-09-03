package Array_programs;

/*Insert an element K at end in arr[]  */

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Insert {
    
    public static void main(String args[]){
         
         Scanner sc=new Scanner(System.in);
    
         System.out.println("Enter the number of elements");
         int n=sc.nextInt();
       
         Integer[] arr=new Integer[n];
         System.out.printf("Enter %d values",n);
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("length is"+arr.length);
         System.out.println(Arrays.toString(arr));
         sc.nextLine();
 
 
     
        System.out.println("Do you want to insert element:yes/no");
       String req= sc.nextLine().toLowerCase();
       
        if(req!="yes"){
           System.out.print("final array "+Arrays.toString(arr));
        }
       
         else{
             /*Changing the original array to list adding element and again changing it into array */
             ArrayList<Integer> temp=new ArrayList<Integer>(Arrays.asList(arr));
             System.out.println("Enter a new value to insert");
             temp.add(sc.nextInt());
             arr=temp.toArray(arr);
             System.out.println("the final array is"+Arrays.toString(arr));
             
        }
        sc.close();
         
    }
    
}