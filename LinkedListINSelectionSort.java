package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListINSelectionSort {
	public static void main(String[] args) 
	{
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,7,8,2,5,4,1,6));
		for(int i=0 ; i<arr.size(); i++)
		{
		  int min = i;
		  for(int j = i+1 ; j<arr.size(); j++)
		  {
			  if(arr.get(j)<arr.get(min))
			  {
				  min = j;
			  }
		  }
		  int temp = arr.get(i);
		  arr.set(i,arr.get(min))  ;
		  arr.set(min,temp);
		}
		System.out.println(arr);
	}

}
