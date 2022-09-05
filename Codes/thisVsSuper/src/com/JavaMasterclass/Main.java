package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
    /*
        This vs Super:
        -------------
        The keyword 'super' is used to access/call the parent class members (variables and
        methods).

        The keyword 'this' is used to call the current class members (variables and methods). This
        is required when we have a parameter with the same name as an instance variable (field).

        NOTE: We can use both of them anywhere in a class except static areas(the static block
        or a static method). Any attempt to do so will lead to compile-time errors (more on static
        later in the course).


        this() vs super():
        -----------------
        In Java we have the this() call and the super() call. Notice the braces it is known as a call
        since it looks like a regular method call.

        Use this() to call a constructor from another overloaded constructor in the same class.

        The call to this() can be used only in a constructor, and it must be the first statement in a
        constructor. It's used with constructor chaining, in other words when one constructor
        calls another constructor, and helps to reduce duplicated code.

        The only way to call a parent constructor is by calling super(). This calls the parent
        constructor.

        The Java Compiler puts a default call to super() if we don’t add it, and it is always the
        no-args super which is inserted by compiler (constructor without arguments).

        The call to super() must be the first statement in each constructor.

        Even Abstract classes have constructors, although you can never instantiate an abstract
        class using the new keyword.

        An abstract class is still a super class, so its constructors run when someone makes an
        instance of a concrete subclass.

        NOTE: A constructor can have a call to super() or this() but never both.

    */
    }
}
