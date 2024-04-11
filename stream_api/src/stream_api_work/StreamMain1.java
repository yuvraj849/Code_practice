package stream_api_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		
		
		//create a list and filter all even number from list
		
		//add even number in list
		List<Integer> list1 = List.of(2,4,50,21,22,67);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		List<Integer> list3 = Arrays.asList(23,567,12,677,24);
		
		//without stream
		
		List<Integer> listeven=new ArrayList<>();
		
		for(Integer i:list1) {
			if(i%2==0) {
				listeven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listeven);
		
		//using stream
		
		Stream<Integer> stream =list1.stream();
		List<Integer> newList =  stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> newlist = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("even" + newlist);
		
		//find number greater than 50 using stream
		List<Integer> greater = list1.stream().filter(i->i>50).collect(Collectors.toList());
		System.out.println(greater);
		
		//we can also print inside stream
		List<Integer> greater1 = list1.stream().filter(i->i>50).peek(System.out::println).collect(Collectors.toList());

		Stream<Object> emptyStream = Stream.empty();
		
		emptyStream.forEach(e ->{
			System.out.println(e);
		});
	}

}
