public class basics {
    // Collection framework
    // it is a collection of interfaces and classes
    //   collection methods are global.

    // collection framework has collection interface and map interface inside it
     //                                   |                  |
    //                                    |                  ---------------------------------------------------|
     //                                   \/                                                                    \/
    // and we can accommdate 3 types of data using collection interface                                   Map Interface
    //  1. List(Interface) --> a. Arraylist
    //                         b. LinkedList  --> doubly linked list
    //                         c. Vector (Thead safe) <-- stack
    //  2. Queue(I) --> PrioryQueue
    //                  Dequeue
    //  3. Set(I) -- > HashSet and LinkedHashSet
    //                   SortedSet <-- TreeSet(Binary Search Tree)

    // all of them are dynamic memory allocation at run time

    // 1> List -->
    // whenever we want to preserve *insertion order*
    // duplicate element can be added inside it
    // why list is not fast enough --> because as the list got full of capcity
    //                                 and it will take (previous capcity * (3/2) + 1 ) size newly in the form of array
    //                                 and *copy* old array and paste the data of old array inside the new array of big capacity
    //                                 that is why is become trendmously slower at the time of over capacity and deletion of old array taken by Garbage collector
    // solution to this problem? -->   make a relevent size at the intiallization time.

    // 2> Set -->
    // *cannot* preserve insertion order
    // duplication not allowed


    // 3. Queue -->
    //  both side insertion and deletion
    // sequence of execution -- FIFO

//    MAP -->
//       |         HashTable
//       |        LinkedHashMap
//       |        HashMap
//       \/
//    SortedMap <--   TreeMap

}
