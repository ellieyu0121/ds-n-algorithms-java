Welcome to Lecutre 2! 

<h3>Abstract Data Types: </h3>

What's a good code? 

-Easy to understand 

-Correctness 

-Efficiency 

-Easy to change in case there're new requirments 

So in general: 

1. It works (as specified)
2. It is easy to understand and modify 
3. It is reasonably efficient 

One way to help is toi use <b>abstract data types or ADTs</b>


Abstraction: the process of which we point out some qualities and we don't care about the other details. 

ADT: are an instance of a general principle in software engineering which goes by many names: 

	Abstraction: hiding low-level details with a simpler, higher-level idea

	Modularity: Dividing a system into components or modules, each of which can designed, implemeneted, tested, reasoned about, and reused sparately from the rest of the system. 

	Encapsulation: building walls around a module so that hte module is responsible for its own internal behavior, and bugs in other parts of the system can't damage its integrity. 

	Infomration hiding: Hididng information of a module's implementation from the rest of teh system, so that those details can be changed later without changing the rest of teh system. 

	separation of concerns: making a feature that its responsibility is one task. 

<h3>User-defined types</h3>

1- Built-in types - such as integers 

2- built-in procedures, input and output 

3- users can define their own procuedures


A type is characterized by the operations you can perform on it: 

	-A number is something you can add and multiply 

	-a string is something you can concatenate and take substrings of

	-a boolean is something you can negate and so on 

All that matters is the operations 

<h3>Classifying Types and Operations </h3>

Types can be classified as: 

1. Mutable: objects of a mutable type can be changed: that is they provide operations which when excuted cuase the results of other operations on the same object to give different results. Data is mutable 
2. Immutable: objects cannot be changed 
String is immutable: because its operations create new String objects rather than changing existing ones. Same for integers. 


<h3>Operations</h3>

the operations of an abstract type can be classified as follows: 

1. Creators: create a new object of the type. A creator may take an object as an argument, but not an object of the type being constructed. 
2. Producers: create new objects from the old objects of the type 
3. Observers: take objects of the abstract type and return objects of a differnet type. 
4. Mutators: change objects

<h3>ADTs</h3>

There are two parts to each ADT: 

1. The public or external part, which consists of: 

	* The conceptual picture (the user's view of what the object looks like, how the structure is organized)
	* the conceptual operations (what the user can do with ADT)
2. The private or internal part, which consists of: 
	* the representation (how the structure is actually stored)
	* the implementation of the operations (the actual code)

An examle: 

	*creators: ArrayList and linkedList constructors 
	*Producers: collections.unmodifiableList 
	*Observers: size, get
	*Mutator: add, remove


Random: why are strings immutable?


Example1 

	public class example1 {
	    public static void main(String[]args){
	        String str1 = "hey";
	        String str2 = "hey";
	        String str3 = new String("hey");
	        if (str1 == str2)
	            System.out.println("same1");
	        if (str1.equals(str2))
	            System.out.println("same2");
	        if (str1.equals(str3))
	            System.out.println("same3");
	        if (str1 == str3)
	            System.out.println("look same");
	        else
	            System.out.println("nope");
	    }
	}

output:

	same1
	same2
	same3
	nope

Java uses part of the momory called the pool of strings to store all the strings. Every time you check for a string literal, Java will check in that pool of strings 

use reference: https://www.baeldung.com/java-string-pool

<h3>Java Memory</h3>

Stack: 
Responsible for holding references to heap objects and for storing value types 

Heap: 
Stores the actual object in memoy. Those are refernces from the variable from the stack 

![alt memory](https://raw.githubusercontent.com/sigmazain/ds-n-algorithms-java/master/Lectures/2/src/memory.png)

What happens in recursion, if we start computing factorial for 1000, that means, we have to compute the factorial for 999, then 998, then 997, and so on... so there are many calls to the function that need to be stored at the memory. 

The role of the garbadge collector: 

-a program that manages memory automatically 

-an object uses some meory and the memory remains allocated till there are references for the use of the object. 

-when there are no references to an object, it is assumed to be no longer needed and the memory, occupied by the object, can be reclaimed.  


Example2 

	public class example2 {
	        int a, b;
	        public void setData(int c, int d){
	            a = c;
	            b = d;
	        }
	        public void showData(){
	            System.out.println(a + " " + b);
	        }
	        public static void main(String [] args){
	            example2 s1 = new example2();
	            example2 s2 = new example2();
	            s1.setData(1,2);
	            s2.setData(3,4);
	            s1.showData();
	            s2.showData();
	            example2 s3;
	            s3 = s2;
	            s3.showData();
	        }
	}


so in the case above, we simply make s3 point to s2

	public class example2 {
	        int a, b;
	        public void setData(int c, int d){
	            a = c;
	            b = d;
	        }
	        public void showData(){
	            System.out.println(a + " " + b);
	        }
	        public static void main(String [] args){
	            example2 s1 = new example2();
	            example2 s2 = new example2();
	            s1.setData(1,2);
	            s2.setData(3,4);
	            s1.showData();
	            s2.showData();
	            example2 s3;
	            s3 = s2;
	            s3.showData();
	            s2 = null;
	            s3.showData();
	        }
	}

in the case above, s2 is no longer pointing to that object. S3 will still hold the same values. You might think that the Garbadge collector is going to remove that object since we set s2=null. but it won't because s3 is still pointing at it. 

	public class example2 {
	        int a, b;
	        public void setData(int c, int d){
	            a = c;
	            b = d;
	        }
	        public void showData(){
	            System.out.println(a + " " + b);
	        }
	        public static void main(String [] args){
	            example2 s1 = new example2();
	            example2 s2 = new example2();
	            s1.setData(1,2);
	            s2.setData(3,4);
	            s1.showData();
	            s2.showData();
	            example2 s3;
	            s3 = s2;
	            s3.showData();
	            s2 = null;
	            s3.showData();
	            s3 = null; 
	            s3.showData();
	        }
	}

in the case above, there are no references to that object anymore. In that case, we can't access it or use it. It's not reachable anymore. In that case, the Garbadge collector will take care of it and get rid of it. 