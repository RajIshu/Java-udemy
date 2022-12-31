package com.JavaMasterclass;

public interface Deque_Interface {
    /*
        Deque:
        -----
        The Deque interface of the Java collections framework provides the functionality of a double-ended queue.

        It extends the Queue interface.


        Working of Deque:
        ----------------
        In a regular queue, elements are added from the rear and removed from the front. However, in a deque,
        we can insert and remove elements from both front and rear.

                                     _______ _______ _______ _______ _______
           Addition of Elements --> |       |       |       |       |       | <-- Addition of Elements
           Deletion Of Elements <-- |       |       |       |       |       | --> Deletion of Elements
                                     ------- ------- ------- ------- -------
                                        ↓                               ↓
                                        ↓                               ↓
                                      Front                           Behind
                                                                        Or
                                                                       Rear
       Classes that implement Deque:
       ----------------------------
       1) ArrayDeque
       2) LinkedList


       How to use Deque?
       ----------------
       In Java, we must import the java.util.Deque package to use Deque.

       Example:
            // Array implementation of Deque
            Deque<String> animal1 = new ArrayDeque<>();

            // LinkedList implementation of Deque
            Deque<String> animal2 = new LinkedList<>();


       Methods of Deque:
       ----------------
       1) addFirst() - Adds the specified element at the beginning of the deque. Throws an exception if the
                       deque is full.
       2) addLast() - Adds the specified element at the end of the deque. Throws an exception if the deque is full.
       3) offerFirst() - Adds the specified element at the beginning of the deque. Returns false if the deque is full.
       4) offerLast() - Adds the specified element at the end of the deque. Returns false if the deque is full.
       5) getFirst() - Returns the first element of the deque. Throws an exception if the deque is empty.
       6) getLast() - Returns the last element of the deque. Throws an exception if the deque is empty.
       7) peekFirst() - Returns the first element of the deque. Returns null if the deque is empty.
       8) peekLast() - Returns the last element of the deque. Returns null if the deque is empty.
       9) removeFirst() - Returns and removes the first element of the deque. Throws an exception if the deque is empty.
       10) removeLast() - Returns and removes the last element of the deque. Throws an exception if the deque is empty.
       11) pollFirst() - Returns and removes the first element of the deque. Returns null if the deque is empty.
       12) pollLast() - Returns and removes the last element of the deque. Returns null if the deque is empty.

    */
}
