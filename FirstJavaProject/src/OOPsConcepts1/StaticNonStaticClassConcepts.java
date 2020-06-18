package OOPsConcepts1;

public class StaticNonStaticClassConcepts {

	String name = "tom"; // non static global var.
	static int age = 30; // static global variable.

	public static void main(String[] args) {
		// calling static methods and variables: 
		//There are 2 ways we can call static methods/variables. One is by directly calling the method.
		System.out.println("There are 2 ways we can call static methods/variables. One is by directly calling the method.");
		test2();
		//Second is by calling it using the class name .---> className.staticMethod();
		StaticNonStaticClassConcepts.test2();
		System.out.println("###########################################");
		System.out.println("calling static variables similar way. 1. direct and 2. with className.variableName.");
		// calling static variables similar way. 1. direct and 2. with className.variableName.
		System.out.println(age);
		System.out.println(StaticNonStaticClassConcepts.age);
		System.out.println("###########################################");
		System.out.println("###########################################");
		
		System.out.println("Calling non static variables. We have to declare an object and then use that object to call the var/method.");
		
		StaticNonStaticClassConcepts obj = new StaticNonStaticClassConcepts();
		System.out.println("The non static variable is " +obj.name);
		StaticNonStaticClassConcepts.test2();
		
		System.out.println("###########################################");
		System.out.println("summarry: Static variables can be accessed directly. but non static var/methods must be accessed using object of the class.");
		System.out.println("###########################################");
	
	
	
	}
	public void test1(){
			System.out.println("In Test1 which is non static method");
	}

	public static void test2(){
			System.out.println("In Test2 which is a static method");
	}

}