package OOPsConcept2;

public class TestPolymorphism {

	public static void main(String[] args) {
		// lets test the polymorphism. 
// 1. Static Polymorphism
		childClass1 c1 = new childClass1 ();
		c1.callFromChild();
		c1.print();
		c1.childonly1();
		
//2. Dynamic polymorphism
		// dynamic polymorphism where we can create a child class object by referring to parent class.
		// however the parent class object cannot use the methods defined in the child class. But viceVersa is allowed.
		parent p1 = new childClass1(); 
		p1.parentMethod();
		
		
		 

	}

}
