
import java.util.Scanner;
public class MultidimArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter row and column size");
        int m=sc.nextInt();
        int n=sc.nextInt();
  
        int[][] arr=new int[m][n];
        int i,j=0;
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                
            }
           
        }
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                System.out.println(arr[i][j]);
                
            }
            System.out.println();
           
        }
       
        
        sc.close();
       

    }
    
}