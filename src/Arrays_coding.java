
public class Arrays_coding {

	 //Write a program, which takes an input as Integers of arrays, and print them.
		public static void printArray(int arr[]) {
			for(int i = 0; i<arr.length;i++) {
				System.out.println("a["+i+"] = "+arr[i]);	
			}
			System.out.println();
		}
		
	// Write a program which takes an input as Integers of arrays and prints in reverse	order	
		
		public static void printReverseArray(int arr[]) {
			for(int i = arr.length-1; i>=0;i--) {
				System.out.println("a["+i+"] = "+arr[i]);	
			}
			System.out.println();
		}
		
	// Write a program which takes an input as Integers of arrays and it finds product	of all arrays.
		public static void printProductOfArray(int arr[]) {
			int product = arr[0];
			System.out.print(product);
			for(int i = 0; i<arr.length-1;i++) {
			    product = product*arr[i+1];
				System.out.print("*"+arr[i+1]);	
			}
			System.out.println("="+product);
			System.out.println();
		}
		
//		Write a program which takes an input as doubles of arrays and print them.
		public static void printArrayDoubles(double arr[]) {
			for(int i = 0; i<arr.length;i++) {
				System.out.println("a["+i+"] = "+arr[i]);	
			}
			System.out.println();
		}
		
//		Write a program which takes an input as doubles of arrays and prints in reverse	order
		public static void printReverseArrayDoubles(double arr[]) {
			for(int i = arr.length-1; i>=0;i--) {
				System.out.println("a["+i+"] = "+arr[i]);	
			}
			System.out.println();
		}
		
//		Write a program which takes an input as doubles of arrays and it finds product	of all arrays.
		public static void printProductOfArrayDouble(double arr[]) {
			double product = arr[0];
			System.out.print(product);
			for(int i = 0; i<arr.length-1;i++) {
			    product = product*arr[i+1];
				System.out.print("*"+arr[i+1]);	
			}
			System.out.println("="+product);
			System.out.println();
		}
//		 Write a program which takes an input as doubles of arrays and it finds average	 of all arrays.
		public static void printAverageOfArrayDouble(double arr[]) {
			double	product = 0;
			for(int i = 0; i<arr.length-1;i++) {
			    product = product+arr[i];
			}
			System.out.println(product/arr.length);
		}
		
		
		public static void main(String[] args) {
			int[] a ={1,2,3,4};
			double[] b ={1.2, 2.5, 3.8, -12};
			 double[] d ={1.2, -20, 3.89, 400.0};
			 double[] c ={1.0, 2.0, 3.89, 4.78};
			printArray(a);
			printReverseArray(a);
			printProductOfArray(a);
			printArrayDoubles(b);
			printReverseArrayDoubles(d);
			printProductOfArrayDouble(c);
			printAverageOfArrayDouble(c);
			
		}

}
