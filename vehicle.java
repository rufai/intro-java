public class vehicle {
	// instance variables
	public static int tyre = 4;
	public static int sideMirror = 2;
	public static int rearMirror = 1;
	public static int engine = 1;


	// variables
	private double speed = 0.0;
	private double acceleration = 0.0;
	public String color = ""; // no color
	public String plateNumber = ""; // no plate number
	protected String particulars = "";
	protected String gps = "";
	protected boolean fuelTank = false;
	protected boolean tintedGlass = false; 
	protected String manufacturer = "";

	private double totalTimeMoved = 14.89;

	protected String direction = "frontward"; // backward


	// constructor: the job of a constructor is to initialise a class
	// initialise/customise a class
	public vehicle(String newManufacturer, String newColor, String newPlateNumber, boolean tintedGlassStatus) {
		this.manufacturer = newManufacturer;
		this.color = newColor; // 
		this.plateNumber = newPlateNumber; // 
		this.tintedGlass = tintedGlassStatus;
	}


	// methods
	// verbs

	// getter: value of the variable
	public String getDirection(){
		return this.direction;
	}


	public String getPlateNumber(){
		return this.plateNumber;
	}

	public boolean getTintedGlass(){
		return this.tintedGlass;
	}

	// seeter: change the value of the value
	public boolean setTintedGlass(boolean tintedGlassStatus){
		this.tintedGlass = tintedGlassStatus;
		return this.tintedGlass;
	}

	// void means that the method should not return anything
	public void move(String locationOne, String locationTwo){
		System.out.println("The vehicle is from " + 
			locationOne + " to " + locationTwo)
	}

	public double accelerate(double increaseInSpeed){
		return increaseInSpeed / totalTimeMoved;
	}

	public double deccelerate(double decreaseInSpeed){
		return decreaseInSpeed / totalTimeMoved;
	}

	public String reverse(){
		if(direction == "frontward") {
			direction = "backward";
		}
		else {
			direction= "frontward";
		}

		System.out.println("the car is going " + direction);
		return direction;

	}


}








