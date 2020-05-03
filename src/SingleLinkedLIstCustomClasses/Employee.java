package SingleLinkedLIstCustomClasses;

public class Employee 
{
	private int id;
	private String firstName;
	private String lastName;
	
	Employee(int id, String firstName, String lastName)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString()
	{
		return "Employee id: " + this.id
				+ "Employee Name: " + firstName +" " + lastName;
	}
}
