package SingleLinkedLIstCustomClasses;

public class EmployeeLinkedList 
{
	EmployeeNode headElementReference;
	private int size= 0;
	
	
	public void addElement(Employee employee)
	{
		EmployeeNode newElementNode = new EmployeeNode(employee,headElementReference);
		headElementReference  = newElementNode;
		size ++;
	}
	
	public int size()
	{
		return this.size;
	}
	
	
	public EmployeeNode remove()
	{
		EmployeeNode currentElementreference = this.headElementReference;
		this.headElementReference = currentElementreference.nextNodeReference;
		return currentElementreference;
	}
	
	public String toString()
	{
		StringBuffer str = new StringBuffer();
		EmployeeNode currentElement = headElementReference;
		
		while(currentElement !=null)
		{
			str.append(currentElement.data + "/n");
			currentElement = currentElement.nextNodeReference;
		}
		
		return str.toString();
	}
}
