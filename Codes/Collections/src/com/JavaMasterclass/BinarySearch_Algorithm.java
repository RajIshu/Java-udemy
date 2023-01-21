package com.JavaMasterclass;

public class BinarySearch_Algorithm {
    /*
        Binary Search:
        -------------
        It is a method used to search an element in a list that is sorted.

        Syntax:
        ------
            Collections.binarySearch(List list, T key, Comparator c);

            Parameters:
                list − This is the list to be searched.
                key − This is the key to be searched for.
                Comparator (optional) - A comparator interface is used to order the objects of
                                        user-defined classes. Order can be in Ascending Order
                                        or Descending Order.

            Returns:
                i) returns index of the searched element or key i.e., >= 0
                ii) returns "(-(insertion point) - 1)" i.e. < 0, if key or element is not found.
                    Here,
                        The insertion point is defined as the point at which the key
                        would be inserted into the list.


        Example:
        -------

        1) Binary Search for Ascending Ordered List:

            public static void main(String[] args)
            {
                List<Integer> al = new ArrayList<Integer>();
                al.add(1);
                al.add(2);
                al.add(3);
                al.add(10);
                al.add(20);

                // 10 is present at index 3.
                int index = Collections.binarySearch(al, 10);
                System.out.println(index);

                // 13 is not present. 13 would have been inserted
                // at position 4. So the function returns (-4-1)
                // which is -5.
                index = Collections.binarySearch(al, 13);
                System.out.println(index);
            }


        2) Binary Search for Descending Ordered List:

            public static void main(String[] args)
            {
                List<Integer> al = new ArrayList<Integer>();
                al.add(100);
                al.add(50);
                al.add(30);
                al.add(10);
                al.add(2);

                // The last parameter specifies the comparator
                // method used for sorting.
                int index = Collections.binarySearch(al, 50, Collections.reverseOrder());

                System.out.println("Found at index " + index);
            }


        Arrays.binarysearch() vs Collections.binarySearch():
        ---------------------------------------------------
        Arrays.binarysearch() works for arrays which can be of primitive data type also.
        Collections.binarysearch() works for objects Collections like ArrayList and LinkedList.


        Important Points:
        ----------------
        1) If input list is not sorted, the results are undefined.
        2) If there are duplicates, there is no guarantee which one will be found.
        3) Time Complexity for Binary Search:
                a) Best Case: O(1)
                b) Average Case: O(log n)


        Note: We can write our own method for Binary Search.
    */
}
