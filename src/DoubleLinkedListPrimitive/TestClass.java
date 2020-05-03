package DoubleLinkedListPrimitive;

public class TestClass {

	public static void main(String[] args) {

		IntDoubleLinkedListClass idll = new IntDoubleLinkedListClass();
	
		idll.addfirst(4);
		idll.addlast(16);
		idll.addlast(17);
		idll.addlast(18);
		idll.addlast(19);
		
		System.out.println(idll.size());
		System.out.println(idll);
		
		idll.addfirst(4);
		idll.addfirst(2);
		idll.addfirst(3);
		idll.addfirst(46);
		
		System.out.println(idll.size());
		System.out.println(idll);
	}

}
