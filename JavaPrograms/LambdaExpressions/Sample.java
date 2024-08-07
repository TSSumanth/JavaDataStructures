package LambdaExpressions;

import java.util.function.Function;

public class Sample {

	public static void main(String[] args) 
	{
		
		CustumFunInterface name = ()-> "Sumanth";
		String s = name.m1();
		System.out.println(s);
		useFunction();
	}

	public static void useFunction()
	{
		Function<String, Integer> f = s -> {return s.length();};
		System.out.println(f.apply("Sumanth"));
		System.out.println(f.apply("Sai"));
		System.out.println(f.apply("Apple"));
	
	}
	
}




