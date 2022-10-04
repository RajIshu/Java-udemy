package com.JavaMasterclass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*
	    All the primitive types are value types, in other words they hold a value.

	    Unlike primitive types, an array is a reference type and string is also a reference type.


	    VALUE TYPES:
	    -----------
	    With value types, each variable has its own copy of the data, and it is not possible for
	    operations on one variable to affect the other.

	    A data type is a value type if it holds a data value within its own memory space. It
	    means the variables of these data types directly contain values.

	    Example:
            int myInt = 10;
            int anotherInt = myInt;

            anotherInt++;
            It will not modify or affect the value of myInt.

	    All the value types derive from System.ValueType, which in-turn, derives from System.Object.

	    Value Type variables are stored in the STACK.



	    REFERENCE TYPES:
	    ---------------
	    With reference types, two variables can reference the same object. Therefore, operations on
	    one variable can affect the object referenced by the other variable.

	    Example:
            int[] myIntArray = new int[5];
            int[] anotherIntArray = myIntArray;

            anotherIntArray[0] = 1;
            It will modify or affect the values of myInt as well.

	    Reference Type contains a pointer to another memory location that holds the real data.

	    Reference Type holds a reference (address) to the object but not the object itself. Because
	    reference types represent the address of the variable rather than the data itself, assigning
	    a reference variable to another doesn't copy the data. Instead, it creates a second copy of
	    the reference, which refers to the same location.

	    Reference Type variables are stored in the HEAP.


        STACK vs HEAP:
        -------------
        Stack is used for static memory allocation and Heap for dynamic memory allocation, both
        stored in the computer's RAM.

        STACK - Variables allocated on the stack are stored directly to the memory and access to this
                memory is very fast, and it's allocation is dealt with when the program is compiled.
        HEAP  - Variables allocated on the heap have their memory allocated at run time and accessing
                this memory is a bit slower.

        STACK - Stack follows LIFO approach which makes it really simple to keep track of the stack,
                freeing a block from the stack is nothing more than adjusting one pointer.
        HEAP  - Elements in Heap can be accessed randomly at any time. You can allocate a block at
                any time and free it at any time. This makes it much more complex to keep track of
                which parts of the heap are allocated or free at any given time.

        STACK - We can use the stack if you know exactly how much data we need to allocate before
                compile time, and it is not too big.
        HEAP  - We can use heap if you don't know exactly how much data we will need at runtime
                or if we need to allocate a lot of data.

	*/

        int myInt = 10;
        int anotherInt = myInt;

        System.out.println("myInt = " + myInt);
        System.out.println("anotherInt = " + anotherInt);

        anotherInt++;

        System.out.println("After Change, myInt = " + myInt);
        System.out.println("After Change, anotherInt = " + anotherInt);


        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
        // toString() methods converts Array object into String object

        anotherIntArray[0] = 1;

        System.out.println("After Change, myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After Change, anotherIntArray = " + Arrays.toString(anotherIntArray));
        // Both the array gets modified

        modifyArray(anotherIntArray); // passing reference type as a parameter in a method

        System.out.println("After Modify, myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After Modify, anotherIntArray = " + Arrays.toString(anotherIntArray));
        // Both the array gets modified


        // De-referencing anotherIntArray reference
        anotherIntArray = new int[] {1,1,1,1,1};

        System.out.println("After De-referencing, myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After De-referencing, anotherIntArray = " + Arrays.toString(anotherIntArray));
        // Both the array are now pointing to different array or object in the memory


        // REMEMBER: 'new' keyword is the crucial thing here which creates reference to the new
        // object in the memory.
    }


    private static void modifyArray(int[] array){
        array[0] = 2;

        // De-referencing the reference
        array = new int[] {1,2,3,4,5};
        // These changes will not reflect in main method's array because array reference type in
        // modifyArray method doesn't have reference to the main method's array. Now array reference
        // type is pointing to another array or object in the memory.
    }
}
