package com.JavaMasterclass;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    /*
        COLLECTION:
        ----------
        The Collection in Java is a framework that provides an architecture to store and manipulate
        the group of objects.

        Java Collections can achieve all the operations that you perform on a data such as searching,
        sorting, insertion, manipulation, and deletion.

        Java Collection means a single unit of objects.

        Java Collection framework provides many interfaces (Set, List, Queue, Deque) and
        classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet)
        to implement various data structures and algorithms.

        Java COLLECTION Framework Diagram:
        ---------------------------------

                              COLLECTION                              MAP             ITERATOR
                                  ⬆                                    ⬆                  ⬆
                                  ⬆                                    ⬆                  ⬆
                   ➡ ➡ ➡ ➡ ➡ ➡ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅ ⬅               SortedMap        ListIterator
                  ⬆               ⬆                 ⬆
          extends ⬆               ⬆ extends         ⬆ extends
                  ⬆               ⬆                 ⬆
                LIST             SET              QUEUE
                                  ⬆                 ⬆
                                  ⬆ extends         ⬆ extends
                                  ⬆                 ⬆
                              SortedSet           DEQUE

        View this link to understand Java Collection Hierarchy: https://static.javatpoint.com/images/java-collection-hierarchy.png


        COLLECTION Interface:
        --------------------
        The Collection interface is the root interface of the Java collections framework.

        There is no direct implementation of this interface. However, it is implemented through
        its sub-interfaces like List, Set, and Queue.

        Open Collection Interface in this project to learn about it.


        Collections Framework Vs. Collection Interface:
        ----------------------------------------------
        People often get confused between the collections framework and Collection Interface.

        The Collection interface is the root interface of the collections framework. Apart from Collection
        Interface the framework includes other interfaces as well: Map and Iterator.


        MAP Interface:
        -------------
        In Java, the Map interface allows elements to be stored in key/value pairs. Keys are unique names
        that can be used to access a particular element in a map. And, each key has a single value associated
        with it.

        Open Map Interface in this project to learn about it.
    */

        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }


        LinkedList<String> languages = new LinkedList<>();

        // add elements in LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        System.out.println("LinkedList: " + languages);

        // remove elements from index 1
        String str = languages.remove(3);
        int len = languages.size();

        LinkedList<String> lang = (LinkedList<String>) languages.clone();

        languages.removeAll(languages);
        ArrayList<Integer> aint = new ArrayList<>();
        aint.ensureCapacity(3);

        Deque<String> la = new LinkedList<>();
        la.addFirst("Ram");
        la.addLast("Rita");
        la.offer("tina");

        System.out.println("Removed Element: " + str);

        System.out.println("Updated LinkedList: " + languages);

    }
}
