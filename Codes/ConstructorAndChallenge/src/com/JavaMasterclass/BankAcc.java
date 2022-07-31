package com.JavaMasterclass;

public class BankAcc {

    private long accNo;
    private double balance;
    private String custName;
    private String email;
    private long phoneNo;

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void depositFund(double amt){
        balance += amt;
        System.out.println("Credited Amount: " + amt);
        System.out.println("Current Balance: " + String.format("%.2f", balance));
    }

    public void withdrawFund(double amt){
        if(balance < amt){
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amt;
            System.out.println("Withdrawal Amount: " + amt);
            System.out.println("Current Balance: " + String.format("%.2f", balance));
        }
    }

}
