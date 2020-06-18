package OOPsConcept2;

public class childClass1 extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClass1 c1 = new childClass1 ();
		c1.print();
		c1.callFromChild();
		c1.ChildOnly();
		c1.childonly1();
	}

	public void print() // when parent and child class have functions with same name and same parameters this is call function overriding.
	{
System.out.println("In child class print function");
	}

	public void ChildOnly(){
		System.out.println("Child only method. This cannot be called using parent class object");
	}
	public void childonly1(){
		
		System.out.println("In child specific method childOnly");
	}
}
