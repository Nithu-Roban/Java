/* create an interface shape having two prototype disp(), calc(), to display the shape and calculate the area respectively.
create two  classes circle and rectangle which implements the above interfaces.In the main create a reference of shape depending 
on user choice*/
import java.io.*;
interface Shape{
    public void disp();
    public void calc();
}
class Rectangle implements Shape{
    int length, breadth, area;
    Rectangle(int l, int b){
        length =l;
        breadth = b;
    }
    public void calc(){
       area = length*breadth; 
    }
    public void disp(){
       System.out.println("Area of Rectangle : "+area);
    }
}
class Circle implements Shape{
    float radius ;
    double area;
    Circle(float r){
        radius = r;
        
    }
    public void calc(){
       area = 3.14 * (radius * radius); 
    }
    public void disp(){
       System.out.println("Area of Circle : "+area);
    }
}
class ShapeInterface{
    public static void main(String args[]){
         int l,b;
         float r;
        DataInputStream dis = new DataInputStream(System.in);
        try{
           
            System.out.println("enter radius of circle");
            r = Float.parseFloat(dis.readLine());
            Circle cir = new Circle(r);
            cir.calc();
            cir.disp();
            System.out.println("enter length and breadth of Rectangle");
            l = Integer.parseInt(dis.readLine());
            b = Integer.parseInt(dis.readLine());
            Rectangle rec = new Rectangle(l,b);
            rec.calc();
            rec.disp();    
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}