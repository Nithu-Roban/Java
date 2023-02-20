//Synchronized keyword
import java.io.*;
class First{
     public void disp(String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}
class Second extends Thread{
    First ff;
    String ss;
    Second(First f, String s){
        ff= f;
        ss=s;
    }
    public void run(){
        synchronized(ff){
            ff.disp(ss);
        }

    }
}
class SynchronizedKeyword{
    public static void main(String args[]){
        First fnew = new First();
        Second s1 = new Second(fnew,"Rajagiri");
        s1.start();
        Second s2 = new Second(fnew,"College");
        s2.start();
        Second s3 = new Second(fnew,"Kalamaserry");
        s3.start();
    }
}