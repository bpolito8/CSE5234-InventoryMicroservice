
public class Product {
	public int id;
	public String name;
	public double price;
	public String description;
	public String img_src;
	public int inventory;
	public Product(int id, String name, double price, String description, String img_src, int inventory) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.img_src = img_src;
		this.inventory = inventory;
	}
}
