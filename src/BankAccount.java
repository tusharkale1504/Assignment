import java.util.Scanner;

class BankAccount
{
    Scanner sc =  new Scanner(System.in);

    void withdraw()
    {
        System.out.println("Welcome");
    }
    void deposit()
    {
        System.out.println("Banking Management System");
    }
}
class SavingAccount extends BankAccount
{
    int balance =1000;
    void deposit()
    {
        System.out.println("Enter Amount to Deposit : ");
        int damt = sc.nextInt();

        if(damt <100000)
        {
            System.out.println("Your Amount "+damt+" is Successfully Deposited");
            balance = balance+damt;
        }
        else
        {
            System.out.println("Sorry you are out of Limit");
        }
        System.out.println("Current Balance : "+balance);
    }
    void withdraw()
    {
        System.out.println("Enter Withdraw Amount : ");
        int wamt = sc.nextInt();

        if(wamt < 50000 && wamt >1000 )
        {
            System.out.println(wamt+" Successfully Withdraw");
            balance =balance -wamt;
        }
        else
        {
            System.out.println(" Sorry You can't Withdraw amount ");
        }
        System.out.println("Your Current balance : "+balance);
    }

}
class CurrentAccount extends BankAccount
{
    int balance =1000;
    void deposit()
    {
        System.out.println("Enter Amount to Deposit : ");
        int damt = sc.nextInt();

        if(damt <200000)
        {
            System.out.println("Your Amount "+damt+" is Successfully Deposited");
            balance = balance+damt;
        }
        else
        {
            System.out.println("Sorry you are out of Limit");
        }
        System.out.println("Current Balance : "+balance);

    }
    void withdraw()
    {
        System.out.println("Enter Withdraw Amount : ");
        int wamt = sc.nextInt();

        if(wamt < 300000 && wamt >1000 )
        {
            System.out.println(wamt+" Successfully Withdraw");
            balance =balance -wamt;
        }
        else
        {
            System.out.println(" Sorry You can't Withdraw amount ");
        }
        System.out.println("Your Current balance : "+balance);
    }

}
 class BankingApplication {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SavingAccount obj = new SavingAccount();
        CurrentAccount obj1 = new CurrentAccount();

        char ch = 'e';

        do {

            System.out.println("Choose Account"
                    + "\n(s) for Saving Account"
                    + "\n(c) for Current Account");

            char acctype=sc.next().charAt(0);

            if(acctype =='s')
            {
                System.out.println("Enter (d) for deposit and (w) for withdraw : ");
                char type = sc.next().charAt(0);
                if(type =='d')
                {
                    obj.deposit();
                }
                else if(type == 'w')
                {
                    obj.withdraw();
                }
            }
            else if(acctype =='c')
            {
                System.out.println("Enter (d) for deposit and (w) for withdraw : ");
                char type = sc.next().charAt(0);
                if(type =='d')
                {
                    obj1.deposit();
                }
                else if(type == 'w')
                {
                    obj1.withdraw();
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("Enter (c) for continue and Enter (e) for Exit");
            ch = sc.next().charAt(0);
        }while(ch =='c');
        System.out.println("----VISIT AGAIN----");
    }

}
 