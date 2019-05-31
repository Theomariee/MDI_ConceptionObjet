package pizza;

public class Pizza  {
	public enum PizzaSize{
		Petite,
		Grande
	}
	PizzaSize size;
	private int price;
	private String name;
	private String photo;
	
	public Pizza(int price, String name, String photo, PizzaSize size) {
		this.price = price;
		this.name = name;
		this.photo = photo;
		
		this.size = size;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void bake() throws Exception{
		
	}
}

