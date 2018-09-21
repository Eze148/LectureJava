import java.util.Scanner;
public class nbank
{
    public static void main(String[] args)
    {
        saldo sal = new saldo(1000.0, 0.10);         // Initialize balance at 1000 and interest at 0.10
        Scanner input = new Scanner(System.in);
        int pilihan;
        do
        {
            System.out.println("Select a Menu: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            pilihan=input.nextInt();
            if(pilihan == 1)
            {
                System.out.println(sal.getBalance());
            }
            else if(pilihan == 2)
            {
                System.out.print("Input the amount you want to deposit: ");
                double am=input.nextDouble();
                sal.deposit(am);
            }
            else if(pilihan == 3)
            {
                if(sal.getBalance() > 15000.0)    // Balance must be above 15000 to make a withdrawal.
                {
                    System.out.print("Input the amount you want to withdraw: ");
                    double am=input.nextDouble();
                    sal.withdraw(am);
                }
                else
                {
                    System.out.println("Sorry your balance is insufficient.");
                }
            }

        } while(pilihan !=4);
        System.out.println("Thank you for using the application");
    }
}