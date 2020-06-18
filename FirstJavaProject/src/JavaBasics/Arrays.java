// ### Arrays#####

package JavaBasics;

public class Arrays {

	public static void main(String[] args) {

		int i[]= new int[5];

		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;

		for(int j=0; j<i.length;j++){
			System.out.println("The value of i is " +i[j]);
		}
		//	Similarly we can have arrays of all types: boolean, string, double etc.
		// if we try and access the array index[4](ex: j<=i.length instead of j<i.length). which does not exist. Then it will give an exception called. ArrayIndexOutOfBounds exception.


		//disadvantages: 
		//		1. Static in size : - To overcome these disadvantages we use---> collections, ArrayLists,HashTables, dynamic arrays.
		//		2. Stores only similar data type objects.: To overcome this we use ----> Object arrays.

		// ##Lets see how to create object arrays;

		Object obj[] = new Object[6];
		obj[0]= "Tom";
		obj[1]= "20000";
		obj[3]= "1-1-2020";
		obj[4]= 'M';
		obj[5]= 12.555;

		System.out.println(obj[5]);

		for (int k=0; k<obj.length;k++){
			System.out.println(obj[k]);
		}


		// ##### Lets define a two dimentional array.

		String m[][]= new String[6][6];
		// m has 7 rows and 7 columns.

		// lets print the length of two dimensional array.

		System.out.println("The length of two dim array m is "+ m.length);
		// To get the number of columns in twod dim array. We have to get the length of row #0. See --->
		System.out.println("The number of columns in two dim array m are " +m[0].length);

		// we have so far seen how to declare two dim array, now lets see how we can declare values in those two dim arrays.

		m[0][0]= "Kiran";
		m[0][1]="Ravindra";
		m[0][2]= "Paranjape";
		m[0][3]= "Flat No 5";
		m[0][4]= "lane 4, Swastishree Society";
		m[0][5]= "Pune 52";
 
		m[1][0]= "Kiran";
		m[1][1]="Ravindra";
		m[1][2]= "Paranjape";
		m[1][3]= "Flat No 5";
		m[1][4]= "lane 4, Swastishree Society";
		m[1][5]= "Pune 53";
 
		m[2][0]= "Kiran";
		m[2][1]="Ravindra";
		m[2][2]= "Paranjape";
		m[2][3]= "Flat No 5";
		m[2][4]= "lane 4, Swastishree Society";
		m[2][5]= "Pune 54";
 
		m[3][0]= "Kiran";
		m[3][1]="Ravindra";
		m[3][2]= "Paranjape";
		m[3][3]= "Flat No 5";
		m[3][4]= "lane 4, Swastishree Society";
		m[3][5]= "Pune 55";
 
		m[4][0]= "Kiran";
		m[4][1]="Ravindra";
		m[4][2]= "Paranjape";
		m[4][3]= "Flat No 5";
		m[4][4]= "lane 4, Swastishree Society";
		m[4][5]= "Pune 56";
 
		m[5][0]= "Kiran";
		m[5][1]="Ravindra";
		m[5][2]= "Paranjape";
		m[5][3]= "Flat No 5";
		m[5][4]= "lane 4, Swastishree Society";
		m[5][5]= "Pune 57";
 
		System.out.println(m[0][5]);
		for(int row = 0; row < m.length; row++)// this will run the loop for number of rows in the m. thats is 7
		{
			for (int col=0; col<m[0].length;col++){// this will run for all the columns in the arra m. 
				System.out.println(m[row][col]); // this will print the values.
			}
		}
	}





}


