
import java.io.*;
class test{
    public int sum(int x){
        int rem, rev;
        rev=0;
        while(x!=0){
            rem= x%10;
            rev = rev+rem;
            x=x/10;
        }
        return rev;
    }
}
class Digits{
    public static void main(String args[]){
        DataInputStream dis = new DataInputStream(System.in);
        String str;
        int x, sum;
        try{
            test t = new test();
            System.out.println("Enter the number: ");
            str = dis.readLine();
            x = Integer.parseInt(str);
            sum = t.sum(x);
            System.out.println("Sum of "+x+" is "+sum);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}