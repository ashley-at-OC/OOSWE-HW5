public class Manager extends Employee {

	/**
	 * 
	 * @param saleAmount
	 */
	private void addStoreSale(int saleAmount) {
		// TODO - implement Manager.addStoreSale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param discountAmount
	 */
	public void addItemDiscount(Item item, double discountAmount) {
		// TODO - implement Manager.addItemDiscount

		item.isOnDiscount = true;
		double newCost = item.getCost() - (item.getCost() * discountAmount);
		item.discountedCost = newCost;

	}

	/**
	 * 
	 * @param itemID
	 * @param amount
	 */
	private void orderItem(int itemID, int amount) {
		// TODO - implement Manager.orderItem
		throw new UnsupportedOperationException();
	}

}