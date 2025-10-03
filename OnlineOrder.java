class Test {
	public static void main(String[] args) {
		System.out.println("Testing");
	}
}

public class OnlineOrder {

	public Item[] shoppingCart;

	private int deliveryMonth;

	private int deliveryDay;

	private String deliveryStreet;

	private String deliveryStatus;

	private String deliveryCity;

	private String deliveryState;

	private int deliveryZipCode;

	public int onlineOrderID;

	public boolean hasFreeShipping;

	public double totalCost;

	public double discountedCost;

	public void totalCost() {

		double calculatedTotalCost = 0;

		for (int i = 0; i < shoppingCart.length; ++i) {
			calculatedTotalCost = calculatedTotalCost + shoppingCart[i].getCost();
		}

		totalCost = calculatedTotalCost;
	}

	/**
	 * 
	 * @param totalCost
	 */
	public void freeShipping(double totalCost) {

		hasFreeShipping = false;

		if (totalCost >= 100) {
			hasFreeShipping = true;
		}
	}

}