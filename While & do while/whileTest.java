public class whileTest
{
    static boolean cekKondisi()
    {
        double a = Math.random();
        //Math.random global 
        boolean hasil = a<0.99;
        System.out.println(a);
        return hasil;
    }
    public static void main (String[] args)
    {
        int c = 0;
        do
        {
            System.out.println("True");
            c++;
        } while(cekKondisi());
        System.out.println("False");
        System.out.println("The count is "+c);
    }
}
