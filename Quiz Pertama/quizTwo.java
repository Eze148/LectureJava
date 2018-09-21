import java.util.Random;

public class quizTwo
{
    static Random r = new Random(20);
    public static void main(String[] args)
    {
       for(int x=1; x<=25; x++)
       {
            int a = r.nextInt(100);
            int b = r.nextInt(100);
            System.out.print(x);
            if(a<b)
            {
                System.out.println(". "+a+" < "+b);
            }
            else if(a>b)
            {
                System.out.println(". "+a+" > "+b);
            }
            else if(a==b)
            {
                System.out.println(". "+a+" = "+b);
            }
       }
        
    }
}