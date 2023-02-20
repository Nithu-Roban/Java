class test{
    public int cube(int x){
        int p= x*sq(x);
        return p;
    }
    public int sq(int x){
            int s = x*x;
            return s;
        }
}
class FuncDemo{
    public static void main(String args[]){
        test t = new test();
        int x=10;int y=20;
        int z = t.cube(x);
        System.out.println("cube is is"+ z);
    }
}