package Array_programs;

import java.util.Arrays;
public class Reverse{
    public static void main(String args[]){
        String s="Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String[] str=s.split("\\s");
        System.out.println(Arrays.toString(str));
           String temp;
           int last_pos=str.length-1;
         for(int i=0;i<str.length/2;i++){
            temp=str[i];
            str[i]=str[last_pos];
            str[last_pos]=temp;
            last_pos--;

         }
         System.out.println(Arrays.toString(str));
    }
}
