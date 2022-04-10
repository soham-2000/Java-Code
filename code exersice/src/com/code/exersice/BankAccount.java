package com.code.exersice;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {

        this("6524587996355810", 15000.0, "soham", "so@email.com", "951753524");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail,
                       String phoneNumber) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {

        BankAccount sohamAcc = new BankAccount("3245833568994210", 15000.00, "Soham Chakraborty", "chakrabortysoham3005@gmail.com", "9854233657");
//		sohamAcc.setAccountNumber("3254869225745216");
        System.out.println("Account Number: " + sohamAcc.getAccountNumber());
//		sohamAcc.setCustomerName("Soham Chakraborty");
        System.out.println("Holder Name: " + sohamAcc.getCustomerName());
//		sohamAcc.setBalance(326500);
        System.out.println("Balance: " + sohamAcc.getBalance());
//		sohamAcc.setPhoneNumber("9865471258");
        System.out.println("Customer's phone number: " + sohamAcc.getPhoneNumber());
//		sohamAcc.withdrawal(200);
//		sohamAcc.deposit(500);
//		sohamAcc.withdrawal(200);
//		System.out.println(sohamAcc.getBalance());
//		System.out.println(sohamAcc.getAccountNmuber());
        System.out.println("Email Address: " + sohamAcc.getCustomerEmail());

        BankAccount ba = new BankAccount();
        System.out.println("name: " + ba.getCustomerName());
        System.out.println(ba.getAccountNumber());
        BankAccount ab = new BankAccount("47538367537583", 254365287.0, "Ravi", "some@mail.com", "32545887");
        BankAccount ss = new BankAccount("65474196352", 65452.00, "iva", "iva@mil.com", "369977412");
        System.out.println(ab.getAccountNumber());
        System.out.println(ab.getCustomerName());
        System.out.println(ss.accountNumber);
        System.out.println(ss.getBalance());


    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {

        this.balance += depositAmount;
        System.out.println("Deposit of amount" + " " + depositAmount + " is successful.");
        System.out.println("Current balance is " + this.balance);


    }

    public void withdrawal(double withdrawalAmount) {

        if (this.balance - withdrawalAmount < 0) {

            System.out.println("Insufficient balance for withdrawal");
            System.out.println("Current balance is " + this.balance);
        } else {

            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed successfully.");
            System.out.println("Current balance is " + this.balance);
        }
    }

}
