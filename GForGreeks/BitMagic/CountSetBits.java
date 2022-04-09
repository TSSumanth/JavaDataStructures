/**
 * 
 */
package BitMagic;

/**
 * @author saisumanthreddytalamanchi
 *
 */
public class CountSetBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(func_usingBitWise(5));

	}
	
	static int func(int n)
	{
		int res =0;
		
		while(n>0)
		{
			if(n%2 !=0)
				res++;
			n=n/2;
		}
		
		return res;
	}
	
	static int func_usingBitWise(int n)
	{
		int res =0;
		
		while(n>0)
		{
			if((n&1) == 1)
				res++;
			n=n >> 1;
		}
		
		return res;
	}
	

}
