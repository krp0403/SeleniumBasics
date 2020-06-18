package JavaBasics;

public class ComparisonOPerators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int o = 100;
			int p = 200;
			int q = 40;
			
			if (o > p & o > q){ 
				System.out.println("O is the greatest number of 3 numbers");
			
			}
			else if (p > q){
				System.out.println("p is the greatest number of 3 numbers");
			}
			else {
				System.out.println("q is the greatest number of 3 numbers");
			}

			int s = 20;
			int r= 230;
			int k = 30;			
			if (s == r){
				System.out.println("S and R are equal");
				
			}
			else { 
				System.out.println("S and R are not equal");
			}
	}

}
