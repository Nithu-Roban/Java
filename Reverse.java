import java.io.*;
import java.lang.Math;
class Reverse{
    public static void main(String args[]){
           int x, rem, rev;
           String st;
           DataInputStream dis = new DataInputStream(System.in);
           try{
                System.out.println("enter a num:");
                st = dis.readLine();
                x= Integer.parseInt(st);
                rev=0;
                while(x!=0){
                    rem = x%10;
                    rev = rev+rem;
                    x=x/10;
                }
                System.out.println("reverse is :"+rev );
           }
           catch(IOException e){
            System.out.println(e);
           }

            
    }
}