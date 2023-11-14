package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DuplicatesRemove {

	public static void main(String[] args) {
		/*
		 * List<Integer> list = Arrays.asList(1,2,3,4,5,5,4,8);
		 * list.stream().distinct().forEach(i->System.out.print(i+" "));
		 */
		/*
		 * String[] names= {"Welcome","to","Vtalent"}; Stream<String>
		 * s=Stream.of(names); s.forEach(System.out::println)
		 */;
		 List<Integer> list = Arrays.asList(1,2,3,4,5,5,4,8,0);
			/*
			 * long count = list.stream().distinct().count(); System.out.println(count);
			 */
//		 list.stream().sorted().forEach(i->System.out.println(i));
		 List<String> movies = Arrays.asList("devara","Asvr","JaiLavaKusa","JanataGarage","NannakuPrematho","temper","RRR");
		 movies.stream().sorted().forEach(ntr->System.out.println(ntr));
	}

}
