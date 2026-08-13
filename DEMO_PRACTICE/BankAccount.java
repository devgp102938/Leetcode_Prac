
class Bank{

    private final String HolderName;
    private final long AccountNumber;
    private double Balance;

    Bank(String HolderName, long AccountNumber, double Balance) {
        this.HolderName = HolderName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    //deposit
    void deposit(double Amount){
        if(Amount < 0){
            System.out.println("Amount should be more than 0");
        }

        Balance += Amount;
        System.out.println("New Balance After Deposit" + Balance);
    }

    //withdraw
    void withdraw(double Amount){
        if(Amount < 0){
            System.out.println("Amount should be more than 0");
        }

        if(Amount > Balance){
            System.out.println("Insufficient balance");
        }
    }

    //display
    void display(){
        System.out.println("Holder Name: " + HolderName);
        System.out.println("Account No. : " + AccountNumber);
        System.out.println("Balance : " + Balance);
    }
}

public class BankAccount{
    public static void main(String[] args) {
        Bank Account1 = new Bank("dev", 78101, 250000);
        Bank Account2 = new Bank("ved", 78102, 350000);


        Account1.display();
        
        Account1.deposit(3000);
        Account1.display();

        Account1.withdraw(1500);
        Account1.display();

        Account2.display();
        Account2.deposit(4000);

        Account2.withdraw(2000);
        Account2.display();
    }
}
