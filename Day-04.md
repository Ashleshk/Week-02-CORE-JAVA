## Day-04 
majrul.ansari@lntinfotech.com
dinesh.malwade@lntinfotech.com

![java class](https://github.com/Ashleshk/Week-02-CORE-JAVA/blob/main/d41.JPG)

* JVM is a process in Windows. Its an application running in window. OS are multi-programming, multi-tasking, multi-processing makes as os to run mulitple application at a time in it.
* Multi-Programming: Time sharing : Mutliprocessing OS
* Windows is time-Sharing, linux is mulit tasking

1. Process :
    * Starting each process in the OS is overhead of alotting resources to the application.
    * JVM when is started, can start **Sub-Processes**.
    * Sub-Process - runs within set of resources alloted to the process.
        * Sub-processes are threads in case of JVM.
        * The Main thread is a sub-Process.
    * Single Thread Application - main Thread until now is called Single Thread Application.
    * Exception Handling is done by separate thread within a JVM.
    * Garbage collection is a **dormant thread** (Thread is running in queue but won't reach to window) active but not executed.

**NOTE - There is **nothing** like Sub-Thread, only process and Sub-Process.**

**NOTE - Windows implement Round Robin, Pre-emptive.**

2. Steps 
    * JVM is started by OS.
    * JVM starts a main methods
    * The Min Thread runs main method of your programs.
    * The main method can start other threads.

    ![power CPU]()

3. Threads: 
    * A thread is a lightweight sub-process, the smallest unit of processing. It is a separate path of execution.
    * Multiprocessing and multithreading, both are used to achieve multitasking.
    * However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.
    * Process will be completed in 1/3 time. harnessing power of multi-cpu systems.
    * thereby incresing performance of the application.
    * Thread will ensure every user gets response for their request in case of google server.
    * Sense for user that application is fast even if applicaiton is slow is what it matter.
    * hence front-end is done in threads.

4. Advantages of Java Multithreading
    * It doesn't block the user because threads are **independent** and you can perform multiple operations at the same time.
    * You can perform many operations together, so it saves time.
    * Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

5. Thread Class in Java
    * start() - It is used to start the execution of the thread.
    * run()	- It is used to do an action for a thread.
    * sleep() - It sleeps a thread for the specified amount of time.
    * currentThread() - It returns a reference to the currently executing thread object.
    * join() - It waits for a thread to die.
    * getPriority() - It returns the priority of the thread.
    * setPriority()	- It changes the priority of the thread.
    * getName()	- It returns the name of the thread.
    * setName() - It changes the name of the thread.
    * getId() - It returns the id of the thread.
    * isAlive() - It tests if the thread is alive.
    * yield() - It causes the currently executing thread object to pause and allow other threads to execute temporarily.
    * suspend() - It is used to suspend the thread.
    * resume() - It is used to resume the suspended thread.
    * stop() - It is used to stop the thread.



## Virendra Sir Continued with
# String
1. String Pool -> In part of heap 
  ex : String str = "Hello";
       String p = "Hello"  //point to String pool's Hello
2. heap (new operator)
  ex: String str = new String("Hello"); -->in the heap
```java
  String j ="World";
  String l ="World";
  String u = new String("World"); // -->2 : 2 object in heap + 1 object of strig pool
   String u = new String("Java"); // -->2 : 2 object in heap + 1 object of strig pool
```
   * String is Immutable - cannot change value
    * s.concat("tendulkar")
        * no change in s
   * so to change
        * StringBuffer
        * StringBuilder
    * equals -- used to comapre the context of the strings
    * == it is used  copare add/location of two string objects

    * if == comes as true --> always .equals will be true ==> so content are obvoisly same
    * if .equals is truw --> then == may/maynot be true.


========================================
String s1 = new String("Java");
String s2 = new String("Language");
String s3= "Java";
String s4= "Language";
String s5 = s3;
String s6 = new String("Java");


4. Sequence
   * Anonymous block
   *  static block
   * ctor
   * methods

#  JDBC 
* JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database. It is a part of JavaSE (Java Standard Edition). JDBC API uses JDBC drivers to connect with the database
* There are four types of JDBC drivers:

    * JDBC-ODBC Bridge Driver,
    * Native-API driver (partially java driver)
    * Network Protocol driver (fully java driver)
    * Thin Driver(fully java driver)
* We can use JDBC API to access tabular data stored in any relational database. By the help of JDBC API, we can save, update, delete and fetch data from the database. It is like Open Database Connectivity (ODBC) provided by Microsoft.
* A list of popular interfaces of JDBC API are given below:
    * Driver interface
    * Connection interface
    * Statement interface
    * PreparedStatement interface
    * CallableStatement interface
    * ResultSet interface
    * ResultSetMetaData interface
    * DatabaseMetaData interface
    * RowSet interface
* A list of popular classes of JDBC API are given below:

    * DriverManager class
    * Blob class
    * Clob class
    * Types class


## Steps for java Mysql JDBC Connection
Step 1: Set tje connection parameters inside the class as class variables
- url
- username
- password
 
Step 2:  // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
 
Step 3: Loading the driver for the MYsql
Class.forName("com.mysql.jdbc.Driver");
 
Step 4:  // opening database connection to MySQL server
         con = DriverManager.getConnection(url, user, password);
 
Step 5: // getting Statement object to execute query
        stmt = con.createStatement();
 
Step 6: //put all th data from the tables into the result set object
         rs = stmt.executeQuery(query1); 

















