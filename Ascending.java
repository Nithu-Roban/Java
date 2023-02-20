import java.io.*;
import java.lang.Math;
class Ascending{
    public static void main(String args[]){
          int a[], n,i, j,temp;//declaring
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
                     System.out.print(a[i]);
                }
                for(i=0;i<n;i++){
                    for(j=i+1;j<n;j++){
                        if(a[i]>a[j]){
                            temp = a[i];
                            a[i]=a[j];
                            a[j]= temp;
                        }
                    }
                }
                System.out.println(" Sorted elements are:");
                for(i=0;i<n;i++){
                     System.out.print(a[i]);
                }
           }
           catch(IOException e){
            System.out.println(e);
           }

            
    }
}