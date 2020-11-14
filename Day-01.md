## JAVA 

 

## CREATING PROJECT
>File-->New-->Other --> Java(yellow folder) --> Java Project 
> The Project Name should be in Caps(first letter) word Like 'CoreJava'

## IMPORTANT FROM INTERVIEW POINT OF VIEW
* Objects 
* CLASSES
* OOPS
  * Abstarction
  * Polymorphism
  * Inheritance
* Threading
* Collections
* Strings
* Access Modifiers
* File Handling
* Java 8 Features

---------------------------------------------------

1. linux kernel is used inside Java And Android
2. OPEN spource - Wirte program once deploy anywhere windows , linux , unbuntu

3. EVERY OS require JVM to run PROGRAM
4. how JAVA PLATFORM INDEPENDENT ?
> Java JVM, compiler  is specific to OS,
byteclass file is what makes java PLatform independent that can be used to run in other OS

5. JDK, JRE is written in  LINUX

6. Name of Java File should be unique
7. java.lang.Object is SUPER CLASS OF every Class

> System.out.println("The sum is: " + sum);
    |     |       |
  Class  object   method

  ```java
  package ashlesh;

public class MainTest {
	public static void main(String[] args) {

        System.out.println("Hello Ashlesh Welcome to Java");
    }
}
  ```

8. **Java Class Components**
   1. Varaibles:
      class varaible/instance varaible
      local varaible/function varaible
      reference varaiable (object variable)
      static varaible
    
    2. functions:
    Static methods
    norma methods
    constructors

    3. inner classes

9. **Wrapper classes** - primitive type to OBject type

10. Autoboxing --> which means conversion of the smaller data type to the another bigger datatype
eg --> int to long
11. unboxing --> which means conversion of the bigger datatype to smaller one datatype
eg--> long to int


12. prefix ---> means we are doing the calculation of the variables and then pritning the value 
eg:- int num= 10;
     ++num  --->  11 ---> then printed on console
 
13. postfix --> means we are printing the value and then doing the calculation on that value
eg:-  int y= 34;
      y++ --->  it will print the value of y as 34 and then increment the value to 35 

14. EVALUATION IS DONE LEFT TO RIGHT 

========================================================================================

ASSGINMENT 
WAP : converstion from long to double / int to double, double to float, flaoat to int
```java
public class ConversionDemo {
    //TYPECAST
	public static void main(String[] args) {
		int a =10;
		long l = 120;
		double d = l;
		double di = a;
		float f = (float) d;
		int fi = (int) f;
		System.out.println(a + " int to double " + di);
		System.out.println( l + "  long to double "+ d);
		System.out.println( d + "  double to float "+ f);
		System.out.println( f + "  float to int "+ fi);
	}
}
```
 

15. TYPES OF LOOP
    * for-loop;
    ```java
      for(int i=0, i<10;i++){
          ...
      }
      ```
    * while loop
    ```java
       while(num<=9)
       {
           ....
           num++;
       }
    ```
    * do-while loop    --> exec once even if conditin is false
      ```java
       do
       {
           ....
           num++;
       }while(num<=9);
    ```
    * Foreach loop --(COMING SOON..later)

16. Conditional Branching 
    * IF-ELSE / IF ELSE LADDER etc
      ```java
      if(if true then 1/ if false then 2)
      {
          ...
      }
      else
      {
          ...
      }
      ```

    * SWTICH 
    ```java
    switch(5){
         case 1:  ... break;
     case 2:  ... break;
        default:
    }
    ```
```java
public class BreakAndContinue {

	public static void main(String[] args) {

		int count =0;
		for(count=0;count<40;count++)
		{
			if(count%7==0)
				continue; //skip to next iteration
			System.out.println(count);
		}
        
		
		for(count=0;count<10;count++)
		{
			if(count%3==0)
				break; //terimates the loop
			System.out.println(count);
		}
	}

}

```
17. Modifiers
> 1. Public --> the value is to be accessible withing the same package + another package
> 2. private --> the value should be accessible inside the same classs
> 3. protected --> the value will be visisble inside the same package(all classes+ subclasses) and also subclass inside another package
> 4. default -->  the value is visible inside the same package only

18. Function / Method : execution code in java
```java
<access-modifer> <return-type> <name-finction>(arguemnts.....)
{
    ....statement
}
```
```java 
public int sum(int a , int b)
{
    int c = a +b;
    return c;
}
```
19. Constructors --> any Method which is decalred inside the class is having the same name as of class
* Constructor cant return 
* Cosntructor will be called automatically
* private constructor cannot be there only in inner class
* two types
> Default --> no arg
> parameterised -> arg


20. Overloading of Constructors/methods
  if any class is having more than one method and constructors with different arguemnt list and type of arg is aslo different 
  
```java
public employee(int n)
{

}

public employee(int n, int m){

}
```

21. Standard Protocol

class name: first letter should be CAPS and if another word is there then also fitst letter should be CAPS

package: everything will be in small case only

Porject Name--> similar to class_name notation

methods name: if we have tow words then firsst word should be smallcase and other word should be start from first initial as CAPS

like:  addCalculate()



22. GARBAGE COLLECTION - unsed objects are removed automatically
System.gc(); //explicilty clean heap area.
permGen comman // 

23. Arrays
int[] arr= new int[5] ;
int[] arr ={1,2,3,4,5,6};
int arr[]={1,2,3,4,5,6};


2-D Array:-
int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};


24. SCANNER CLASS ---> TO take input from Console
Scanner scan = new scanner(System.in);
int x =scan.nextInt();
String str=scan.nextLine();



head first core java- oreilly publications
























