package LinkedList;

public class TestDemo {

	public static void main(String[] args) 
	{
		SingleList sl = new SingleList();
		for(int i=10;i<100;i=i*2)
			sl.addElement(i);
		System.out.println(sl.size());
		System.out.println(sl);
		sl.addElement(0,10);
		System.out.println(sl.size());
		System.out.println(sl);
		sl.addElement(1,100);
		System.out.println(sl.size());
		System.out.println(sl);
		sl.addElement(sl.size() - 1,100);
		System.out.println(sl.size());
		System.out.println(sl);
		sl.addElement(sl.size(),8);
		System.out.println(sl.size());
		System.out.println(sl+"--last");
	}

}
