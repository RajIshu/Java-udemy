package com.JavaMasterclass;

public interface Map_Interface {
    /*
        MAP Interface:
        -------------
        The Map interface of the Java collections framework provides the functionality of the map data
        structure.

        In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with
        individual Values. Keys can be used to access a particular element in a map.

        A map cannot contain duplicate keys. And, each key is associated with a single value.

        EXAMPLE:

                Keys               Values
                ----            -------------
                 in             India
                 us             Unites States
                 br             Brazil
                 ru             Russia

        Note: The Map interface maintains 3 different sets:
                a) the set of keys
                b) the set of values
                c) the set of key/value associations (mapping).

              Hence we can access keys, values, and associations individually.


        Collection framework diagram for MAP:
        ------------------------------------

                                                MAP
                                                ⬈⬉
                                     extends ⬈      ⬉ implements
                                          ⬈            ⬉
                                     SortedMap        HashMap
                                         ⬆               ⬆
                              implements ⬆               ⬆ extends
                                         ⬆               ⬆
                                      TreeMap       LinkedHashMap


        Difference Between SortedMap and HashMap:
        ----------------------------------------
         _______________________________________________________________________________________________
        |                  SortedMap                    |                   HashMap                     |
        |_______________________________________________|_______________________________________________|
        | 1. It does not allow null keys but can have   | 1. It allows a single null key and multiple   |
        |    multiple null values.                      |    null values.                               |
        |                                               |                                               |
        | 2. It allows homogeneous values as a key      | 2. It allows heterogeneous elements because   |
        |    because of sorting.                        |    it does not perform sorting on keys.       |
        |                                               |                                               |
        | 3. It is slower than HashMap.                 | 3. It is faster than SortedMap.               |
        |_______________________________________________|_______________________________________________|



        Classes that implement Map:
        --------------------------
        Since Map is an interface, we cannot create objects from it.

        In order to use functionalities of the Map interface, we can use these classes:
        a) HashMap
           - The HashMap class of the Java collections framework provides the functionality of the hash table
             data structure.
           - To learn more about HashMap, open HasMap Class in this project.

        b) EnumMap

        c) LinkedHashMap
           - The LinkedHashMap interface extends the HashMap class to store its entries in a hash table. It
             internally maintains a doubly-linked list among all of its entries to order its entries.

        d) WeakHashMap

        e) TreeMap
           - The TreeMap class of the Java collections framework provides the tree data structure implementation.
           - To learn more about TreeMap, open TreeMap Class in this project.


        Interfaces that extend Map:
        --------------------------
        a) SortedMap
           - The SortedMap interface of the Java collections framework provides sorting of keys stored in a map.

           - To learn more about SortedMap, open SortedMap Interface in this project.

        b) NavigableMap
        c) ConcurrentMap
    */

}
