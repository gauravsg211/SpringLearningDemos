package collectionLearn;

public class Car {
	
	private String regNo;
	private String model;
	private double price;
	private String company;
	
	public Car() {
		
	}
	
	public Car(String regNo, String model, double price, String company) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.price = price;
		this.company = company;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", model=" + model + ", price=" + price + ", company=" + company + "]";
	}
	

}
