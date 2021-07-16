import java.util.Scanner;


public class July16Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		// Lab 1: Gathering input
		/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in a line and hit Enter.");

        String line = scanner.nextLine();
        System.out.println("You have typed: " + line);

        scanner.close();

        String numbers = "1 2 3 5 7 9";

        scanner = new Scanner(numbers);

        while (scanner.hasNextInt()) {
            System.out.print(scanner.nextInt());
        }

        scanner.close();
		*/
		
		
		// Lab common string methods
		/*
        String str = "Hello";
        String s = new String("Hello");
        System.out.println(str.equals(s));

        //use the length() method
        System.out.println(str.length());

        //use the indexOf() method
        System.out.println(str.indexOf("H"));
		*/
		
		
		
		
		
		// Lab: Writing your own classes
		/*
        Ball b1 = new Ball();
        Ball b2 = new Ball();

        //assign initial state to the Ball instances
        b1.size = "big";
        b1.color = "red";
        b2.size = "small";
        b2.color = "blue";
        
        //invoke the bounce method
        b1.bounce();
        b2.bounce();
		*/
		
		
		
		// Lab: Composite classes
		/*
        ClassB b = new ClassB();
        b.classA.setName("Taylor");
    
        System.out.println(b.classA.getName());
		*/
		
		// Lab: Constructors
		/*
        //create instances here
        Constructors c = new Constructors(5839);

        //use the no-arg constructor
        Constructors cNoArg = new Constructors();
		*/
        
        
        
        
        // Lab: Instance and static variables
        A.staticCount = 2494;
        System.out.println("class A staticCount: " + A.staticCount);

        A a = new A();

        System.out.println(a.instanceCount);
        System.out.println(A.staticCount);

        A a2 = new A();

        System.out.println(a2.instanceCount);
        System.out.println(A.staticCount);

        a.instanceCount = 15;

        System.out.println("object a instanceCount: " + a.instanceCount);
        System.out.println("object a2 instanceCount: " + a2.instanceCount);
        
        System.out.println("class A staticCount: " + A.staticCount);
		
	}

}



class Ball {
    String size;
    String color;

    public Ball() {
		// TODO Auto-generated constructor stub
	}

	public void bounce(){
        System.out.println("The " + size + " " + color + " ball is bouncing.");
    }


}

class ClassA {

    String name = "name";

    public void setName(String name){ this.name = name; }

    public String getName() {return name; }
}

class ClassB{

    ClassA classA = new ClassA();


}



class Constructors {

    public Constructors(){
        System.out.println("Default constructor ran.");
    }

    public Constructors(int value){
        System.out.println(value);
    }

}


class A {

    //static member
    public static int staticCount = 0;

    //instance member
    public int instanceCount = 0;

    public A() {
        staticCount++;
        this.instanceCount++;
    }
}



