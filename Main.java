import java.util.Scanner;

// BankAccount class represents the user's bank account
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

// ATM class represents the ATM machine
class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void withdraw(double amount) {
        if (bankAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: $" + bankAccount.getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
        System.out.println("Deposit successful. New balance: $" + bankAccount.getBalance());
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + bankAccount.getBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        // Initialize bank account with an initial balance
        BankAccount account = new BankAccount(1000.0);
        ATM atm = new ATM(account);

        Scanner scanner = new Scanner(System.in);

        // ATM menu
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
