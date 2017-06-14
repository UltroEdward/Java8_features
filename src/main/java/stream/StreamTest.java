package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("sun", "moon", "see", "river", "earth", "sun");

		// filtering
		List<String> filtered = list.stream().filter(e -> e.length() > 3).collect(Collectors.toList());
		System.out.println(filtered);

		// sorting
		List<String> sorted = list.stream().sorted((a, b) -> a.length() - b.length()).collect(Collectors.toList());
		System.out.println(sorted);

		// mapping
		List<Integer> maped;
		maped = list.stream().map(e -> e.length()).collect(Collectors.toList());
		maped = list.stream().map(String::length).collect(Collectors.toList());
		System.out.println(maped);

		// matching
		list.stream().allMatch(e -> e.length() > 0); // true
		list.stream().noneMatch(e -> e.length() > 0); // false
		list.stream().anyMatch(e -> e.length() > 0); // true

		// counting
		long count = list.stream().filter(e -> e.startsWith("s")).count();
		System.out.println(count);
	}

}
