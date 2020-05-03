package ArrayListsCustomeClass;

public class Employee {
	int id;
	String firstName;
	String lastName;
	
	
	Employee(int id, String firstName, String lastName)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public String toString()
	{
		return "Employee Id: " + id +
				", Employee Name: " + firstName + " " + lastName;
		
	}
	
//	public boolean equals(Object o) {
//		if(this == o) //reference comparison
//			return true;
//		
//		if(o==null)  // checking the comparison with null object
//			return false;
//		
//		if( getClass() != o.getClass())  // checking both objects are from different class
//			return false;
//		
//		Employee e= (Employee) o;
//		if(this.id != -1) {
//			if(! (this.id == e.id))
//				return false;
//		}
//		
//		if(this.firstName != "" ) {
//			if(! (this.firstName.equals(e.firstName)))
//				return false;
//		}
//		
//		if(this.lastName != "" ) {
//			if(! (this.lastName.equals(e.lastName)))
//				return false;
//		}
//		
//		if(this.id == -1 && this.firstName == "" && this.lastName == "")
//			return false;
//		
//		return true;
//	}
	
	
	public boolean equals(Object o) {
		if(this == o) //reference comparison
			return true;
		
		if(o==null)  // checking the comparison with null object
			return false;
		
		if( getClass() != o.getClass())  // checking both objects are from different class
			return false;
		
		Employee e= (Employee) o;
		
		if(this.id == e.id && this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName))
			return true;
		
		return false;
	}
		
}
