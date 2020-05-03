package StackClass;

public class StackUsingLinkedList {

	public static void main(String[] args) throws Exception {
		StackUsingLinkedList obj = new StackUsingLinkedList();
		obj.push(4);
		obj.push(43);
		obj.push(44);
		obj.push(41);
		obj.push(45);
		
		System.out.println(obj.contains(43));
		System.out.println(obj);
		
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		
		
		System.out.println(obj);
		
		System.out.println(obj.peek());
		System.out.println(obj.peek());
		
		System.out.println(obj);
		
		System.out.println(obj.pop());
		System.out.println("sfsd");
		System.out.println(obj.pop());
		obj.push(45);
		obj.push(45);
		System.out.println(obj.peek());
		System.out.println(obj.peek());
		System.out.println(obj.contains(43));
		System.out.println(obj.pop());
		
		

	}

	IntNode headNode;
	int size=0;
	
	
	
	public void push(int value)
	{
		IntNode node = new IntNode(value,headNode);
		headNode = node;
		size ++;		
	}
	
	
	public int pop() throws Exception
	{
		if(size == 0)
		{
			throw new Exception("No elements in Stack");
		}
		IntNode currentNode = headNode;
		headNode = headNode.node;
		size --;
		return currentNode.data;
	}
	
	
	public int peek() throws Exception
	{
		if(size == 0)
		{
			throw new Exception("No elements in Stack");
		}
		return headNode.data;
	}
	
	public boolean contains(int value) 
	{
		IntNode currentNode = headNode;
		while(currentNode != null)		
		{
			if(currentNode.data == value)
			{
				return true;
			}
			currentNode = currentNode.node;
		}
		return false;
	}
	
	
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		IntNode currentNode = headNode;
		while(currentNode != null)		
		{
			str.append(currentNode + ", ");
			currentNode = currentNode.node;
		}
		return str.toString();
	}
}
