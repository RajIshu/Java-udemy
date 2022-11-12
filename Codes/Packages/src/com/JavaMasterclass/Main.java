package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {

    /*
        PACKAGES:
        --------
            - Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces.
            - We can assume package as a folder or a directory that is used to store similar files.


        Packages are used for:
        ---------------------
            1.	To avoid name conflicts.
            2.	To control access of class, and, interface, etc.
            3.	Using package, it becomes easier to locate and use the related classes.
            4.	Packages can be considered as data encapsulation (or data-hiding).
            5.	It also provides a good structure for projects with hundreds of classes and other files.


        How to Create a Package?
        -----------------------
            - Creating a package in java is quite easy, simply include a package command followed by name of the
              package as the first statement in java source file.
            - Example:
                package mypack;

                public class employee
                {
                    String empId;
                    String name;
                }

            NOTE: Package statement must be first statement in the program even before the import statement.


        Importing JAVA Package:
        ----------------------
            - There are 3 different ways to access classes from the packages:
                    1. Without importing the package
                    2. Import package with specified class
                    3. Import package with all classes

            - Accessing package without import keyword:
              ----------------------------------------
                    + To access only a particular class into our program without importing the package (other
                      classes in the same package will not be accessible).
                    + For this approach, there is no need to use the import statement. But, we will have to use the
                      fully qualified name every time we are accessing the class or the interface.
                    + This is generally used when two packages have classes with same names.
                        ~ For example:
                                javafx.scene and org.w3c.dom packages contain Node class.

                      NOTE: But when we have to import and use two different classes whose names are same then we have
                            to either import one package for a class and use fully qualified name for other class, or
                            we have to use fully qualified name for both classes.
                            Example:
                                a) Method - 1:
                                   ----------
                                   import javafx.scene.Node;

                                   public class Main {
                                        public static void main(String[] args) {
                                            Node node = null;                    // Importing the package
                                            org.w3c.dom.Node anotherNode = null; // Using fully qualified name
                                        }
                                   }

                                 b) Method - 2:
                                    ----------
                                    public class Main {
                                        public static void main(String[] args) {
                                            javafx.scene.Node node = null;       // Using fully qualified name
                                            org.w3c.dom.Node anotherNode = null; // Using fully qualified name
                                        }
                                    }

                            REASON: In case of importing both the packages, the first 'Node' declaration will create
                            confusion to use which package to import 'Node' class.

            - Import package with specified class:
              -----------------------------------
                    + Package can have many classes, but sometimes we want to access only specific class in our
                      program.
                      In that case, if we use
                            import packagename.classname
                      statement then only the class with name classname in the package will be available for use.

            - Import all classes of the package:
              ---------------------------------
                    + If we use
                            packagename.*
                      statement, then all the classes and interfaces of this package will be accessible.
                      But, the classes and interface inside the sub-packages will not be available for use


        Subpackages:
        -----------
            - Packages that are inside another package are the subpackages.
            - These are not imported by default, they have to imported explicitly.
            - Also, members of a subpackage have no access privileges, i.e., they are considered as different package
              for protected and default access specifiers.
            - Example:
                    import java.util.*;
              util is a subpackage created inside java package.


         Using Static Import:
         -------------------
            - Static import is a feature introduced in Java programming language (versions 5 and above) that allows members ( fields and methods ) defined in a class as public static to be used in Java code without specifying the class in which the field is defined.

            - Example:
                    import static java.lang.System.*;

                    class StaticImportDemo
                    {
                       public static void main(String args[])
                       {
                            // We don't need to use 'System.out' as we have imported using static keyword.
                            out.println("Hello"); //using Out without System
                       }
                    }

    */

    }
}
