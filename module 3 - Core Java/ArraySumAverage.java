import java.util.Scanner;

class ArraySumAverage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double average = (double)sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}