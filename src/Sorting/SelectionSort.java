package Sorting;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int[] unsortedArray = {10,29,-20,1,1,1234,787,324,1,35 };
		SelectionSortSmallestToLeft(unsortedArray);
		
	}
	
	public static void SelectionSortLargestToRight(int[] givenArray)
	{
		int indexOfSortedArray = givenArray.length - 1;
		while(indexOfSortedArray > 0) {
			int largestElementIndex = 0;
			for(int i=1;i<=indexOfSortedArray;i++)
			{
				if(givenArray[i] > givenArray[largestElementIndex]) {
					largestElementIndex = i;
				}
			}
			int temp = givenArray[largestElementIndex];		
			givenArray[largestElementIndex] = givenArray[indexOfSortedArray];
			givenArray[indexOfSortedArray] = temp;
			indexOfSortedArray--; 
		}
		
		for(int i: givenArray)
			System.out.println(i);
	}

	
	public static void SelectionSortSmallestToLeft(int[] givenArray)
	{
		int indexOfSortedArray = 0;
		while(indexOfSortedArray < givenArray.length -1) {
			int smallestElementIndex = givenArray.length -1;
			for(int i=givenArray.length -1;i>=indexOfSortedArray;i--)
			{
				if(givenArray[i] < givenArray[smallestElementIndex]) {
					smallestElementIndex = i;
				}
			}
			int temp = givenArray[smallestElementIndex];		
			givenArray[smallestElementIndex] = givenArray[indexOfSortedArray];
			givenArray[indexOfSortedArray] = temp;
			indexOfSortedArray++; 
		}
		
		for(int i: givenArray)
			System.out.println(i);
	}
}
