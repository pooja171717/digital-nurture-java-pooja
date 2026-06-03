class PatternMatchingDemo
{
    static void checkType(Object obj)
    {
        switch(obj)
        {
            case Integer i ->
                System.out.println("Integer Value");

            case String s ->
                System.out.println("String Value");

            case Double d ->
                System.out.println("Double Value");

            default ->
                System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args)
    {
        checkType(10);
        checkType("Java");
        checkType(12.5);
    }
}
