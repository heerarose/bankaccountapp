import java.util.Scanner;
public class BankAccount {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;
    BankAccount(String cname, String cid){
        this.customerName = cname;
        this.customerId = cid;
    }

    void deposit(int amount){
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited :" + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn :" + Math.abs(previousTransaction));
        }
        else{
            System.out.println("No Transaction Occured");
        }
    }
    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome :" + customerName);
        System.out.println("Your ID is :" + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D.  Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("***********************************");
            System.out.println("Enter an option : ");
            System.out.println("***********************************");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("********************************");
                    System.out.println("Balance = " + balance);
                    System.out.println("********************************");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("********************************");
                    System.out.println("Enter an amount to deposit :");
                    System.out.println("********************************");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println('\n');
                    break;

                case 'C':
                    System.out.println("********************************");
                    System.out.println("Enter an amount to withdraw :");
                    System.out.println("********************************");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println('\n');
                    break;

                case 'D':
                    System.out.println("********************************");
                    getPreviousTransaction();
                    System.out.println("********************************");
                    System.out.println('\n');
                    break;

                case 'E' :
                    System.out.println("********************************");
                    break;

                default:
                    System.out.println("Invalid option !!. Please enter again.");
                    break;
            }
        }while (option != 'E');
        System.out.println("Thankyou for using our services");
    }
}


