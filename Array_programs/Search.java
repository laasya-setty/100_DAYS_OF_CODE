package Array_programs;

public class Search {
    int[] arr={1,2,3,4,5,6,78,8,0};
    int search(int n){
       int  flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                flag=0;
                break;
            }
            else{
                flag=1;
            }


        }
        if(flag == 0)
        {
            System.out.println("Element found ");
        }
        else
        {
            System.out.println("Element not found");
        }
        return 0;
    }
    public static void main(String args[]){
Search obj=new Search();
obj.search(3);
    }
    
}