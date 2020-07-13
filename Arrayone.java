import java.util.Scanner;
import java.util.Arrays;
public class Arrayone{
    public static void main(String args[]){

        System.out.println("enter the number of elements in a array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int[] temp=new int[n+1];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        System.out.println("enter new number to add");
        int newnum=sc.nextInt();
        temp[n]=newnum;
        sc.close();
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(temp));


}
}