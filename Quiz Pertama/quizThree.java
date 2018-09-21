import java.util.Random;

public class quizThree
{
    static Random r = new Random();
    public static void main(String[] args)
    {
        int x = 1;
       while(true)
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
            x++;
       }
        
    }
}