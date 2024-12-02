package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Que1Map {

	public static void main(String[] args) {

		String str = "My name is khan";
		Map<Character, List<Character>> collect3 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c));
		System.out.println(collect3);

		Map<Character, Long> collect4 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(collect4);

		List<Integer> list1 = List.of(1, 2, 3, 45, 62, 61, 4, 3, 22, 6, 73);
		List<Integer> collect = list1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> collect2 = list1.stream().map(a -> a * 2).collect(Collectors.toList());
		System.out.println(collect2);

		list1.stream().sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();

		Integer a = list1.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("max " + a);

		List<String> names = Arrays.asList("John", "Jane", "Jake", "Jill", "Jessie");

		Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(groupedByLength);
		
		
		

	}
}
