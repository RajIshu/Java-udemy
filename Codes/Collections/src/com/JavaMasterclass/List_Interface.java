package com.JavaMasterclass;

public interface List_Interface {
    /*
        List Interface:
        --------------
           - The List interface is an ordered collection that allows us to add and remove elements
             like an array.

           - In Java, the List interface is an ordered collection that allows us to store and access
             elements sequentially.

           - It extends the Collection interface.

           - List Interface Implementation Diagram:
             -------------------------------------

                                                     LIST
                                                       ⬆
                                                       ⬆
                              → → → → → → → → → → → → → ← ← ← ← ← ← ← ← ← ← ← ← ←
                             ⬆          ⬆                  ⬆                      ⬆
                  implements ⬆          ⬆ implements       ⬆ implements           ⬆ implements
                             ⬆          ⬆                  ⬆                      ⬆
                        ArrayList   LinkedList           STACK                 VECTOR


           - Since List is an interface, we cannot create objects from it.

             In order to use functionalities of the List interface, we can use these classes:

                   a. ArrayList
                   b. LinkedList
                   c. Vector
                   d. Stack

             These classes are defined in the Collections framework and implement the List interface.

           - How to use List?
             ---------------
             In Java, we must import java.util.List package in order to use List.

             Example:
                // ArrayList implementation of List
                List<String> list1 = new ArrayList<>();

                // LinkedList implementation of List
                List<String> list2 = new LinkedList<>();

                Here, we have created objects list1 and list2 of classes ArrayList and LinkedList.
                These objects can use the functionalities of the List interface.

           - Methods of List:
             ---------------
             The List interface includes all the methods of the Collection interface. Its because
             Collection is a super interface of List.

             Some commonly used methods of the Collection interface that's also available
             in the List interface are:

                + add()         - adds an element to a list
                + addAll()      - adds all elements of one list to another
                + get()         - helps to randomly access elements from lists
                + iterator()    - returns iterator object that can be used to sequentially access
                                  elements of lists
                + set()         - changes elements of lists
                + remove()      - removes an element from the list
                + removeAll()   - removes all the elements from the list
                + clear()       - removes all the elements from the list (more efficient than removeAll())
                + size()        - returns the length of lists
                + toArray()     - converts a list into an array
                + contains()    - returns true if a list contains specified element

           - To learn more about ArrayList, open ArrayList Class.
           - To learn more about LinkedList, open LinkedList Class.


        Java List vs. Set:
        -----------------
        Both the List interface and the Set interface inherits the Collection interface. However, there exists
        some difference between them.

            1) Lists can include duplicate elements. However, sets cannot have duplicate elements.
            2) Elements in lists are stored in some order. However, elements in sets are stored in groups like sets
               in mathematics.


    */
}
