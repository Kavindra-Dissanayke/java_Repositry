class Example{
    public static void myMethod(int i, double d){
        System.out.println("myMethod(int,double)");
    }
    public static void myMethod(double d, int i){
        System.out.println("myMethod(double,int)");
    }
    public static void main(String args[]){
        myMethod(111,1.5);
        myMethod(1.5,111);
    }
}
