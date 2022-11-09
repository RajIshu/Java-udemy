package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
        Naming Convention:
        -----------------
        Java naming convention is a rule to follow as we decide what to name our identifiers such as class, package,
        variable, constant, method, etc.

        But, it is not forced to follow. So, it is known as convention not rule.


        Advantage of Naming Convention:
        ------------------------------
        By using standard naming conventions, we can  make our code easier to read for ourselves and other programmers.


        Naming Convention for different Java Identifiers:
        ------------------------------------------------
        1) Packages
           --------
                - Always lower case.
                - Package names should be unique.
                - Use your internet domain name, reversed, as a prefix for the package name.
                - Invalid domain name components:
                        + Replace invalid characters (i.e. -) in domain name with an underscore.
                          Example:
                                i) experts-exchange.com --> com.experts_exchange
                        + Domain name components starting with a number should instead start with an underscore.
                          Example:
                                i) 1world.com --> com._1world
                        + Domain name components that are Java keywords should have that component start with an
                          underscore.
                          Example:
                                i) switch.supplier.com --> com.supplier._switch

                - Examples of Package names:
                    a) java.lang
                    b) java.io
                    c) org.xml.sax.helpers
                    d) com.rajishu.java_masterclass

        2) Class
           -----
                - CamelCase
                - Class names should be nouns (they represent things).
                - Should start with a capital letter
                - Each word in the name should also start with a capital (e.g. LinkedList)

                - Examples of Class names:
                    a) ArrayList
                    b) String
                    c) LinkedList
                    d) GearBox
                    e) Main

        3) Interface
           ---------
                - Capitalized like class names (CamelCase).
                - Consider what objects implementing the interface will become of what they will be able to do.
                - Examples:
                    a) Comparable
                    b) List
                    c) Serializable

        4) Methods
           -------
                - mixedCase.
                - Often verbs.
                - Reflect the function performed or the result returned.
                - Examples:
                    a) size()
                    b) getName()
                    c) addPlayer()

        5) Constants
           ---------
                - All UPPER_CASE.
                - Separate words with underscore(_).
                - Declared using the final keyword
                - Examples:
                    a) Static final int MAX_INT
                    b) Static final short SEVERITY_ERROR
                    c) Static final double P1 = =3.141592653

        6) Variables
           ---------
                - mixedCase.
                - Meaningful and indicative.
                - Start with lower case letter.
                - Do not use underscores(_).
                - Examples:
                    a) i
                    b) league
                    c) sydneySwans
                    d) boxLength

        7) Type Parameters
           ---------------
                - Single Character
                - Capital Letter
                - Examples:
                    a) E - Element (used extensively by the Java Collections Framework)
                    b) K - Key
                    c) T - Type
                    d) V - Value
                    e) S,U,V, etc. - 2nd, 3rd, 4th types
	*/
    }
}
