public class account {

	private static int bvn = 2343243;
	private static String password = "#$@#$#@$#@$%#@";
	protected static double amountInBank = 2345678.3245323;
	public static int accountNumber = 012323;

	// credit
	public static double addMoney(double amountToAdd){
		amountInBank += amountToAdd;  // increase, increment
		return amountInBank;
	}

	// generator

/*	protected light generator(String oil, String fuel) {
		// drag , press button
		return light
	}
*/

	// debit
	private static double removeMoney(double amountToRemove) {
		amountInBank -= amountToRemove;  //decrease, decrement
		return amountInBank;
	}

	// controller
	public static void main(String[] args) {
		System.out.println("This is your bank account");
		System.out.println("The amount in your account is " + amountInBank );

		System.out.println("Remove 2000 from my account");
		System.out.println("The final balance is " + removeMoney(2000.00));
	}


}