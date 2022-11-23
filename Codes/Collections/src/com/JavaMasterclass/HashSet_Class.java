package com.JavaMasterclass;

public class HashSet_Class {
    /*
        HashSet Class:
        -------------
        - The HashSet class of the Java Collections framework provides the functionalities of the hash
          table data structure.

        - It implements the Set interface.

                        COLLECTION
                            ⬆
                            ⬆  extends
                            ⬆
                           SET
                            ⬆
                            ⬆  implements
                            ⬆
                         HashSet

        - Creating a HashSet:
          ------------------
          In order to create a hash set, we must import the java.util.HashSet package first.

          Example:
                // HashSet with 8 capacity and 0.75 load factor
                HashSet<Integer> numbers = new HashSet<>(8, 0.75);

                Here,
                    -> capacity - The capacity of this hash set is 8. Meaning, it can store 8 elements.
                    -> loadFactor (optional) - The load factor of this hash set is 0.6. This means, whenever our
                                               hash set is filled by 60%, the elements are moved to a new hash table
                                               of double the size of the original hash table.

          Default capacity and load factor:
          --------------------------------
          Example:
                // HashSet with default capacity and load factor
                HashSet<Integer> numbers1 = new HashSet<>();

                By default,
                    the capacity of the hash set will be 16
                    the load factor will be 0.75


      - Methods of HashSet:
        ------------------
        1) Insert Elements to HashSet:
           --------------------------
            + add() - inserts the specified element to the set
            + addAll() - inserts all the elements of the specified collection to the set

                    Example:
                        HashSet<Integer> evenNumber = new HashSet<>();

                        // Using add() method
                        evenNumber.add(2);
                        evenNumber.add(4);
                        evenNumber.add(6);

                        HashSet<Integer> numbers = new HashSet<>();

                        // Using addAll() method
                        numbers.addAll(evenNumber);
                        numbers.add(5);

        2) Access HashSet Elements:
           -----------------------
            + To access the elements of a hash set, we can use the iterator() method.
              In order to use this method, we must import the java.util.Iterator package.

              Example:
                    HashSet<Integer> numbers = new HashSet<>();
                    numbers.add(2);
                    numbers.add(5);
                    numbers.add(6);

                    // Calling iterator() method
                    Iterator<Integer> iterate = numbers.iterator();

                    // Accessing elements
                    while(iterate.hasNext()) {
                        System.out.print(iterate.next());
                    }

        3) Remove HashSet Elements:
           -----------------------
            + remove() - removes the specified element from the set
            + removeAll() - removes all the elements from the set


        - Set Operations:
          --------------
          a) Union of Sets:
             -------------
             To perform the union between two sets, we can use the addAll() method.

             Example:
                HashSet<Integer> evenNumbers = new HashSet<>();
                evenNumbers.add(2);
                evenNumbers.add(4);

                HashSet<Integer> numbers = new HashSet<>();
                numbers.add(1);
                numbers.add(3);

                // Union of two set
                numbers.addAll(evenNumbers);

          b) Intersection of Sets:
             --------------------
             To perform the intersection between two sets, we can use the retainAll() method.

             Example:
                HashSet<Integer> primeNumbers = new HashSet<>();
                primeNumbers.add(2);
                primeNumbers.add(3);

                HashSet<Integer> evenNumbers = new HashSet<>();
                evenNumbers.add(2);
                evenNumbers.add(4);

                // Intersection of two sets
                evenNumbers.retainAll(primeNumbers);

          c) Difference of Sets:
             ------------------
             To calculate the difference between the two sets, we can use the removeAll() method.

             Example:
                HashSet<Integer> primeNumbers = new HashSet<>();
                primeNumbers.add(2);
                primeNumbers.add(3);
                primeNumbers.add(5);

                HashSet<Integer> oddNumbers = new HashSet<>();
                oddNumbers.add(1);
                oddNumbers.add(3);
                oddNumbers.add(5);

                // Difference between HashSet1 and HashSet2
                primeNumbers.removeAll(oddNumbers);

          d) To check Subset:
             ---------------
             To check if a set is a subset of another set or not, we can use the containsAll() method.

             Example:
                HashSet<Integer> numbers = new HashSet<>();
                numbers.add(1);
                numbers.add(2);
                numbers.add(3);
                numbers.add(4);

                HashSet<Integer> primeNumbers = new HashSet<>();
                primeNumbers.add(2);
                primeNumbers.add(3);

                // Check if primeNumbers is a subset of numbers
                boolean result = numbers.containsAll(primeNumbers);

         - Other Methods Of HashSet:
           ------------------------
            a) clone()      :	Creates a copy of the HashSet
            b) contains()   :	Searches the HashSet for the specified element and returns a boolean result
            c) isEmpty()    :	Checks if the HashSet is empty
            d) size()       :	Returns the size of the HashSet
            e) clear()      :	Removes all the elements from the HashSet

         - Why HashSet?
           -----------
            In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a
            hash table are accessed using hash codes.

            The hashcode of an element is a unique identity that helps to identify the element in a hash table.

            HashSet cannot contain duplicate elements. Hence, each hash set element has a unique hashcode.
    */
}
