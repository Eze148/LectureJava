public class latihan
{
    private int a;
    public void setVar(int x) 
    {
        this.a = x;
    }
    public int getVar()
    {
        return this.a;
    }
    public static void main(String[] args)
    {
        latihan abc = new latihan();
        abc.setVar(10);
        System.out.println(abc.getVar());
    }
}