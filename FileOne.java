import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class FileOne {
    Scanner sc=new Scanner(System.in);
    String file_name=sc.nextLine();
     File obj=new File(file_name);
    
 
    //method for creating a file
    void create(){
        try{
     
        
        if(obj.createNewFile()){
          System.out.println("file name is"+obj.getName());
        }
        else{
            System.out.println("Already exists");
        }
    }
        catch(IOException e){
            System.out.println("error occured while creating");
        }    
    }
    //method to write in file
    void writeFile(){
     try{
         FileWriter w=new FileWriter(obj);
         w.write("Learning files now");
         w.close();
     }
     catch(IOException e){
         System.out.println("Exception occured while writing a file");
     }
    }
    void reading() throws FileNotFoundException,IOException{
        FileReader reader=new FileReader(file_name);
        int i;
        while((i=reader.read())!=-1){
            System.out.print((char)i);
        }
        reader.close();
    }
    
    
    public static void main(String args[])throws FileNotFoundException,IOException{
       FileOne f=new FileOne();
       f.create(); 
       f.writeFile();
       f.reading();
       
       
    }
}