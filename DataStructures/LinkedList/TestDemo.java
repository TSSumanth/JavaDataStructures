package LinkedList;

public class TestDemo {

	public static void main(String[] args) 
	{
		ReverseSingleList rsv = new ReverseSingleList();
		for(int i=10;i<100;i=i*2)
			rsv.addElement(i);
		System.out.println(rsv.size());
		System.out.println(rsv);
		rsv.remove();
		System.out.println(rsv.size());
		System.out.println(rsv);
		rsv.remove();
		System.out.println(rsv.size());
		System.out.println(rsv);
		rsv.remove();
		System.out.println(rsv.size());
		System.out.println(rsv);
		rsv.remove();
		System.out.println(rsv.size());
		System.out.println(rsv);
	}

}
