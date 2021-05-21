package collectionLearn;

public class User {
	
	private String id;
	private String name;
	private String city;
	private int age;
	private Car car;
	
	public User() {
		
	}
	
	public User(String id, String name, String city, int age,Car car) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.car=car;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", car=" + car + "]";
	}

	
}
