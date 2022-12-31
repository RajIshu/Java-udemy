package com.JavaMasterclass;

public class ArrayDeque_Class {
    /*
        ArrayDeque:
        ----------
        In Java, we can use the ArrayDeque class to implement queue and deque data structures using arrays.

        It implements Queue and Deque Interfaces.


        Creating ArrayDeque:
        -------------------
        In order to create an array deque, we must import the java.util.ArrayDeque package.

        Syntax:
            ArrayDeque<Type> animal = new ArrayDeque<>();

        Example:
            // Creating String type ArrayDeque
            ArrayDeque<String> animals = new ArrayDeque<>();

            // Creating Integer type ArrayDeque
            ArrayDeque<Integer> age = new ArrayDeque<>();


       Methods of ArrayDeque:
       ---------------------
       1) Insert Elements to Deque:
            + add() - inserts the specified element at the end of the array deque
            + addFirst() - inserts the specified element at the beginning of the array deque
            + addLast() - inserts the specified at the end of the array deque (equivalent to add())

            + offer() - inserts the specified element at the end of the array deque
            + offerFirst() - inserts the specified element at the beginning of the array deque
            + offerLast() - inserts the specified element at the end of the array deque

            Note: If the array deque is full
                     --> the add() method will throw an exception
                     --> the offer() method returns false

       2) Access ArrayDeque Elements:
            + getFirst() - returns the first element of the array deque
            + getLast() - returns the last element of the array deque

            + peek() - returns the first element of the array deque
            + peekFirst() - returns the first element of the array deque (equivalent to peek())
            + peekLast() - returns the last element of the array deque

       3) Remove ArrayDeque Elements:
            + remove() - returns and removes an element from the first element of the array deque
            + remove(element) - returns and removes the specified element from the head of the array deque
            + removeFirst() - returns and removes the first element from the array deque (equivalent to remove())
            + removeLast() - returns and removes the last element from the array deque

            + poll() - returns and removes the first element of the array deque
            + pollFirst() - returns and removes the first element of the array deque (equivalent to poll())
            + pollLast() - returns and removes the last element of the array deque

            + clear() - To remove all the elements from the array deque

       4) Iterating the ArrayDeque:
            + iterator() - returns an iterator that can be used to iterate over the array deque
            + descendingIterator() - returns an iterator that can be used to iterate over the array deque in
                                     reverse order


       Other Methods of ArrayDeque:
       ---------------------------
       1) element() - Returns an element from the head of the array deque.
       2) contains(element) - Searches the array deque for the specified element.
				              If the element is found, it returns true, if not it returns false.

       3) size() - Returns the length of the array deque.
       4) toArray() - Converts array deque to array and returns it.
       5) clone() - Creates a copy of the array deque and returns it.


       ArrayDeque VS LinkedList:
       ------------------------
       1) LinkedList supports null elements, whereas ArrayDeque doesn't.

       2) Each node in a linked list includes links to other nodes. That's why LinkedList requires
          more storage than ArrayDeque.

       3) If you are implementing the queue or the deque data structure, an ArrayDeque is likely
          faster than a LinkedList.
    */
}
