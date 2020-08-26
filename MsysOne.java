
import java.util.*;
public class MsysOne {
    public void solution(int n){
        
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=i+1;
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0 && a[i]%3==0 && a[i]%5==0){
                System.out.println("CodilityTestCoders");
            }
            else if(a[i]%2==0 && a[i]%3!=0 && a[i]%5!=0){
                System.out.println("Codility");
            }
            else if(a[i]%2!=0 && a[i]%3==0 && a[i]%5!=0 ){
                System.out.println("Test");
            }
            else if(a[i]%2!=0 && a[i]%3!=0 && a[i]%5==0){
                System.out.println("Coders");
            }
            else if(a[i]%2==0 && a[i]%3==0 && a[i]%5!=0){
                System.out.println("CodilityTest");
            }
            else if(a[i]%2==0 && a[i]%3!=0 && a[i]%5==0){
                System.out.println("CodilityCoders");
            }
            else if(a[i]%2==0 && a[i]%3==0 && a[i]%5==0){
                System.out.println("TestCoders");

            }
            else if(a[i]%2!=0 && a[i]%3==0 && a[i]%5==0){

            }
            else{
                System.out.println(a[i]);
            }
        }
    }
   public static void main(String args[]){
       MsysOne obj=new MsysOne();
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       obj.solution(n);
       sc.close();
   
   } 
}