//WAP menu driven to display function overriding java  ,by displaying student, teacher details
import java.io.*;

abstract class OverRide{
    abstract public void disp(int n);
}
class Teacher extends OverRide{
    int i;
    int id[];
    String dept[], name[];
    DataInputStream ds = new DataInputStream(System.in);
        public void read(int n){
        try{
            id = new int[n];
            name = new String[n];
            dept = new String[n];
            for(i=0;i<n;i++){
                System.out.println("Enter the id, name and dept: ");
                id[i] = Integer.parseInt(ds.readLine());
                name[i] = ds.readLine();
                dept[i] = ds.readLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
        public void disp(int n){
            for(int i=0;i<n;i++){
                System.out.print(id[i]+"  "+name[i]+"  "+dept[i]+"\n");
            }
            
        }
    
    
}
class Student extends OverRide{
    int i;
    int id[];
    String dept[], name[]; 
    DataInputStream ds = new DataInputStream(System.in);
    
        public void read(int n){
        try{
            id = new int[n];
            name = new String[n];
            dept = new String[n];
            for(i=0;i<n;i++){
                System.out.println("Enter the id, name and dept: ");
                id[i] = Integer.parseInt(ds.readLine());
                name[i] = ds.readLine();
                dept[i] = ds.readLine();
            }
        }catch(IOException e){
            System.out.println(e);
        }
        }
        public void disp(int n){
            for(int i=0;i<n;i++){
                System.out.print(id[i]+"  "+name[i]+"  "+dept[i]+"\n");
            }
            
        }
        
}
class StudentTeacherOverRide{
    public static void main(String args[]){
        int id, choice, n=3,i;
        String name, dept, ch;
        
        Student st = new Student();
        Teacher tch= new Teacher();
        DataInputStream dis = new DataInputStream(System.in);
        try{
            do{
                System.out.println("\n STUDENT _TEACHER DETAILS\n\n=======================\n");
                System.out.println("\n1. Enter the details of Student \n 2. Enter the details of Teacher\n 3.Display details of Student\n 4. Display details of Teacher");        
                choice = Integer.parseInt(dis.readLine());
                switch(choice){
                    case 1 :    System.out.println("Enter the no.of students you need to insert");
                                n =Integer.parseInt(dis.readLine());
                                st.read(n);
                                break;
                    case 2 :    System.out.println("Enter the no.of Teachers you need to insert");
                                n =Integer.parseInt(dis.readLine());
                                tch.read(n);   
                                break;
                    case 3 :    System.out.println("details of Students: ");
                                st.disp(n); 
                                break;    
                    case 4 :    System.out.println("details of Teachers: ");
                                tch.disp(n);
                                 
                                break;                           
                    default :   System.out.println("Invalid Input"); 
                                //exit();
                                 break;      
                }
                System.out.println("Do you want to continue (Yes/No)"); 
                 ch = dis.readLine();
            }
            while(ch != "yes");
             
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
