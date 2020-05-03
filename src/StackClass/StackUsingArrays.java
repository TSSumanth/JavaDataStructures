package StackClass;

public class StackUsingArrays {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays obj = new StackUsingArrays();
		obj.push(4);
		obj.push(43);
		obj.push(44);
		obj.push(41);
		obj.push(45);
		
		System.out.println(obj.search(45));
		
		System.out.println(obj);
		
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		
		System.out.println(obj.search(45));
		
		System.out.println(obj);
		
		System.out.println(obj.peek());
		System.out.println(obj.peek());
		
		System.out.println(obj);
		
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		
		System.out.println(obj.peek());
		System.out.println(obj.peek());
		
		System.out.println(obj.pop());
		
	}

	int [] stack;
	int nextIndex = 0;
	
	public StackUsingArrays()
	{
		stack = new int[20];
	}
	
	public StackUsingArrays(int capacity)
	{
		stack = new int[capacity];
	}
	
	public void push(int value)
	{
		if(nextIndex == stack.length)
		{
			int[] tempStack = stack; 
			stack = new int[stack.length * 2];
			for(int i:tempStack)
			{
				stack[i] = tempStack[i];
			}
		}
		
		stack[nextIndex] = value;
		nextIndex ++ ;
	}
	
	public int pop() throws Exception
	{	
		if(nextIndex == 0)
		{
			throw new Exception("No elements in Stack");
		}
		nextIndex -- ;
		return stack[nextIndex];
	}
	
	public int peek()
	{		
		if(nextIndex == 0)
		{
			return -1;
		}
		return stack[nextIndex-1];
	}
	
	public boolean search(int value)
	{
		for(int i=0;i<nextIndex; i++)
		{
			if(stack[i] == value)
				return true;
		}
		
		return false;
	}
	
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		for(int i=0;i<nextIndex;i++)
		{
			str.append(stack[i]+", ");
		}
		return str.toString();
	}
}
