import java.util.*;
public class OrderInformation{
	private ArrayList<Product> products;
	private double totalAmount;
	private DeliverMode deliveryMode;
	private ModeOfPayment payment;
	private String address;
	private String name;
	private int quantity;
	private Customer c;

	public OrderInformation(Customer c, DeliverMode deliveryMode, String address){
		this.products = new ArrayList<>();
		this.totalAmount = 0;
		this.deliveryMode = deliveryMode;
		this.payment = c.getPaymentMethod();
		this.name = c.getName();
		this.address = address;
		this.quantity = 0;
		this.c = null;
	}
	public void addProduct(Product p, int quantity)
	{
		this.products.add(p);
		this.totalAmount += (p.getPrice() * quantity);
		p.numOrders = quantity;
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
			s += product.numOrders + " order(s) were made on this product.\n";
			s += product.toString();
			s += "\n";
		}
		s += "Deliver Address: " + this.address + "\n";
		s += "Delivery Method is " + this.deliveryMode + " | Total Payment: " + this.totalAmount + " | Mode of Payment: " + this.payment + ".\n";
		return s += "Total Remaining Balance from you EWallet: " + c.getMoneyBalance();
	}
}