package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]  elemets = {3,5,1,4,0,7,6};
		understandingRecurssion(elemets);
	}

	// 2 4 1  5 2 7 4 2
	public static void understandingRecurssion(int[] givenArray) {
		
		if(givenArray.length > 1)
		{
			System.out.println("size:" + givenArray.length);
			int midindex = (givenArray.length -1)/2; 
			int[] leftArray = new int[midindex];
			for(int i = 0;i< midindex ;i++)
			{
				leftArray[i] = givenArray[i];
			}
		//	understandingRecurssion(leftArray);
			int[] rightArray = new int[givenArray.length - midindex];
			for(int i = 0;i< givenArray.length - midindex ;i++)
			{
				rightArray[i] = givenArray[midindex + i];
			}
			understandingRecurssion(rightArray);
			for(int i: leftArray)
					System.out.println(i);
			for(int i: rightArray)
				System.out.println(i);
		}
		
	}
}
