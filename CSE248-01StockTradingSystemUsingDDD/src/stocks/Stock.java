package stocks;

public class Stock {

	private String instruments;
	private double shares;
	private double price;
	public Stock(String instruments, double shares, double price) {
		this.instruments = instruments;
		this.shares = shares;
		this.price = price;
	}

	public double getTotal() {
		
		return shares * price;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public double getShares() {
		// TODO Auto-generated method stub
		return shares;
	}

}
