
public class July14Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		//Lab: Print name
		/*
        System.out.println("Aaron Ma");
        */
        
        // Lab: Print data types
		/*
        boolean on = false;
        System.out.println(on);

        short s = 16;
        System.out.println(s);

        int i = -32;
        System.out.println(i);
 
        float f = 3839.34839f;
        System.out.println(f);

        long l = 4294967296L;
	    System.out.println(l);
	
	    char c = 'a';
	    System.out.println(c);
        */
		
		
		// Lab: Performing operations on different datatypes
		/*
		//define variables
		int x = 5;
		int y = 3;
		int z;

		//simple addition
		z = x + y;
		System.out.println(z);

		//simple subtraction
		z = x - y;
		System.out.println(z);

		//simple multiplication
		z = x * y;
		   System.out.println(z);

		//simple division
		z = x / y;
		System.out.println(z);

		//simple modulus
		z = x % y;
		System.out.println(z);

		//float vs. int
		float f = 3.6f;
		int i = 22;
		int result = (int)f + i;
		System.out.println(result);
		*/
		
		
		// Lab Casting:
		/*
		//default values

		int i = 200;

		//cast to a short

		short s = (short)i;

		System.out.println(s);

		//cast to a double

		double d = (double)i;

		System.out.println(d);

		//cast to a byte

		byte b = (byte)i;

		System.out.println(b);
		*/
		
		
		// Lab: String concatenation
		/*
        String beginning = "Hello";
        String end = " World";
        String combo = beginning + end;

        System.out.println(combo);

        long l = 203L;
        System.out.println("The value of l: " + l);

        boolean b = true;
        System.out.println(b + " is true");

        int x = 2;
        int y = 3;
        System.out.println(x + y + " is the sum of x and y");
		*/
		
		
		// Lab: Conditional Blocks
		/*
		boolean b = true;  
		   
		if (b){  
			System.out.println("inside the if-statement");  
		}  
		  
		System.out.println("Outside of the if-statement"); 
		*/
		
		// Lab: Variant Conditional BLock
		/*
	    boolean firstCondition = false;
	    boolean secondCondition = true;

	    if (firstCondition){
	      System.out.println("inside the if-statement");

	      if (secondCondition){
	        System.out.println("inside the nested if-statement");
	      }
	    }else if (secondCondition){
	      System.out.println(5);
	    }else {
	      System.out.println("inside the else-statement");
	    }

	    System.out.println("Outside of the if-statement");
		*/
		
		
		
		// Lab: Nested Conditionals
		/*
        int precipitation = 30;
        int waterOutput = 0;
        int temperature = 70;

        //start an if-statement
        if (precipitation < 20){
        	if (temperature <= 75){
                waterOutput = 30;
            }
            else {
                waterOutput = 45;
            }
        }else if (precipitation < 31){
        	if (temperature <= 75){
                waterOutput = 10;
            }
            else {
                waterOutput = 25;
            } 
        }else if (precipitation < 56){
        	if (temperature <= 75){
                waterOutput = 0;
            }
            else {
                waterOutput = 15;
            }
        }else {
        	waterOutput = 0;
        }
        
        System.out.println("The water output should be " + waterOutput);
		*/
		
        
		
		// Lab: Switches and Fallthrough

        int x = 5;

        switch(x) {
            case 6: {
                System.out.println("case 6 ran");
                break;
            }
            default:{
                System.out.println("The default case ran.");
                break;
            }
            case 7:{
                System.out.println("case 7 ran");
                break;
            }
            case 10:{
                System.out.println("case 10 ran");
                break;
            }
        }

		
		
		
		
		
		
		
	}

}
