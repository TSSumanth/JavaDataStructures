package LinkedList;

class RSLNode
{
	int data;
	RSLNode nextReference;
	RSLNode(int data)
	{
		this.data = data;
	}
}

public class ReverseSingleList 
{
	private RSLNode headElement;
	private RSLNode tailElement;
	private int size;
	
	public void addElement(int data)
	{
		RSLNode n = new RSLNode(data);
		if(headElement ==null)
		{
			headElement = n;
			tailElement = n;
			size++;
			return;
		}
		if(headElement.nextReference == null)
		{
			this.headElement.nextReference = n;
			this.tailElement = n;
		}
		else {
			this.tailElement.nextReference = n;
			this.tailElement = n;
		}
		
		size++;
	}
	
	public void remove()
	{
		if(this.headElement == null)
			return;
		
		RSLNode currentNode = this.headElement.nextReference;
		if(currentNode == null) {
			this.headElement = null;
			size--;
			return;
		}
		RSLNode previousNode = this.headElement;
		while(currentNode != null && currentNode.nextReference != null)
		{
			previousNode = currentNode;
			currentNode = currentNode.nextReference;
		}
		
			tailElement = previousNode;
			tailElement.nextReference = null;
			size --;
	}
	
	public final int size()
	{
		return size;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		RSLNode currentnode = this.headElement;
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
