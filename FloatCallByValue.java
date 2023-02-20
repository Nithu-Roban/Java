// WAP to implement function call by value to swap 2 float numbers
import java.io.*;
class temp{
public static void swap(float a, float b){
        float c=a;
        a=b;
        b=c;
        System.out.println("In function swapped value of a=" +a+ " b ="+b);
    }
}
class FloatCallByValue{
    
    public static void main(String args[]){
        float a, b;
        DataInputStream dis = new DataInputStream(System.in);
        try{
            temp  t = new temp();
            System.out.println("enter 2 numbers: ");
            a = Float.parseFloat(dis.readLine());
            b= Float.parseFloat(dis.readLine());
             System.out.println("In main  value of a="+a +" b ="+b);
            t.swap(a,b);
           
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}