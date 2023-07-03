import java.util.*;
public class Store{
	private ArrayList<Product> products;
	public String name;

	public Store(String name){
		this.name = name;
		this.products = new ArrayList<>();
	}
	public boolean isAvailable(Product p, int quantity)
	{
		for(Product prod : products)
		{
			if(prod.getName().equals(p.getName()) && p.getQuantity() > quantity)
				return true;
		}
		return false;
	}
	public void addProduct(Product a){
		products.add(a);
	}
	public boolean removeProduct(Product b){
		for(Product product : products){
			if(product.equals(b)){
				products.remove(product);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Product> productList(){
		return products;
	}
	@Override
	public String toString(){
		String s = "";
		for(Product product :  products){
			s += product.toString();
		}
		return s;
	}
}