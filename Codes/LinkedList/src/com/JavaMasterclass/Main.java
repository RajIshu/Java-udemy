package com.JavaMasterclass;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    /*
        LinkedList:
        ----------

        LinkedList is a linear data structure where the elements are not stored in contiguous
        locations and every element is a separate object with a data part and address part.
        The elements are linked using pointers and addresses.

        Each element is known as a node.

        Due to the dynamicity and ease of insertions and deletions, they are preferred over
        the arrays.
            --> Dynamicity: LinkedList acts as a dynamic array.
                            We do not have to specify the size while creating it, the size of
                            the list automatically increases when we dynamically add and remove
                            items.

        It also has a few disadvantages like the nodes cannot be accessed directly instead we
        need to start from the head and follow through the link to reach a node we wish to access.


        Difference between ArrayList and LinkedList:
        -------------------------------------------
        1) ArrayList: The memory location for the elements of an ArrayList is contiguous.
           LinkedList: The location for the elements of a linked list is not contagious.

        2) ArrayList: ArrayList is better for storing and accessing data.
           LinkedList: LinkedList is better for manipulating data.

        3) ArrayList: An ArrayList class can act as a list only because it implements List only.
           LinkedList: LinkedList class can act as a list and queue both because it implements List and Deque
                       interfaces.

        4) ArrayList: Manipulation with ArrayList is slow because it internally uses an array.
                      If any element is removed from the array, the list is traversed and all the other elements are
                      shifted in memory.
           LinkedList: Manipulation with LinkedList is faster because in LinkedList and DoubleLinkedList there is
                       no concept of shifting the memory bits. The list is traversed and the reference link is changed.


        Hierarchy of LinkedList Class:
        -----------------------------
        Linked List is a part of the Collection framework present in java.util package.

        LinkedList inherits or extends 'AbstractSequentialList' which implements 'List' and 'List'
        extends or inherits 'Collection' and 'Collection' extends or inherits 'Iterable'.

        Also, LinkedList implements 'Deque' which extends 'Queue' and 'Queue'
        extends or inherits 'Collection' and 'Collection' extends or inherits 'Iterable'.


        DoubleLinkedList:
        ----------------
        A Doubly Linked List (DLL) contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.

        A DLL can be traversed in both forward and backward directions.

        A DLL can be implemented using ListIterator.
        
    */

        LinkedList<String> placesToVisit = new LinkedList<>();

//        placesToVisit.add("Kerala");
//        placesToVisit.add("Lakshadweep");
//        placesToVisit.add("Gujarat");
//        placesToVisit.add("Mumbai");
//        placesToVisit.add("Leh");
//        placesToVisit.add("Visakhapatnam");
//        placesToVisit.add("Goa");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Munnar");
//
//        printList(placesToVisit);
//
//        placesToVisit.remove(0);
//        printList(placesToVisit);

        addInOrder(placesToVisit,"Kerala");
        addInOrder(placesToVisit,"Lakshadweep");
        addInOrder(placesToVisit,"Gujarat");
        addInOrder(placesToVisit,"Mumbai");
        addInOrder(placesToVisit,"Leh");
        addInOrder(placesToVisit,"Visakhapatnam");
        addInOrder(placesToVisit,"Goa");

        printList(placesToVisit);

        addInOrder(placesToVisit,"Gujarat");
        addInOrder(placesToVisit,"Hyderabad");

        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> placesToVisit){
    /*
        Iterator:
        --------
        An Iterator is an object that can be used to loop through collections, like LinkedList,
        ArrayList and HashSet.

        ‘Iterator’ is an interface which belongs to collection framework.

        Iterator allows us to traverse the collection, access the data element and remove the data
        elements of the collection.

        Iterator contains three methods:
            1. boolean hasNext(): It returns true if Iterator has more element to iterate.
            2. Object next(): It returns the next element in the collection until the hasNext()method
                              return true.
                              This method throws ‘NoSuchElementException’ if there is no next element.
            3. void remove(): It removes the current element in the collection.
                              This method throws ‘IllegalStateException’ if this function is called
                              before next() is invoked.
    */
        Iterator<String> i = placesToVisit.iterator();
        // iterator() : It returns the Iterator instance for 'placesToVisit' Collection.

//        System.out.println(i);
//        System.out.println(i.next());
//        System.out.println("=========================================");
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
            // next() : It returns the next element (i.e., current element) and then moves the pointer to
            // next element.
//            System.out.println("Now visiting " + i);

        }
        System.out.println("----------------------------------------");
    }


    /*
        Iterator vs ListIterator:
        ------------------------
        - In Iterator, iteration can be done in the forward direction only.

          In ListIterator, iteration can be done in both forward and backward directions.

        - Methods in Iterator: ‘next()’, ‘remove()’, ‘hasNext()’.
          Methods in ListIterator: ‘nextIndex()’, ‘previousIndex()’, ‘previous()’, ‘next()’, 'remove()'.

        - Iterator can traverse Map, List and Set.
          ListIterator can only traverse List.

        - Iterator cannot modify or replace elements present in Collection.
          ListIterator can modify or replace elements present in Collection.

        - Iterator cannot add elements and it throws ConcurrentModificationException.
          ListIterator can easily add elements to a collection at any time.
    */

    private static boolean addInOrder(LinkedList<String> places, String newCity){
        ListIterator<String> stringListIterator = places.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0){
                // Both are same
                System.out.println("The " + newCity + " city is already in the list");
                return false;
            }
            else if(comparison > 0){
                // newCity should be inserted before current city
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison < 0){
                // move to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    // DoubleLinkedList Method
    private static void visit(LinkedList cities){
        Scanner sc = new Scanner(System.in);

        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
        }
        else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){ // This is used so program doesn't print cities two times
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else{
                        System.out.println("Reached the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

}
