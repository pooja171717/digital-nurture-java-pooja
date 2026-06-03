import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();

        int n;

        System.out.println("How many names?");
        n = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter Name:");
            names.add(sc.nextLine());
        }

        System.out.println("Student Names:");

        for(String name : names)
        {
            System.out.println(name);
        }
    }
}