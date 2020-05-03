package SingleLinkedListPrimitives;

public class TestClass {

	public static void main(String[] args) {
		
		IntegerSingleLinkedList ill = new IntegerSingleLinkedList();
		ill.addElement(4);
		ill.addElement(5);
		ill.addElement(42);
		ill.addElement(53);
		ill.addElement(41);
		ill.addElement(55);
		ill.addElement(434);
		ill.addElement(545);
		ill.addElement(-1);
		System.out.println(ill.size());
		System.out.println(ill);
		
		ill.remove();
		ill.remove();
		ill.remove();
		System.out.println(ill.size());
		System.out.println(ill);
	}

}
