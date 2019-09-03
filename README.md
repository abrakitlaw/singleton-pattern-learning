# Singleton Pattern Learning
The Singleton Patter ensures a class as only one instance, and provides a global point of access to it.

## Bullets Points
1. Singleton Pattern provides a global access point to that instance
2. Implementation of the Singleton Pattern using a private constructor, a static method combined with a static variable
3. Examine performance and resource constraints and carefully choose and appropriate Singleton implementation for multithread applications
4. Beware of the double-checked locking implementation; it is not thread-safe in versions before Java 2, version 5.
5. Need to create registry of Singletons to defeat GC before JVM 1.2
