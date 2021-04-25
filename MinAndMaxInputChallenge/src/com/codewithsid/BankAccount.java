package com.codewithsid;

public class BankAccount {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds (long deposit){
        this.balance += deposit;
        System.out.println("Deposit made = "+ deposit);
        System.out.println("Total balance now is =" + this.balance);
    }
    public void withdrawFunds (long withdraw){
        System.out.println("Withdraw processed = "+ withdraw);
        if (this.balance<withdraw) {
            System.out.println("Insufficient funds");
        }
        else {
            this.balance -= withdraw;
            System.out.println("Total balance now is ="+ this.balance);
        }
    }
}
