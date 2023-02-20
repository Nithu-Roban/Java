// WAP to display even numbers upto n using static fn;
import java.io.*;
class Even{
    public static void check(int num){
       int i;
       for(i=0;i<num;i=i+2){
        System.out.print(i+ " ");

       }
       
      
    }
}
 class EvenNumWithStaticFn{
    public static void main(String args[]){
        int num, res;
        
        DataInputStream dis = new DataInputStream(System.in);
        try{
            System.out.println("Enter a number:");
            num = Integer.parseInt(dis.readLine());
             Even.check(num);
            
        } catch(IOException e){
            System.out.println(e);
        }

    }
 }