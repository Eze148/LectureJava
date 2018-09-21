//Method Overloading
public class abc
{
    static void abc()
    {
        System.out.println("abc");
    }
    static void abc(String i)
    {
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        abc();
        abc("123");
    }
}