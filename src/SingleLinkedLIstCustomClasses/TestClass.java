package SingleLinkedLIstCustomClasses;

public class TestClass {

	public static void main(String[] args) 
	{
		EmployeeLinkedList ell = new EmployeeLinkedList();
		
		ell.addElement(new Employee(1,"sam","Sundar"));
		ell.addElement(new Employee(2,"suman","erf"));
		ell.addElement(new Employee(3,"smith","steve"));
		ell.addElement(new Employee(4,"robert","tony"));
		ell.addElement(new Employee(5,"stark","thor"));

		System.out.println(ell.size());
		System.out.println(ell);
		
		
		ell.remove();
		ell.remove();
		
		System.out.println(ell.size());
		System.out.println(ell);
		
	}
}
