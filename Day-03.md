## Day-03
=============================================================================================== 

# Core Java – Collections and Generics 
1. **Collections framework**
	* ArrayList
    * LinkedList
    * HashMap
    * HashTable
    * HashSet
2. **Other classes and interfaces in Collection Framework**
3. **Comparable v/s Comparator**
4. **Generic Collection**
5. **Introduction to Java 8 Collection Streams**
=======================================================================================
## Start 
1. Arrays  
   * Arrays are static in  nature i.e ince decalred their size canot be changed. otherwise arrayIndexOutOFBoundException is thrown.
   * Arrays are randomly accessible by using subscript.
   * Sorting/Binary Search are possible and give best performance
   * Insertion/deletion incur huge cost of data Transfer. Heavy Insertion/deletion is costly and slow.
   * Array elements are stored in consecutive memory on the heap. Array is an object internally.
   * array is stored in heap

NOTE:- Insertion at end is not insertion it is called **APENDING**
```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayVsCollection {

	public static void main(String[] args) {
		int[] nums = {10,12,15,78,56,39,25,12,0,0,0,0}; //size-12
		//System.out.println(nums.length);
		//System.out.println(nums[5]); //valid 0-7
		//System.out.println(nums[7]); /*We can read array elements randomly by specifying subscript/index.*/
	    //System.out.println(nums[8]); //java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(nums[-1]); //java.lang.ArrayIndexOutOfBoundsException
		
		/*System.out.println(nums.getClass());
		System.out.println(nums.getClass().getSuperclass()); */

		
		//array Travesal
		/*
	    for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+ " ");
		}
		System.out.println();
		//reverse Travesal
		for(int i=nums.length-1;i>=0;i--)
		{
			System.out.print(nums[i]+ " ");
		}
		*/
		
		//Enhanced FOR Loop
		/*for(int val :nums)
			System.out.print(val+" ");*/
		
		//Insertion in array
		// array are static in nature i.e once declared you cannot increase their size
		//1.Insertion @begin
		/*for(int i=7;i>=0;i--)
		{
			nums[i+1]=nums[i];
		}
		nums[0]=5;
		System.out.println();
		for(int val :nums)
			System.out.print(val+" ");
		*/
	
		/*ArrayList lst = new ArrayList(); //Dynamic in Nature
		ArrayList lst2 = new ArrayList(5); // ArrrayList takes capacity which is minumum size.
		lst.add(10);                       //it takes subscript of range 0 -N-1
		lst.add(12);
		lst.add(98);
		lst.add(12);
		lst.add(58);
		lst.add(5);
		lst.add("ABC");
		
		System.out.println(lst.toString());
		*/
		//travelsal
		/*System.out.println();
		for(int i=0;i<lst.size();i++) {
			System.out.print(lst.get(i)+" ");
		}*/
		
		//Reverse travesal
		/*System.out.println();
		for(int i= lst.size()-1;i>=0;i--)
		{
			System.out.print(lst.get(i)+" ");
		}
		
		System.out.println();
		//enhanced forloop
		for(Object val : lst)      // lst is object of arrayList so object
			System.out.print(val+ " ");
		*/
	
		//TYPE SAFE ARRAYLIST
		ArrayList<Integer> intlst = new ArrayList<>();  //type Safe Ararylist 
		intlst.add(10);                        // IT will accommade reference of specific type 
		intlst.add(12);                        // and not of general Object Type.
		intlst.add(98);
		intlst.add(12);
		intlst.add(58);
		intlst.add(5);
		//intlst.add("ABC");   //at the compile time, the type safe list detects wrong type being added.
		
		System.out.println(intlst.get(5));  //Random pickup
		intlst.add(0,3);
		System.out.println(intlst);
		intlst.remove(4);
		System.out.println(intlst);
		System.out.println(intlst.contains(28));
		System.out.println(intlst.contains(12));
		
		Iterator<Integer> itr = intlst.iterator();
		while(itr.hasNext())
		{
			System.out.print (itr.next()+ " ");
		}
		System.out.println();
		
		ListIterator<Integer> Litr = intlst.listIterator(intlst.size());  //slloe travesal in both directions
		while(Litr.hasPrevious()) {
			System.out.print(Litr.previous()+ " ");
		}		
	}
}

```
2 Collections: ArraylIst, Vector, LinkedList, hashSet, TreeSet, Stack, queue 
   * Its a **framework** giving ready implementations of diff data-structures.
   * Collections can have only references to objects. (array can be of primitive as well as of reference)
        * lst.add(10) --> Primitive are automatically wrapped(autoboxed) BOXED into WRAPPER and then are added.
	* We can declare collections of type safe by using Generics (They are Templates in C++)
    * Generics make Collections type Ssafe and Makes compile Time detection of addition of wrong type of element into it.  

3. ArrayLists
   * Dynamic Arrays which are stored in Consecutive memeory but automatically INC in capacity. 
   * randomly accessible, can hold duplicates. Sort/Search Like algorithms work faster.
   * Like Arrays, INSERTION/DELETION incurs Huge data transfer cost so not good for frequent insertion/deletion.
   * ArrayList inherits AbstractList class and implements List interface.
   * ArrayList is initialized by a size, however the size can increase if collection grows or shrunk if objects are removed from the collection.
   * Java ArrayList allows us to randomly access the list.
   * ArrayList automatically elongates itself by 50%. Initial size of array list is 16. It grows by 50% (Point added by Ms. Bhavana Ingole).
   * Vectors are always synchronized. ArrayList is by default unsynchronised. but you can make it synchronized.
   * Vector & arraylist Synchosied (others have to wait.. so slows down system)
   * so solutions is - **CONCURRENT COLLECTIONS**
   * Capacity: a Minimum memory reserved for Arraylist. by default is 16.
   * ArrayList maintains the order of Insertion.
   * Insertion and Deletion 



4. COLLECTION API
   * Interfaces:
        * Iterable: Iterable interface makes every collection to traverse using Enhanced FOR Loop. With this we can call Iterate() on the collection and create Iteravle code.
        * Collection: Super Interface in Collection API.
        * List Interface: Maintains order of Insertion. Allow duplicates. allow reverse travelsal using ListIterator
            * These properties are applicable to Arraylist, LinkedList, Vector 
        * ListIterator: Extended from  Iterator. So ithas hasNext() and next() like methods. In Addition it has hasPrevious() and previous() methods.
            * It is extended by List Interface only and thus not avaialbe in other interfaces as well classes

        * Set Interface: does not allow duplication. Does not guarantee you order of insertion. It gives data either in no order(HashSet) or ascorder(TreeSet)
            * The Exception in the ordering is LinkedHashSet which gives dat ain order of Insertion.
        
        * List Implementations: 
            * ArrayList : it inc automatically in size.
            * LinkedList:  Linked List in collection is Doubly Linked List.
                * Single Linked List: it can be traversed in ONE direction only. It can not Traversed in reverse. 
                * Double Linked List: traversed in Both directions It uses List Iterator.
                ![Linked list]()
            * Vector : Dynamic Aray with Synchronization by default. it inc automatically in size.
        
```java
import java.util.Comparator;
import java.util.LinkedList;

public class ApplyLinkedList {

	public static void main(String[] args) {
		 LinkedList lst = new LinkedList();
		 lst.add(15);
		 lst.add("ABC");
		 lst.add(new Emp(10));
		 
		 LinkedList<Integer> intLst =new LinkedList<>();
		 intLst.add(15);
		 //intLst.add("ABC");
		 //intLst.add(new Emp());
		 
		 LinkedList<String> strLst =new LinkedList<>();
		 strLst.add("ABC");
		 
		 LinkedList<Emp> empLst =new LinkedList<>();
		 empLst.add(new Emp(10));
		 empLst.add(new Emp(15));
		 empLst.add(new Emp(28));
		 empLst.add(new Emp(12));
		 empLst.add(new Emp(89));
		 empLst.add(new Emp(55));
		 
		 System.out.println(empLst);
		 Emp emp = empLst.get(2);  //this method sequentially reaches to the 
		                          //element at index and then gives that referecne.
		 System.out.println(emp.getEmpNo());
		 System.out.println(empLst.remove(3));
		 System.out.println(empLst.contains(28)); //it is there in list
		 /*Implementation of equals() is necessary. this implementation has been already 
		  * written in Wrapper classes and a string class*/
		 Emp empSearch = new Emp(28);
		 System.out.println(empLst.contains(empSearch));
		 
		 empLst.sort(new CompareOnEmpNo()); //Quick Sort(faster for small data) merge Sort-> Mostly
		 System.out.println(empLst);	 
	}
}
class CompareOnEmpNo implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		int empNo1=o1.getEmpNo();
		int empNo2 =o2.getEmpNo();
		if(empNo1< empNo2)
			return -1;
		else if(empNo1> empNo2)
			return 1;
		else 
			return 0;
	}
}

EMP CLASS
public class Emp implements Comparable<Emp>{
	private int empNo;

	public Emp(int empNo) {
		super();
		this.empNo = empNo;
	}

	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empNo != other.empNo)
			return false;
		return true;
	}

	@Override
	public int compareTo(Emp o) {
		 
		int empNo2 =o.getEmpNo();
		if(empNo < empNo2)
			return -1;
		else if(empNo > empNo2)
			return 1;
		else 
			return 0;
		 
	}
    
}
```
5. ARRAYLIST vs LINKEDLIST 
   * Similarities: 
        * Both from List interface
        * Both Traversible in both directions
        * Both Maintains order of iNsertion
    * Differences
        * Ararylist consumes consecutive memory in HEAp. Linked List holds in Nodes where nodes may not be in consecutive memory.
        * LinkedList: Insertion/deletion is very fast as no data transfer is incurred but just change in the links.
        * LinkedList is not randomly accessible. it is sequentially accessibe. Not good for Searching/sorting.

    * What to Use when heavy insertions and fast Searching is needed.
        * Use **Set** Implementations.

6. HashSet
    * It don't Allow duplicate and print in order of add.
    * it does not get() method
    * HashSet<Class> to make hashset work properly, Hashcode is needed to overriden in class file definaltey. <String>, <integer> classes already have HAshcode and Equals method implemented in it, but for custom class we have to implicity define hashCode() and Equals().
    * For custom classes, overrinding of hashcode() prevents duplicate.
    * The LinkedHashSet gives you order of insertion
    
    * Best for heavy insertion deletion
    * Best for quick searching
    * prefer when you have large chunk of data may be to transfer from data base or files. 

    * it consumes large space right from beginning.
```java
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ApplyHashSet {

	public static void main(String[] args) {
		/* It don't Allow duplicate and print in order of add.
		 * */
		 HashSet<Integer> hSet =new HashSet<>();
		 hSet.add(15);
		 //hSet.add("af");
		 hSet.add(25);
		 hSet.add(10);
		 hSet.add(45);
		 hSet.add(5);
		 hSet.add(34);
		 hSet.add(5);
		 /*
		 System.out.println(hSet.toString());
		 System.out.println(hSet.contains(10));
		 System.out.println(hSet.contains(48));
		
		 for(int val : hSet)
		 {
			 System.out.println(val);
		 }*/
		 
		 //hSet.forEach(x->System.out.print(x+ " "));
		 
		 /*
		  * Object[] intarr = hSet.toArray();
		 for(int i=0;i<intarr.length-1;i++)
			 System.out.print(intarr[i]+", ");
		 System.out.println(intarr[intarr.length-1]);
		 
		 Iterator iter = hSet.iterator();
		 
		 */
		 /*
		 System.out.println(hSet.remove(45));
		 System.out.println(hSet);
		 */
		 /*
		 LinkedHashSet<String> names =new LinkedHashSet<>();
		 names.add("Ashlesh");
		 names.add("ash");
		 names.add("mrbeast");
		 names.add("chandler");
		 System.out.println(names);
		 
		 System.out.println(names.contains("Ash"));
		 
		 */
		 /*
		 HashSet<Emp> empSet =new HashSet<>();
		 empSet.add(new Emp(10));
		 empSet.add(new Emp(15));
		 empSet.add(new Emp(28));
		 empSet.add(new Emp(12));
		 empSet.add(new Emp(89));
		 empSet.add(new Emp(55));
		 empSet.add(new Emp(89));
		 
		 System.out.println(empSet);
		 
		 Emp emp = new Emp(89);
		 System.out.println(empSet.contains(emp));  //hashcode and equals methods
		  */                                          //
		 
		 /*
		 LinkedHashSet<Emp> empSet =new LinkedHashSet<>();
		 empSet.add(new Emp(10));
		 empSet.add(new Emp(15));
		 empSet.add(new Emp(28));
		 empSet.add(new Emp(12));
		 empSet.add(new Emp(89));
		 empSet.add(new Emp(55));
		 empSet.add(new Emp(89));
		 
		 System.out.println(empSet);
          		 
		 Emp emp = new Emp(89);
		 System.out.println(empSet.contains(emp));
		 */
	}

}
```  
7. TreeSet
    * Always give you contents in ascending order. No Duplicates
    * it is binary Serach Tree.
    * Traversal of such tree gives asc order o/p
    * For wrapper and Strings, comparision logic has already been written
    * for Emp(Custom class) need to write comparator/camparable(this is req).
```java
import java.util.Comparator;
import java.util.TreeSet;

public class ApplyTreeSet {

	public static void main(String[] args) {
		/*
		TreeSet<Integer> tset =new TreeSet<>();
		tset.add(15);
		tset.add(26);
		tset.add(9);
		tset.add(18);
		tset.add(16);
		tset.add(26);
		
		System.out.println(tset);
		
		TreeSet<String> names =new TreeSet<>();
		 names.add("Ashlesh");
		 names.add("ash");
		 names.add("mrbeast");
		 names.add("chandler");
		 System.out.println(names);
		 
		 TreeSet<Emp> empset =new TreeSet<>(new CompareOnEmpNo1());
		 empset.add(new Emp(10));
		 empset.add(new Emp(15));
		 empset.add(new Emp(28));
		 empset.add(new Emp(12));
		 empset.add(new Emp(55));
		 empset.add(new Emp(89));
		 empset.add(new Emp(55));
		 System.out.println(empset);
		 */
		 
		 TreeSet<EmpN> empset2 =new TreeSet<>(new CompareOnEmpNo2());
		 empset2.add(new EmpN(10,"AA","EEEE"));
		 empset2.add(new EmpN(15,"BB","GGGG"));
		 empset2.add(new EmpN(28,"CC","CCCC"));
		 empset2.add(new EmpN(12,"DD","DDDD"));
		 empset2.add(new EmpN(55,"EE","AAAA"));
		 empset2.add(new EmpN(89,"FF","FFFF"));
		 empset2.add(new EmpN(55,"GG","BBBB"));
		 
		 for(EmpN val : empset2)
			 System.out.println(val);
		 System.out.println();
	}

}
class CompareOnEmpNo2 implements Comparator<EmpN>{
	   //aadhar
		@Override
		public int compare(EmpN o1, EmpN o2) {
			String empAd1=o1.getAadhar();
			String empAd2 =o2.getAadhar();
			return empAd1.compareTo(empAd2);
		}
	}
class CompareOnEmpNo1 implements Comparator<Emp2>{

	@Override
	public int compare(Emp2 o1, Emp2 o2) {
		int empNo1=o1.getEmpNo();
		int empNo2 =o2.getEmpNo();
		if(empNo1 < empNo2)
			return 1;
	
		else 
			return 0;
	}
}

IN OTHER FILE
public class EmpN {
	private int empNo;
    private String name;
    private String aadhar;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "EmpN [empNo=" + empNo + ", name=" + name + ", aadhar=" + aadhar + "]";
	}
	public EmpN(int empNo, String name, String aadhar) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.aadhar = aadhar;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadhar == null) ? 0 : aadhar.hashCode());
		result = prime * result + empNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpN other = (EmpN) obj;
		if (aadhar == null) {
			if (other.aadhar != null)
				return false;
		} else if (!aadhar.equals(other.aadhar))
			return false;
		if (empNo != other.empNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
```   

8. Comparator: is an Interface implemented by separate clas which has to override 'compare(para1,para2)' method.   
    * is for additional comparison on Candidate key. ex cellno, pan aadhar, salaccno 
9. comparable : is an interface implemented by entity class.(class Emp), 
    * the method is override is 'compareto(para)' method.
    * for natural comparision on like Primary key. ex empno
    


10. Map : is part of Collection but not considered in API.   basically for Key-value pairs. purpose of quick search
    * map are for lookUp tables.
    * example
```java
    1. HR: empNo(key)  and others of Values
    2. online shopping: Product List, productId(key), Productdetails(Values)
    3. Accounts:   TransactionID(Key), Transcationdetails(Values)
```
```java
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ApplyMaps {

	public static void main(String[] args) {
		 /*
		 HashMap<Integer, String> hmap = new HashMap<>();
		 hmap.put(110, "Ashlesh");
		 hmap.put(115, "Pwedypy");
		 hmap.put(117, "Candler");
		 hmap.put(200, "Chris");
		 hmap.put(121, "Jimmy");
		 hmap.put(918, "MrBeast");
		 
		 System.out.println(hmap);
		 */
		
		 HashMap<Integer, EmpN> Emap = new HashMap<>();
		 Emap.put(10,new EmpN(10,"AA","EEEE"));
		 Emap.put(15,new EmpN(15,"BB","GGGG"));
		 Emap.put(28,new EmpN(28,"CC","CCCC"));
		 Emap.put(12,new EmpN(12,"DD","DDDD"));
		 Emap.put(55,new EmpN(55,"EE","AAAA"));
		 Emap.put(89,new EmpN(89,"FF","FFFF"));
		 Emap.put(55,new EmpN(55,"GG","BBBB"));
		
		 System.out.println(Emap);
		 System.out.println(Emap.get(3));
		 System.out.println(Emap.get(55));
		 
		 Set<Integer> allKeys = Emap.keySet();
		 System.out.println(allKeys);
		 
		 Collection<EmpN> emplist =Emap.values();
		 System.out.println(emplist);
		 
		 System.out.println();
		 Set<Entry<Integer,EmpN>> list = Emap.entrySet();
		 for(Entry<Integer,EmpN> record: list)
		 {
			 System.out.println(record.getKey()+" - "+record.getValue());
		 }
	}

}
```
11.  
    * hashMap -> no duplicates allowed , also all key values have to be mentioned while inserting
        * Emap.keySet() return in Set, Emap.values() return in Collections.
    * TreeMap

=======================================================================================
Assignment 
1. Consider an Integeer aray with values as example as 5, 17,12,9,18
    create a new array with values:  5, 22 , 34, 43, 59

2. List has Emp(EmpNo, Name, deptNo) 10,20,30 each employee will work in any one given dept nos.
       sort the list in asc order of deptno
       print them dept : 10
             employee no name.
3. list of list of numbers 
     list[0]->list[1,2,3,4]
     list[1]->list[5,6,7,8]
     list[2]->list[9,0,1,2]
        find horizontal sum of each row
        find vertical sum of each row.