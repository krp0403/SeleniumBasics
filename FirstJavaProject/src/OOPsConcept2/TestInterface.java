package OOPsConcept2;

//#### With this class we will test the interfaces and the classes implementing the interface
public class TestInterface {

	public static void main(String[] args) {
		
		ImplementsExample I1 = new ImplementsExample();
		I1.interface1(); // calling the methods from interface
		I1.ImplementsMethod();// calling the method from the implements example class implementing the interface.
		I1.intFace2();// this is the method from 2nd interface that the class ImplementsExample is implementing
		System.out.println("The value of integer defined in interface is "+InterfaceExamples.interfaceInt);
		
		
		

	}

}
