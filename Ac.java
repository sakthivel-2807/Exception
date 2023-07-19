package exception;

public class Ac {
	private String brand;
	private String model;
	private int price;
	private int noofmonthWarranty;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoofmonthWarranty() {
		return noofmonthWarranty;
	}
	public void setNoofmonthWarranty(int noofmonthWarranty) {
		this.noofmonthWarranty = noofmonthWarranty;
	}
	public Ac(String brand, String model, int price, int noofmonthWarranty) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.noofmonthWarranty = noofmonthWarranty;
	}
	
	
	



}
