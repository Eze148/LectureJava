public class CommaOperator
{
    public static void main (String[] args)
    {
        for(int i=0; i<100; i++)
        {
            if(i==74) break;
            if(i%9!=0) continue;
            System.out.println(i);
        }
        /*for(int i=1, j=i+10; i<10 && j<=12; i++, j=i*2)
        {
            System.out.println("i= "+i+" j= "+j);
        }*/
    }
}