package OOPsConcepts1;

public class CallByValueCallByReference {

	public static void main(String[] args) {

	// create object of the class.
	
		CallByValueCallByReference obj = new CallByValueCallByReference();
		int a=10;
		int b = 20;
		obj.testsum(a,b);
	}
	//Call by value method definition. 
	public int testsum(int x, int y)
	{
//		x= 40;
//		y=60;
		int z=x+y;
		return z;
	
	
	
	
	
	}

}
