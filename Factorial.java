import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get Factorial");
        int num = sc.nextInt();
        int fact=1;

        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
