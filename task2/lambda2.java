package javaoops.task2;

import java.util.Arrays;
import java.util.List;

public class lambda2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("alice","bob","anil","kiran","amit");
		//print all names
		names.forEach(name->System.out.println("name:"+name));
		//filter names starting with a
		System.out.println("\nnames starting with a:");
		names.stream()
		.filter(n -> n.startsWith("a"))
		.forEach(System.out::println);
		//sort names
		System.out.println("\nsorted names:");
		names.stream()
		     .sorted()
		     .forEach(System.out::println);

	}

}
