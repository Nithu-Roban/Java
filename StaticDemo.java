class Test{
    static int x;
    Test(){
        x++;
        System.out.printf("\n x is %d",x);
    }
}
class StaticDemo{
    public static void main(String args[]){
        Test t1=new Test();
        Test t2=new Test();
    }
}