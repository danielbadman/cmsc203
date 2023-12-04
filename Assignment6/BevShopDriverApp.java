import java.util.Scanner;

public class BevShopDriverApp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BevShop shop = new BevShop();
		String orderName;
		int orderAge;
		System.out.println("The current order in process can have at most " + shop.getMaxOrderForAlcohol() + " alcoholic beverages.");
		System.out.println("The minimum age to order alcohol drink is " + shop.getMinAgeForAlcohol());
		System.out.println("Start please a new order:");
		System.out.println("Your Total Order for now is 0.0");
		System.out.print("Would you please enter your name: ");
		orderName = sc.nextLine();
		System.out.print("Would you please enter your age: ");
		orderAge = sc.nextInt();
		shop.startNewOrder(13, Day.FRIDAY, orderName, orderAge);
		if (shop.isValidAge(shop.getCurrentOrder().getCustomer().getAge())) {
			System.out.println("Your age is above 20 and you are eligible to order alcohol");
			System.out.println("Would you please add an alcohol drink");
			shop.processAlcoholOrder("Tequila", Size.SMALL);
			System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
			System.out.println("The total price on the Order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			if (shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 3");
			} else {
				System.out.println("You have reached the maximum alcohol drinks for this order");
			}
			System.out.println("Would you please add another alcohol drink");
			shop.processAlcoholOrder("Budlight", Size.LARGE);
			System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
			System.out.println("The total price on the Order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			if (shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 3");
			} else {
				System.out.println("You have reached the maximum alcohol drinks for this order");
			}
			System.out.println("Would you please add another alcohol drink");
			shop.processAlcoholOrder("Four Loko", Size.MEDIUM);
			System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
			System.out.println("The total price on the Order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			if (shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 3");
			} else {
				System.out.println("You have reached the maximum alcohol drinks for this order");
			}
		} else {
			System.out.println("Your age is below 21 and you are not eligible to order alcohol");
		}
		System.out.println("Would you please add a COFFEE to your order:");
		shop.processCoffeeOrder("Cappuccino", Size.LARGE, true, false);
		System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
		System.out.println("The total price on the Order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
		System.out.println("#------------------------------------#");
		System.out.println("Would you please start a new order ");
		sc = null;
		sc = new Scanner(System.in);
		System.out.print("Would you please enter your name: ");
		orderName = sc.nextLine();
		System.out.print("Would you please enter your age: ");
		orderAge = sc.nextInt();
		shop.startNewOrder(13, Day.SUNDAY, orderName, orderAge);
		System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());
		System.out.println("Would you please add a SMOOTHIE to order");
		shop.processSmoothieOrder("Berry Swirl", Size.MEDIUM, 3, true);
		System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());
		System.out.println("Would you please add a SMOOTHIE to order");
		shop.processSmoothieOrder("Chocolate Banana", Size.LARGE, 1, false);
		System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());
		System.out.println("Would you please add a drink?");
		if (shop.isValidAge(shop.getCurrentOrder().getCustomer().getAge())) {
			System.out.println("Your age is above 20 and you are eligible to order alcohol");
			System.out.println("Would you please add an alcohol drink");
			shop.processAlcoholOrder("Tequila", Size.SMALL);
			System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
			System.out.println("The total price on the Order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			if (shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 3");
			} else {
				System.out.println("You have reached the maximum alcohol drinks for this order");
			}
			System.out.println("Would you please add another alcohol drink");
			shop.processAlcoholOrder("Budlight", Size.LARGE);
			System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
			System.out.println("The total price on the Order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			if (shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 3");
			} else {
				System.out.println("You have reached the maximum alcohol drinks for this order");
			}
			System.out.println("Would you please add another alcohol drink");
			shop.processAlcoholOrder("Four Loko", Size.MEDIUM);
			System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
			System.out.println("The total price on the Order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
			if (shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 3");
			} else {
				System.out.println("You have reached the maximum alcohol drinks for this order");
			}
		} else {
			System.out.println("Your age is below 21 and you are not eligible to order alcohol");
		}
		System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
		System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());
		System.out.println("The total number of fruits is 4");
		if (shop.isMaxFruit(4)) {
			System.out.println("You reached a Maximum number of fruits");
		} else {
			System.out.println("You haven't reached a Maximum number of fruits");
		}
		
		System.out.println("Total price on the second Order: " + shop.getCurrentOrder().calcOrderTotal());
		System.out.println("Total price for all orders: " + shop.totalMonthlySale());
		System.out.println("Total number of beverages for all orders: " + shop.totalNumOfMonthlyOrders());
	}
}
