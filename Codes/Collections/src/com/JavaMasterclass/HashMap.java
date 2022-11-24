package com.JavaMasterclass;

public class HashMap {
    /*
        HashMap:
        -------
        - The HashMap class of the Java collections framework provides the functionality of the hash table data structure.

        - It stores elements in key/value pairs. Here, keys are unique identifiers used to associate each value on a map.

        - The HashMap class implements the Map interface.

                                    MAP
                                     ⬆
                                     ⬆ implements
                                     ⬆
                                  HashMap

        Create a HashMap:
        ----------------
        - In order to create a hash map, we must import the java.util.HashMap package first.

        - Syntax:
                // hashMap creation with 8 capacity and 0.6 load factor
                HashMap<K, V> numbers = new HashMap<>();

                Here, K represents the key type and V represents the type of values.

        - Example:
                HashMap<String, Integer> numbers = new HashMap<>();

                Here, the type of keys is String and the type of values is Integer.


        Basic Operations on Java HashMap:
        --------------------------------
        1) Add elements to a HashMap:
                + put(K key, V value): To add a single element to the hashmap.

                ● Return Value:
                         -> if key is already associated with any value, returns the previously associated value
                         -> if key is not associated with any value, returns null

                         NOTE:  If key is previously associated with a null value, then also the method returns null.

                ● Example:
                        // create an HashMap
                        HashMap<String, Integer> languages = new HashMap<>();

                        // insert items to the HashMap
                        languages.put("Java", 14);

                        Here,
                            "Java" is a Key
                            14 is the Value

        

    */
}
