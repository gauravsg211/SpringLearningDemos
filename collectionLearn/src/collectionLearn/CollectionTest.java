package collectionLearn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class CollectionTest {
	
	private static final int required_age=25;
	
public static void main(String args[])
{  
	ObjectMapper mapper  = new ObjectMapper();
	DataSet dataSet=new DataSet();
	List<User> userList=DataSet.generateUserByRange(10);
	List<User> userList2=DataSet.generateUserByRange2(10);
	userList.addAll(userList2);
	System.out.println("Size of UserList is: "+userList.size());
	
	

//	
//    DataSet.line("this is for each loop as terminal operator.");
//
//	
//	userList.forEach(e->{
//		try {
//		
//			System.out.println(mapper.writeValueAsString(e));
//		} catch (JsonProcessingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	});
//	
//	
//	//Iterator
//     DataSet.line("Iterator");
//	Iterator<User> itr=userList.iterator();	
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
//	
//	
//	
//	DataSet.line("ListIterator");
//	
//	ListIterator<User> itrl=userList.listIterator(userList.size());
//	while(itrl.hasPrevious()) {
//		System.out.println(itrl.previous());
//	}
	
	userList=userList.stream().filter(filterData()).map(mapping()).sorted(comparing()).collect(Collectors.toList());
	Map<String,String>userMap=new HashMap<>();
   userList.forEach(generateMap(userMap));
	DataSet.printLine("Printing array list objects after filter and map");
	dataSet.printList(userList);
	DataSet.printLine("Printing map objects");
	DataSet.printMap(userMap);
	AdditionalListTests(userList);
	DataSet.Collection_stream_forEach_Test();
	flatmapTest();
	otherMapsTest();
	
}

private static void otherMapsTest() {
	Map<String,String>linkedmap=new LinkedHashMap<String,String>();
	
}

//filter users from specific cities and have a age more than required value
private static final  Predicate<User> filterData(){
	return g->Arrays.asList(CityEnum.DELHI.toString(),CityEnum.KOLKATA.toString(),CityEnum.MUMBAI.toString()).contains(g.getCity())&&g.getAge()>required_age;
}

private static final Comparator<User> comparing(){
	
	Comparator<User> city=Comparator.comparing(User::getCity);
	Comparator<User> age=Comparator.comparing(User::getAge);

	return age.thenComparing(city);
	 
}

private static final  Function<User,User> mapping(){
	return e->{
	User user=new User();
	Car car=e.getCar();
	car.setModel(e.getCar().getModel().toUpperCase());
	car.setCompany(e.getCar().getCompany().toUpperCase());
	user.setAge(e.getAge());
	user.setCar(car);
	user.setCity(e.getCity());
	user.setId(e.getId());
	user.setName(e.getName());
	
	return user;

};

}

private static Consumer<User> generateMap(Map<String,String> userMap){
	return e->{
		userMap.put(e.getId().concat(e.getName()),e.getCar().getRegNo());
		
	};
}

private static void AdditionalListTests(List<User> userlist) {
	int blockSize=2;
	List<String> list1=new ArrayList<>(Arrays.asList("my","name","is","gaurav","singh","nice"));
	List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	List<Integer> list3=new ArrayList<>();
	List<Integer> list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	IntStream.range(1, 101).boxed().forEach(e->list3.add(e));
	String cmbnd=list1.stream().collect(Collectors.joining(" "));
	Double meanAr=list2.stream().collect(Collectors.averagingInt(a->a.intValue()));
	IntSummaryStatistics value=list2.stream().collect(Collectors.summarizingInt(a->a.intValue()));
	Map<String,Long> cmbnd3=list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	Map<Boolean,List<Integer>> cmbnd4=list2.stream().collect(Collectors.groupingBy(e->e%2==0,Collectors.toList()));
	AtomicInteger c=new AtomicInteger();
	
	Map<Integer,List<Integer>> cmbnd5=list4.stream().collect(Collectors.groupingBy(e-> c.getAndIncrement() /blockSize,Collectors.toList()));

	Map<String ,List<User>> cmbnd6=userlist.stream().collect(Collectors.groupingBy(User::getCity,Collectors.toList()));
	
	Map<String ,List<String>> cmbnd7=userlist.stream().collect(Collectors.groupingBy(User::getCity,Collectors.mapping(User::getName, Collectors.toList())));


    List<List<Integer>> lists=new ArrayList<>(cmbnd4.values());

DataSet.printLine("additional");
//	System.out.println(cmbnd);
//	System.out.println(cmbnd5);
	//DataSet.printMap(cmbnd7);
//	System.out.print(lists.get(1));
	
	HashMap<Integer,String> TestinMap=new HashMap<>();
    cmbnd7.entrySet().stream().forEach(e->System.out.println(e));
	
	TestinMap.put(1,"firstValue");
	DataSet.printLine("usage of compute method in map");

	TestinMap.compute(1, (K,V)->{return V.concat("+").concat("secondValue");});
	
	TestinMap.compute(1, (K,V)->{
	return V.toUpperCase();});
	TestinMap.computeIfAbsent(2, V->"SecondValue".concat("there"));
	TestinMap.computeIfPresent(2, (K,V)->V.concat("+").concat("there"));
	
	cmbnd7.put("test",Arrays.asList("this and"));
	
	cmbnd7.compute("test",(K,V)->Arrays.asList(V.get(0).concat("that").toUpperCase()));
	
	DataSet.printMap(TestinMap);
	
	DataSet.printLine("Replace /all in Map usage");

	//normal replace
	cmbnd7.replace("test",Arrays.asList("changed"));
	cmbnd7.replace("test",Arrays.asList("changed"),Arrays.asList("againChnaged"));
	
	//replace all
	cmbnd7.replaceAll((key, oldValue)->Arrays.asList("allReplaced","kkk","kk"));
	cmbnd7.replaceAll((key, oldValue)->DataSet.getListGeneric("hi","this","list","is","changed","again"));
	
	
	///sample code
//	employeeDOJMap.replaceAll((year, empList) -> {
//		empList.replaceAll(emp -> {
//		    emp.setName(emp.getName().toUpperCase());
//		    return emp;
//		  });
//		  return empList;
//		});
	cmbnd7.computeIfPresent("test", (K,V)->{
		V.set(0, "Hello");
		V.set(1, "checkout");
		return V;
		});
	
	HashSet<String>Set3=new HashSet<>();
	
	cmbnd7.forEach((K,V)->{
		Set3.addAll(V);
		
		System.out.println("Key is :"+K+",Value is:"+V );
	});
	
	cmbnd7=cmbnd7.entrySet().stream().filter(e->e.getKey().equalsIgnoreCase(CityEnum.KOLKATA.toString())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	//All the possible value in the map value list will be in this set.
	//DataSet.printSet(Set3);
	
	//just return an unordered stream but if stream is itself unordered then it returns itself.
	Set3.stream().unordered().forEach(System.out::println);
	System.out.println();
	DataSet.printLine("result after filter on map by generating entry set of a map that");
    System.out.println("final size of cmbnd7 map is after applying map filter : "+cmbnd7.size());
    DataSet.printMap(cmbnd7);
    DataSet.mapTest();
	
	Set<Integer> set1=new HashSet<>();
	Set<Integer> set2=new HashSet<>();
	list4.add(1);
	set1.addAll(list4);
	

	//DataSet.printSet(set1);
	///first usage of optional
//	Optional<Integer> r=set1.stream().findFirst();
//	if(r.isPresent()) {
//	System.out.print(r.get());
//	}
//	else
//	{
//		System.out.println("no value in optional");
//	}
	
	
	//System.out.println(set1.stream().findFirst().orElse(12345));
	set2.addAll(set1);
	//set1.remove(2);
	//System.out.println(set1.equals(set1));
	//System.out.println(set1.containsAll(set2));
	//set1.removeIf(e->e.intValue()%2==0);
	//DataSet.printSet(set1);
	
//	set1.forEach(e->{System.out.println(e*3);
//	});
	
	
	//--spliterator test method call
	//SpliteratorTest(set1);
	
	Integer[] array = set1.toArray(new Integer[0]);
	System.out.println(Arrays.toString(array));
	
}

private  static void SpliteratorTest(Set<Integer> set1) {
	IntStream.range(12,25).forEach(e->set1.add(e));
	Spliterator<Integer> g=set1.spliterator();
	System.out.println("Estimated"+g.estimateSize()+","+"exactSize:"+g.getExactSizeIfKnown());
	DataSet.printLine("Spliterator test from actual split but after spliting");
	Spliterator<Integer> h=g.trySplit();
	g.forEachRemaining((u) -> System.out.println(u));
    DataSet.printLine("from the splitted iterator");
	h.forEachRemaining((u) -> System.out.println(u));
	//System.out.println("Estimated"+g.estimateSize()+","+"exactSize:"+g.getExactSizeIfKnown());
	//System.out.println("Estimated"+h.estimateSize()+","+"exactSize:"+h.getExactSizeIfKnown());

	//SpliteratorTesting.splitTest();
	SpliteratorTesting.DiffSpliters();
}


private static Consumer<Integer> multiply(int value){
	 return e->{
		System.out.println(e*value);
};
}


private static void flatmapTest() {
	// Creating a list of Prime Numbers
    List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
      
    // Creating a list of Odd Numbers
    List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
      
    // Creating a list of Even Numbers
    List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

    List<List<Integer>> listOfListofInts =
            Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
    
    List<String> list1=Arrays.asList("gaurav","singh");
    List<String> list3=Arrays.asList("1","2","3","4");
    System.out.println("The Structure before flattening is : " +
                                              listOfListofInts);
      
    // Using flatMap for transformating and flattening.
    List<Integer> listofInts  = listOfListofInts.stream()
                                .flatMap(list -> list.stream())
                                .collect(Collectors.toList());

    System.out.println("The Structure after flattening is : " +
                                                     listofInts);
    
    list1.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
    
    OddNumbers.stream().flatMap(str -> Stream.of(str.floatValue())).forEach(System.out::println);
    
    list3.stream().flatMapToInt(str->IntStream.of(Integer.parseInt(str))).forEach(System.out::println);
    
    
    List<String> list4=Arrays.asList("gaurav_001","vipin_002","rahul_003","alex_006","jadhav_009");
    //task is to create separate array list of string type having the id only, that are after the hyphen.
    
    list4.stream().flatMap(str->Stream.of(str.split("_")[1])).forEach(System.out::println);
    
    list4.stream().map(e->e.split("_")[1]).forEach(System.out::println);
    

}


}

