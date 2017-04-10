package money;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// need method for change
		// check if amount tendered was lower than item price
		int priceOfProduct;
		int change;
		int moneyProvided;
		// alter variable to double to allow change.

		System.out.println("Please enter purchase price of product: $");
		priceOfProduct = (int) Math.round(kb.nextDouble() * 100);
		System.out.print("Enter the amount given by the customer: $");
		moneyProvided = (int) Math.round(kb.nextDouble() * 100);

		if (moneyProvided > priceOfProduct) {
			System.out.println("The change is: " + ((moneyProvided - priceOfProduct) / 100));
			System.out.println("The customer should be given the change as follows:");
			change = moneyProvided - priceOfProduct;
			// Tested at this point, need to round the change to nearest whole
			// number.
			int twenties = change / 2000;
			if (twenties > 0) {
				change = change % 2000;
				System.out.println(twenties + " $20 bill(s)");
				//Divided by 2000 to counter the multiplication of 100.
			}
			int tens = change / 1000;
			if (tens > 0) {
				change = change % 1000;
				System.out.println(tens + " $10 bill(s)");
				//Divided by 1000 to counter the multiplication of 100.
			}
			int fives = change / 500;
			if (fives > 0) {
				change = change % 500;
				System.out.println(fives + " $5 bill(s)");
				//Divided by 500 to counter the multiplication of 100.
			}
			int ones = change / 100;
			if (ones > 0) {
				change = change % 100;
				System.out.println(ones + " $1 bill(s)");
				//Divided by 100 to counter the multiplication of 100.
			}
			int quarters = change / 25;
            if (quarters > 0) {
                change = change % 25;
                System.out.println(quarters + " quarter");
                //Divided by 25 to counter multiplication of 100.
            }

            int dimes = change / 10;
            if (dimes > 0) {
                change = change % 10;
                System.out.println(dimes + " dime");
              //Divided by 10 to counter multiplication of 100.
            }

            int nickels = change / 5;
            if (nickels > 0) {
                change = change % 5;
                System.out.println(nickels + " nickel");
              //Divided by 5 to counter multiplication of 100.
            }
            int pennies = change;
            System.out.println(pennies + " penny");
		}
            if (moneyProvided < priceOfProduct) {
                System.out.print("Not enough money!");
            } else if (moneyProvided == priceOfProduct) {
                System.out.print("No change is necessary!");
		}
		
	}
}
