/**
 * 
 */
package BitMagic;

/**
 * @author saisumanthreddytalamanchi
 *
 */
public class PrintPowerSet {

	/**
	 * @param args
	 */
	public static void main(String args[]) 
    { 
        String s = "abcd";

        printPowerSet(s);  
    }
	
	static void printPowerSet(String str)
    {
    	int n = str.length();

    	int totalsets = (int)Math.pow(2, n);

    	for(int counter = 0; counter < totalsets; counter++)
    	{
    		for(int j = 0; j < n; j++)
    		{
    			if(findSetKey(counter, j))
    				System.out.print(str.charAt(j));
    		}
    		
    		System.out.println();
    	}
    }
	
	static boolean findSetKey(int num, int key)
	{
		if((num & (1 << key)) != 0)
			return true;
		return false;
	}

    
   
     

}
