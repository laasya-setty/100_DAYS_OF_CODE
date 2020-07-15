import java.util.regex.*;
public class Regexx {
    public static void main(String args[]){
        Pattern p=Pattern.compile("laasya",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher("I am Laasya and laasya is good.");
        while(m.find()){
           int n=m.end()-1;         //-1 because end return a index of the character next to the last matched character
            System.out.println("found "+p+" " +m.start()+" to "+n);

        }
        
        
    }
    
}