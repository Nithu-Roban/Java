
import java.io.*;
class test{
    public int rever(int x){
        int rem, rev;
        rev=0;
        while(x!=0){
            rem= x%10;
            rev = (rev * 10)+rem;
            x=x/10;
        }
        return rev;
    }
}
class Palin{
    public static void main(String args[]){
        DataInputStream dis = new DataInputStream(System.in);
        String str;
        int x, rev;
        try{
            test t = new test();
            System.out.println("Enter the number: ");
            str = dis.readLine();
            x = Integer.parseInt(str);
            rev = t.rever(x);
            if(rev == x){
                 System.out.println("palindrome!!!");
            System.out.println("reverse of "+x+" is "+rev);
            }
            else{
                System.out.println("Not a palindrome!!!");
            }
           
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}