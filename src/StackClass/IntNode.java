package StackClass;

public class IntNode 
{
	int data;
	IntNode node;
	
	public IntNode(int data, IntNode node)
	{
		this.data = data;
		this.node = node;
	}
	
	public String toString()
	{
		return data+"";
	}
}
