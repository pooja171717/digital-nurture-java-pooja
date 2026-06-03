import java.util.Scanner;

class StringReversal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str, reverse = "";

        System.out.println("Enter a string:");
        str = sc.nextLine();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);
    }
}