//WAP to implement function using call by Reference to find the sqrt of a given number.

import java.io.*;
import java.lang.*;
class test{
    int x;
}
class num{
 public  void swap(test a){
        double c = Math.sqrt(a.x);
       
        System.out.println("sqrt = "+c);
    }
}
class SqrtCallByRef{
    public static void main(String args[]){
        test a =new test();
        DataInputStream dis = new DataInputStream(System.in);
        try{
            System.out.println("enter a numbers: ");
            a.x = Integer.parseInt(dis.readLine());
            num n = new num();
            n.swap(a);
        }
        catch(IOException e){
            System.out.println(e);
        }
   }
   
}
