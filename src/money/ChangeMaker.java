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
		
		System.out.println("Please enter purchase price of product: $");
		priceOfProduct = kb.nextDouble();
		System.out.print("Enter the amount given by the customer: $");
		moneyProvided = kb.nextDouble();

	}
}
