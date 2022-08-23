package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	 /* CHALLENGE 1:

         Create a new class for a bank account
         Create fields for the account number, balance, customer name,
         email and phone number.

         Create getters and setters for each field
         Create two additional methods
         1. To allow the customer to deposit funds (this should increment
            the balance field).
         2. To allow the customer to withdraw funds. This should deduct
            from the balance field, but not allow the withdrawal to
            complete if there are insufficient funds.

         You will want to create various code in the Main class (the one
         created by IntelliJ) to confirm your code is working.

         Add some System.out.println's in the two methods above as well.
	 */


//        BankAcc RajAccount = new BankAcc();

        BankAcc RajAccount = new BankAcc(7577489958725L, 304.56, "Raj Ishu", "gokuishu57@gmail.com", 790386091L);

        RajAccount.withdrawFund(100);

        RajAccount.depositFund(50);
        RajAccount.withdrawFund(100);

        RajAccount.depositFund(51.6);
        RajAccount.withdrawFund(100);


        BankAcc IshaAccount = new BankAcc("Isha Sharma", "ishasharma13@gmail.com", 982766727L);


    /* CHALLENGE 1:

        Create a new class VipCustomer.
        It should have 3 fields name, credit limit, and email address.
        Create 3 constructors
            1st constructor empty should call the constructor with 3 parameters with default values.
            2nd constructor should pass on the 2 values it receives and add a default value for the 3rd.
            3rd constructor should have all fields.
        Create getters only for this using code generation of intellij as setters won't be needed.
        Test and confirm it works.
    */

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Ishu", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Isha", 100.00, "isha@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());

    }
}
