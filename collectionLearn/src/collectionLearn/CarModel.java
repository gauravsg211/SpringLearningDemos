package collectionLearn;
import java.util.Arrays;
import java.util.Random;


public enum CarModel {
	
	AMAZE("amaze",278876.98,"honda"),
	CIVIC("civic",456768,"honda"),
	VITARA_BREZZA("vitara_brezza",76789.99,"maruti"),
	LAURA("laura",89887.98,"skoda"),
	SWIFT("swift",546776.88,"maruti"),
	INDICA("indica",345697.88,"tata"),
	SCORPIO("scorpio",127656.99,"mahindra"),
	CELTOS("celtos",54665.88,"kia");
	
	private String model;
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

	private double price;
	private String company;
	
	private CarModel(String model, double price, String company) {
		this.model = model;
		this.price = price;
		this.company = company;
	}
	
	public static final CarModel getAppResposeCode (final String model) throws  Exception {
		return Arrays.asList(CarModel.values()).stream().filter(e -> e.model.equalsIgnoreCase(model))
				.findFirst().orElseThrow(() -> new Exception("No match for code " + model));
	}
	
	public static CarModel randomCarModel() {
		Random random =new Random();
		
		int pick=random.nextInt(CarModel.values().length);
		return CarModel.values()[pick];
		
	}
}
