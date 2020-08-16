

public class GenericClass<T> {
    T age,name;
    
    T display(T age){       //I can give the return type during objcreation
        return age;
        
    }
    T disp(T name){
        return name;
    }
public static void main(String args[]){
    GenericClass<Integer> obj=new GenericClass<Integer>();
     GenericClass<String> o=new GenericClass<String>();
    o.display("twenty");
    obj.display(20);
    o.disp("laasya");
    obj.disp(0);


}
    

}