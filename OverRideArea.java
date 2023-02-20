/*WAP to implement runtime polymorphism in java using interface, wrt calculating area of a triangle*/
import java.io.*;
interface Temp{
    public int area(int b, int h);
}
class Triangle implements Temp{
    int b, h;
    public int area(int b, int h){
        int result = (b*h)/2;
        return result;
    }
}
class OverRideArea{
    public static void main(String args[]){
        int base, height;
        DataInputStream dis = new DataInputStream(System.in);
        try{
             System.out.println("enter the base and height of triangle");
             base = Integer.parseInt(dis.readLine());
             height = Integer.parseInt(dis.readLine());
             Triangle tng = new Triangle();
             int value= tng.area(base,height);
             System.out.println("Area = "+value);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}