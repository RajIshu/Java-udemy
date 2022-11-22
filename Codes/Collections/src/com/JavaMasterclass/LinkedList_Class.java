package com.JavaMasterclass;

public class LinkedList_Class {
    /*
        LinkedList:
        ----------
        The LinkedList class of the Java collections framework provides the functionality of the
        linked list data structure (doubly linkedlist).

        Java Doubly Linkelist:
                         _________________________________________
                 _______|   Prev   |        DATA        |   Next  |_______
                |       |__________|____________________|_________|       |
                |                                                         |
                |                                                         |
                ╲╱                                                        |
           link to the                                                    ╲╱
         Previous Element                                            link to the
                                                                     Next Element

        Here,
            Each element in a linked list is known as a node. It consists of 3 fields:
                Prev - stores an address of the previous element in the list. It is null for the
                       first element
                Next - stores an address of the next element in the list. It is null for the last
                       element
                Data - stores the actual data


        Java ArrayList Implementation Diagram:
        -------------------------------------

                                             COLLECTION
                                                  ⬆
                                                  ⬆ extends
                                                  ⬆
                              → → → → → → → → → → → ← ← ← ← ← ← ← ← ← QUEUE
                            ⬆                                           ⬆
                            ⬆                                           ⬆ extends
                            ⬆                                           ⬆
                          LIST                                        DEQUE
                            ⬆                                           ⬆
                            ⬆  implements                               ⬆ implements
                            ⬆                                           ⬆
                             ← ← ← ← ← ← ← ← LinkedList → → → → → → → →


        Creating a LinkedList:
        ---------------------
        Before using LinkedList, we need to import the java.util.LinkedList package first.

        Example:
            // create Integer type linked list
            LinkedList<Integer> linkedList = new LinkedList<>();

            // create String type linked list
            LinkedList<String> linkedList = new LinkedList<>();


       NOTE: Learn about Iterator interface first before moving further with LinkedList.

       Basic Operations on ArrayList:
       -----------------------------
       1) Add elements
          ------------
          - Methods:
                + add(E element)
                + add(int index, E element)
                    -> index - index at which the element is inserted
                    -> element - element to be inserted

                    NOTE: If the index parameter is not passed the element is appended
                          at the end of the arraylist.

                    ● Return Value:
                         -> returns 'true' if the element is successfully inserted

                + addAll(int index, Collection c)
                    -> index - index at which all elements of a collection is inserted
                    -> collection - collection that contains elements to be inserted

                    NOTE: If the index parameter is not passed the collection is appended
                          at the end of the arraylist.

                    ● Return Value:
                         -> returns 'true' if the elements are successfully inserted

          Using listIterator() method:
          ---------------------------
              ArrayList<String> languages = new ArrayList<>();

              // Creating an object of ListIterator
              ListIterator<String> listIterate = languages.listIterator();
              listIterate.add("Java");
              listIterate.add("Python");


       2) Access elements
          ---------------
          - Methods:
                + get(int index)
                    -> index - position of the element to be accessed

                    ● Return Value:
                         -> returns the element present in the specified position.

          Using iterator() method:
          -----------------------
              LinkedList<String> animals= new LinkedList<>();

              // Add elements in LinkedList
              animals.add("Dog");
              animals.add("Horse");
              animals.add("Cat");

              // Creating an object of Iterator
              Iterator<String> iterate = animals.iterator();

              while(iterate.hasNext()) {
                System.out.print(iterate.next());
              }

          Using listIterator() method:
          ---------------------------
              LinkedList<String> animals= new LinkedList<>();

              // Add elements in LinkedList
              animals.add("Dog");
              animals.add("Horse");
              animals.add("Cat");

              // Create an object of ListIterator
              ListIterator<String> listIterate = animals.listIterator();

              while(listIterate.hasNext()) {
                  System.out.print(listIterate.next());
              }

              // Iterate backward
              System.out.print("\nReverse LinkedList: ");

              while(listIterate.hasPrevious()) {
                  System.out.print(listIterate.previous());
              }

          Note: The listIterator() method is more preferred than iterator(). This is because it allows
               you to iterate backward as well.


       3) Change elements
          ---------------
          - set() method replaces the element present in a specified position with the
            specified element in an arraylist.
          - Methods:
                + set(int index, E element)
                    -> index - position of the element to be replaced
                    -> element - new element that is to be stored at index

                    ● Return Value:
                         -> returns the element previously present at index


       4) Remove elements
          ---------------
          Methods:
                + remove(Object obj)
                    -> obj - element that is to be removed from the arraylist
                + remove(int index)
                    -> index - position from where element is to be removed

                    NOTE: If the same element obj is present in multiple location,
                          then the element that appear first in the arraylist is removed.

                    ● Return Value:
                         -> returns true if specified element is present in the arraylist
                         -> returns the removed element if index is passed as parameter

         We can also remove all the elements from the arraylist at once. To learn more, visit

                + removeAll(Collection c) : It removes all the elements from the arraylist
                                               that are also present in the specified collection.
                    -> collection - all elements present in collection are deleted from the arraylist.

                    ● Return Value:
                         -> returns true if elements are deleted from the arraylist

                    ● Example:
                        Before:
                            language1 = [java, c, cpp, python, MATLAB]
                            language2 = [c, cpp]

                        Code Execution:
                            language1.removeAll(language2)

                        After:
                            language1 = [java, python, MATLAB]
                            language2 = [c, cpp]


                + clear()
                    -> The clear() method does not take any parameters.

                    ● Return Value:
                         -> The clear() method does not return any value.

                NOTE: clear() is faster and efficient compared to removeAll().

    */
}
