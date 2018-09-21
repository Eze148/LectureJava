public class quizFour
{
    public static void main(String[] args)
    {
        for(int x=2; x<=100; x++)
        {
            int count =0;
            for(int y=x; y>=1; y--)
            {
                if(x%y==0)
                {
                    count++;  
                }
            }
            if(count==2)
            {
                System.out.println("The prime number are "+x);
            }
        }
    }
}