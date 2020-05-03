package QueueClass;



public class QueueWithArrays {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueWithArrays obj = new QueueWithArrays();
		obj.push(4);
		obj.push(43);
		obj.push(44);
		obj.push(41);
		obj.push(45);
		
		System.out.println(obj.contains(45));
		
		System.out.println(obj);
		
		System.out.println(obj.pop());
		
		System.out.println(obj.peek());
		
		System.out.println(obj.contains(4));
		
		System.out.println(obj);
		
	}
	
	int[] queue;
	int first = 0;
	int last = 0;
	
	public QueueWithArrays()
	{
		queue = new int[10]; 
	}
	
	public QueueWithArrays(int capacity)
	{
		queue = new int[capacity]; 
	}
	
	
	public void push(int value)
	{
		if(last  == queue.length)
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


