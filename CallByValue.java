import java.io.*;
class CallByValue{
    public static void swap(int a, int b){
        int c=a;
        a=b;
        b=c;
        System.out.println("In function swapped value of a=" +a+ " b ="+b);
    }
    public static void main(String args[]){
        int a, b;
        DataInputStream dis = new DataInputStream(System.in);
        try{
            System.out.println("enter 2 numbers: ");
            a = Integer.parseInt(dis.readLine());
            b= Integer.parseInt(dis.readLine());
            swap(a,b);
            System.out.println("In main swapped value of a="+a +" b ="+b);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}