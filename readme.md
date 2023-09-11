# Computer Science II
## Lab 5.0 - Classes & Constructors

An introduction to using classes and constructors in the Java programming language.

This is a lab used in Computer Science II (CSCE 156) for Fall 2023 
in the [School of Computing](https://computing.unl.edu) 
at the [University of Nebraska-Lincoln](https://unl.edu).

## Overview

### Resources

-   Java constructor tutorial:  
    https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html

-   Object Creation tutorial:  
    http://download.oracle.com/javase/tutorial/java/javaOO/objectcreation.html

### Lab Objectives & Topics

Following the lab, you should be able to:

-   Use Classes and objects to write Java programs

-   Understand and use constructors

-   Understand the visibility of a class's methods and how to use them

Note that the lab may involve some concepts, classes, or methods not covered (yet) in the class. You should be able to complete the lab without fully understanding them. If you have any questions about them, please feel free to ask our LAs. 


### Peer Programming Pair-Up

At the start of
each lab, you may find a team member by yourself or may be randomly paired up with another student by
a lab instructor.  One of you will be designated the *driver* 
and the other the *navigator*. If you prefer to work on this lab by yourself, that is fine too.  Each week you should try to alternate: if you were a driver 
last week, be a navigator next, etc. 

***Note that, each student must submit the code to CodePost for grading.***

## 1. Getting Started

Clone this project code for this lab from GitHub in Eclipse using the
URL: `https://github.com/lisongxu/CSCE156-Lab-OOP-Basic`

## 2. Classes & Constructors 

Java is a class-based Object Oriented Programming Language meaning that
it realizes the concept of objects by allowing you to define classes
which have member methods and variables. Instances of classes are
*instantiated* through a constructor, which is a method with the same name as a
class and called using the keyword `new`. This lab will familiarize you with
how classes and their constructors are defined and used. In addition,
you will be introduced to some ways that Java supports other Object
Oriented Principles: Encapsulation and Abstraction.

-   *Encapsulation* is a mechanism by which objects group data and the
    methods/functions that act on that data. It is also the means by
    which a class's data is protected from the outside world (outside of
    the object). Java achieves this by allowing you to define member
    methods and variables and to specify the visibility of these fields
    using the keywords `private`, `protected`, and `public`.

-   *Abstraction* refers to the means by which an object exposes a
    public interface to the outside world while hiding the inner
    workings (the internal representation or the implementation
    details). Java's main mechanism for supporting this is the same as
    with encapsulation though it does provide other means (interfaces,
    abstract classes, etc.).

-   *Class Signaling* refers to invoking methods on an instance of a
    class. Java uses the dot (or period) operator to signal a class.

## 3. Activities 

We have provided a Java project that simulates a library collections
system. It has several classes already defined to model authors, books,
a library (a collection of books) and a text-based interface which
allows you to search the collection, add books to the collection, and
list the collection.

### 3.1 Writing Constructors and Getter Methods

1.  Run the library demo program `LibraryDemo.java` to familiarize yourself with its
    functionality. Note that `(3) Printing Collection` is not fully
    operational yet.

2.  Modify the `Book` class by implementing the constructor and the accessor (getter) methods as listed below.  Practice Tip: always use the `this` keyword to disambiguate the scope of
    variables and prevent potential problems when subclassing.

```Java
public Book(String title, Author author, String isbn, String publishDate)
public Author getAuthor()
public String getISBN()
public String getTitle()
```

3.  Test whether your methods work by running the library demo program again. `(3) Print Collection` should work if all your methods work. Also test your `Book` class using the JUnit test suites provided in `BookTests.java`.

### 3.2 Enforcing Good Encapsulation

The `Book` class is well-designed: it logically groups data and methods
together that semantically define what a book is and how you can use it.
The `Author` class however, is not well-designed.  Its data members are publicly
exposed and it has no methods at all.

1.  Redesign the `Author` class and make its member variables private.

2.  Create and use getter methods to make the members accessible to the
    outside world. Use these methods where appropriate.

3.  Create setter methods (also called mutator methods) to enable code
    outside of the `Author` class to change the member variables. Add some data
    validation: for example, do not allow "invalid" values for member
    variables.

4.  Add and make use of an appropriate constructor to this class.

5. Test your `Author` class using the JUnit test suites provided in `AuthorTests.java`.

## 4. Testing, Submitting & Grading

* Test your programs locally on your computer using the provided JUnit test suites.  Fix any
errors and completely debug your programs.
* Submit the following file to CodePost:
  * `Author.java`
  * `Book.java`
* Make sure that your programs pass  the tests on CodePost. For this lab, as long as your programs pass  the tests on Codepost, you will get full points for the lab.

