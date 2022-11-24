package com.JavaMasterclass;

public interface Set_Interface {
    /*
        SET Interface:
        -------------
        - The Set interface allows us to store elements in different sets similar to the set in
          mathematics.

        - It cannot have duplicate elements.

        - Java ArrayList Implementation Diagram:
          -------------------------------------

                                COLLECTION
                                    ⬆
                                    ⬆  extends
                                    ⬆
                                   SET ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅
                                 ⬈  ⬆               ⬉                        ⬆
                              ⬈     ⬆  extends         ⬉  implements         ⬆ implements
               implements  ⬈        ⬆                     ⬉                  ⬆
                        ⬈       SortedSet                    ⬉            HashSet
                     ⬈              ⬆                           ⬉            ⬆
                 EnumSet            ⬆  extends                     ⬉         ⬆ extends
                                    ⬆                                 ⬉      ⬆
                               NavigableSet                            LinkedHashSet
                                    ⬆
                                    ⬆
                        ➡ ➡ ➡ ➡ ➡ ⬅ ⬅ ⬅ ⬅ ⬅
                       ⬆                         ⬆
            implements ⬆                         ⬆ implements
                       ⬆                         ⬆
                    TreeSet            ConcurrentSkipListSet

        - Since Set is an interface, we cannot create objects from it.

           In order to use functionalities of the Set interface, we can use these classes:
               a) HashSet
                    + The HashSet class of the Java Collections framework provides the functionalities of the
                      hash table data structure.
                    + To learn more about HashSet, go to HashSet Class

               b) LinkedHashSet
                    + The LinkedHashSet class of the Java collections framework provides functionalities of both
                      the hashtable and the linked list data structure.
                    + To learn more about HashSet, go to LinkedHashSet Class


               c) EnumSet

               d) TreeSet
                    + The TreeSet class of the Java collections framework provides the functionality of a tree
                      data structure.
                    + To learn more about HashSet, go to TreeSet Class.


        - The Set interface is also extended by these sub-interfaces:

               a) SortedSet
                    + The SortedSet interface of the Java Collections framework is used to store elements
                      with some order in a set.
                    + To learn more about HashSet, go to SortedSet Interface.
               b) NavigableSet


        Creating a Set:
        --------------
        - In Java, we must import java.util.Set package in order to use Set.

        - Example:
                // Set implementation using HashSet
                Set<String> animals = new HashSet<>();

                As, Set is an Interface so we have to use constructor of classes that have implemented
                Set Interface.


        Methods of Set:
        --------------
        The Set interface includes all the methods of the Collection interface. It's because Collection
        is a super interface of Set.

        Some of the commonly used methods of the Collection interface that's also available in the Set
        interface are:

            a) add() - adds the specified element to the set
            b) addAll() - adds all the elements of the specified collection to the set
            c) iterator() - returns an iterator that can be used to access elements of the set sequentially
            d) remove() - removes the specified element from the set
            e) removeAll() - removes all the elements from the set that is present in another specified set
            f) retainAll() - retains all the elements in the set that are also present in another specified set
            g) clear() - removes all the elements from the set
            h) size() - returns the length (number of elements) of the set
            i) toArray() - returns an array containing all the elements of the set
            j) contains() - returns true if the set contains the specified element
            k) containsAll() - returns true if the set contains all the elements of the specified collection
            l) hashCode() - returns a hash code value (address of the element in the set)


        Set Operations:
        --------------
        The Java Set interface allows us to perform basic mathematical set operations like union, intersection,
        and subset.

            a) Union - to get the union of two sets x and y, we can use x.addAll(y)
            b) Intersection - to get the intersection of two sets x and y, we can use x.retainAll(y)
            c) Difference - to calculate the difference between the two sets x and y, we can use the x.removeAll(y)
            d) Subset - to check if x is a subset of y, we can use y.containsAll(x)

    */
}
