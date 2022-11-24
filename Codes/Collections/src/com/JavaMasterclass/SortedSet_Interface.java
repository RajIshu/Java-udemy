package com.JavaMasterclass;

public interface SortedSet_Interface{
    /*
        SortedSet Interface:
        -------------------
        - The SortedSet interface of the Java Collections framework is used to store
          elements with some order in a set.

        - It extends the Set interface.

                        COLLECTION
                            ⬆
                            ⬆  extends
                            ⬆
                           SET
                            ⬆
                            ⬆  extends
                            ⬆
                        SortedSet

        Creating a SortedSet:
        --------------------
        - To use SortedSet, we must import the java.util.SortedSet package first.

        - Example:
                // SortedSet implementation by TreeSet class
                SortedSet<String> animals = new TreeSet<>();

          Here, we have used no arguments to create a sorted set. Hence, the set will be
          sorted naturally.

          As, SortedSet is an Interface so, we have to use constructor of classes that have
          implemented SortedSet Interface.


        Methods of SortedSet:
        --------------------
        The SortedSet interface includes all the methods of the Set interface. It's
        because Set is a super interface of SortedSet.

        Besides, methods included in the Set interface, the SortedSet interface also
        includes these methods:

            + comparator() - returns a comparator that can be used to order elements
                             in the set
            + first() - returns the first element of the set
            + last() - returns the last element of the set
            + headSet(element) - returns all the elements of the set before the
                                 specified element
            + tailSet(element) - returns all the elements of the set after the specified
                                 element including the specified element
            + subSet(element1, element2) - returns all the elements between the element1
                                           and element2 including element1
    */

}
