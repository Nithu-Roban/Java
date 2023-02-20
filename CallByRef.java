import java.io.*;
class test{
    int x;
}
class num{
 public  void swap(test a, test b){
        int c=a.x;
        a.x=b.x;
        b.x=c;
        System.out.println("In function swapped value of a=" +a.x+ " b ="+b.x);
    }
}
   class CallByRef{
 public static void main(String args[]){
        
        test a =new test();
        test b = new test();
        DataInputStream dis = new DataInputStream(System.in);
        try{
            System.out.println("enter 2 numbers: ");
            a.x = Integer.parseInt(dis.readLine());
            b.x= Integer.parseInt(dis.readLine());
            System.out.println("In main  value of a="+a.x +" b ="+b.x);
            num n = new num();
            n.swap(a,b);
            System.out.println("In main swapped value of a="+a.x +" b ="+b.x);
        }
        catch(IOException e){
            System.out.println(e);
        }
   }
   
    }
