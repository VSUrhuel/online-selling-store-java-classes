import java.util.*;
public class Order{
	private ArrayList<Product> products;
	private double totalAmount;
	private DeliverMode deliveryMode;
	private String address;

	public Order(ArrayList<Product> products, double totalAmount, DeliverMode deliveryMode, String address){
		this.products = products;
		this.totalAmount = totalAmount;
		this.deliveryMode = deliveryMode;
		this.address = address;
	}

	public double getTotalAmount(){
		return this.totalAmount;
	}
	public ArrayList<Product> getListProducts(){
		return this.products;
	}
	public DeliverMode getDeliveryMode(){
		return this.deliveryMode;
	}
	public String getAddress(){
		return this.address;
	}
	@Override
	public String toString(){
		String s = "";
		for(Product product : products){
			s += product.toString();
		}
		return s + "Delivery Method is " + this.deliveryMode + " | Total Payment: " + this.totalAmount;
	}


}