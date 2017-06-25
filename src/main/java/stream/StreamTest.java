package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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

		// distinct
		List<String> clean = list.stream().distinct().collect(Collectors.toList());
		System.out.println(clean);

		// peek
		list.stream().peek(e -> System.out.print(e)).collect(Collectors.toList());

		// counting
		long count = list.stream().filter(e -> e.startsWith("s")).count();
		System.out.println(count);

		// min
		Optional<String> min = list.stream().min((e1, e2) -> e2.compareTo(e1));
		System.out.println(min.get());

		// max
		Optional<String> max = list.stream().max((e1, e2) -> e2.compareTo(e1));
		System.out.println(max.get());

		// foreach
		list.stream().forEach(e -> System.out.print(e));

	}

}
