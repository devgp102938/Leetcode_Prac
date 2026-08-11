class Bank{
    private String accountHolder;
    private long accountNumber;
    private double balance;

    Bank(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        
        if(amount <= 0){
            System.out.println("Enter valid amount for making deposit");
            return;
        }

        balance += amount;
        System.out.println("New Balance after deposit: " + balance);
    }

    void withdraw(double amount){

        if(amount <= 0){
            System.out.println("Enter Valid Amount to make Withdraw request");
            return;
        }

        if(amount > balance){
            System.out.println("Insufficient balance");
            return;
        }

        balance -= amount;
        System.out.println("New Balance after withdraw: " + balance);
    } 

    void display(){
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance : " + balance);
    }
}

public class BankAccount{
    public static void main(String[] args) {
        Bank obj = new Bank("Dev", 78101, 20000);
        Bank obj1 = new Bank("diya", 78102, 30000);

        obj.display();

        obj.deposit(2000);
        obj.display();

        obj.withdraw(1000);
        obj.display();


        obj1.display();

        obj.deposit(300);
        obj.display();

        obj.withdraw(10000);
        obj.display();
    }
}
