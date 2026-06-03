import java.util.HashMap;
import java.util.Scanner;

class HashMapExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        int n;

        System.out.println("Enter Number of Students:");
        n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter ID:");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            map.put(id,name);
        }

        System.out.println("Enter ID to Search:");
        int searchId = sc.nextInt();

        System.out.println("Name: " + map.get(searchId));
    }
}
