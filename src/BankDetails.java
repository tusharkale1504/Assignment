    abstract  class BankAccounts {
        String accNo;
        double balance; // Ensure balance is of type double

        public BankAccounts(String accNo, double balance) {
            this.accNo = accNo;
            this.balance = balance;
        }

        abstract void deposit(double amount);
        abstract void withdraw(double amount);

        void displayBalance() {
            System.out.println("Account No: " + accNo);
            System.out.println("Balance: ₹" + balance);
            System.out.println("------------------------");
        }
    }


class SavingAccounts extends BankAccounts {
    public SavingAccounts(String accNo, double balance) {
        super(accNo, balance); // Correctly calling superclass constructor
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited. New Balance: ₹" + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 1000) { // Enforcing ₹1000 minimum balance
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn. New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance! Minimum ₹1000 must be maintained.");
        }
    }
}



    class CurrentAccounts extends BankAccounts {
        public CurrentAccounts(String accNo, double balance) {
            super(accNo, balance); // Correctly calling superclass constructor
        }

        @Override
        void deposit(double amount) {
            balance += amount;
            System.out.println("₹" + amount + " deposited. New Balance: ₹" + balance);
        }

        @Override
        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("₹" + amount + " withdrawn. New Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }



public class BankDetails {
    public static void main(String[] args) {
        // Creating accounts with correct constructor calls
        BankAccounts savings = new SavingAccounts("SA101", 5000.0);
        BankAccounts current = new CurrentAccounts("CA202", 10000.0);

        // Performing transactions
        System.out.println("Savings Account Transactions:");
        savings.deposit(2000);
        savings.withdraw(5500);
        savings.withdraw(2000);
        savings.displayBalance();

        System.out.println("Current Account Transactions:");
        current.deposit(5000);
        current.withdraw(12000);
        current.withdraw(5000);
        current.displayBalance();
    }
}
