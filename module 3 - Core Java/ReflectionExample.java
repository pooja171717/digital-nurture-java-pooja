import java.lang.reflect.Method;

class Sample
{
    public void show()
    {
        System.out.println("Method Invoked");
    }
}

class ReflectionExample
{
    public static void main(String[] args)
    {
        try
        {
            Class c = Class.forName("Sample");

            Object obj =
            c.getDeclaredConstructor().newInstance();

            Method methods[] =
            c.getDeclaredMethods();

            for(Method m : methods)
            {
                System.out.println("Method Name: "
                + m.getName());

                m.invoke(obj);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
