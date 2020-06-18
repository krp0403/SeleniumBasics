package OOPsConcepts1;

public class WrapperClassConcepts {
//	wrapper classes are used to convert data type A into data type B;
	public static void main(String[] args) {

		String a = "100";
		int b = 20;
		System.out.println(a+b); // this will not add 100+20; but rather concatinate 100 and 20--> 10020 since 100 is a string.
		//Lets use the wrapper class object to convert String a into Integer.
		int j = Integer.parseInt(a);// will parse value of String a to int a == 100;We need to store it into an integer.s
		System.out.println(j+b);// will now print 120; See-->
		
		// similarly we can use the wrapper classes:--> Double,Float,boolean
		
		String t = "true";
		boolean bb = Boolean.parseBoolean(t);
		System.out.println(bb);
	
	// For converting integer to string use valueof(integer) function.
		
		int k = 300;
		System.out.println(k+20);// will make 320.
		String s = String.valueOf(k);
		System.out.println(s+20);
		
		
		System.out.println("For parsing string to int the value of string should be pure int or otherwise");
		System.out.println("it will show NumberFormattingException.");
		
		try{
		String testParse = "110A";
		Integer.parseInt(testParse);
		}catch (NumberFormatException e){
			
			System.out.println("Improper string to convert to int");
			}
	}

}
