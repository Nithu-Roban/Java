import java.io.*;
import java.lang.Math;
class Character{
    public static void main(String args[]){
           String str, str1;
           char c;
           int x,y,z;
            DataInputStream dis = new DataInputStream(System.in);
           try{
            System.out.println("Enter character:");
        
            c= (char)dis.read();
            
            System.out.println("character is: "+c);
            
           } catch(IOException e){
            System.out.println(e);
           }
    }
}