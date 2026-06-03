import java.util.ArrayList;
import java.util.Collections;

class LambdaExample
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Ravi");
        list.add("Anu");
        list.add("Kumar");
        list.add("Bala");

        Collections.sort(list,(a,b) -> a.compareTo(b));

        System.out.println(list);
    }
}