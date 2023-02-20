/* Create file using Files.createFile() method
get data from keyboard 
write it on to the file */
import java.io.*;
import java.nio.file.*;
class NewFile3{
    public static void main(String args[]){
        char c;
        try{
        FileInputStream f = new FileInputStream("E:\\New_folder\\new1.txt");
        int i = f.read();
        while(i!= -1){
            c=(char) i;
            System.out.print(c);
            i = f.read();
        }

           }
        
        catch(IOException e){
            System.out.println(e);
        }
    }
}