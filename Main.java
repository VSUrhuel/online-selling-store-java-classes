import java.util.*;
public class Main{
	public static void main(String[] args){
		Product shoe = new Product("Nike Shoe", 200, 20);
		Product bag = new Product("Jansport Bag", 1400, 45);
		Store shoppe = new Store("Shoppe");
		Customer rhuel = new Customer("Rhuel", ModeOfPayment.EWALLET, 50000, DeliverMode.PICK_UP, "Brgy.Combis, Dulag, Leyte");

		shoppe.addProduct(shoe);
		shoppe.addProduct(bag);
		rhuel.addToCart(shoe, 7, shoppe);
		rhuel.addToCart(bag, 10, shoppe);
		System.out.println(shoppe);
		System.out.println(rhuel);
	}
}