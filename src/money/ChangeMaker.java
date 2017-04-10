package money;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// need method for change
		// check if amount tendered was lower than item price
		double priceOfProduct;
		double change;
		double moneyProvided;
		//alter variable to double to allow change.
		
		System.out.println("Please enter purchase price of product: $");
		priceOfProduct = kb.nextDouble();
		System.out.print("Enter the amount given by the customer: $");
		moneyProvided = kb.nextDouble();

		if (moneyProvided > priceOfProduct) {
            System.out.println("The change is: " + ((moneyProvided - priceOfProduct)));
            System.out.println("The customer should be given the change as follows:");
            change = moneyProvided - priceOfProduct;
            //Tested at this point, need to round the change to nearest whole number.
		}
	}
}
