import java.io.*;
import java.lang.Math;
class Arr{
    public static void main(String args[]){
          int a[], n,i;//declaring
           DataInputStream dis = new DataInputStream(System.in);
           try{
                System.out.println("enter a size of array:");
                
                n= Integer.parseInt(dis.readLine());
                a = new int[n]; // creating array
                System.out.println("Enter elements into array : ");
                for(i=0;i<n;i++){
                    a[i]=  Integer.parseInt(dis.readLine());
                }
                System.out.println(" elements are:");
                for(i=0;i<n;i++){
                   System.out.println(a[i]);
                }
           }
           catch(IOException e){
            System.out.println(e);
           }

            
    }
}