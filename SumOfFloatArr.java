import java.io.*;
import java.lang.Math;
class SumOfFloatArr{
    public static void main(String args[]){
          float a[],sum;
          int n,i ;//declaring
           DataInputStream dis = new DataInputStream(System.in);
           try{
                System.out.println("enter a size of array:");
                
                n= Integer.parseInt(dis.readLine());
                a = new float[n]; // creating array
                System.out.println("Enter elements into array : ");
                sum=0.0F;
                for(i=0;i<n;i++){
                    a[i]=  Float.parseFloat(dis.readLine());
                    sum=sum+a[i];
                }
                System.out.println(" elements are:");
                for(i=0;i<n;i++){
                     System.out.println(a[i]);
                }
                 System.out.println("the sum is "+ sum);
           }
           catch(IOException e){
            System.out.println(e);
           }

            
    }
}