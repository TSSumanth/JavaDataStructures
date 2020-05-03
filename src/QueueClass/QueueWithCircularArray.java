package QueueClass;

public class QueueWithCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	int[] queue;
	int first = 0;
	int last = 0;
	
	public QueueWithCircularArray()
	{
		queue = new int[10]; 
	}
	
	public QueueWithCircularArray(int capacity)
	{
		queue = new int[capacity]; 
	}
	
	
	public void push(int value)
	{
		if(size() == queue.length)
		{
			int[] tempQueue = new int[2 * queue.length];
			System.arraycopy(queue, 0, tempQueue, 0, last);
		}
		queue[last] = value;
		last ++ ;
	}

	public int pop() throws Exception
	{
		if(first - last == 0)
		{
			throw new Exception("No elements in Stack");
		}
		int value = queue[first];
		first ++;
		return value;
	}
	
	public int peek() throws Exception
	{
		if(first - last == 0)
		{
			throw new Exception("No elements in Stack");
		}
		return queue[first];
	}
	
	public int size()
	{
		return last - first;
	}
	
	public boolean contains(int value)
	{
		for(int i=first;i<=last;i++)
		{
			if(queue[i] == value)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String toString()
	{
		StringBuffer str = new StringBuffer();
		for(int i=first;i<last;i++)
		{
			str.append(queue[i] + ", ");
		}
		return str.toString();
	}
}
