package OOPsConcept2;

public class parent {

	public static void main(String[] args) {
	
		parent p1 = new parent();
		p1.callFromChild();
		p1.print();
		p1.parentMethod();
		
		}
	
	public void print (){
		System.out.println("In Parent method");	

	
	}

	public void parentMethod(){
		
		System.out.println("In ParentMethod not for child  ");
	}
	public void callFromChild(){
		System.out.println("Called from parent class");
	}
}
