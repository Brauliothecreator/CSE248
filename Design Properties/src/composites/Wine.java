package composites;

public class Wine implements Item {

	private String Producer;
	private String vintage;
	private double price;
	
	
	public Wine(String producer, String vintage, double price) {
		super();
		Producer = producer;
		this.vintage = vintage;
		this.price = price;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	
}
