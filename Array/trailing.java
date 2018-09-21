public class trailing
{
    static void f(String...trailing)
    {
        for(String s : trailing)System.out.print(s+" ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        f("two", "three", "four");
        f("five", "six");
    }
}