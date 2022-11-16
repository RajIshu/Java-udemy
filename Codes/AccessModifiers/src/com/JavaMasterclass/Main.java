package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {

	/*
	    ACCESS MODIFIERS:
	    ----------------
	    Access Modifiers in Java helps to restrict the scope of a class, constructor, variable,
	    method, or data member.
	    There are four types of access modifiers available in java:
            1) Default – No keyword required
            2) Private
            3) Protected
            4) Public

        Access Control can be granted at the Top Level or at the Member Level.


        Top Level:
        ---------
        Only classes, interfaces and enums can exist at the top level, everything else
        must be included within one of these.

        a) public: the object is visible to all classes everywhere, whether they are in the
           same package or have imported the package containing the public class.
           Example:
                public class Main{
                ...
                }

        b) Default (or Package-private): the object is only available within its own package (and is
           visible to every class within the same package). Package-private is specified by
           not specifying, i.e., it is the default if you do not specify public. There is not a
           "package-private" keyword.
           Example:
                class Main{
                ...
                }

        NOTE: Top Level Cannot be defined with 'private' access modifier.


        Member Level:
        ------------
        a) public: At the member level, public has the same meaning as at top level. A public class
           member (or field) and public method can be accessed from any other class anywhere,
           even in a different package.
           Example:
                i) public int a = 7;
                ii) public void getValue(){
                    ...
                    }

        b) Default (or Package-private): this also has the same meaning as it does at the top level.
           An object with no access modifier is visible to every class within the same package (but
           not to classes in external packages).
           Example:
                i) int a = 7;
                ii) void getValue(){
                    ...
                    }

        c) private: the object is only visible within the class it is declared. It is not visible
           anywhere else (including in subclasses of its class).
           Example:
                i) private int a = 7;
                ii) private void getValue(){
                    ...
                    }

        d) protected: the object is visible anywhere in its own package (like package-private) but
           also in subclasses even if they are in another package.


         ___________________________________________________________________________________________
        |                                   |   default   |   private  |   protected   |   public   |
        |___________________________________|_____________|____________|_______________|____________|
        | Same Class                        |     Yes     |     Yes    |      Yes      |     Yes    |
        |-----------------------------------|-------------|------------|---------------|------------|
        | Same Package Subclass             |     Yes     |     No     |      Yes      |     Yes    |
        |-----------------------------------|-------------|------------|---------------|------------|
        | Same Package Non-subclass         |     Yes     |     No     |      Yes      |     Yes    |
        |-----------------------------------|-------------|------------|---------------|------------|
        | Different Package Subclass        |     No      |     No     |      Yes      |     Yes    |
        |-----------------------------------|-------------|------------|---------------|------------|
        | Different Package Non-subclass    |     No      |     No     |      No       |     Yes    |
        |___________________________________|_____________|____________|_______________|____________|


	*/
    }
}
