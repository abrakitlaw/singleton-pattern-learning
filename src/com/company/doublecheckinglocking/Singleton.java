package com.company.doublecheckinglocking;

/**
 * We have declared the obj volatile which ensures that multiple threads offer the obj variable correctly
 * when it is being initialized to Singleton instance. This method drastically reduces
 * the overhead of calling the synchronized method every time.*/
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if (uniqueInstance == null) {
            //To make thread safe
            synchronized (Singleton.class) {
                //check again as multiple threads
                //can reach above step
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
