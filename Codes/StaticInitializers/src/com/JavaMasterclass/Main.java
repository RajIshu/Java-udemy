package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
    /*
        There are two variants of an initialization block in Java -
           1) Static initialization block.
           2) Instance Initialization block.

        Static Initialization Block:
        ---------------------------
        Static initialization block can be used to initialize class variables, which are marked
        with the static keyword.

        Static Initialization blocks are only executed once when the class is loaded. There can
        be multiple static initialization blocks in a class that is called in the order they
        appear in the program.

        Static Blocks are also known as Static Clause.

        NOTE: A static initialization block starts with the static keyword.

        Example:
            class A
            {
                //Static Initialization Block
                static
                {
                    System.out.println("Hello from the static block");
                }

                public A(){
                ...
                }

            }


        NOTE:
            1) A static initialization block can only access static variables and static
               methods of a class.
               Example:
                    class A
                    {
                        private static int i;

                        //Static Initialization Block
                        static
                        {
                            i = 10;
                            System.out.println("Hello from the static block");
                        }

                        public A(){
                        ...
                        }
                    }

            2) A static initialization block cannot access instance variables. Doing so
               gives a compile error.
               Example:
                    class A
                    {
                        private int i;

                        //Static Initialization Block
                        static
                        {
                            i = 10; // Gives ERROR
                            System.out.println("Hello from the static block");
                        }

                        public A(){
                        ...
                        }
                    }


        Multiple static initialization blocks:
        -------------------------------------
        We can define multiple static initialization blocks within our class and the order in which
        they are defined(starting from the top) is the order in which they are executed when the
        class loads.

        Example:
            class A
            {
                //first static initialization block
                static
                {
                    System.out.println("First hello from static block");
                }

                public A()
                {
                    System.out.println("Hello from Constructor");
                }

                //second static initialization block
                static
                {
                    System.out.println("Second hello from static block");
                }

                //third static initialization block
                static
                {
                    System.out.println("Third hello from static block");
                }
            }

        OUTPUT:
            First hello from static block
            Second hello from static block
            Third hello from static block
            Hello from Constructor



    Instance Initialization Block:
    -----------------------------
    The instance initialization block of a class is associated with its instance/object creation.
    The instance initialization block is automatically executed when a constructor of its class
    is called for object creation.

    NOTE:
        1) Instance initialization block does not precede with any keyword or name.
        2) Unlike the static initialization block, which could only access the static variables
           and the static methods of its class, the instance initialization block can access
           both the instance variables and the static variables of its class.
        3) The static blocks always execute first before the main() method in Java because the
           compiler stores them in memory at the time of class loading and before the object creation.

    Example:
        class A
        {

            int a;

            //Instance Initialization block
            {
                a=10;
                System.out.println("An object is created");
            }

            public A(){
                System.out.println("Constructor Called with value = " + a);
            }
        }

    Output:
    ------
        An object is created
        Constructor Called with value = 10



    */

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
