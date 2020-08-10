
/*If variables declared in class and constructor/method same then use this keyword to refer class instance */
package this_keyword;

public class One{
    String place;
    int pin;
    One(String place,int pin){
       this.pin=pin;                  
       this.place=place;
    }
     void meth(){
        System.out.println(place+" "+pin);
    }
    public static void main(String args[]){
        One obj=new One("chennai",603103);   //if we didnot use this keyword it would return null 0
                                                 //because it will be pointing to null and 0 in constructor
        obj.meth();
    }
}
