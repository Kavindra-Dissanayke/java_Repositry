import java.util.*;
class Example{
    public static void main(String args[]){
        for(int i=0; i<1000; i++){
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPalindrome(int num){
        int temp=num;
        int rev=0;
        while (num>0){
            rev=rev*10;
            rev=num%10+rev;
            num=num/10;
        }
   return temp==rev?true:false;

    }
}
