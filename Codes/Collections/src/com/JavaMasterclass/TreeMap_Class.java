package com.JavaMasterclass;

public class TreeMap_Class {
    /*
        TREEMAP Class:
        -------------
        - The TreeMap class of the Java collections framework provides the tree data structure implementation.

        - It implements the NavigableMap interface.

                                    MAP
                                     ⬆
                                     ⬆ extends
                                     ⬆
                                 SortedMap
                                     ⬆
                                     ⬆ extends
                                     ⬆
                                NavigableMap
                                     ⬆
                                     ⬆ implements
                                     ⬆
                                  TreeMap

        Creating a TreeMap:
        ------------------
        - In order to create a TreeMap, we must import the java.util.TreeMap package first.

        - Syntax:
            TreeMap<Key, Value> numbers = new TreeMap<>();

            Here,
                Key - a unique identifier used to associate each element (value) in a map
                Value - elements associated by keys in a map


        Methods of TreeMap:
        ------------------
        1) Insert Elements to TreeMap
                + put() - inserts the specified key/value mapping (entry) to the map
                + putAll() - inserts all the entries from specified map to this map
                + putIfAbsent() - inserts the specified key/value mapping to the map if the
                                  specified key is not present in the map

        2) Access TreeMap Elements
            a) Using entrySet(), keySet() and values()
                + entrySet() - returns a set of all the key/values mapping (entry) of a treemap
                + keySet() - returns a set of all the keys of a tree map
                + values() - returns a set of all the maps of a tree map

            b) Using get() and getOrDefault()
                + get() - Returns the value associated with the specified key. Returns null if
                          the key is not found.
                + getOrDefault() - Returns the value associated with the specified key. Returns
                                   the specified default value if the key is not found.

           c) Remove TeeMap Elements
                + remove(key) - returns and removes the entry associated with the specified key
                                from a TreeMap
                + remove(key, value) - removes the entry from the map only if the specified key
                                       is associated with the specified value and returns a
                                       boolean value

           d) Replace TreeMap Elements
                + replace(key, value) - replaces the value mapped by the specified key with the
                                        new value
                + replace(key, old, new) - replaces the old value with the new value only if the
                                           old value is already associated with the specified key
                + replaceAll(function) - replaces each value of the map with the result of the
                                         specified function


        Methods for Navigation:
        ----------------------
        1) First and Last Methods
                + firstKey() - returns the first key of the map
                + firstEntry() - returns the key/value mapping of the first key of the map
                + lastKey() - returns the last key of the map
                + lastEntry() - returns the key/value mapping of the last key of the map

        2) Ceiling, Floor, Higher and Lower Methods
                + higherKey(key k) - Returns the lowest key among those keys that are greater than the
                                specified key.
                + higherEntry(key k) - Returns an entry associated with a key that is lowest among all
                                  those keys greater than the specified key.
                + lowerKey(key k) - Returns the greatest key among all those keys that are less than the
                               specified key.
                + lowerEntry(key k) - Returns an entry associated with a key that is greatest among all
                                 those keys that are less than the specified key.
                + ceilingKey(key k) - Returns the lowest key among those keys that are greater than the
                                      specified key. If the key passed as an argument is present in the
                                      map, it returns that key.
                + ceilingEntry(key k) - Returns an entry associated with a key that is lowest among those
                                        keys that are greater than the specified key. It an entry associated
                                        with the key passed an argument is present in the map, it returns
                                        the entry associated with that key.
                + floorKey(key k) - Returns the greatest key among those keys that are less than the specified
                                    key. If the key passed as an argument is present, it returns that key.
                + floorEntry(key k) - Returns an entry associated with a key that is greatest among those keys
                                      that are less than the specified key. If the key passed as argument is
                                      present, it returns that key.

        3) pollFirstEntry() and pollLastEntry() Methods
                + pollFirstEntry() - returns and removes the entry associated with the first key of the map
                + pollLastEntry() - returns and removes the entry associated with the last key of the map

        4) headMap(), tailMap() and subMap() Methods
                + headMap(key, booleanValue) - returns all the key/value pairs of a treemap before the specified
                                               key (which is passed as an argument).

                                               If true is passed as a booleanValue, the method also includes the
                                               key/value pair of the key which is passed as an argument.

                + tailMap(key, booleanValue) - returns all the key/value pairs of a treemap starting from the
                                               specified key (which is passed as an argument).

                + subMap(k1, bV1, k2, bV2) - returns all the entries associated with keys between k1 and k2
                                             including the entry of k1.

        Other Methods of TreeMap:
        ------------------------
        1) clear(): removes all mappings from the TreeMap
        2) clone(): makes the copy of the TreeMap
        3) containsKey(): checks if the specified key is present in TreeMap
        4) containsValue(): checks if TreeMap contains the specified value
        5) size(): returns the number of items in TreeMap

    */
}
