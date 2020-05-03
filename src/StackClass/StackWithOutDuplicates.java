package StackClass;

public class StackWithOutDuplicates 
{
	public static void main(String[] args) throws Exception {
		StackWithOutDuplicates obj = new StackWithOutDuplicates();
		System.out.println(obj.push(4));
		System.out.println(obj.push(43));
		System.out.println(obj.push(44));
		System.out.println(obj.push(41));
		System.out.println(obj.push(45));
		System.out.println(obj.push(45));
		System.out.println(obj.push(45));
		
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
		System.out.println(obj.push(45));
		System.out.println(obj.push(45));
		System.out.println(obj.peek());
		System.out.println(obj.peek());
		System.out.println(obj.contains(43));
		System.out.println(obj.pop());
		
		

	}

	IntNode headNode;
	int size=0;
	
	
	public boolean push(int value)
	{
		if(this.contains(value))
		{
			return false;
		}
		IntNode node = new IntNode(value,headNode);
		headNode = node;
		size ++;
		return true;
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
