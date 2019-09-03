package com.company.classicimplementation;

/**
 * Here we have declared getInstance() static so that we can call it without instantiating the class.
 * The first time getInstance() is called it creates a new singleton object and after that it just returns the same object.
 * Note that Singleton obj is not created until we need it and call getInstance() method.
 * This is called lazy instantiation.
 *
 * The main problem with above method is that it is not thread safe.
 * */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
