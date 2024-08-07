package numbers;

public class countalldigits {

	public static void main(String[] args) {
		
		System.out.println(count(-23));

	}
	
	public static int count(int n)
	{
		// Will convert -ve value to +ve, if +ve returns the same
		n=Math.abs(n);
		
		int currentcount = 0;
		
		while(n>0)
		{
			// n%10 will get the remainder which is last number
			currentcount = currentcount + (n%10);
			
			// n/10  will remove last digit from the number 
			n=n/10;
			
		}
		return currentcount;
	}
	

}
