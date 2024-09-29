# Computer Science II
## Lab 6.0 - Classes & Constructors

An introduction to using classes and constructors in the Java programming language.

This is a lab used in Computer Science II (CSCE 156) for Fall 2024 
in the [School of Computing](https://computing.unl.edu) 
at the [University of Nebraska-Lincoln](https://www.unl.edu).

## Overview

### Lab Objectives & Topics

Following the lab, you should be able to:

-   Use Classes and objects to write Java programs

-   Understand and use constructors

-   Understand the visibility of a class's methods and how to use them

Note that the lab may involve some concepts, classes, or methods not covered (yet) in the class. You should be able to complete the lab without fully understanding them. If you have any questions about them, please feel free to ask our LAs in the lab. 

### Resources

-   Java constructor tutorial:  
    https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html

-   Object Creation tutorial:  
    http://download.oracle.com/javase/tutorial/java/javaOO/objectcreation.html

### Peer Programming Pair-Up

At the start of each lab, you may find a team member by yourself or be randomly paired up with another student by
a lab instructor.  One of you will be designated the *driver* and the other the *navigator*. Each week you should try to alternate: if you were a driver 
last week, be a navigator next, etc. If you prefer to work on this lab by yourself, that is fine too.

***Note that each student must submit the code to GradeScope for grading.***

## 1. Getting Started

Clone this project code for this lab from GitHub in Eclipse using the
URL: `https://github.com/lisongxu/CSCE156-Lab-OOP-Basic`

## 2. Classes & Constructors 

Java is a class-based Object Oriented Programming Language meaning that it realizes the concept of objects by allowing you to define classes which have member methods and variables. Instances of classes are created through a constructor, which is a method with the same name as a class and called using the keyword `new`. This lab will familiarize you with how classes and their constructors are defined and used. In addition, you will be introduced to some ways that Java supports other Object Oriented Principles: Encapsulation and Abstraction.

-   *Encapsulation* is a mechanism by which objects group data and the methods/functions that act on that data. 

-   *Abstraction* refers to the means by which an object exposes a public interface to the outside world while hiding the inner workings (the internal representation or the implementation details). Java achieves this by allowing you to define member methods and variables and to specify the visibility of these fields using the keywords `private`, `protected`, and `public`.
    
-   *Class Signaling* refers to invoking methods on an instance of a class. Java uses the dot (or period) operator to signal a class.

## 3. Activities 

We have provided a Java project that simulates a library collections system. It has several classes already defined to model authors, books,
a library (a collection of books) and a text-based interface that allows you to search the collection, add books to the collection, and list the collection.

### 3.1 Writing Constructors and Getter Methods

1.  Run the library demo program `LibraryDemo.java` to familiarize yourself with its functionality. Note that `(3) Printing Collection` is not fully
    operational yet.

2.  Modify the `Book` class by implementing the constructor and the getter (accessor) methods listed below.  Practice Tip: always use the `this` keyword to disambiguate the scope of variables and prevent potential problems when subclassing. ***Note that do not change the data types of the parameters of these methods. For example, the last parameter `publishDate` of the `Book` constructor must be `String`.***

```java
public Book(String title, Author author, String isbn, String publishDate)
public Author getAuthor()
public String getISBN()
public String getTitle()
 ```

3.  Test whether your methods work by running the `LibraryDemo.java` program again. `(3) Print Collection` should work if all your methods work.
   
4.  Test your `Book` class using the JUnit test suites provided in `src/test/java/unl/soc/BookTests.java`.

### 3.2 Enforcing Good Encapsulation and Abstraction

The `Book` class is well-designed: it logically groups data and methods together that semantically define what a book is and how you can use it.
The `Author` class however, is not well-designed.  Its data members are publicly exposed and it has no methods at all.

1.  Redesign the `Author` class and make its member variables ***private***.

2.  Create and use getter methods to make the members accessible to the outside world. Use these methods where appropriate.

```java
public String getFirstName() 
public String getLastName()
 ```

3.  Create setter methods (also called mutator methods) to enable code outside of the `Author` class to change the member variables. Use these methods where appropriate.

```java
public void setFirstName(String firstName)
public void setLastName(String lastName)
 ```

4.  Add and make use of an appropriate constructor to this class.

```java
public Author()
public Author(String firstName, String lastName)
 ```

5. Test your `Author` class using the JUnit test suites provided in `src/test/java/unl/soc/AuthorTests.java`.

## 4. Testing, Submitting & Grading

* Test your programs locally on your computer using the provided JUnit test suites.  Fix any
errors and completely debug your programs.

    1. Expand the `src/test/java` directory, then expand the `unl.soc` package, and then double click on the `BookTests.java` file to open it. 
    2. Run the test suites by clicking the usual "Play" button.
    3. Fix any errors and completely debug your programs. 
    4. Expand the `src/test/java` directory, then expand the `unl.soc` package, and then double click on the `AuthorTests.java` file to open it. 
    5. Run the test suites by clicking the usual "Play" button.
    6. Fix any errors and completely debug your programs.

* Submit the following files to GradeScope. ***Do not upload any other files.***
  * ***`Author.java`***
  * ***`Book.java`***
    
* Make sure that your programs pass the tests on GradeScope. For this lab, as long as your programs pass  the tests on GradeScope, you will get full points for the lab.

* What if the test on GradeScope fails? Please test your programs locally on your computer using the provided JUnit test suites, because the test on GradeScope is exactly the same as the provided JUnit test suites. **Debugging your programs on GradeScope is not recommended because GradeScope gives very limited information.***
