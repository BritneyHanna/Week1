import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		double priceOfChocolateCake = 10.50;
		double priceOfFrosting = 1.50;
		double initialAmountOfMoneyinTomsWallet = 154.50;
		double originalAmountOfMoneyinMarysPurse =200.25;
		int numberOfTomsFriends = 7;
		int howmanyFriendsMaryhas = 10;
		int tomsAge = 35;
		int marysAge = 47;
		String mansFirstName ="Tom" ;
		String womansFirstName ="Mary" ;
		String mansLastName ="Jones" ;
		String womansLastName ="Smith" ;
		char mansMiddleInitial  ='A';
		char womansMiddleInitial ='C';
		double changeLeftInMarysPurse = originalAmountOfMoneyinMarysPurse - priceOfFrosting ;
		double moneyLeftOverInTimsWallet =initialAmountOfMoneyinTomsWallet -priceOfChocolateCake;
		int tomsAverageFriendsmadeperyear = tomsAge/numberOfTomsFriends;
		int marysAverageFriendsmadeperyear =marysAge/howmanyFriendsMaryhas;
		String mansFullName = mansFirstName + " " + mansMiddleInitial + " " +mansLastName;
		String womansFullName = womansFirstName + " " + womansMiddleInitial +" " + womansLastName;
		DecimalFormat x = new DecimalFormat ("##.00");
		System.out.println ("The price of the chocolate cake is " + x.format( priceOfChocolateCake));
		System.out.println ("The price of the Frosting is " + x.format( priceOfFrosting ));
		System.out.println ("The amount of money in Tom's wallet before he starts shopping is " + x.format( initialAmountOfMoneyinTomsWallet));
		System.out.println ("The amount of money in Mary's wallet before she starts shopping is " + x.format( originalAmountOfMoneyinMarysPurse));
		System.out.println ("The number of friends that Tom has is " + numberOfTomsFriends );
		System.out.println ("The number of friends that Mary has is " + howmanyFriendsMaryhas );
		System.out.println ("Tom's Age is " + tomsAge );
		System.out.println ("Mary's age is " + marysAge );
		System.out.println ("The man's first name is " + mansFirstName );
		System.out.println ("The woman's first name is " + womansFirstName );
		System.out.println ("The man's last name is " + mansLastName );
		System.out.println ("The woman's last name is " + womansLastName );
		System.out.println ("The man's middle initial is " + mansMiddleInitial );
		System.out.println ("The woman's middle inital is " + womansMiddleInitial );
		System.out.println ("The change left in Mary's purse after purchasing the Frsoting is " + x.format( changeLeftInMarysPurse));
		System.out.println ("The change left in Tom's wallet after purchasing the chocolate cake is " + x.format( moneyLeftOverInTimsWallet));
		System.out.println ("The average number of friends Tom has made per year over the course of his lifetime is  " + tomsAverageFriendsmadeperyear );
		System.out.println ("The average number of friends Mary has made per year over the course of her lifetime is " + marysAverageFriendsmadeperyear );
		System.out.println ("The man's full name is  " + mansFullName );
		System.out.println ("The woman's full name is  " + womansFullName );

	}

}
