package methods;

public class This_Example {

	// Instance variable num

	int num = 10;

	This_Example() {
		System.out.println("This is an example program on keyword this");
	}

	This_Example(int num) {
		// Invoking the default constructor

		this();
		// Assigning the local variable num to the instance varia
	}

	public void greet() {
		System.out.println("hi Welcome to Tutorialspoint");
	}

	public void print() {
		// Local variable num
		int num = 20;

		// Print the instance variable
		System.out.println("Value of local variable num is: " + num);

		// Print the local varible

		System.out.println("Value on instance variable is: " + this.num);

		// Invoking the greet method of a class

		this.greet();
	}

	public static void main(String[] args) {
			
		//Instantiating the class
		
		This_Example this_Example = new This_Example();
		
		//Invoking the print method
		
		this_Example.print();
		
		//Passing the new value to the num variable through parameterized constructor
		
		This_Example this_Example2 = new  This_Example(30);
		
		//Invoking the print method again
		
		this_Example2.print();
		
		
		
		
	}
}