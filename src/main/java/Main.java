package main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

/**
 * main method for running the program.
 * @author amehlhas
 *
 */
final class Main {
	/**
	 * All methods should have a Javadoc according to STYLE.
	 * @param args command-line arguments
	 * @throws Exception as per typical main specifications
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String accStr;  
		String choice;
//BUG-7 Code Fix Begin
			System.out.println("Enter your string of numbers or just one number:");
			accStr = br.readLine();
			SortDemoData data = new SortDemoData();
			
			try {
				
				data.initializeArray(accStr);
			
			 } catch (NoSuchElementException e) {
				 System.out.println("Not enough numbers.");
		     } catch (NumberFormatException e) {
		    	 System.out.println("Please only use integer values. ");
		     } catch (NegativeArraySizeException e) {
		    	 System.out.println("Negative Array Size.");
		     }  
			
			System.out.println("Initial String: ");
			System.out.println(accStr);
			
			System.out.println("Algorithm Codes :\n"
					+ "0 (Bubble Sort) \t 1 (Selection Sort) \t 2 (Insertion Sort)\n"
					+ "3 (Merge Sort) \t 4 (Quick Sort) \t\t 5 (Heap Sort)");
			System.out.println("Enter selected algorithm code :");
			choice = br.readLine();
			
		try {
			StringBuffer outputBuf = data.runAlgo(Integer.valueOf(choice).intValue());
			
			System.out.println("Result: ");
			System.out.println(outputBuf.toString());
		
		 } catch (NoSuchElementException e) {
			 System.out.println("Not enough numbers.");
	     } catch (NumberFormatException e) {
	    	 System.out.println("Please only use integer values. ");
	     } 
//BUG-7 Code Fix End
	
	}
    
}
