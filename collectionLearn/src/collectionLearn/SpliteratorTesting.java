package collectionLearn;


	
	import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
	import java.util.stream.IntStream;
	
	public class SpliteratorTesting {

	public static void splitTest() {

	  List<String> lines = new ArrayList<>();

	  IntStream.range(0, 10).forEach(i -> lines.add("Line number " + i));

	  System.out.println("Original list size " + lines.size());

	  Spliterator<String> linesIterator = lines.spliterator();
	  System.out.println(linesIterator.hasCharacteristics(Spliterator.DISTINCT));
	  long estimatedSize = linesIterator.getExactSizeIfKnown();
	  System.out.println("lines spliterator count for getExactSizeIfKnown() : " + estimatedSize);

	  Spliterator<String> splittedLinesIterator = linesIterator.trySplit();
	  long splittedLinesIteratorCount = splittedLinesIterator.getExactSizeIfKnown();
	  System.out.println(
	    "lines splittedLinesIteratorCount count for getExactSizeIfKnown() : " + splittedLinesIteratorCount);
	  splittedLinesIterator.forEachRemaining((n) -> System.out.println(n));
	 }
	
	
	public static void DiffSpliters() {

		  Set<String> lines = new HashSet<>();

		  IntStream.range(0, 10).forEach(i -> lines.add("Line number " + i));

		  System.out.println("Original list size " + lines.size());

		// Main spliterator
		  Spliterator<String> linesIterator = lines.spliterator();

		// Splitted spliterator
		  Spliterator<String> splittedLinesIterator = linesIterator.trySplit();

		  System.out.println("Elements processed by main iterator");
		  linesIterator.forEachRemaining(value -> System.out.println(value));

		  System.out.println("Elements processed by splitted iterator 1");
		  splittedLinesIterator.forEachRemaining(value -> System.out.println(value));
		 }
	}


