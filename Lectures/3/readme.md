# Generics in Java 

### Advanteges: 

- Enable types to be parameteres when defining classes, interfaces, and methods. 
- it is possible to create a single class that works with different types of data 
- A class, interface, or method that operates on a parameterized type is called generic. 

### how to define a generic class 

```java 
class name <T1, T2, .... , Tn> { ..... }

```

1. Angle brackets delimt type parameter section 
2. clss name specifies the type parameters T1, T2, ..., Tn 

```java 
public class Box<T> {
private T t; 
public void set (T t) {this.t = t; }
}
```

### how to use it 

1. to reference the generic Box class, you use the generic type inovacation, replacing T with some concrete value, such as Integer. 
2. AN invocation of a generic type is known as a parameterized type. 
3. To instantiate the class 

//insert example from the lecture here 


how is it possible to use a primitive type int with generics, like the example below? 
```java 
	Gen<int> s = new Gen<int>(50); 
```
clearly, 50 is a primitive type, not an Integer object. But java, converts 50 from int, to Integer, in a process called autoboxing. 
Autoboxing is also applicable to Doubles and so on. 

```java 
 Gen<int> int1 = new Gen<int>(53); 
 ``` 
 the example above won't work because generics don't work with primitive types. 

Remark: when we compile the generic code, it's translated into a no generic code. so for example: 

```java 
public class Node<T> {
	private T data; 
	private Node<T> next; 

	public Node(T data, Node<T> next){
		this.data = data; 
		this.next = next; 
	}

	public T getData(){ return data;}
}

//at runtime, the compiler replaces it with 

public class Node {
	private Object data; 
	private Node next; 

	public Node(Object data, Node next){
		this.data = data; 
		this.next = next; 
	}
	public Object getData(){ return data;}

}

``` 

but what's the point? well, because all the code written before generic time must run too. This process is called type erasure. 

Remark: use javap -c filename to view how the code changes after complining 


### more advantages:

1. Stronger type checks at compile time 
2. Elimination of casts 
3. Enabling programmers to implement generic algorithms 


**Note** a generic class can have multiple types. 

## Generic Methods 
These are the methods that introduce their own parameters. 
- similiar to declaring a generic type 

```java 
class stats<T> {
	T[] nums; 
	stats(T[] o){
		nums = o; 
	}
	double average(){
		double sum = 0.0; 
		for (int i : nums){
			sum += i.doublevalue();  
		}
		return sum/nums.length
	}
}
``` 

there's an issue with the code above, what if declare stats<String>? 
The solution is actually pretty simple 

```java 
class stats<T extends Number>
``` 

the compiler will then know what to do 

//insert example here ...stats code 

if we use 
```java 
stats<String> x = new stats<String>(array); 
```
the compiler will give us an error because **String** doesn't extend Number 

Another example: 

```java 
class stats<T extends Number> {
	T[] nums; 
	stats(T[] o){
		nums = o; 
	}
	double average(){
		double sum = 0.0; 
		for (int i : nums){
			sum += i.doublevalue();  
		}
		return sum/nums.length
	}


	boolean  sameAve(stats<T> ob){
		if (average() == ob.average())
			return true; 
		return false; 

	}
}
``` 

apparently, there's an issue with the example above that I don't know. 

using wildcard, ?, we can relax the condition such that 
```java 
boolean sameAve(stats<?> ob)
``` 


//the last example wakeup.. insert code here 
the second line is pointing to a list of strings, we cannot do that. 