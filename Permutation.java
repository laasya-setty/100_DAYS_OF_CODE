import java.util.Scanner;
public class Permutation {
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        permute(str,0,len);
        sc.close();   

    }
    static void  permute(String str,int start,int end){
        if(start==end-1){
            System.out.println(str);
        }
        else{
            for(int i=start;i<end;i++){
                str=swap(str,start,i);
                permute(str,start+1,end);
                str=swap(str,start,i);
            }
        }
    }
   static String swap(String c,int s,int e){
        char[] arr=c.toCharArray();
        char temp;
        temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
       return String.valueOf(arr);
    }
}