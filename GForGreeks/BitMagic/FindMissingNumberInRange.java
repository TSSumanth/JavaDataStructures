package BitMagic;

public class FindMissingNumberInRange {

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,2,6};
		System.out.println(func(arr));
	}
	
	static int func(int[] array)
	{
		int missing = 0;
		for(int i=0;i<array.length;i++)
		{
			missing = missing ^ array[i] ^ i+1;
		}
		missing = missing ^ array.length + 1;
		return missing;
	}

	/*
	 *  x^0 = x
	 *  x^x = 0
	 *  x^x^x = x
	 */
}
