import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome or not");
        int num = sc.nextInt();
        int rev = 0;
        int number = num;
        while( num > 0 ){
            int temp = num%10;
            rev = rev*10+temp;
            num = num /10;
        }
        if(number == rev){
            System.out.println( number + " is palindrome");
        }else{
            System.out.println(number + " is not Palindrome");
        }
    }

}
