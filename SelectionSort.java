package Programs;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {3,7,8,2,5,4,1,6};
		for(int i=0; i<arr.length ; i++)
		{
			int min = i;
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
					
				}	
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
