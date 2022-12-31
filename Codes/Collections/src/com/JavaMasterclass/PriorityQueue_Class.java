package com.JavaMasterclass;

public class PriorityQueue_Class {
    /*
        PriorityQueue:
        -------------
        The PriorityQueue class provides the functionality of the heap data structure.

        Unlike normal queues, priority queue elements are retrieved in sorted order.

        It is important to note that the elements of a priority queue may not be sorted.
        However, elements are always retrieved in sorted order.

        Note: By default, the head of the PriorityQueue is always the smallest in the queue
              and rest elements are stored as per their insertion order.


        Creating PriorityQueue:
        ----------------------
        In order to create a priority queue, we must import the java.util.PriorityQueue package.

        Example:
            PriorityQueue<Integer> numbers = new PriorityQueue<>();

            Here, we have created a priority queue without any arguments.
            In this case, the head of the priority queue is the smallest element of the queue.
            And elements are removed in ascending order from the queue.

            However, we can customize the ordering of elements with the help of the Comparator interface.


        Methods of PriorityQueue:
        ------------------------
        1) Insert Elements to PriorityQueue:
            + add() - Inserts the specified element to the queue. If the queue is full, it throws an exception.
            + offer() - Inserts the specified element to the queue. If the queue is full, it returns false.

        2) Access PriorityQueue Elements:
            + peek() - returns the head of the queue.

        3) Remove PriorityQueue Elements:
            + remove() - removes the specified element from the queue
            + poll() - returns and removes the head of the queue

        4) Iterating Over a PriorityQueue:
            + iterator()

        Other PriorityQueue Methods:
        ---------------------------
        1) contains(element) - Searches the priority queue for the specified element. If the element is found,
                               it returns true, if not it returns false.
        2) size() - Returns the length of the priority queue.
        3) toArray() - Converts a priority queue to an array and returns it.
    */
}
