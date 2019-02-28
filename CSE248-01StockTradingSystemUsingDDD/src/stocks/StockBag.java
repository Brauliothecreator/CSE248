package stocks;

public class StockBag {
	private Stock[] stockArray;
	private int nElems;
	public StockBag(int maxSize) {
		stockArray = new Stock[maxSize];
		nElems = 0;
	}
	public void insert() {
		
	}
	public double getGrandTotal() {
		double grandTotal = 0;
		for(int i =0; i< nElems; i++) {
			grandTotal += (stockArray[i].getShares() * stockArray[i].getPrice());
		}
		return grandTotal;
	}

}
