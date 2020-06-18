package OOPsConcept2;

public class ImplementsExample implements InterfaceExamples, InterfaceExample2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		
	}

	
	public void ImplementsMethod(){
		
		System.out.println("In implements method");
	}

	@Override
	public void intFace2() {
		System.out.println("Method from second interface.");
		
	}
}
