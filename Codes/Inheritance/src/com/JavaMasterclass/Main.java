package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    INHERITANCE:
	        - Many objects may have same characteristics, but they may also be different.
	          Example:
	            - Apple iPhone
	                - OS: iOS
	                - CPU: A11 Bionic processor
	            - Samsung Galaxy Phones
	                - OS: Android
	                - CPU: Exynos 9825

              Both have OS and CPU, but both are completely different. So, we can create
              a class named 'Phone' and will inherit all the features from it in Apple
              iPhone class and Samsung Galaxy class.

              Here,
                Parent class: Phone
                Child class: Apple iPhone and Samsung Galaxy

	        -

	*/

        Animal weiredSpecies = new Animal("Isha", 0, 10, 5, 120);

        Dog dog1 = new Dog("Bella", 4, 30, 2, 4, 1, 42, "Golden");

        dog1.eat(); // Method or behaviour inherited by Dog class from Animal class.
    }
}
