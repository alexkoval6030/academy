package by.it.academy.homework.lesson7.task1;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLambda {

	public static void main(String[] args) {
		Random random = new Random();
		Map<Long, String> streamLambda = Stream.generate(() -> random.nextInt(100))
				.limit(100)
				.map(intValue -> (long)(intValue * Math.PI - 20))
				.filter(longValue -> longValue < 100)
				.sorted()
				.skip(3)
				.distinct()
				.collect(Collectors.toMap(key -> key, value -> "Number: " + value));
		System.out.println(streamLambda);
		System.out.println(streamLambda.size());
	}

}

