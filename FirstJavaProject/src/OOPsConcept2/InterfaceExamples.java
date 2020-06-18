package OOPsConcept2;
/* Interfaces are abstract in nature
 * Interfaces do not have function definition.
 * they only have function declarations.
 * we cannot change values of the variables declared in an interface.
 * variables are by default static in an interface.
 * Most importantly we cannot create objects of an interface. 
 * class implementing the interface has to implement (define) all the methods in Interface. And have its own additional methods as well.
 * example:--->  public class ImplementsExample implements InterfaceExamples { has to implenment all the methods from "interfaceexamples".
 * Once class can implement more than 1 interfaces. With the same rule that it has to implement all functions of the respective interfaces.
 * 
 * Interface relationship (between classes and interfaces ) is also called as "is-a relationship"
 * Static methods are allowed in interface and there is also a new type called default for method declarationn 
 * Interfaces achieve 100% abstraction. That is it has only method declarations and no definitions.
 * 
 * There is no need to mention the keyword Abstract in the interface. However it is mandatory for abstract classes to mention abstract.
 * ##################abstract classes###### 
 * abstract classes achieve partial abstractions since they also have non abstract methods and their definitions along with abstract methods.
 * 
 * Abstract classes need to have atleast 1 abstract method (just declaration and no definition.
 * Abstract class can have non abstract methods as well. That means methods with definition. 
 * The class that extends the abstract class should define the abstract method. ex: (a extends b then b.defineabstractMethod)
 *  * However it is not mandatory to define/ override other non abstract methods (by that class) 
 */ 




public interface InterfaceExamples {

	int interfaceInt = 100; // static and final by default.
	
	public void interface1();
	
	public void interface2();
	
	public void interface3();
	
}
