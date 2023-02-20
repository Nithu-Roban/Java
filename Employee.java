 /* Create a class for employee having eno,ename and esal as data members. 
  Provide functions for reading and displaying employee details.
 (Accept information of n employees in the main function, display the same and search for an emp (using eno)). */
import java.io.*;

class Emp{
    int eno[],num,i, esal[];
    String ename[];
   
    
    public void read(int id, String name, int sal){
        try{
             eno = new int[num];
             ename = new String[num];
             esal = new int[num];
            for(i=0;i<num;i++){
                this.eno[i]= id;
               this.ename[i]= name;
                this.esal[i]= sal;
            }
        }
        catch(NullPointerException e){
             System.out.println(e);
        }
      
    }
    public void disp(){
       
       try{
        System.out.println("DETAILS OF EMPLOYEE\n============================\n");
            for(i=0;i<num;i++){ 
                System.out.println("ID  :"+eno[i]);
                System.out.println("Name  :"+ename[i]);
                System.out.println("SAL  :"+esal[i]);
            }
       } 
       catch(NullPointerException e){
             System.out.println(e);
        }
    
}
}


class Employee{
    public static void main(String args[]){
        int id,sal,i, n;
        String name;
        DataInputStream dis = new DataInputStream(System.in);
        try{
            Emp e= new Emp();
            System.out.println("enter the total no of employees you need to enter:");
            n = Integer.parseInt(dis.readLine());
            e.num = n;
            System.out.println("num: "+e.num);
            for(i=0;i<n;i++){
                System.out.println("enter the id, name and salary  ");
                id = Integer.parseInt(dis.readLine());
                name = dis.readLine();
                sal = Integer.parseInt(dis.readLine());
                e.read(id,name,sal);
            }
            e.disp();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
