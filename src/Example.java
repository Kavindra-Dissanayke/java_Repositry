class Example{
    public static void myMethod(int i){
        System.out.println("myMethod(int)");
    }
    public static void myMethod(double d){
        System.out.println("myMethod(double)");
    }
    public static void main(String args[]){
        myMethod(111);
        myMethod(1.5);
    }
}

