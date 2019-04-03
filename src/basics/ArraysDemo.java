package basics;

/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public class ArraysDemo {
	public static void main(String[] args) {
		// declare an array
		int[] marks = new int[6];

		// store the data in the array
		marks[0] = 19;
		marks[1] = 21;
		marks[2] = 24;
		marks[3] = 17;
		marks[4] = 20;
		marks[5] = 21;

		// find the nubmer of elements in an array
		System.out.println(marks.length);

		// retrieve the data from the array
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
//		System.out.println(marks[5]);
//		System.out.println(marks[6]);
		
		System.out.println("printing marks values using for each loop");
		for(int mark : marks) {
			System.out.println(mark);
		}

		System.out.println("printing marks values using for loop");
		for(int i = 0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		// initialize 1D array
		double[] percentages = { 7.6, 8.1, 7.9, 6.8, 8.3, 9.1 };
		System.out.println(percentages.length);

//		System.out.println(percentages[0]);
//		System.out.println(percentages[1]);
//		System.out.println(percentages[2]);
//		System.out.println(percentages[3]);
//		System.out.println(percentages[4]);
//		System.out.println(percentages[5]);
		
		for(double percentage : percentages) {
			System.out.println(percentage);
		}

		// declare a 2D array
		int[][] matrix1 = new int[2][2];

		matrix1[0][0] = 1;
		matrix1[0][1] = 0;
		matrix1[1][0] = 0;
		matrix1[1][1] = 1;

		System.out.print(matrix1[0][0] + "\t");
		System.out.print(matrix1[0][1] + "\n");
		System.out.print(matrix1[1][0] + "\t");
		System.out.print(matrix1[1][1] + "\n");

		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 0 } };
		System.out.print(matrix2[0][0] + "\t");
		System.out.print(matrix2[0][1] + "\t");
		System.out.print(matrix2[0][2] + "\n");
		System.out.print(matrix2[1][0] + "\t");
		System.out.print(matrix2[1][1] + "\t");
		System.out.print(matrix2[1][2] + "\n");
		System.out.print(matrix2[2][0] + "\t");
		System.out.print(matrix2[2][1] + "\t");
		System.out.print(matrix2[2][2] + "\n");
	}
}
