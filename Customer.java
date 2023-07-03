import java.util.*;
public class Customer{
	private String name;
	private ModeOfPayment payMethod;
	private double money;
	private String address;
	private DeliverMode deliverMode;
	private ArrayList<Product> order;
	private OrderInformation information;

	public Customer(String name, ModeOfPayment payMethod, double money, DeliverMode deliverMode, String address){
		this.name = name;
		this.payMethod = payMethod;
		this.money = money;
		this.information = new OrderInformation(this, deliverMode, address);
		this.order = new ArrayList<>();
	}

	public boolean addToCart(Product p, int quantity, Store s){
		if(payMethod == ModeOfPayment.EWALLET && money > (p.getPrice() * quantity) && s.isAvailable(p, quantity))
		{
			for(int i=0; i<quantity; i++)
			{
				order.add(p);
			}
			this.money -= (p.getPrice() * quantity);
			information.addProduct(p, quantity);
			return true;
		}
		else if(s.isAvailable(p, quantity))
		{
			for(int i=0; i<quantity; i++)
			{
				order.add(p);
			}
			information.addProduct(p, quantity);
			System.out.println("Pending Payment Amounts to PHP: " + (p.getPrice() * quantity));
			return true;
		}
		return false;
	}
	public double getMoneyBalance()
	{
		return this.money;
	}
	public ModeOfPayment getPaymentMethod()
	{
		return this.payMethod;
	}
	public String getName(){
		return this.name;
	}
	public ArrayList<Product> getOrders(){
		return order;
	}
	@Override
	public String toString(){
		String p = "Name: " + this.name + "\t Date: July 1, 2023\n\n";
		p += information.toString();
		return p;
	}
}