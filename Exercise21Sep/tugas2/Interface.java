import java.util.Scanner;

class Interface{
    static void MainMenu()
    {
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("1. Turn On/Off TV");
        System.out.println("2. Increase Channel");
        System.out.println("3. Decrease Channel");
        System.out.println("4. Change Channel");
        System.out.println("5. Increase Volume");
        System.out.println("6. Decrease Volume");
        System.out.println("7. Check TV status");
        System.out.println("8. Exit");
        System.out.println("Your Input: ");
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Tv t = new Tv();
        boolean flag = true;
        System.out.println("Welcome");
        while(flag)
        {
            MainMenu();
            int choice=input.nextInt();
            switch(choice)
            {
                case 1: 
                        System.out.println("1. Turn on TV");
                        System.out.println("2. Turn off TV");
                        System.out.println("Option: ");
                        choice=input.nextInt();
                        if(choice==1)
                        {
                            t.stat=true;
                        }
                        else if(choice==2)
                        {
                            t.stat=false;
                        }
                        continue;
                case 2:
                        t.incChannel();
                        continue;
                case 3:
                        t.decChannel();
                        continue;
                case 4:
                        if(t.onoff())
                        {
                                System.out.println("Input channel number [1-100]: ");
                                choice=input.nextInt();
                                t.chgChannel(choice);
                        }
                        else
                        {
                                System.out.println("The Tv is off. Please turn it on");
                        }
                        
                        continue;
                case 5:
                        t.incVolume();
                        continue;
                case 6:
                        t.decVolume();
                        continue;
                case 7:
                        t.tvStatus();
                        continue;
                case 8:
                        flag=false;
                        break;
                default:
                        System.out.println("Invalid Input");
                        continue;
            }
            
            
        }
        
    }
}