package com.JavaMasterclass;

public interface ListIterator_Interface {
    /*
        ListIterator Interface:
        ----------------------
        The ListIterator interface of the Java collections framework provides the
        functionality to access elements of a list.

        It is bidirectional. This means it allows us to iterate elements of a list in both the direction.

        It extends the Iterator interface.

                                  Iterator
                                     ⬆
                                     ⬆ extends
                                     ⬆
                                ListIterator

        The List interface provides a listIterator() method that returns an instance of the ListIterator interface.


        Methods of ListIterator:
        -----------------------
        1) hasNext() - returns true if there exists an element in the list
        2) next() - returns the next element of the list
        3) nextIndex() returns the index of the element that the next() method will return
        4) previous() - returns the previous element of the list
        5) previousIndex() - returns the index of the element that the previous() method will return
        6) remove() - removes the element returned by either next() or previous()
        7) set() - replaces the element returned by either next() or previous() with the specified element
    */
}
