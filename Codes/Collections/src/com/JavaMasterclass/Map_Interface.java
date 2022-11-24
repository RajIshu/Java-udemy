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
        d) WeakHashMap
        e) TreeMap
    */
}
