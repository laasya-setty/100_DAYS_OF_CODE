package Competetive_programming;
import java.util.Scanner;

public class StringPalindrome {
    boolean isPalindrome(String k){
        char[] arr=k.toCharArray();
        
        char[] new_arr=new char[arr.length];
        int j=arr.length;
        for (int i = 0; i < arr.length; i++) { 
			new_arr[j - 1] = arr[i]; 
			j = j - 1; 
		} 
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=new_arr[i]){
                return false;
            }
        }
        return true;
          
    }
    void check(String n){
        if(isPalindrome(n)){
            System.out.println("given string is a palindrome");
        }
        else{
            System.out.println("Given string is not a palindrome");
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String val=sc.nextLine();
        StringPalindrome obj=new StringPalindrome();
        obj.check(val);
        sc.close();

    }
}