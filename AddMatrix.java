import java.io.*;
import java.lang.Math;
class AddMatrix{
    public static void main(String args[]){
          int a[][], b[][],c[][],r1,c1,r2,c2,i, j;//declaring
           DataInputStream dis = new DataInputStream(System.in);
           try{
                System.out.println("enter a row and column size of matrix 1:");// matrix 1
                
                r1= Integer.parseInt(dis.readLine());
                 c1= Integer.parseInt(dis.readLine());
                a = new int[r1][c1]; // creating array
                System.out.println("Enter elements into matrix1: ");
                
                for(i=0;i<r1;i++){
                    for(j=0;j<c1;j++){
                       a[i][j]=  Integer.parseInt(dis.readLine());
                    }  
                }
                System.out.println("enter  row and column size of matrix 2:");// matrix 2
                r2= Integer.parseInt(dis.readLine());
                c2= Integer.parseInt(dis.readLine());
                b = new int[r2][c2]; // creating array
                System.out.println("Enter elements into matrix 2 : ");
                for(i=0;i<r2;i++){
                    for(j=0;j<c2;j++){
                      b[i][j]=  Integer.parseInt(dis.readLine());
                    }   
                }
                System.out.println(" elements of matrix 1 ");// displaying matrix 1
                for(i=0;i<r1;i++){
                    for(j=0;j<c1;j++){
                      System.out.println(a)
                }
                System.out.println(" elements of matrix 2 ");// displaying matrix 2
                for(i=0;i<r2;i++){
                    for(j=0;j<c2;j++){
                        System.out.println(b[i][j]);
                    }
                }
                c = new int[r1+r2][c1+c2];
                if(r1 == r2 && c1==c2){
                  for(i=0;i<r1;i++){
                    for(j=0;j<c1;j++){
                       c[i][j] = a[i][j]+b[i][j];
                    }
                }  
                }
                System.out.println(" sum of 2 matrices: ");// displaying matrix 2
                for(i=0;i<r1;i++){
                    for(j=0;j<c1;j++){
                        System.out.println(c[i][j]+" ");
                    }
                }
                
                }
                catch(IOException e){
            System.out.println(e);
           }
                
           }
           

            
    }