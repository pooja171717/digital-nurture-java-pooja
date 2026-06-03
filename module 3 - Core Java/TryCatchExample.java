import java.util.Scanner;

class TryCatchExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter first number:");
        num1 = sc.nextInt();

        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        try
        {
            int result = num1 / num2;
            System.out.println("Result = " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
    }
}