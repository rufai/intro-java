public class skush {
	public static void main(String[] args) {
		

		// access modifiers
		// public, private, and protected

		// string
		private String name = "Stephen"; // temporary
		final String state = "Enugu State"; // permanent

		System.out.println("Hello, " + name);  // console.log
		System.out.println("I am from " + state);
		
		// data 7
		// int, double, float, string, boolean, array,...		

		//boolean  --> true/false
		boolean haveYouEatenToday = true; // temporary variable
		System.out.println("Have you eaten today? " + haveYouEatenToday);

		final boolean areYouAtTheSMECenter = false; // permanent varialbe


		//int ---> without decimal
		int howMuchIsInYourPocket = 10000;

		final int a = 2;

		// double, float ==> decimal
		// float number = 9.6;

		final double secondNumber = 5.004;


		// final String num = 90;  // syntax error
		final String num = "90";  



		// char
		char alphabet = 'a';

// start, stop, step
	/*
	    for( int x = 0; x <= 100; x++) {
		        // System.out.println(x);
		        
		        if(x % 3 == 0) {  // remainder
		            System.out.println("This number " + x + " is divisible by 3"); 
		        }
		        if(x % 5 == 0) {
		            System.out.println("This number " + x + " is divisible by 5"); 
		        }

		        //object 
		        
	    }
	*/
	    int ages[] = {45,67,90,54,32,12,78};
	    String[] names = {"jenifer", "sabinus", "kenneth", "jonas","rebecah","Emeka"};


	    for (int index = 0; index < ages.length; index++){
		    System.out.println("This number at index " + index + " is " + ages[index]); 
	    }

		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 


	    int x[] = new int[10];
	    x[0] = 6;
	    x[2] = 9;
	    x[7] = 88;
	    x[9] = 67;


	    for (int b = 0; b < x.length; b++){
		    System.out.println("This number at index " + b + " is " + x[b]); 
	    }

	}
}