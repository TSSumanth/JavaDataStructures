package DoubleLinkedListPrimitive;

public class IntDoubleLinkedListClass 
{
	IntNode headNodeReference;
	IntNode tailNodeReference;
	int size=0;
	
	
	public void addfirst(int i)
	{
		IntNode currentElementReference = new IntNode(i);
		
		currentElementReference.head = null;
		currentElementReference.tail = headNodeReference;
		if(this.tailNodeReference == null && this.headNodeReference == null) {
			headNodeReference = currentElementReference;
			tailNodeReference = currentElementReference;
			size++;
			return;			
		}			
		
		if(this.tailNodeReference == null && this.headNodeReference != null) {
			this.tailNodeReference = headNodeReference;
		}
		headNodeReference = currentElementReference;
		
		size ++;
	}
	
	
	public void addlast(int i)
	{
		if(tailNodeReference == null && headNodeReference == null)
		{
			IntNode currentElementReference = new IntNode(i);
			tailNodeReference = currentElementReference;
			headNodeReference = currentElementReference;
			size ++;
			return;
		}
		
		
		
		IntNode currentElementReference = new IntNode(i);
		currentElementReference.tail = null;		
		tailNodeReference.tail = currentElementReference;
		currentElementReference.head = tailNodeReference;
		
		tailNodeReference = currentElementReference;
		size ++;
	}
	
	
	public int size()
	{
		return size;
	}
	
	
	public String toString()
	{
		StringBuffer str = new StringBuffer();
		IntNode currentNode = headNodeReference;
		while(currentNode != null)
		{
			System.out.println("current element:" + currentNode.toString());
			str.append(currentNode.toString() +", ");
			currentNode = currentNode.tail;
		}
		return str.toString();
	}

}
