package LinkedList;

class DNode
{
	int data;
	DNode previousNode;
	DNode nextNode;
	DNode(int data)
	{
		this.data = data;
	}
}
public class DoubleList 
{
	private DNode headElement;
	private DNode tailElement;
	int size;
	
	public void addFirst(int data)
	{
		DNode dn = new DNode(data);
		if(this.headElement == null) {
			this.headElement = dn;
			this.tailElement = dn;
		}else {
			dn.nextNode=this.headElement;
			this.headElement.previousNode = dn;
			if(this.tailElement.previousNode == null )
				this.tailElement = this.headElement; 
			this.headElement = dn;			
		}
		size++;
	}
	
	
	public void removeFirst()
	{
		if(this.headElement == null) {
			return;
		}else if(this.headElement.nextNode == null){
			this.headElement = null;
			this.tailElement = null;
		}else {
			this.headElement = this.headElement.nextNode;
			this.headElement.previousNode = null;
		}
		size--;
	}
	
	public void addLast(int data)
	{
		DNode dn = new DNode(data);
		if(this.headElement == null) {
			this.headElement = dn;
			this.tailElement = dn;
		}else {
			dn.nextNode=null;
			dn.previousNode=this.tailElement;
			this.tailElement.nextNode = dn;
			this.tailElement = dn;
		}
		size++;
	}
	
	public void removeLast()
	{
		if(this.headElement == null) {
			return;
		}else if(this.headElement.nextNode == null){
			this.headElement = null;
			this.tailElement = null;
		}else {
			this.tailElement = this.tailElement.previousNode;
			this.tailElement.nextNode = null;
		}
		size--;
	}
	
	public void addAt(int index, int data)
	{
		if(index>size)
			return;
		
		
		if(index==0)
			this.addFirst(data);
		if(index==size)
			this.addLast(data);
		DNode nodeAtIndex=headElement; 
		for(int i=1;i<index-1;i++)
		{
			nodeAtIndex =  nodeAtIndex.nextNode;
		}
		DNode dn = new DNode(data);
		dn.previousNode = nodeAtIndex;
		dn.nextNode = nodeAtIndex.nextNode;
		nodeAtIndex.nextNode = dn;
		size++;
	}
	
	public int size()
	{
		return size;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		if(this.headElement == null)
			return "";
		DNode currentReference=this.headElement;
		while(currentReference.nextNode != null)
		{
			sb.append(currentReference.data +", ");
			currentReference = currentReference.nextNode;
		}
		if(currentReference.nextNode == null)
			sb.append(currentReference.data);
		return sb.toString();
	}
}
