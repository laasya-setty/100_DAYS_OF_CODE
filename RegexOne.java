import java.util.regex.*;
public class RegexOne{
    public static void main(String args[]){
        String s="laasya1loves2to3play4in5rain";
        String delimiter="\\d";                      // /d finds a digit , we know escape sequences so use //
        Pattern p=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
        String[]  sp=p.split(s);
        for(String i:sp){
            System.out.println(i);
        }
    
    }

}