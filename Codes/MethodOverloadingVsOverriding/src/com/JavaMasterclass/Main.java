package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    Method Overloading:
	    ------------------
	    Method overloading means providing two or more separate methods in a class with
        the same name but different parameters.
        Method return type may or may not be different and that allows us to reuse the same
        method name.
        Overloading is very handy, it reduces duplicated code, and we don't have to remember
        multiple method names.

        Overloading does not have anything to do with polymorphism but Java developers
        often refer to overloading as Compile Time Polymorphism.

        In other words the compiler decides which method is going to be called based on the
        method name, return type and argument list.

        We can overload static and instance methods.

        Usually overloading happens inside a single class, but a method can also be treated as
        overloaded in the subclass of that class.
        That is because a subclass inherits one version of the method from the parent class
        and then the subclass can have another overloaded version of the method.

        Methods will be considered overloaded if both follow the following rules:
            + Methods must have the same method name.
            + Methods must have different parameters.

        If methods follow the rules above then they may or may not
            + Have different return types.
            + Have different access modifiers.
            + Throw different checked or unchecked exceptions.


        Method Overriding:
        -----------------
        Method overriding means defining a method in a child class that already exists in the
        parent class with same signature (same name, same arguments).

        By extending the parent class the child class gets all the methods defined in the parent
        class (those methods are also known as derived methods).

        Method overriding is also known as Runtime Polymorphism and Dynamic Method
        Dispatch, because the method that is going to be called is decided at runtime by the
        JVM.

        When we override a method it's recommended to put @Override immediately above
        the method definition. This is an annotation that the compiler reads and will then
        show us an error if we don't follow overriding rules correctly.

        We can’t override static methods only instance methods.

        Method will be considered overridden if we follow these rules:
            + It must have same name and same arguments.
            + Return type can be a subclass of the return type in the parent class.
            + It can't have a lower access modifier.
                « For example, if the parent method is protected then using private in the child
                  is not allowed but using public in the child would be allowed.

        There are also some important points about method overriding to keep in mind:
            + Only inherited methods can be overridden, in other words methods can be
              overridden only in child classes.
            + Constructors and private methods cannot be overridden.
            + Methods that are final cannot be overridden.
            + A subclass can use super.methodName() to call the superclass version of an
              overridden method.

        Recap:
            Overloading: Same Name, Different Parameters
            Overriding: Same Name, Same Parameters


        Covariant Return Type:
        ---------------------
        Before Java5, it was not possible to override any method by changing the return
        type. When we override a parent class method, the name, argument types, and
        return type of the overriding method in child class has to be exactly the same
        as that of the parent class method. The overriding method was said to be
        invariant with respect to return type.

        But now, since Java5, it is possible to override method by changing the return type.
        Now it is possible to have different return types for an overriding method in the child
        class, but the child’s return type should be a subtype of the parent’s return type. The
        overriding method becomes variant with respect to return type.

        Covariant return type refers to return type of an overriding method.

        In simple words if any child class has method overriding by different return types then
        that overridden method can return any type.
	*/
    }
}
