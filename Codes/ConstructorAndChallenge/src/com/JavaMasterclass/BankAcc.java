package com.JavaMasterclass;

public class BankAcc {

    private long accNo;
    private double balance;
    private String custName;
    private String email;
    private long phoneNo;

    /*
        As we have seen above we can set fields using setter, but it would
        not be a nice and efficient approach when we have many fields.

        Also, What if we need to change the accessed field's type?
        We also have to change the accessor's return type.

        So, to resolve this issue we can use constructors with parameters.
    */

    public BankAcc(long accNo, double balance, String custName, String email, long phoneNo){
        System.out.println("Bank Account constructor with parameters called");

        this.accNo = accNo;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // Empty Parameter Constructor can be used to set default values to the fields.
    public BankAcc(){
        this(5678474994021L, 100.5, "Default Name", "Default Email", 7645478937L);
        // this() constructor should always be at first line of empty constructor

        System.out.println("Empty Bank Account constructor called");
    }

    public BankAcc(String custName, String email, long phoneNo) {
        // Account Number and Balance needs to be default then
        this(983653788389L, 100.5, custName, email, phoneNo);

        /*
        OR, we can do it in this way (But the above implementation is great)

        this.accNo = 983653788389L;
        this.balance = 100.5;
        this.custName = custName;
        this.email = email;
        this.phoneNo = phoneNo;

        */
    }

    // NOTE: Getter and Setter are also known as ACCESSORS

//    public void setAccNo(long accNo) {
//        this.accNo = accNo;
//    }
//
    public long getAccNo() {
        return accNo;
    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
    public double getBalance() {
        return balance;
    }
//
//    public void setCustName(String custName) {
//        this.custName = custName;
//    }
//
    public String getCustName() {
        return custName;
    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
    public String getEmail() {
        return email;
    }
//
//    public void setPhoneNo(long phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//
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
