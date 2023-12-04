import java.util.ArrayList;

public class BevShop implements BevShopInterface{
	public ArrayList<Order> orders = new ArrayList<>();
	
	public boolean isValidTime(int time) {
		if (time < 8 || time > 23) {
			return false;
		} else {
			return true;
		}
	}
	
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}
	
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits) {
		if (numOfFruits >= MAX_FRUIT) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEligibleForMore() {
		if (getNumOfAlcoholDrink() < MAX_ORDER_FOR_ALCOHOL) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getNumOfAlcoholDrink() {
		return orders.get(orders.size() - 1).findNumOfBeveType(Type.ALCOHOL);
	}
	
	public boolean isValidAge(int age) {
		if (age >= MIN_AGE_FOR_ALCOHOL) {
			return true;
		} else {
			return false;
		}
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		orders.add(new Order(time, day, new Customer(customerName, customerAge)));
	}
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		orders.get(orders.size() - 1).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	public void processAlcoholOrder(String bevName, Size size) {
		if (isEligibleForMore()) {
			orders.get(orders.size() - 1).addNewBeverage(bevName, size);
		}
	}
	
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		orders.get(orders.size() - 1).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	public int findOrder(int orderNo) {
		int orderIndex = -1;
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getOrderNo() == orderNo) {
				orderIndex = i;
			}
		}
		return orderIndex;
	}
	
	public double totalOrderPrice(int orderNo) {
		return orders.get(findOrder(orderNo)).calcOrderTotal();
	}
	
	public double totalMonthlySale() {
		double total = 0;
		for (int i = 0; i < orders.size(); i++) {
			total += orders.get(i).calcOrderTotal();
		}
		return total;
	}
	
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}
	
	public Order getCurrentOrder() {
		return orders.get(orders.size() - 1);
	}
	
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	public void sortOrders() {
		for (int i = 0; i < orders.size() - 1; i++) {
			int min_idx = i;
	        for (int j = i+1; j < orders.size(); j++) {
	        	if (orders.get(j).getOrderNo() < orders.get(min_idx).getOrderNo()) {
	        		min_idx = j;
	        	}
	        }
	            
	        
	        Order temp = orders.get(min_idx);
	        orders.set(min_idx, orders.get(i));
	        orders.set(i, temp);
		}
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < orders.size(); i++) {
			output += orders.get(i).toString();
		}
		output += "\nTotal Monthly Sales: " + Double.toString(totalMonthlySale());
		return output;
	}
}
