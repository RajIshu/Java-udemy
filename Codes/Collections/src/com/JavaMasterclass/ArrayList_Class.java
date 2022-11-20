package com.JavaMasterclass;


public class ArrayList_Class {
    /*
        ArrayList:
        ---------
        In Java, we use the ArrayList class to implement the functionality of resizable-arrays.

        It implements the List interface of the collections framework.

        Java ArrayList Implementation Diagram:
        -------------------------------------

                        COLLECTION
                            ⬆
                            ⬆  extends
                            ⬆
                          LIST
                            ⬆
                            ⬆  implements
                            ⬆
                        ArrayList


        Java ArrayList Vs Array:
        -----------------------
            a) In Java, we need to declare the size of an array before we can use it. Once the
               size of an array is declared, it's hard to change it.

            b) Unlike arrays, arraylists can automatically adjust their capacity when we add
               or remove elements from them. Hence, arraylists are also known as dynamic arrays.


        Creating an ArrayList:
        ---------------------
        Before using ArrayList, we need to import the java.util.ArrayList package first.

        Example:
            // create Integer type arraylist
            ArrayList<Integer> arrayList = new ArrayList<>();

            // create String type arraylist
            ArrayList<String> arrayList = new ArrayList<>();

            Here, Integer not int because we cannot use primitive types while creating an
            arraylist. Instead, we have to use the corresponding wrapper classes.


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

       2) Access elements
          ---------------
          - Methods:
                + get(int index)
                    -> index - position of the element to be accessed

                    ● Return Value:
                         -> returns the element present in the specified position.

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


        Other methods of ArrayList Class:
        --------------------------------
        1) size(): Returns the length of the arraylist.

        2) sort(Comparator c): Sort the arraylist elements.
                -> comparator - specifies the sort order of the arraylist
                    >> For Ascending Order (Natural Order): sort(Comparator.naturalOrder())
                    >> For Descending Order (Reverse Order): sort(Comparator.reverseOrder())

                    NOTE: Here, these methods used from Comparator Interface.

        3) clone(): Creates a new arraylist with the same element, size, and capacity.
                    It makes the shallow copy of an array list.
           Example:
                // create an arraylist
                ArrayList<Integer> number = new ArrayList<>();

                // create copy of number
                ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();

           ___________________________________________________________________________________________
          | NOTE:                                                                                     |
          |    Shallow copy is a just a set of pointers to the same memory locations. Actually it     |
          |    does not create a real copy so the memory usage is lower.                              |
          |                                                                                           |
          |    In a case of a deep copy, an exact copy of the memory segment is created and pointers  |
          |    are set to new memory locations. So theoretically the memory consumption should be     |
          |    twice in this case.                                                                    |
          |___________________________________________________________________________________________|

        4) contains(Object obj): Searches the arraylist for the specified element and returns a boolean result.
                                                      OR
                       It checks if the specified element is present in the arraylist.
                -> obj - element that is checked if present in the arraylist
                ● Return Value:
                         -> returns true if the specified element is present in the arraylist.
                         -> returns false if the specified element is not present in the arraylist.

        5) ensureCapacity(int minCapacity): Specifies the total element the arraylist can contain.
                                                    OR
                             It sets the size of an arraylist with the specified capacity.
                -> minCapacity - the specified minimum capacity of the arraylist

           QUES. Why do we need to resize arraylist using the ensureCapacity() method if the
                 arraylist can automatically resize itself?
           ANS. It is because if we use the ensureCapacity() to resize the arraylist, then the
                arraylist will be resized at once with the specified capacity. Otherwise, the
                arraylist will be resized every time when an element is added.

        6) isEmpty(): Checks if the arraylist is empty.
                ● Return Value:
                         -> returns true if the arraylist does not contain any elements
                         -> returns false if the arraylist contains some elements

        7) indexOf(Object obj): Searches a specified element in an arraylist and returns the index
                                of the element.
                -> obj - element whose position is to be returned

                NOTE: If the same element obj is present in multiple location, then the position
                      of the element that appears first in the arraylist is returned.

                ● Return Value:
                         -> returns the position of the specified element from the arraylist
                         -> returns '-1', if the specified element doesn't exist in the list

           NOTE:
                lastIndexOf(Object obj): In case of multiple occurrence, it returns the position
                                         of the last occurrence of the specified element.

    */



}
