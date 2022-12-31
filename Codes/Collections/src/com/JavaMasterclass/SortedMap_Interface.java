package com.JavaMasterclass;

import java.util.SortedMap;
import java.util.TreeMap;

public interface SortedMap_Interface {
    /*
        SortedMap Interface:
        -------------------
        - The SortedMap interface of the Java collections framework provides sorting of keys stored in a map.

        - It extends the Map interface.

                                 COLLECTION
                                     ⬆
                                     ⬆ extends
                                     ⬆
                                    MAP
                                     ⬆
                                     ⬆ extends
                                     ⬆
                                 SortedMap

        How to use SortedMap?
        --------------------
        - To use the SortedMap, we must import the java.util.SortedMap package first.

        - Syntax:
            // SortedMap implementation by TreeMap class
            SortedMap<Key, Value> numbers = new TreeMap<>();

            Here,
                Key - a unique identifier used to associate each element (value) in a map
                Value - elements associated by keys in a map

            Here, we have used no arguments to create a sorted map. Hence, the map will
            be sorted naturally (ascending order).


        Methods of SortedMap:
        --------------------
        The SortedMap interface includes all the methods of the Map interface. It is because Map
        is a super interface of SortedMap.

        1) comparator() - returns a comparator that can be used to order keys in a map
        2) firstKey() - returns the first key of the sorted map
        3) lastKey() - returns the last key of the sorted map
        4) headMap(key) - returns all the entries of a map whose keys are less than the specified key
        5) tailMap(key) - returns all the entries of a map whose keys are greater than or equal to
                          the specified key
        6) subMap(key1, key2) - returns all the entries of a map whose keys lies in between key1 and
                                key2 including key1

    */



}
