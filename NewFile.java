/* Create file using FileOutputStream class
get dat from keyboard 
write it on to the file */
import java.io.*;
class NewFile{
    public static void main(String args[]){
        try{
           FileOutputStream f1 = new FileOutputStream("E:\\New_folder\\new.txt");
           DataInputStream dis = new DataInputStream(System.in);
           while(true){
                System.out.println("Enter the data onto the file ./.. terminate with !");
                String st = dis.readLine();
                if(st.equals("!")) 
                    break;
                else
                    f1.write(st.getBytes());
                    f1.write("\n".getBytes());
           }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}