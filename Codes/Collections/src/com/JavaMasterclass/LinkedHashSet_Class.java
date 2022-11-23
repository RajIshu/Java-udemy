package com.JavaMasterclass;

public class LinkedHashSet_Class {
    /*
        LinkedHashSet:
        -------------
        - The LinkedHashSet class of the Java collections framework provides
          functionalities of both the hashtable and the linked list data structure.

        - It implements the Set interface.

                        COLLECTION
                            ⬆
                            ⬆  extends
                            ⬆
                           SET
                            ⬆
                            ⬆  implements
                            ⬆
                      LinkedHashSet

        - Elements of LinkedHashSet are stored in hash tables similar to HashSet.

          However, linked hash sets maintain a doubly-linked list internally for all
          of its elements. The linked list defines the order in which elements are
          inserted in hash tables.

        Create a LinkedHashSet:
        ----------------------
        - In order to create a linked hash set, we must import the java.util.LinkedHashSet package first.
        - Example:
                // LinkedHashSet with 8 capacity and 0.75 load factor
                LinkedHashSet<Integer> numbers = new LinkedHashSet<>(8, 0.75);

                Here,
                    -> capacity - The capacity of this hash set is 8. Meaning, it can store 8 elements.
                    -> loadFactor - The load factor of this hash set is 0.6. This means, whenever our hash
                                    table is filled by 60%, the elements are moved to a new hash table of
                                    double the size of the original hash table.

                Default capacity and load factor:
                --------------------------------
                Example:
                      // HashSet with default capacity and load factor
                      HashSet<Integer> numbers1 = new HashSet<>();

                      By default,
                          the capacity of the hash set will be 16
                          the load factor will be 0.75

        Creating LinkedHashSet from Other Collections:
        ---------------------------------------------
        Example:
            // Creating an arrayList of even numbers
            ArrayList<Integer> evenNumbers = new ArrayList<>();
            evenNumbers.add(2);
            evenNumbers.add(4);

            // Creating a LinkedHashSet from an ArrayList
            LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);


        Methods of LinkedHashSet:
        ------------------------
        1) Insert Elements to LinkedHashSet:
               + add() - inserts the specified element to the linked hash set
               + addAll() - inserts all the elements of the specified collection to the linked hash set

        2) Access LinkedHashSet Elements:
           To access the elements of a linked hash set, we can use the iterator() method. In order to
           use this method, we must import the java.util.Iterator package.

           Example:
                LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

                // Calling the iterator() method
                Iterator<Integer> iterate = numbers.iterator();

                // Accessing elements
                while(iterate.hasNext()) {
                    System.out.print(iterate.next());
                }

        3) Remove Elements from HashSet:
                + remove() - removes the specified element from the linked hash set
                + removeAll() - removes all the elements from the linked hash set


        LinkedHashSet Set Operations:
        ----------------------------
        1) Union of Sets:
           -------------
           Two perform the union between two sets, we can use the addAll() method.

        2) Intersection of Sets:
           --------------------
           To perform the intersection between two sets, we can use the retainAll() method.

        3) Difference of Sets:
           ------------------
           To calculate the difference between the two sets, we can use the removeAll() method.

        4) To check Subset:
           ---------------
           To check if a set is a subset of another set or not, we can use the containsAll() method.


        Other Methods Of LinkedHashSet:
        ------------------------
            a) clone()      :	Creates a copy of the LinkedHashSet
            b) contains()   :	Searches the LinkedHashSet for the specified element and returns a boolean result
            c) isEmpty()    :	Checks if the LinkedHashSet is empty
            d) size()       :	Returns the size of the LinkedHashSet
            e) clear()      :	Removes all the elements from the LinkedHashSet


        LinkedHashSet Vs. HashSet:
        -------------------------
        a) LinkedHashSet maintains a linked list internally. Due to this, it maintains the insertion
           order of its elements.

        b) The LinkedHashSet class requires more storage than HashSet. This is because LinkedHashSet
           maintains linked lists internally.

        c) The performance of LinkedHashSet is slower than HashSet. It is because of linked lists
           present in LinkedHashSet.


        LinkedHashSet Vs. TreeSet:
        -------------------------
        a) The TreeSet class implements the SortedSet interface. That's why elements in a tree set are
           sorted. However, the LinkedHashSet class only maintains the insertion order of its elements.

        b) A TreeSet is usually slower than a LinkedHashSet. It is because whenever an element is added
           to a TreeSet, it has to perform the sorting operation.

        c) LinkedHashSet allows the insertion of null values. However, we cannot insert a null value to
           TreeSet.
    */
}
