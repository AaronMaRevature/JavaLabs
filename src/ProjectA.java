import java.util.*;
import java.lang.*;


public class ProjectA {

	public static void main(String[] args) {

		boolean quit = false;
		
		double convertFactor = 0.0;
		String convertedUnits = "";
		
		
		loop: while(!quit){
			// Get input
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please select an option:\r\n"
        		+ "1. Volume Conversions\r\n"
        		+ "2. Distance Conversions\r\n"
        		+ "3. Quit");
			String line = scanner.nextLine();
			
			
			// Switch
			switch(line) {
			
				// Volume conversions
				case "1":
					
					
					// Get type of conversion
					System.out.println("Please select an option:\r\n"
		        		+ "1. Teaspoons to Tablespoons\r\n"
		        		+ "2. Teaspoons to Cups");
					String option = scanner.nextLine();
					
					
					switch(option) {
					
						// Teaspoon to Tablespoons
						case "1":
							convertFactor = 0.33333333333;
							break;
						// Teaspoons to Cups
						case "2":
							convertFactor = 0.0208333;
							break;
						// Bad input: 
						default:
							System.out.println("Invalid input. Try again:");
							continue;
					}

					break;
					
					
					
				// Distance Conversions
				case "2":

					
					
					// Get type of conversion
					System.out.println("Please select an option:\r\n"
		        		+ "1. Feet to Meters\r\n"
		        		+ "2. Miles to Kilometers");
					String option2 = scanner.nextLine();
					
					switch(option2) {
					
						// feet to meters
						case "1":
							convertFactor = 0.3048;
							break;
						// miles to kilometers
						case "2":
							convertFactor = 1.60934;
							break;
						// Bad input: 
						default:
							System.out.println("Invalid input. Try again:");
							continue;
					}

					break;
					
				// Quit
				case "3":
					quit = true;
					continue;
			
					
				// Bad input	
				default: System.out.println("Invalid input. Retry");
			}
			
			
			
			
			
			
			// Get input for amount to convert
			System.out.println("Enter amount to convert");
			String amountToConvert = scanner.nextLine();
			
			
			// Get the answer and print
			int amount = Integer.parseInt(amountToConvert);
			System.out.println("Answer: " + amount * convertFactor + convertedUnits + "\n");
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
