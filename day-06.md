## day-06

# UNIT TESTING
1. defination
    * is a method by which individual units of source code area tested to determine if they are fit for use
    * concerned with functional correctness and completeness of individual program units
    * its goal is to isolate each part of the program and show that the individual parts are correct.
    * typically written and run by software developers to ensure that code meets its design and behaves as intended.

2. Types of Testing
* **black box testing** - outer boundary, application interface, internal module interface and i/o description. 
* **white box testing** - how functions executed and checked each other
* **grey box testing** - test cases, risks assessment ans test methods

3. Traditional Testing
* test the whole program
    * print statement 
    * use og debugger
    * debugger expressions
    * test scripts - web application

4. Unit testing
    * each part testd individaualaly
    * all componenets tested atleast once
    * errors picked up earlier
    * scope is smaller, easier to fix errors

5. UNit testing Ideals
    * isolatable 
    * reapeatable
    * automatable
    * easy to write

6. why need unit test?
    * Better Design
    * faster debugging
    * faster development
    * excellent regression Tool
    * Reduce future Cost (LOC-line of Code) 

7. Benefits
    * Unit Testing allows the programmer to refactor code at a later date, make sure the module still works correctly
    * Integration much easier
    * Unit testing provideds a sort of living documentation of system.

8. JUnit 
    * Framework to write test cases

9. Annotation - tells what method will overall behave
    * @Test -> 
        ```java
        @Test
        public int add(int a, int b)
        {
            sop("inside add")
            return a+b;
        }
        ```
    * @Before -> execute some statement such as preconditions before each test case. 
        * Initalize variable, static varaibles, final variables
    * @After ->  
        * closing the connection, closing the file, deelting temporary files, varaibles.
        ```java
        @before
        public void before(){sop("I am before add")}

        @After void after(){sop("i ma after add")}
        ```
    * @BeforeClass -> This annotation is used if you want to execute some statements before all the test cases for eg- test connection
    * @AfterClass -> This annotation is used if you want to execute some statements after all the test cases for eg- Releasing Resources after executing all test cases.
        ```java
        @beforeClass
        public class before(){sop("I am before add")}

        @AfterClass
        class afterClass(){sop("i ma after add")}
        ```
    * @Ignore -> ignore some statement during execution
        * ex- disabling some test cases during test execution
    * @Test(timeout=500) -> set some timeout during test execution
        * ex -SLA test under specified condition.
    * @Test(Expected=LLLegalArguementException) -> Hanadle some exception during test execution
        * ex- check whether a particular method is throwing specified exception or not.

10. Assertion Class
    * void assertEquals(bool expected, bool actual)
    * void assertFalse(bool condition)
    * void assertSame([String message])


==================================================================================
(1) String Programs: String builder/ String buffer
(1.a) Write a Java program to get the character at the given index within the String.
(1.b) Write a Java program to test if a given string contains the specified sequence of char values
(1.c) Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
(1.d) How to print the duplicate characters from the given String
(1.e) How to remove all duplicates from a given string
(1.f) How to find the maximum occurring character in given String eg if the input string is "Java" then the function should return 'a'.
 

(2) 
Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint - Use array of objects
 

(3)
Program: Inheritance
Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes
 

(4)
Program: static + polymorphism
Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a static method with the same name to print "Child". Now call this method by the objects of the two classes. Also, call this method by an object of the parent class refering to the child class i.e. A obj = new B()
 
 
(5) Later On:::
Case Study:
All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
 
Write a JAVA program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and functions in each class.
```java
Hint:
Class Customer
{​​​​​
//Personal Details ...
// Few functions ...
}​​​​​
Class Account
{​​​​​
// Account Detail ...
// Few functions ...
}​​​​​
Class RBI
{​​​​​
Customer c; //hasA relationship
Account a; //hasA relationship
..
Public double GetInterestRate() {​​​​​ }​​​​​
Public double GetWithdrawalLimit() {​​​​​ }​​​​​
}​​​​​
Class SBI: public RBI
{​​​​​
//Use RBI functionality or define own functionality.
}​​​​​
Class ICICI: public RBI
{​​​​​
//Use RBI functionality or define own functionality.
}
```









