# DSA Sorting and Factory proyect
 
This proyect was requested as part of the 4th Semester at my University under the class Data Structures and Algorithms 2. 

The code consists of the creation of three main classes: Factory, App and Person.

In the `Person` class, a `Person` Object is created, which has two attributes `(Identifier and Name)`. The general idea of the program is to be able to alter the type of data structure with which the list is generated and also to be free to sort it in `ascending` or `descending` order.

The `Person` class implements the `get()` methods for each attribute, in addition to the `compareTo()` method which was extracted from the Comparable interface, which compares the `Person` instances based on their identifiers (ID), allowing the comparison necessary for sorting, and then there is the `toString()` method.

The `Factory` class has two static methods. The first one produces the list and indicates the type of data structure to be used. In this case, the `ArrayList` data structure was kept uncommented, while the `LinkedList` data structure was commented out. In terms of testing and verification of the program, you can comment one or the other and compare their performance, and functionality. In addition to that, the static methods extend the `Comparable` interface for an element of type `<T>`, which in our case, will be of type `String` (this will be demonstrated in the `App` class).  The second method requires two inputs: the list to sort and the sort type. Two conditionals are generated using the .equals method to verify which of the two types of sorting is desired and the `.sort()` method is used to sort either ascending or descending the inserted list.


Finally, the `App` class starts by creating a list of type Person that invokes the `Factory` class, the `createList()` method to create the list and the respective data `(ID and Name)` are added to it. To compare the behavior of this program, the list is printed with a `for:each`, first unordered, then sorted ascending and then descending.

It is important to note that in the `Factory` class, the methods are designed to work with generic types `<T extends Comparable<T>>`. This means that the list can contain any type of elements that implement the `Comparable` interface. Instead of limiting ourselves to a 'String type', lists can be generated from any type of object that is comparable, providing considerable flexibility in the implementation and use of the program.
