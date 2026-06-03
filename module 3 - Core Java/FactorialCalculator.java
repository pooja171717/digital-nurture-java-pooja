import java.util.Scanner;

public class FactorialCalculator {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num;
        long factorial = 1;

        System.out.println("Enter a number:");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);
    }
}
