package collectionLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DataSet {

	public List<User> setUserFirst(int count) {

		List<User> userList = new ArrayList<>();

		for (int i = 1; i <= count; i++) {

			Car car = new Car(i + "BBBTR", "palio", 988787.0F, "fiat");
			User user = new User("F" + i, "gaurav_singh" + i, "kanpur", 22, car);

			userList.add(user);

		}
		return userList;

	}

	public List<User> setUserSecond(int count) {

		List<User> userList = new ArrayList<>();

		for (int i = 1; i <= count; i++) {

			Car car = new Car(i + "MLLPII", "amaze", 988787.0F, "honda");
			User user = new User("S" + i, "vipin_rawat" + i, "delhi", 22, car);

			userList.add(user);

		}
		return userList;

	}

	public static void printLine(String phrase) {
		System.out
				.println("------------------" + phrase + "-----------------------------------------------------------");

	}

	public <T> void printList(List<T> arrList) {

		for (T usr : arrList) {
			System.out.println(usr.toString());
		}

	}
	
	public static <T> void printSet(Set<T> givenSet) {

		for (T usr : givenSet) {
			System.out.println(usr.toString());
		}

	}

	public static <T, U>  void printMap(Map<T, U> genMap) {

		for (Entry<T, U> mapEntity : genMap.entrySet()) {
			System.out.print("KEY:" + mapEntity.getKey());
			System.out.print("  VALUE:" + mapEntity.getValue());
			System.out.print("\n");

		}

	}

	public static List<User> generateUserByRange(int upperBound) {

		List<User> userList = new ArrayList<>();
		IntStream.rangeClosed(1, upperBound).boxed().forEach(e -> {
			CarModel carModel = CarModel.randomCarModel();
			userList.add(new User("F" + e, "gaurav_singh" + e, CityEnum.randomCity().toString(), genRandomAge(20, 60),
					new Car(e + "BBBTR", carModel.getModel(), carModel.getPrice(), carModel.getCompany())));
		});

		return userList;

	}

	public static List<User> generateUserByRange2(int upperBound) {

		List<User> userList = new ArrayList<>();
		IntStream.rangeClosed(1, upperBound).boxed().forEach(e -> {
			CarModel carModel = CarModel.randomCarModel();
			userList.add(new User("S" + e, "rahul_chahar" + e, CityEnum.randomCity().toString(), genRandomAge(20, 60),
					new Car(e + "MLLPII", carModel.getModel(), carModel.getPrice(), carModel.getCompany())));
		});

		return userList;

	}

	private static Integer genRandomAge(int min, int max) {
		return min + (new Random().nextInt((max - min) + 1));
	}
	
	public static List<String> getList(String... strings) {
		return new ArrayList<>(Arrays.asList(strings));
	}
	
	@SafeVarargs
	public static <T> List<T> getListGeneric(T... values) {
		return new ArrayList<>(Arrays.asList(values));
	}
	
public static void Collection_stream_forEach_Test() {
	List<String> al=getListGeneric("A","B","C","D");
	Consumer<String> consumer=System.out::println;
	al.forEach(consumer);
	al.stream().forEach(consumer);
	al.parallelStream().forEach(consumer);
}


public static void mapTest() {
	
	Stream<String[]>
	str = Stream
	          .of(new String[][] { { "1", "A" },
	                               { "2", "B" },
	                               { "2", "C" } });
	// Convert the String to Map
	// using toMap() method
	//valuemapper,keymapper,merge function(if same key),mapsupplier
	LinkedHashMap<String, String>map = str.collect(Collectors
                            .toMap(
                                p -> p[0], p -> p[1], (s, a) -> s + "," + a, LinkedHashMap::new));

	// Print the returned Map
	System.out.println("Map:" + map);	
}


}
