package com.JavaMasterclass;

public class HashMap_Class {
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

                Note: Every item is inserted in random positions in the HashMap.

                + putAll(Map m): It inserts all the key/value mappings from the specified Map to the HashMap.
                        -> map - map that contains mappings to be inserted into the hashmap

                    ● Return Value: Doesn't return any value

                    ● Example:
                            // create an HashMap
                            HashMap<String, Integer> primeNumbers = new HashMap<>();

                            // add mappings to HashMap
                            primeNumbers.put("Two", 2);
                            primeNumbers.put("Three", 3);

                            // create another HashMap
                            HashMap<String, Integer> numbers = new HashMap<>();
                            numbers.put("One", 1);
                            numbers.put("Two", 22);

                            // Add all mappings from primeNumbers to numbers
                            numbers.putAll(primeNumbers);

                            Notice, in above code for a single key "Two" we have two values 2 and 22.
                            So, when we try putAll method the value of 'numbers' HashMap is replaced by
                            value of 'primeNumbers' HashMap.

                + putIfAbsent(K key, V value): It inserts the specified key/value mapping to the hashmap if the
                                               specified key is already not present in the hashmap.

                    ● Return Value:
                            -> returns the value associated with the key, if the specified key is already present
                               in the hashmap
                            -> returns null, if the specified key is not present in the hashmap

                            NOTE: If the specified key is previously associated with a null value, then also the
                                  method returns null.

        2) Access HashMap Elements:
                + get(Object key): It returns the value corresponding to the specified key in the hashmap.

                    ● Return Value:
                             -> returns the value to which the specified key is associated
                             -> returns null, if either the specified key is mapped to a null value or the key is
                                not present on the hashmap.

                    ● Example:
                            // create an HashMap
                            HashMap<Integer, String> numbers = new HashMap<>();
                            numbers.put(1, "Java");
                            numbers.put(2, "Python");
                            numbers.put(3, "JavaScript");

                            // get the value with key 1
                            String value = numbers.get(1);

                            System.out.println("HashMap Value with Key 1: " + value);

                Note: We can use the HashMap containsKey() method to check if a particular key is present
                      in the hashmap.

                + getOrDefault(Object key, V defaultValue): It returns the specified default value if the mapping for
                                                            the specified key is not found in the hashmap.
                                                            Otherwise, the method returns the value corresponding to
                                                            the specified key.
                            -> key - key whose mapped value is to be returned
                            -> defaultValue - value which is returned if the mapping for the specified key is not found

                    ● Return Value:
                             -> returns the value to which the specified key is associated
                             -> returns the specified defaultValue if the mapping for specified key is not found

                + keySet(): returns a set view of all the keys present in entries of the hashmap.

                + values(): returns a view of all the values present in entries of the hashmap.

                + entrySet(): returns a set view of all the mappings (entries) present in the hashmap.

        3) Change HashMap Value:
                + replace(K key, V oldValue, V newValue)
                            -> key - key whose mapping is to be replaced
                            -> oldValue (optional)- value to be replaced in the mapping
                            -> newValue - oldValue is replaced with this value

                    ● Return Value:
                            -> the previous value associated with the specified key, if the optional parameter
                               oldValue is not present
                            -> true, if the optional parameter oldValue is present
                            -> returns null, if either the specified key is mapped to a null value or the key
                               is not present on the hashmap.

                + replaceAll(Bifunction<K, V> function)
                            -> function - operations to be applied to each entry of the hashmap

                    ● Example:
                            // create an HashMap
                            HashMap<Integer, String> languages = new HashMap<>();

                            // Change all value to uppercase
                            languages.replaceAll((key, value) -> value.toUpperCase()); // lambda expression inside

                            // replace all value with the square of key
                            numbers.replaceAll((key, value) -> key * key); // lambda expression inside

        4) Remove HashMap Elements:
                + 
    */
}
