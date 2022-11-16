package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    SCOPE:
	    -----
	        - It refers to visibility of a class, variables and other members.

        How scope of variables are checked?
        ----------------------------------
        Here, we use Enclosing Block concept. So, when Java sees a reference to a variable, what it does,
        it starts by checking the current block of code to see if the variable was actually declared there.
        Now if it is declared there, then that variable is used. But if there's no such declaration, or it's
        not there, then Java actually checks the parent block that encloses the current one to see if there's
        a declaration there. So it keeps doing this searching in every parent block until it finds the
        variable declaration.
        And if it doesn't actually find one, then you'll actually get an error in your code.

	*/

        String privateVar = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar = " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println("***********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
