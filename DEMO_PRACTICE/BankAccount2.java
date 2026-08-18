class BankAccount{
    
    private final String accountHolder;
    private final long accountNumber;
    private double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getbalance(){
        return balance;
    }

    public String getaccountHolder(){
        return accountHolder;
    }

    public long getaccountNumber(){
        return accountNumber;
    }

    //deposit
    public void deposit(double Amount){
        if(Amount <= 0){
            System.out.println("Amount Should be greater than 0");
            return;
        }

        balance += Amount;
        System.out.println("Balance after Deposit : " + balance);
    }

    //withdraw
    public void withdraw(double Amount){
        if(Amount <= 0){
            System.out.println("Amount Should be greater than 0");
            return;
        }

        if(Amount > balance){
            System.out.println("Insufficiant Balance");
            return;
        }

        balance -= Amount;
        System.out.println("Balance After Withdraw : " + balance);
    }
}

public class BankAccount2{
    public static void main(String[] args) {
        BankAccount Account1 = new BankAccount("Dev", 12345, 10000);

        Account1.deposit(1000);
        Account1.withdraw(3000);

        System.out.println(Account1.getbalance());
        System.out.println(Account1.getaccountHolder());
        System.out.println(Account1.getaccountNumber());
    }
}