import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileRead{
    void reading() throws FileNotFoundException,IOException{
        Scanner sc=new Scanner(System.in);
        String file_name=sc.nextLine();
        sc.close();
        File f=new File(file_name);
        if(f.createNewFile()){
            System.out.println("new file created");
          }
          else{
              System.out.println("Already exists");
          }
        FileReader reader=new FileReader(file_name);
        int i=reader.read();
        while(i!=-1){
            System.out.println((char)i);
        }
        reader.close();
        
    }
    public static void main(String args[]) throws FileNotFoundException, IOException {
       FileRead obj=new FileRead();
       obj.reading();
    }
}