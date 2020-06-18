package OOPsConcepts1;
// This program deals with function, their types, definitions and calls.

public class FunctionsInJava {

	public static void main(String[] args) {
// main method is void because it never returns anything.
		
		// object creation.
		FunctionsInJava a = new FunctionsInJava();
		// start calling the functions defined.
		a.ReturnNothing();
		int x= a.ReturnsInt(); // storing the returned value in an int and later print it.
		System.out.println(x);
		int y= a.TakesInputReturnsInt(10, 5); // same as above comment
		System.out.println(y);
	}
	// 1st type of function that does not take any input and does not return anything

	public void ReturnNothing(){
		System.out.println("In ReturnsNothing function");

	}

	// 2nd type of 
	//function that does not take any input but returns a data type hence we cannot use void in fn declaration and use the data type that is returned.
	public int ReturnsInt(){
		System.out.println("In function ReturnsInt");
		int a=4; int b=5;int c=a+b;
		return c;

	}
// third type of function that takes inputs and returns a data type.
	
	public int TakesInputReturnsInt(int i, int j){
		
		int k=i/j;
		return k;
	}
}
