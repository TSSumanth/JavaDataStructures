package SingleLinkedListPrimitives;

public class IntegerSingleLinkedList 
{
	
	//int data;
	private int size=0;
	private IntNode headElement;
	
//	public IntegerSingleLinkedList() {
//		this.headElement =  new IntNode(,headElement);;
//	}
//	
	public void addElement(int data)
	{
		IntNode newElement = new IntNode(data);
		newElement.nextReference = headElement;
		headElement = newElement;
		System.out.println("Head Elemnet : "+ headElement);
		size ++ ;
	}
	
	public final int size() {
		return size;
	}
	
	public void remove()
	{
		IntNode nextreference = this.headElement.nextReference;
		headElement = nextreference;
		size --;
	}
	
	public String toString() {
		StringBuffer elements = new StringBuffer();
		IntNode currentElement = this.headElement;
		while(currentElement.nextReference != null)
		{
			elements.append( currentElement+ ", ") ;
			currentElement = currentElement.nextReference;
		}
		
		elements.append( currentElement) ;
		return elements.toString();
	}
}
