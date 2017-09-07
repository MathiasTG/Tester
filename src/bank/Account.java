package bank;

public class Account {
    private double balance;
    private int accountID;
    private static int nextAccountID=1;

    public Account(double balance, int accountID){
        this.balance=balance;
        this.accountID=nextAccountID;
        nextAccountID++;
    }
    public Account(){
        this.balance=0;
        this.accountID=nextAccountID;
        nextAccountID++;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public double withdrawel(double amount){
        balance-=amount;
        return amount;
    }

    public static int getNextAccountID() {
        return nextAccountID;
    }
}
