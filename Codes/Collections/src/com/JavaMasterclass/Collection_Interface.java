package com.JavaMasterclass;

public interface Collection_Interface {
    /*
        COLLECTION Interface:
        --------------------
        The Collection interface is the root interface of the Java collections framework.

        There is no direct implementation of this interface. However, it is implemented through
        its sub-interfaces like List, Set, and Queue.

        Sub-interfaces of Collection:
        ----------------------------
        1. List Interface:
           --------------
           - The List interface is an ordered collection that allows us to add and remove elements
             like an array.
           - To learn about List more, open List Interface in this project.

        2. Set Interface:
           -------------
           - The Set interface allows us to store elements in different sets similar to the set in mathematics.
           - It cannot have duplicate elements.
           - To learn about List more, open Set Interface in this project.

        3. Queue Interface:
           ---------------
           - The Queue interface is used when we want to store and access elements in First In, First Out(FIFO)
             manner.


         Methods of Collection List:
         --------------------------
         1) shuffle(List): It is used to randomly reorders the specified list elements using a default randomness.
         2) sort(List, Comparator): It is used to sort the elements presents in the specified list of collection
                                    in ascending order.
         3) swap(List, index1, index2): It is used to swap the elements at the specified positions in the specified
                                        list.
         4) reverse(List): It is used to reverse the order of the elements in the specified list.
         5) replaceAll(List, oldValue, newValue): It is used to replace all occurrences of one specified value in
                                                  a list with the other specified value.
         6) max(List): It is used to get the maximum value of the given collection.
         7) min(List): It is used to get the minimum value of the given collection.
         8) frequency(List, Object): It is used to get the number of elements in the specified collection equal
                                     to the specified object.
         9) copy(destList, srcList): It is used to copy all the elements from one list into another list.
         10) addAll(List, element1, element2, element3, .....): It is used to add all the specified elements to
                                                                the specified collection.

    */
}
