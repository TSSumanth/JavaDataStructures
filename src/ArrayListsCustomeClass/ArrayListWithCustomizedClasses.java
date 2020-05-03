package ArrayListsCustomeClass;

import java.util.ArrayList;

public class ArrayListWithCustomizedClasses {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(1,"sam","Sundar"));
		al.add(new Employee(2,"steve","mohan"));
		al.add(new Employee(3,"sumit","smith"));
		al.add(new Employee(4,"rem","rahim"));
		
		//System.out.println(al.get(1));
		
		System.out.println(al.contains(new Employee(4,"rem","rahim"))); 
		System.out.println(al.indexOf(new Employee(4,"rem","rahim"))); 
		
		Object[] arrayObj = al.toArray();
		
		Employee[] empArray = al.toArray(new Employee[al.size()]);
		
	}

}
