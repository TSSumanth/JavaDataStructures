package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray =  {10,29,-20,1,1,1234,787,324,1,35 };
		InsertionSortSortedArrayToRight(unsortedArray);

	}

	
	public static void InsertionSortSortedArrayToLeft(int[] givenArray)
	{
		int unsortedArrayIndex = 1;
		for(int i=unsortedArrayIndex ;i<givenArray.length;i++)
		{
			int currentElement = givenArray[i];
			int sortingArrayIndex = i;
			for(int j=unsortedArrayIndex-1;j>=0;j--) {
				if(currentElement < givenArray[j]) {
					givenArray[sortingArrayIndex] = givenArray[j];
					if(j == 0)
					{
						givenArray[0] = currentElement;
						break;
					}
					sortingArrayIndex --;
				}
				else {
					givenArray[sortingArrayIndex] = currentElement;
					break;
				}
			}
			unsortedArrayIndex ++;
		}
		
		for(int i: givenArray)
			System.out.println(i);
	}
	
	
	public static void InsertionSortSortedArrayToRight(int[] givenArray)
	{
		// 9 8 1 2 5
		int sortedArrayIndex = givenArray.length -1;
		
		for(int i=sortedArrayIndex-1; i>=0 ; i-- ) {
			
			int currentelement = givenArray[i];
			int newSortedIndex = i;
			
			for(int j = sortedArrayIndex; j<givenArray.length;j++)
			{
				if(currentelement > givenArray[j])
				{
					givenArray[newSortedIndex] = givenArray[j];
					if(j == givenArray.length -1 )
					{
						givenArray[newSortedIndex+1] = currentelement;
						break;
					}
					newSortedIndex ++;
				}
				else {
					givenArray[newSortedIndex] = currentelement;
					break;
				}
			}
			sortedArrayIndex --;
			
		}
	
		
		for(int i: givenArray)
			System.out.println(i);
	}
}
