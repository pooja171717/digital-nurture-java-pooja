
import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        int choice;

        System.out.println("Enter first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        num2 = sc.nextDouble();

        System.out.println("Choose Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        choice = sc.nextInt();

        if(choice == 1)
        {
            result = num1 + num2;
            System.out.println("Result = " + result);
        }
        else if(choice == 2)
        {
            result = num1 - num2;
            System.out.println("Result = " + result);
        }
        else if(choice == 3)
        {
            result = num1 * num2;
            System.out.println("Result = " + result);
        }
        else if(choice == 4)
        {
            result = num1 / num2;
            System.out.println("Result = " + result);
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}