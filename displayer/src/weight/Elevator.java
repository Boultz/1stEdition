package weight;

public class Elevator {
	public static void main(String args[]) {
		
		int Person; // int used most of the time if its to short go for LONG
		int Limit;
		int NoPeople;
		int Remaining;
		
		char Little; //this is just to use the char type and play with to upper case
		char Big;
		
		Person = 150;
		Limit = 1400;
		NoPeople =
				Limit / Person;
		Remaining = 
				Limit % Person; //% sign shows the number of items left after division.
		
		Little = 'm';
		Big = Character.toUpperCase(Little); //changing character from lower to upper case
										     // you can do the opposite using .to LowerCase
		
		boolean AllTen = NoPeople >= 10;
		
		System.out.print("You can fit ");
		System.out.print(NoPeople);
		System.out.println(" in the box.");//the 3 lines to this line can be condensed using +
		System.out.println();
		System.out.print("Can all 10 of us fit in the box? ");
		System.out.println(AllTen + "!");
		System.out.println();
		System.out.println("You have " + Remaining + "Kg weight left.");
		System.out.println();
		System.out.println(Big);
		
				
	}

}
