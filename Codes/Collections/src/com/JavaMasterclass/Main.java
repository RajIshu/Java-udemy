package com.JavaMasterclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        View this link to understand Java Collection Hierarchy: https://static.javatpoint.com/images/java-collection-hierarchy.png

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

        2.
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
        languages.removeAll(languages);
        System.out.println("Removed Element: " + str);

        System.out.println("Updated LinkedList: " + languages);

    }
}
