
public class July15Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Lab: Using arrays
		/*
	    int[] intArray = new int[3];
	    intArray[0] = -5123;
	    intArray[2] = 32;

	    System.out.println(intArray[1]);
	    
	    int[] arr = {1,2,3,4,5,6,7,8,9,10};
	    System.out.println(arr.length);
		*/
		
		
		// Lab: While Loops
		/*
        boolean on = true;

        while (on){
            System.out.println("Inside the while loop");
            on = false;
        }
		*/
		
		
		// Lab: Do while loop
		/*
    	boolean on = false;
    	
    	do{
    		System.out.println("Inside the do-while loop");
    	} while (on);
		*/
		
		
		//Lab: For loop
		/*
    	//create a simple for-loop that prints the numbers 1 to 10     
    	for (int i = 1; i <= 10; i++){
    		System.out.println(i);
        }
		*/
		
		
		// Lab: Multi dimensional array
		/*
		int[][][] my3dArray = new int[3][3][3];  
		   
		my3dArray[0][0][0] = 1;  
		System.out.println(my3dArray[0][0][0]);  
		  
		int[][] my2dArray =  {{1,2,0}, {4, 5, 6}, {1, 4, 5}};  
		System.out.println(my2dArray.length);  
		  
		System.out.println(my2dArray[1][2]);  
		*/
		
		
		// Lab: Nested Loops
		/*
        int[] arr1 = {2,4,6,8,10,12,14,16,18,20};
        int[] arr2 = {1,2,3,5,7,9,11,13,17,19};

        //iterate over the first set of numbers
        for (int i = 0; i < arr1.length; i++) {
            //iterate over the second set of numbers
            for (int j = 0; j < arr2.length; j++) {
                //print the product of the current elements from each set
                System.out.println(arr1[i] * arr2[j]);
            }
        }
        */
		
		
		
		
		// Lab: Method
		/*
        //create a class instance
        July15Labs md = new July15Labs();

        //call your first method here
        md.talk();
		*/
        
        
        
        // Lab: Method overloading
		/*
        July15Labs om = new July15Labs();  
        om.print();  
        om.print("second print method");  
        om.print("second", "third");  
        */
		
		
		
		// Lab: Methods with Parameters
		/*
        //create a class instance
        July15Labs mp = new July15Labs();

        //call your method here
        double d = mp.convertIntToDouble(44);

        //print the value to the console
        System.out.println(d);

        //call the 2nd method here
        System.out.println(mp.sum(1.0, 2, 3));
		*/
		
		
		
		// Lab: Methods with return types
        //create a class instance
        July15Labs rt = new July15Labs();

        //call your method here
        rt.returnNothing();

        //call the other method here
        boolean b = rt.returnBoolean();

        System.out.println("The value of b is: "  + b);
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	// Method
    public void talk(){
        System.out.println("Inside of the talk method");
    }
	
	
    
    
    
    //overload methods here  
    public void print(){  
        System.out.println("original print method.");  
    }  
  
    public void print(String str){  
        System.out.println(str);  
    }  
  
    public void print(String str, String str2){  
        System.out.println(str + " " + str2);  
    }  
  

    
    
    
    //create your first method here
    public double convertIntToDouble(int num){
        return (double)num;
    }

    //new sum method here
    public double sum(double num1, int num2, int num3){
        return num1 + num2 + num3;
    } 
    
    
	
    
    //create your first method here
    public void returnNothing(){
        System.out.println("Inside of a void method");
    }

    //a method that returns a boolean
    public boolean returnBoolean(){
        return true;
    }
    
    
    
	
}







