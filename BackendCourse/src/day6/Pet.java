package day6;

public class Pet {
	
	Pet(double purchasePrice, double dailyExpense){
		this.purchasePrice = purchasePrice;
		this.dailyExpense = dailyExpense;
		this.salePrice = (purchasePrice + dailyExpense*30) * 1.15;
	}
	
	private double purchasePrice;
	
	private double dailyExpense;
	
	private double salePrice;
	
	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getDailyExpense() {
		return dailyExpense;
	}

	public void setDailyExpense(double dailyExpense) {
		this.dailyExpense = dailyExpense;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
}
