package Testsimple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<>();
		ls.add("Ester");
		ls.add("Sundar");
		ls.add("Bunny");
		ls.add("Amol");
		ls.add("Buddy");

		long count = ls.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count);

		long d = Stream.of("Aishu", "Muthu", "Abisha", "Jessi", "Arun").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		// print the all names in arrayList
//		ls.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		ls.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));

		// map example
		Stream.of("Aishu", "Muthu", "Abisha", "Jessi", "Aruna").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("*******");

		// sort
		List<String> names = Arrays.asList("Azbhi", "Don", "Alekhya", "Sundar", "Muthu");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("*******");
		// concat
		Stream<String> stream = Stream.concat(ls.stream(), names.stream());
//		 stream.forEach(s->System.out.println(s));

		boolean flag = stream.anyMatch(s -> s.equalsIgnoreCase("Don"));
		System.out.println(flag);

		// collect
		List<String> lst = Stream.of("Aishu", "Muthu", "Abisha", "Jessi", "Aruna").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println(lst.get(0));
		
		//print the unique num in list
		
		List<Integer> num = Arrays.asList(2,3,3,8,9,8,8,2,1);
		num.stream().sorted().distinct().forEach(s->System.out.println(s));
		
		//sort the arry print 3rd index
		List<Integer> nums = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(nums.get(3));
	}

}
