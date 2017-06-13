package features;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		Optional<String> optional = null;
		Optional<String> optionalEmpty = null;

		optional = Optional.of("  Hello  "); // must not be null

		optionalEmpty = Optional.ofNullable(null); // can be null or not
		optionalEmpty = Optional.empty(); // if should be empty

		optional.filter((s) -> s.length() > 0); // return empty if not
		optional.flatMap((s) -> Optional.of(s.toLowerCase())); // apply function or return empty

		//optionalEmpty.get(); // NoSuchElementException will be thrown
		
		if (optionalEmpty.isPresent()) {
			optionalEmpty.get();
		}
		
		optional.ifPresent((s) -> s.trim());
		
		System.out.println(optionalEmpty.orElse("I am empty"));
		System.out.println(optional.orElse("I am empty"));

	}
}
