package com.JavaMasterclass;

public class TreeSet_Class {
    /*
        TreeSet Class:
        -------------
        - The TreeSet class of the Java collections framework provides the functionality of a tree data structure.
        - It extends the NavigableSet interface.

                        COLLECTION
                            ⬆
                            ⬆  extends
                            ⬆
                           SET
                            ⬆
                            ⬆  extends
                            ⬆
                        SortedSet
                            ⬆
                            ⬆  extends
                            ⬆
                       NavigableSet
                            ⬆
                            ⬆  implements
                            ⬆
                         TreeSet

        Creating a TreeSet:
        ------------------
        - In order to create a tree set, we must import the java.util.TreeSet package first.

        - Example:
                TreeSet<Integer> numbers = new TreeSet<>();

          Here,
                For Default, the elements in TreeSet are sorted naturally (ascending order) if no
                parameter is passed.

                However, we can customize the sorting of elements by using the Comparator interface
                as a parameter.


        Methods of TreeSet:
        ------------------
        1) Insert Elements to TreeSet:
               + add() - inserts the specified element to the TreeSet
               + addAll() - inserts all the elements of the specified collection to the TreeSet

        2) Access TreeSet Elements:
               + To access the elements of a tree set, we can use the iterator() method.

        3) Remove Elements from HashSet:
                + remove() - removes the specified element from the set
                + removeAll() - removes all the elements from the set


        Methods for Navigation:
        ----------------------
        1) first() and last() Methods:
                + first() - returns the first element of the set
                + last() - returns the last element of the set

        2) ceiling(), floor(), higher() and lower() Methods:
                + ceiling(element) - Returns the lowest element among those elements that are greater
                                     than the specified element. If the element passed exists in a
                                     tree set, it returns the element passed as an argument.

                + floor(element) - Returns the greatest element among those elements that are less than
                                   the specified element. If the element passed exists in a tree set,
                                   it returns the element passed as an argument.

                + higher(element) - Returns the lowest element among those elements that are greater than
                                    the specified element.

                + lower(element) - Returns the greatest element among those elements that are less than
                                   the specified element.

        3) pollfirst() and pollLast() Methods:
                + pollFirst() - returns and removes the first element from the set
                + pollLast() - returns and removes the last element from the set

        4) headSet(), tailSet() and subSet() Methods:
                + headSet(element, booleanValue)
                        -> element: The headSet() method returns all the elements of a tree set before the
                                    specified element
                        -> booleanValue (Optional): Its default value is false.

                                                    If true is passed as a booleanValue, the method returns
                                                    all the elements before the specified element including
                                                    the specified element.

                + tailSet(element, booleanValue)
                        -> element: The tailSet() method returns all the elements of a tree set after the
                                    specified element (which is passed as a parameter) including the specified
                                    element.
                        -> booleanValue (Optional): Its default value is true.

                                                    If false is passed as a booleanValue, the method returns
                                                    all the elements after the specified element without
                                                    including the specified element.

                + subSet(e1, bv1, e2, bv2)
                        -> e1, e2: The subSet() method returns all the elements between e1 and e2 including e1.
                        -> bv1, bv2: The default value of bv1 is true, and the default value of bv2 is false.

                                     If false is passed as bv1, the method returns all the elements between e1
                                     and e2 without including e1.

                                     If true is passed as bv2, the method returns all the elements between e1
                                     and e2, including e1.


        TreeSet Set Operations:
        ----------------------------
        1) Union of Sets:
           -------------
           Two perform the union between two sets, we can use the addAll() method.

        2) Intersection of Sets:
           --------------------
           To perform the intersection between two sets, we can use the retainAll() method.

        3) Difference of Sets:
           ------------------
           To calculate the difference between the two sets, we can use the removeAll() method.

        4) To check Subset:
           ---------------
           To check if a set is a subset of another set or not, we can use the containsAll() method.


        Other Methods of TreeSet:
        ------------------------
            a) clone()      :	Creates a copy of the TreeSet
            b) contains()   :	Searches the TreeSet for the specified element and returns a boolean result
            c) isEmpty()    :	Checks if the TreeSet is empty
            d) size()       :	Returns the size of the TreeSet
            e) clear()      :	Removes all the elements from the TreeSet


        TreeSet Vs. HashSet:
        -------------------
        a) Unlike HashSet, elements in TreeSet are stored in some order. It is because TreeSet implements
           the SortedSet interface as well.

        b) TreeSet provides some methods for easy navigation. For example, first(), last(), headSet(),
           tailSet(), etc. It is because TreeSet also implements the NavigableSet interface.

        c) HashSet is faster than the TreeSet for basic operations like add, remove, contains and size.
    */
}
