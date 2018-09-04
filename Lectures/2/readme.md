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
	a. The conceptual picture (the user's view of what the object looks like, how the structure is organized)
	b. the conceptual operations (what the user can do with ADT)
2. The private or internal part, which consists of: 
	a. the representation (how the structure is actually stored)
	b. the implementation of the operations (the actual code)