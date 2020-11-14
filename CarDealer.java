import vehicle; // link classes together


public class CarDealer {

	// controller
	public static void main(String[] args) {

		int a = 2;
		vehicle civic = new vehicle("Honda", "RED", "ENG098766", false);  // how to create an instance of a class

		System.out.println("Civic is a new object of class Vehicle");
		System.out.println("Does civic have tinted glass? " + civi.getTintedGlass() );


		civic.accelerate(52.5);
		civic.reverse();
		civic.deccelerate(12.67);

		//civic is an object of class vehicle
		//civic is a instance of class vehicle
		vehicle corola = new vehicle("Toyota","BLACK","LAG342456", true);  // how to create an instance of a class
		vehicle mazda = new vehicle("Mazda", "YELLOW", "HGF545646", true);  // how to create an instance of a class
		// vehicle tesla = new vehicle();  // how to create an instance of a class
		vehicle ikenga = new vehicle("Innoson", "WHITE", "654HGFHL", false);  // how to create an instance of a class
		vehicle 4matic = new vehicle("Mercedes", "BLUE", "FDS4365", false);  // how to create an instance of a class


	}


}

