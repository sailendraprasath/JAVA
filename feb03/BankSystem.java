import java.util.Scanner;

class BankAccount{
    private int Balance;
    private String AccountHolder;

    public BankAccount(String AccountHolder, int amount){
        this.Balance = amount;
        this.AccountHolder = AccountHolder;
    }
    public void Deposit(double amount){
        if (amount>0) {
            Balance += amount;
            System.out.println("Dear "+AccountHolder+" your Amount $"+amount+" deposite sucessfully");
        }
        else{
            System.out.println("invalid please try again");
        }
    }
    public void Withdraw(double amount){
        if (amount>0 && amount<=Balance) {
            Balance -= amount;
            System.out.println("Dear "+AccountHolder+" Your Amount $"+amount+" withdraw Sucessfully");
        }
        else{
            System.out.println("invalid please try again");
        }
    }
    public void checkBalance(){
        System.out.println("Dear "+AccountHolder+" Your Current balance is: $"+Balance);
    }
}


public class BankSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a AccountHolder name: ");
        String name = scan.nextLine();

        System.out.print("Enter initial amount here: $");
        int initialAmt = scan.nextInt();


        BankAccount account = new BankAccount(name, initialAmt);
        System.out.println();
        while (true) {
            System.out.println("Welcome to sailesh Bank of india");
            System.out.println(" your choices ");
            System.out.println("1 Deposite Amount");
            System.out.println("2 Withdraw Amount");
            System.out.println("3 check Balance Amount");
            System.out.println("4 Exit ");
            System.out.print("Enter Your choices here: ");
            int choice = scan.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter your Deposite Amount here: $");
                    double deposite = scan.nextDouble();
                    account.Deposit(deposite);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter your Withdraw Amount here: $");
                    double withdraw = scan.nextDouble();
                    account.Withdraw(withdraw);
                    System.out.println();
                    break;
                case 3:
                    account.checkBalance();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thanks for your time!!");
                    scan.close();
                    return;
                default:
                    System.out.println("invalid option try again..!!");
            }
        }
    }
}
