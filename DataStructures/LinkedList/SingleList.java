package LinkedList;

class Node
{
	int data;
	Node nextReference;
	Node(int data)
	{
		this.data = data;
	}
}

public class SingleList 
{
	private Node headElement;
	private int size;
	
	public void addElement(int data)
	{
		Node n =new Node(data);
		n.nextReference = this.headElement;
		headElement = n;
		size++;
	}
	
	public void remove()
	{
		if(this.headElement == null)
			return;			
		Node nextreference = this.headElement.nextReference;
		headElement = nextreference;
		size--;
	}
	
	public void addElement(int index,int data)
	{
		if(this.headElement == null)
			return;		
		if(index>size)
			return;
		
		Node currentnode = this.headElement;
		Node previousnode = null;
		int i=0;
		while(i<=size)
		{	
			if(i==index) // at expected index
			{
				Node n =new Node(data);		// create new node		
				n.nextReference = currentnode; // new node before current node
				if(previousnode != null) // assign current node to previous node
				{
					previousnode.nextReference = n;
				}
				else// if there is no previous node, assign headelement to current node
				{
					this.headElement = n;
				}
				
				size++;
				break;
			}
			previousnode = currentnode ;
			currentnode = currentnode.nextReference;
			i++;			
		}
		
	}
	
	public void remove(int data)
	{
		if(this.headElement == null)
			return;		
		
		Node currentnode = this.headElement;
		Node previousnode = null;
		while(currentnode.nextReference != null)
		{			
			if(currentnode.data == data)
			{
				// change the previous node reference to next node reference
				if(previousnode != null)
					previousnode.nextReference = currentnode.nextReference;
				else // if head element is having the given data
					this.headElement = currentnode.nextReference;
				size--;
			}
			// update previous node to current node and current node to next node 
			previousnode = currentnode;
			currentnode = currentnode.nextReference;
			
		}
		//if data is matching on head element and head element is only element
		if(currentnode.data == data)
		{
			if(previousnode != null) // if element is last element
				previousnode.nextReference = null;
			else  // if element is present in head node and that is only node present
				this.headElement=null;
			size--;
		}
	}
	
	public final int size()
	{
		return size;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		Node currentnode = this.headElement;
		if(currentnode == null)
			return "";
		while(currentnode.nextReference != null)
		{
			sb.append(currentnode.data+", ");
			currentnode = currentnode.nextReference;
		}
		sb.append(currentnode.data);
		return sb.toString();
	}
}
