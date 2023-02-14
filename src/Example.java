import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
    printTotal();
    }
   public static void printTotal(){
       Scanner input=new Scanner(System.in);
       System.out.print("enter the first num1 : ");
       int num1=input.nextInt();
       System.out.print("enter the first num2 : ");
       int num2=input.nextInt();
       int tot=num1+num2;
       System.out.println(tot);
    }
}
