package Stack_programs;

import java.util.Arrays;


public class StackOne {
    int top;
    final int max=1000;
    StackOne(){
        top=-1;
    }
    int[] stack=new int[max];
    boolean push(int n){
        if(top>max-1){
           System.out.println("stack overflow");
           return false;
        }
        else{
        stack[++top]=n;
        System.out.printf("%d is pushed",n);
        return true;
    }
}
int pop(){
    if(top<0){
        System.out.println("Stack underflow");
        return 0;
    }
    else{
        System.out.println("the top value is "+top);
        top--;
        System.out.println("top value after pop is "+top);
        return 0;
    }
}
void display(){
    System.out.println(Arrays.toString(stack));
}

    public static void main(String args[]){
        StackOne obj = new StackOne();
        obj.push(10);
        obj.push(20);
        obj.pop();
        obj.push(16);
        obj.display();
      
    }
}



