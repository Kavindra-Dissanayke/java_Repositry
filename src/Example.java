/*
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
       System.out.println(num1+"+"+num2+" = "+tot);
    }
}
import java.util.Scanner;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        findDigitCount();
    }

    public static void findDigitCount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num = input.nextInt();
        int count=0;

            do {
                count++;

            }
            while (num!=0);{
                num = num/10;
            }
        System.out.println(count);
    }
}

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num= input.nextInt();
        int fact=1;
        for (int i = 1; i <=num ; i++) {
            System.out.print(i+"*");
        fact*=i;
        }
        System.out.println(num<0?"Wrong input":" = "+fact);
    }
}
import java.util.Random;
class Example{
    public static void main(String[] args) {
        Random input=new Random();
        for (int i = 0; i < 10; i++) {
            int num= input.nextInt();
            System.out.println(num<0?"-ve Number ":num);
        }

    }
}
class Example{
    public static void main(String[] args) {
        Random r= new Random();
        double num=r.nextDouble();
        for (int i = 0; i <10 ; i++) {
            System.out.println(num);
        }
    }
}
import java.util.Random;
class Example{
    public static void main(String[] args) {
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            int num= random.nextInt();
            if (num<0){
                num=-num;
            }
            System.out.println(num);
        }

    }
}
class Example{
    public static void main(String args[]){
        int i=0;
        while(i<100){
            System.out.println(i++);
            System.out.println(++i);
        }
    }
}
class Example{
    public static void main(String args[]){
        Random r=new Random();
        int x=0;
        int count=0;
        while(x!=100){
            x=r.nextInt(101); //0 to 100
            System.out.println(x);
            count++;
        }
        System.out.println("count "+count);
    }
}
class Example{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number of Student : ");
        final int N= scanner.nextInt();
        int total=0;
        for (int i = 0; i <N ; i++) {
            System.out.print("Input marks : ");
            int num= scanner.nextInt();
            total+=num;
        }
        System.out.println("total "+total);

    }
}
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.print("Input marks (press -ve number to terminate) : ");
        int marks=input.nextInt();
        int total=0;
        while(marks>=0){
            total+=marks;
            System.out.print("Input marks (press -ve number  to terminate) : ");
            marks=input.nextInt();
        }
        System.out.println("Total : "+total);
    }
}
*/
/*class Example {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer : ");
        int num = input.nextInt();
        int count = 0;
        do {
            num /= 10;
            count++;
        }
        while (num != 0);
        System.out.println("No of digits : " + count);
    }
}*/
/*
class Example {
    public static void main(String[] args) {
        findSumOfDigits();
    }

    public static void findSumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input natural number : ");
        int num = scanner.nextInt();
        int x = 0;
        int y = 0;
        while (num != 0) {

            y+= num % 10;
            //  y+=x;
            num /= 10;
            y += x;
        }
        System.out.println(y);

    }

}


*/
/*
import java.util.*;
class Example{
    public static int sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        int sum;
        sum=sumOfDigits(num);
        System.out.println("Sum of digits for "+num+" : "+sum);
    }
}

*/
/*import java.util.*;
class Example{
    public static int sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        int sum;
        sum=sumOfDigits(num);
        System.out.println("Sum of digits for "+num+" : "+sum);
    }
}*/
/*
import java.util.*;
class Example{
    public static int reverse(int num){
        int reverse=0;
        while(num!=0){
            reverse*=10;
            reverse+=num%10;
            num/=10;
        }
        return reverse;

    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        System.out.println("Reverse number of "+num+" : "+reverse(num));
    }
}
*/

