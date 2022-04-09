package BitMagic;

public class Check_Kth_Bit_Set {

	public static void main(String[] args)
	{
	
		System.out.println(using_LeftShift(8,4));
	}
	
	static boolean using_LeftShift(int n,int k)
	{
		
		if((n & (1 << (k-1)))!=0 )
			return true;
		else
			return false;
	}
	
	static boolean using_RightShift(int n,int k)
	{
		
		if((1 & (n >> (k-1)))==1 )
			return true;
		else
			return false;
	}
	
	

}
