
public class July19Lab {

	public static void main(String[] args) {


		
		
		// Lab: Factorial
		/*
		System.out.println(Fib.fibonacci(10));
		*/
		
		
	
	    // Lab: Recursive
		/*
        //create some dummy data for our method
        int input = 5;
        July19Lab eo = new July19Lab();
        //call the method here
        System.out.println(eo.factorial(input));
	    */
	    
		
		
		// Lab: Search
        //create some dummy data for our method
        char letter = 'm';

        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        //call your methods here
        July19Lab ls = new July19Lab();

        System.out.println(ls.findIndex(letter, letters));
		
		
		
		
		
	}
	
	
	

    //create your first method here
    public int factorial(int num) {
        if (num <= 0) return 0;
        if (num == 1) return 1;

        return num * factorial(num-1);
    }
	
    
    
    
    public int findIndex(char target, char[] data) {
        if (data == null ) return -1;

        int result = -1;
        
        //loop through the data
        for (int i = 0; i < data.length; i++) {
            char temp = data[i];

            //test current element against target
            if (temp == target) {
                return i;
            }
        }

        return result;
    }
    
    
	

}






class Fib {

    public static int fibonacci(int n){

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}




