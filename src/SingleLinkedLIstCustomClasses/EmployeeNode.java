package SingleLinkedLIstCustomClasses;

public class EmployeeNode {
	Employee data;
	EmployeeNode nextNodeReference;
	
	EmployeeNode(Employee data,EmployeeNode nextNodeReference)
	{
		this.data = data;
		this.nextNodeReference = nextNodeReference;
	}
}
