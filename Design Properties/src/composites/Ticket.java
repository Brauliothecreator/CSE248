package composites;

public class Ticket implements Item {

	private String name;
	private String location;
	private String date;
	private double price;
	public Ticket(String name, String location, String date, double price) {
		super();
		this.name = name;
		this.location = location;
		this.date = date;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [name=" + name + ", location=" + location + ", date=" + date + ", price=" + price + "]";
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
