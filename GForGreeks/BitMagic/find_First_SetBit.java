package BitMagic;

public class find_First_SetBit {

	public static void main(String[] args) {
		System.out.println(findFirstSetBit(32));

	}
	
	static int findFirstSetBit(int number)
	{
		for(int i=0;;i++)
		{
			if((number & (1 << i)) !=0)
				return i+1;
		}
	}

}
