package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Test2 {
	
	public static void main(String[] args) {
		
		List<String> lstr = Arrays.asList("a","","c","d","e");
		
		List<String> filterstr = lstr.stream().filter(String -> !String.isEmpty()).collect(Collectors.toList());
		
		filterstr.forEach(System.out::println);
		
		System.out.println(" ----------------------------------------------------------------------------- ");
		
		Random ran = new Random();
		
		ran.ints().limit(10).forEach(System.out::println);
		
		System.out.println(" ----------------------------------------------------------------------------- ");
		
		List<Integer> lstrmap = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> filterstrmap = lstrmap.stream().map(i -> i*i).collect(Collectors.toList());
		
		filterstrmap.forEach(System.out::println);
		
		System.out.println(" ----------------------------------------------------------------------------- ");
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		long count = strings.stream().filter(String -> String.isEmpty()).count();
		
		System.out.println(count);
		
		System.out.println(" ----------------------------------------------------------------------------- ");
		
		Random random = new Random();
		
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		System.out.println(" ----------------------------------------------------------------------------- ");
		
		List<String> stringss = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		List<String> lsts = strings.parallelStream().filter(String -> !String.isEmpty()).collect(Collectors.toList());
		
		lsts.forEach(System.out::println);
		
		System.out.println(" ----------------------------------------------------------------------------- ");
		
		String hbstr = strings.parallelStream().filter(String -> !String.isEmpty()).collect(Collectors.joining(","));
		
		System.out.println(hbstr);
		
		System.out.println(" ----------------------------------------------------------------------------- ");
		
		List<Integer> lstrmaps = Arrays.asList(1,2,3,4,5,6);
		
		IntSummaryStatistics ints = lstrmaps.stream().mapToInt((x) -> x).summaryStatistics();
		
		System.out.println("列表中最大的数 : " + ints.getMax());
		System.out.println("列表中最小的数 : " + ints.getMin());
		System.out.println("所有数之和 : " + ints.getSum());
		System.out.println("平均数 : " + ints.getAverage());
		
	}
	
}
