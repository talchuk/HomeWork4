package At_25.Work4;

public class Phone {
	private int id;
	private String model;
	private String color;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone{" + "id=" + id + ", model='" + model + '\'' + ", color='" + color + '\'' + ", price=" + price
				+ '}';
	}
}
