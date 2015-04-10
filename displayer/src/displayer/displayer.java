package displayer; //the name of where everything is stored

class displayer { //creating a class (think a part of a chair)
	/** God knows how anyone would keep up with this shit through a massive program.
	 * @param args
	 */
	
	public static void main(String args[]) { 
		/* MAIN tells this to run automatically rather than being asked to
		 */
		double ACCBalance; //use or almost all numbers that will have a decimal 
							// try out BigDecimal for currency in most cases.
		
		ACCBalance = 50.22;
		ACCBalance = ACCBalance + 1000000.00;
		
		System.out.print("You have Java £");
		System.out.print(ACCBalance);
		System.out.println(" in your account."); 
		/*print to screen (as an output) You'll love java
		 */
	}

}
