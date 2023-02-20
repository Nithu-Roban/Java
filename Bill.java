import java.io.*;
import java.lang.*;
class Shakes{
    int rate;
        
    public int sharja(){
        
        this.rate = 50;
       
        return rate;
    }
    public int mango(){  
        this.rate = 60;
        return rate;
    }
    public int tender(){   
        this.rate = 100;
        return rate;
    }
}


class newBill{
    String Item, name, address;
    int price, quantity;
    double gst, total;
    public void demo(String name, String Address,String Item,int rate,int quantity){
       this.name = name;
       this.Item = Item;
        this.address = Address;
        this.price = rate;
        this.quantity= quantity;
        gst = price*(0.25/10);
        total= (price* quantity)+gst;  
          System.out.println("=====================================================");
            System.out.println("            SHAKE PALACE            ");
              System.out.println("--------------------------------------------------------");
          System.out.println("                    BILL");
        System.out.println("=====================================================");
        System.out.println("Customer Name :"+name);
        System.out.println("Customer Address :"+address);
        System.out.println();
        System.out.println();
        System.out.println("Item    :"+Item);
        System.out.println("Rate    :"+price);
        System.out.println("Quantity:"+quantity);
        System.out.println("GST    :"+gst);
        System.out.println("=====================================================");
        System.out.println("Total    :"+total);
        System.out.println("=====================================================");
        System.out.println("Thank You....Visit Again");
    }
}


class Bill{
    public static void main(String args[]){
        DataInputStream dis = new DataInputStream(System.in);
        String name, address, shk;
        int  choice, quantity, price;
        double total, gst;
        try{
        name = args[0];
        address = args[1];
       System.out.println("=====================================================");
      System.out.println("            SHAKE PALACE            ");
         System.out.println("=====================================================");
        System.out.println("MENU CARD");
        System.out.println("1.Sharja Shake");
        System.out.println("2. Mango Shake");
        System.out.println("3. tender coconut Shake");
        System.out.println("Enter your choice: ");
        choice = Integer.parseInt(dis.readLine());
        Shakes sh = new Shakes();
        newBill nb = new newBill();
        switch(choice){
            case 1: System.out.println("Enter the quantity: ");
                    quantity = Integer.parseInt(dis.readLine()); 
                    shk = "Sharja Shake";
                    price= sh.sharja();
                    nb.demo(name, address,shk,price,quantity);
                                    break;

            case 2: System.out.println("Enter the quantity: ");
                    quantity = Integer.parseInt(dis.readLine()); 
                    shk = "Mango Shake";
                    price= sh.mango();  
                   nb.demo(name, address,shk,price,quantity);
                                    break;   
            case 3: System.out.println("Enter the quantity: ");
                    quantity = Integer.parseInt(dis.readLine()); 
                    shk = "Tender Coconut Shake";
                    price= sh.tender(); 
                    nb.demo(name, address,shk,price,quantity);
                                    break;
            default : System.out.println("Wrong Input");                                           
        }
        

        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}