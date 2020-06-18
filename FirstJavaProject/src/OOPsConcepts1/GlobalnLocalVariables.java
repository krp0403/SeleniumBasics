package OOPsConcepts1;

public class GlobalnLocalVariables {
	// lets declare some non static global variables. 
	//	Remember that for accessing these variables in a function we have to use the object of the class.

	int age =40;
	String Name= "Tom";

	public static void main(String[] args) {

		// local variables to the main method
		int i = 10;
		int j = 20;
		System.out.println("The value of local variables i and j in main method is " +i+" "+j);
		System.out.println("The sum of two local variables is "+(i+j));
		// lets access the global variables age and name.
		// create an object of the class. 
		GlobalnLocalVariables c1 = new GlobalnLocalVariables();	
		
		//now call the global variables using the object created.
		System.out.println(c1.Name);
		System.out.println(c1.age);
		c1.test();
	}

	public void test(){

		int i=20;
		int j=30;

		System.out.println("The value of local variables in test method is  " + i+" "+j);

	}
}
