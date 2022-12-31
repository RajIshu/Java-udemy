package com.JavaMasterclass;

public interface Queue_Interface {
    /*
        QUEUE Interface:
        ---------------
        The Queue interface of the Java collections framework provides the functionality of the queue data structure.

        It extends the Collection interface.


        Working of Queue Data Structure:
        -------------------------------
        It follows FIFO manner for storing and accessing of elements.
        FIFO means First In, First Out.

        In FIFO, elements are added from the behind and removed from the front.

                             _______ _______ _______ _______ _______
            Deletion        |       |       |       |       |       |
            Of Elements <-- |       |       |       |       |       |  <-- Addition
                             ------- ------- ------- ------- -------       of Elements
                                ↓                               ↓
                                ↓                               ↓
                              Front                           Behind
                                                                Or
                                                               Rear


        How to use Queue?
        ----------------
        In Java, we must import java.util.Queue package in order to use Queue.

        Example:
            // LinkedList implementation of Queue
            Queue<String> animal1 = new LinkedList<>();

            // Array implementation of Queue
            Queue<String> animal2 = new ArrayDeque<>();

            // Priority Queue implementation of Queue
            Queue<String> animal 3 = new PriorityQueue<>();


        Classes that Implement Queue:
        ----------------------------
                                        QUEUE
                                          ⬆
                               implements ⬆
                                          ⬆
                           ➡ ➡ ➡ ➡ ➡ ➡ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅
                          ⬆               ⬆                 ⬆
                          ⬆               ⬆                 ⬆
                      ArrayDeque      LinkedList      PriorityQueue


        Since the Queue is an interface, we cannot provide the direct implementation of it.

        In order to use the functionalities of Queue, we need to use classes that implement it:
        a) ArrayDeque
           - In Java, we can use the ArrayDeque class to implement queue and deque data structures using arrays.
           - To learn more about ArrayDeque, open ArrayDeque Class in this project.

        b) LinkedList

        c) PriorityQueue
           - The PriorityQueue class provides the functionality of the heap data structure.
           - To learn more about PriorityQueue, open PriorityQueue Class in this project.


       Interfaces that extend Queue:
       ----------------------------
                                QUEUE
                                  ⬆
                          extends ⬆
                                  ⬆
                   ➡ ➡ ➡ ➡ ➡ ➡ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅
                  ⬆               ⬆                 ⬆
                  ⬆               ⬆                 ⬆
                Deque        BlockingQueue    BlockingDeque

        a) Deque:
           - The Deque interface of the Java collections framework provides the functionality of a double-ended queue.
           - To learn more about Deque, open Deque Class in this Project.


        Methods of Queue:
        ----------------
        1) add() - Inserts the specified element into the queue. If the task is successful,
                   add() returns true, if not it throws an exception.
        2) offer() - Inserts the specified element into the queue. If the task is successful,
                     offer() returns true, if not it returns false.
        3) element() - Returns the head of the queue. Throws an exception if the queue is empty.
        4) peek() - Returns the head of the queue. Returns null if the queue is empty.
        5) remove() - Returns and removes the head of the queue. Throws an exception if the
                      queue is empty.
        6) poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
    */
}
