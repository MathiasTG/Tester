package main;

import bank.Account;

public class Main {
    public static void main(String[] args){
        Account a1 = new Account();
        Account a2 = new Account();
        System.out.println(Account.getNextAccountID());
    }
}
