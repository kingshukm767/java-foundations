import java.util.Scanner;
public class Fibonacci {
    public static void generateFib(int term){
        if(term < 1){
            System.out.println("Invalid Term");
            return;
        }
        int prev1 = 1;
        int prev2 = 0;
        System.out.print(prev2 + " ");
        if(term == 1){
            return;
        }
        System.out.print(prev1 + " ");

        for(int i=3; i<=term; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
            System.out.print(curr + " ");

        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms for print fibonacci series");
        int totalTerms = sc.nextInt();
        generateFib(totalTerms);

    }
}
