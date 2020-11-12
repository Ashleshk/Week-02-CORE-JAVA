[2:15 PM] Viren (Guest)
    
package jav.core.examples;


//Default Methods and Multiple Inheritance
interface TestInterface1 
{​​​​​​​ 
    // default method 
    default void show() 
    {​​​​​​​ 
        System.out.println("Default TestInterface 1"); 
    }​​​​​​​ 
}​​​​​​​ 
  
interface TestInterface2 
{​​​​​​​ 
    // Default method 
    default void show() 
    {​​​​​​​ 
        System.out.println("Default TestInterface 2"); 
    }​​​​​​​ 
}​​​​​​​ 
  
// Implementation class code 
class DefaultMultiInheritan implements TestInterface1, TestInterface2 
{​​​​​​​ 
    // Overriding default show method 
    public void show() 
    {​​​​​​​ 
        // use super keyword to call the show method of TestInterface1 interface 
        TestInterface1.super.show(); 
  
        // use super keyword to call the show method of TestInterface2 interface 
        TestInterface2.super.show(); 
    }​​​​​​​ 
  
    public static void main(String args[]) 
    {​​​​​​​ 
        DefaultMultiInheritan d = new DefaultMultiInheritan(); 
        d.show(); 
    }​​​​​​​ 
}​​​​​​​ 



