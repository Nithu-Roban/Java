import java.io.*;
import java.lang.Math;
class Area{
    public static void main(String args[]){
           int r;
           double area;
           String st;
           DataInputStream dis = new DataInputStream(System.in);
           try{
                System.out.println("enter a radius:");
                st = dis.readLine();
                r= Integer.parseInt(st);
                System.out.println("Radius is"+r );
                area = 3.14*r*r;
                System.out.println("area is "+area );
           }
           catch(IOException e){
            System.out.println(e);
           }

            
    }
}