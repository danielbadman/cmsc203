import java.util.ArrayList;
import java.util.Random;

public class Order {
	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> bevList = new ArrayList<>();
	
	public Order(int orderTime, Day orderDay, Customer cust) {
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		orderNo = generateOrder();
	}
	
	public int generateOrder() {
		Random rand = new Random();
		return rand.nextInt(10000, 90001);
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public Day getOrderDay() {
		return orderDay;
	}
	
	public Customer getCustomer() {
		Customer deepCustomer = new Customer(cust);
		return deepCustomer;
	}
	
	public Day getDay() {
		return orderDay;
	}
	
	public boolean isWeekend() {
		if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) {
			return true;
		} else {
			return false;
		}
	}
	
	public Beverage getBeverage(int itemNo) {
		if (itemNo < bevList.size()) {
			return bevList.get(itemNo);
		} else {
			return null;
		}
	}
	
	public int getTotalItems() {
		return bevList.size();
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		bevList.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	
	public void addNewBeverage(String bevName, Size size) {
		bevList.add(new Alcohol(bevName, size, isWeekend()));
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		bevList.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	
	public double calcOrderTotal() {
		double total = 0;
		for (int i = 0; i < bevList.size(); i++) {
			total += bevList.get(i).calcPrice();
		}
		return total;
	}
	
	public int findNumOfBeveType(Type type) {
		int count = 0;
		for (int i = 0; i < bevList.size(); i++) {
			if (bevList.get(i).getBevType() == type) {;
			count++;
			}
		}
		return count;
	}
	
	public String toString() {
		String output = "Order Number: " + orderNo + 
							"\nOrder Time: " + orderTime +
							"\nOrder Day: " + orderDay + 
							"\nCustomer: " + cust.toString() +
							"\nList of Beverages: ";
		for (int i = 0; i < bevList.size(); i++) {
			output += (bevList.get(i).toString());
		}
		return output;
	}
	
	public int compareTo(Order anotherOrder) {
		if (this.orderNo > anotherOrder.orderNo) {
			return 1;
		} else if (this.orderNo == anotherOrder.orderNo) {
			return 0;
		} else {
			return -1;
		}
	}
}
