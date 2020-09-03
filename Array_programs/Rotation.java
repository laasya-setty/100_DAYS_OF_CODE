/*shifting elements -> left rotation */
package Array_programs;
import java.util.Scanner;
import java.util.Arrays;
public class Rotation {
    int[] rotate(int[] arr,int n,int r){
        int[] temp=new int[r];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));
        int cnt=0;
        for(int j=r;j<n;j++){
            arr[cnt]=arr[j];
            cnt++;
        }
            int shift=n-r;
          cnt=0;
          //System.out.println(r);
        for(int k=shift;k<arr.length;k++ ){
              arr[k]=temp[cnt];
              cnt++;

        }
        System.out.println("Array after rotation "+Arrays.toString(arr));
        
        return arr;

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
        Rotation obj=new Rotation();
        System.out.println("Enter the pos from where it has to be left rotated");
        int r=sc.nextInt();
        obj.rotate(arr,n,r);
      
        sc.close();
    }
}
