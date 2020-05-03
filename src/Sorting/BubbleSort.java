package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray = {10,29,-20,1,1,1234,787,324,1,35 };
		BubbleSortDescSmallestToRight(unsortedArray);
	}
	
	//Bubble sort with larget elements to right
	public static void BubbleSortLargestToRight(int[] givenArray)
	{
	
		int unsortedArrayLength = givenArray.length;
		while(unsortedArrayLength > 0) {
			
			for(int i=0;i<unsortedArrayLength-1;i++)
			{
				if(givenArray[i] > givenArray[i+1])
				{
					int temp = givenArray[i];
					givenArray[i] = givenArray[i+1];
					givenArray[i+1] = temp;
				}
			}
			unsortedArrayLength = unsortedArrayLength -1;
			
		}
		for(int i: givenArray)
			System.out.println(i);
	}

	//Bubble sort with smallest elements to left
	public static void BubbleSortSmallestToLeft(int[] givenArray)
	{
		int unsortedArrayLength = givenArray.length-1;
		int sortedArrayLength = 0;
		while(sortedArrayLength <= unsortedArrayLength) {
			for(int i=unsortedArrayLength;i>0;i--)
			{
				if(givenArray[i] < givenArray[i-1])
				{
					int temp = givenArray[i];
					givenArray[i] = givenArray[i-1];
					givenArray[i-1] = temp;
				}
			}
			sortedArrayLength ++;
		}
		for(int i: givenArray)
			System.out.println(i);
	}
	
	//Bubble Sort in Descending Order largest to left
	public static void BubbleSortDescLargestToLeft(int[] givenArray)
	{
		int unsortedArrayLength = givenArray.length-1;
		int sortedArrayLength = 0;
		while(sortedArrayLength <= unsortedArrayLength) {
			for(int i=unsortedArrayLength;i>0;i--)
			{
				if(givenArray[i] > givenArray[i-1])
				{
					int temp = givenArray[i];
					givenArray[i] = givenArray[i-1];
					givenArray[i-1] = temp;
				}
			}
			sortedArrayLength ++;
		}
		for(int i: givenArray)
			System.out.println(i);
	}
	
	//Bubble sort decending order smallest to right
		public static void BubbleSortDescSmallestToRight(int[] givenArray)
		{
		
			int unsortedArrayLength = givenArray.length;
			while(unsortedArrayLength > 0) {
				
				for(int i=0;i<unsortedArrayLength-1;i++)
				{
					if(givenArray[i] < givenArray[i+1])
					{
						int temp = givenArray[i];
						givenArray[i] = givenArray[i+1];
						givenArray[i+1] = temp;
					}
				}
				unsortedArrayLength = unsortedArrayLength -1;
				
			}
			for(int i: givenArray)
				System.out.println(i);
		}
}
