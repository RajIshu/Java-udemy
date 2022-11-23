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
                        ⬆                        ⬆
             implements ⬆                        ⬆ implements
                        ⬆                        ⬆
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
                    + To learn more about HashSet, go to TreeSet Class

    */
}
