import java.util.Scanner;
public class Solution{
    boolean  solution(String str){
        long n=str.length();
        char[] arr=str.toCharArray();
        for(int i=1;i<n;i++){
            if(arr[0]=='a'){
                continue;
            }
            if(arr[i]!='a' || arr[i]!='b'){
                
                break;
         }
         else{
            return true;
         }
           
            
      }
    
      for(int j=1;j<n;j++){
          if(arr[0]!='b'){
          if(arr[j]!=arr[0]){
              return false;
          }
        }
          

      }
      
      int cnt=0;
     while(cnt<n){
        if(arr[cnt]=='a'){
            cnt++;
        }
        else{
            break;
        }
        
     }
     System.out.println(cnt);
     if(cnt==n-1){
         return true;
     }
     else{
         while(cnt<n)
             if(arr[cnt]!='b'){
                 return false;
                 
             }
             else{
                 cnt++;
             }
             return true;
         }
         
     }

   


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Solution obj=new Solution();
        String s=sc.nextLine();
        if(!obj.solution(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();

    }
}