public class Product{
	private String name;
	private double price;
	private int quantity;
	public int numOrders;

	public Product(String name, double price, int quantity){
		this.name = name;
		setPrice(price);
		setQuantity(quantity);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(double price){
		this.price = (price > 0.0) ? price : 0;
	}
	public void setQuantity(int quantity){
		this.quantity = (quantity > 0) ? quantity : 0;
	}
	public String getName(){
		return this.name;
	}
	public double getPrice(){
		return this.price;
	}
	public double getQuantity(){
		return this.quantity;
	}
	@Override
	public String toString(){
		return "Product Name: " + this.name + " | Price: " + this.price + ".\n";
	}
}