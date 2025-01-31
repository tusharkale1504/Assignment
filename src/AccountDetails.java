import java.util.Scanner;

class AccountDetails {
    String accNo, name;
    long balance = 0;
    Scanner scan = new Scanner(System.in);

    void addUser() {
        System.out.println("Enter the Account number:");
        this.accNo = scan.nextLine();

        System.out.println("Enter the User Name:");
        this.name = scan.nextLine();
    }

    void viewUser() {
        System.out.println("\nAccount Details:");
        System.out.println("AccNo: " + accNo);
        System.out.println("Name: " + name);
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class AmountDeposit extends AccountDetails {
    void deposit() {
        System.out.println("Enter amount to deposit:");
        int amount = scan.nextInt();
        scan.nextLine();
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }
}

class AmountWithdraw extends AmountDeposit {
    void withdraw() {
        System.out.println("Enter amount to withdraw:");
        int amount = scan.nextInt();
        scan.nextLine();

        if (balance < 4999) {
            System.out.println("Insufficient balance to withdraw.");
        } else if (amount > 4999) {
            System.out.println("Cannot withdraw more than 4999 at a time.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }
}

 class Banking {
    public static void main(String[] args) {
        AmountWithdraw account = new AmountWithdraw();
        account.addUser();
        account.viewUser();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = account.scan.nextInt();
            account.scan.nextLine();

            switch (choice) {
                case 1:
                    account.deposit();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system!");
                    account.scan.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
