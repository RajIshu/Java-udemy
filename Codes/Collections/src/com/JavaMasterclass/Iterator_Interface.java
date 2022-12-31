package com.JavaMasterclass;

public interface Iterator_Interface {
    /*
        ITERATOR Interface:
        ------------------
        The Iterator interface of the Java collections framework allows us to access elements
        of a collection.

        An Iterator is an object that can be used to loop through collections.

        It is called an "iterator" because "iterating" is the technical term for looping.

        All the Java collections include an iterator() method.

        The iterator() method can be used to get an Iterator for any collection i.e.,
        this method returns an instance of iterator used to iterate over elements of collections.

                                  Iterator
                                     ⬆
                                     ⬆ extends
                                     ⬆
                                ListIterator

        Methods of Iterator:
        -------------------
        1) hasNext() - returns true if there exists an element in the collection
        2) next() - returns the next element of the collection
        3) remove() - removes the last element returned by the next()
        4) forEachRemaining() - performs the specified action for each remaining element of the
                                collection


        Example of Iterator Implementation:
        ----------------------------------
                // Creating an ArrayList
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(1);
                numbers.add(3);
                numbers.add(2);
                System.out.println("ArrayList: " + numbers);

                // Creating an instance of Iterator
                Iterator<Integer> iterate = numbers.iterator();

                // Using the next() method
                int number = iterate.next();
                System.out.println("Accessed Element: " + number);

                // Using the remove() method
                iterate.remove();
                System.out.println("Removed Element: " + number);

                System.out.print("Updated ArrayList: ");

                // Using the hasNext() method
                while(iterate.hasNext()) {
                    // Using the forEachRemaining() method
                    iterate.forEachRemaining((value) -> System.out.print(value + ", "));
                }

            OUTPUT:
                ArrayList: [1, 3, 2]
                Acessed Element: 1
                Removed Element: 1
                Updated ArrayList: 3, 2,


     */
}
