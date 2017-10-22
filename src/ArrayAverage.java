

import java.util.Scanner;


/**
 * Write a class that will get input from the user through the terminal
 * Only int will be passed in through the terminal. Any other input will likely fail.
 * 
 * This class will put all the ints into an array then average them together.
 * The average will be printed to the console.
 * 
 * @author dustin
 *
 */
public class ArrayAverage {

	/**
	 * The main method will read from the console to first determine the size of the array
	 * 
	 * Then, the main method should cycle through input from the user to populate the array
	 * 
	 * Then, the main method should average the populated array
	 * 
	 * Finally, the main method should print the average
	 * 
	 * @param args
	 */
	public static void average() {
		double average = 0;
		Scanner console = new Scanner(System.in);
		System.out.println("How many ints to average?");
		int arr[]= new int [console.nextInt()];		
		for(int i = 0; i<arr.length;i++){
			arr[i]=console.nextInt();
			average+=arr[i];
		}			
		System.out.println(average/arr.length);
		console.close();
	}
	
	public static void main(String[] args) {
		//Static method
		average();
		
		//main class method
		int ArraySize;
		double average = 0;
		//Creating a scanner to read input from console
		Scanner console = new Scanner(System.in);
		System.out.println("How many ints to average?");
		ArraySize = console.nextInt();
	
		// TODO -- define an array
		int arr[]= new int [ArraySize];		
		// TODO -- write a for loop here to ask the user for input.
		for(int i = 0; i<ArraySize;i++){
			arr[i]=console.nextInt();
			average+=arr[i];
		}		
		// TODO -- average across the array
		
		System.out.println(average/ArraySize);
		
		//Closing the scanner
		console.close();
	}

}
