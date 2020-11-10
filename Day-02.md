## DAY-2 
 
Object ---> an entity the represents the class 
```java
class Employee {​​​​  Employee emp = new Employee();

 }​​​​ class sub_employee extends Employee

{​​​​ 

}​​​​ // sub-employee ---> is a child class of parent class(Employee)
```
-----------------------------------------------------------------------------------------------

1. Inheritance:  ---> "extends" keyword

  * Heirarical---> where one parent is having the more than one child 

  * multi-level ---> where grandchild class is created in heirarchy then it is known as multi-level

  * single ---.> where a parent has single child 

assignment 
assignment_1:
parent ---> MNC  ---> two methods (public , default) + 1 variable
child class ---> Infosys ----> two methods  + 1 variable
child class of infosys---> banglore_infosys ---> 1 method + 1 variable
child class of infosys ---> pune_infosys ---> 1 method + 1 variable
Main ---> call all the mthods of the banglore infosys + pune_infosys  
```java
package inheritance;
class MNC
{
   int var=1;
   public void MethodPublic()
   {
	   System.out.println("Public Method of MNC ");
   }
   void MethodDefault()
   {
	   System.out.println("Default of MNC");
   }

}
 class Infosys extends MNC
{
   int var_info=10;
   public void Info_MethodPublic()
   {
	   System.out.println("Public Method of Infosys ");
   }
   void Info_MethodDefault() 
   {
	   System.out.println("Default of Infosys");
   }
}
class Banglore_Infosys extends Infosys
{
   int var_Binfo=100;
   public void BInfo_MethodPublic()
   {
	   System.out.println("Public Method of Bangaolre-Infosys ");
   }
}
class pune_infosys extends Infosys
{
   int var_Pinfo=200;
   //var_info +=1;  // ct error
   public void PInfo_MethodPublic()
   {
	   System.out.println("Public Method of Pune-Infosys ");
   }
}
public class Assignment_1 {
   
	public static void main(String[] args) {
		Banglore_Infosys bi= new Banglore_Infosys();
		pune_infosys pune = new pune_infosys();
		
		bi.BInfo_MethodPublic();
		bi.Info_MethodDefault();
		bi.Info_MethodPublic();
		bi.MethodDefault();
		bi.MethodPublic();
		System.out.println(bi.var+ " "+ bi.var_info+ " "+ bi.var_Binfo);

		System.out.println();
	
		pune.PInfo_MethodPublic();
		pune.Info_MethodDefault();
		pune.Info_MethodPublic();
		pune.MethodDefault();
		pune.MethodPublic();
		System.out.println(pune.var + " "+pune.var_info+" "+pune.var_Pinfo);
	}

}
```
output:
```java
Public Method of Bangaolre-Infosys 
Default of Infosys
Public Method of Infosys 
Default of MNC
Public Method of MNC 
1 10 100

Public Method of Pune-Infosys 
Default of Infosys
Public Method of Infosys 
Default of MNC
Public Method of MNC 
1 10 200
```


2. Encapsulations

3. Polymorphism --> multiple behavior for same object
    * **static polymorphism** --> complile time --> method overloading , occurs in same class
    * **dynamic polymorphism** --> runtime -->method overriding --> occur in diff classes --> whenever we use inhertance concept this is seen.


4. Method Overriding -->  method overriding ---> when parent and child classes are having the same method with the same mthod name,
same method return type, same method access modifier, same method function arguments and type of arguments
menra duplicate methods in parent and child classes this is known as method overrding


5. super ---> this is used to call parent methods, constructors and variables
* super()-----> default constructor
* super(argument)  ---> super(3)----> this will call the parent parameterized constructor
* super.method_name()----> this will call the parent method
* super.variable ----> this will call the parent variable

6. Abstraction --> hiding of internal properties

7. abstract it i want to hide the internal details of my class and showing only the functionality with is needed

```java
abstarct modifeir method_name(){ ,...}
```

* any class which is having atleast one abstract method inside it then that class will also kown as 'abstract class'
```java
abstract class <class-name>{

}
```

* abstract class can have both the abstract methods + non-abstract method.
* we cannot create the object of the abstract class


8. Interface --> no method body at all
syntax
```java
interface <name-interface>{
    (methods decalration)  //--> public + abstract 
    int age=10; //public + static + final;
}
```
* interface are automatically abstract public in nature
* 


8. static --> common varaible sharing across objects




=============================================================
1.  single program in which i want to implement all my OOPS concept --> abstarction + poymorphism (both types) + interface 


2. ABSTRACT class - SMSSender
        connectionWithTower() --> abstract method
        sendSMS() --> non-abstract method
        destroyConnectionWithTower() --> abstract method
        CheckForDND() --> non abstract method
        CheckForTelecomRules() --> non abstract method

        varable --> String signal;
    class Vodafone --> child of SMSSender
        abive method + VodOffer()
    Class Airtel  --> child of SMSSender
       above method + ariteloffer()
    Main
==============================================================
9. Exceptions 
1.Error Class (asynchronous )

2. Exception Class (synchrnous)
   * Checked Exceptions  --> Complie time --expected to be handled by the programmer ex i/o tppe
   * Uncehcked Exceptions  --> Happen at runtime 
                   --> arise during execution of code
                   ex end of array
* Syntax
```java
try{
      int c =2/0;
}catch(arithmeticException e)
{
    ....
}
catch(Exceptions ex){
    ...
}
finally()
{
    ...
}
```
==============================================================
Assignment 
Custom exception deptname check is HR
employee code > 100
                 

=============================================================
//*** Rules***//
// 1. If the superclass method does not declare an exception, subclass overridden method 
//    cannot declare the checked exception but can declare unchecked/runtime exception.
 
// 2. If the superclass method does not declare an exception, subclass overridden method
//    cannot declare the checked exception.
 
// 3. If the superclass method declares an exception, subclass overridden method can 
//    declare same, subclass exception or no exception but cannot declare parent exception.





















