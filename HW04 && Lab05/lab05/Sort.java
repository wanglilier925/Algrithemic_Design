/*
 * Lili Wang
 * lab05
 * 2022.3.24
 */

import java.util.Scanner;
public class Sort {
	
	public static final int SIZE= 20;

	public static void main(String[] args) 
 {
		
	Scanner keyboard = new Scanner(System.in);	
	do
	{
	System.out.println("Enter any number of strings and I will sort by SORT’s.\nOnce you’re done entering sentences enter “quit”.");
    

    // input lots of string in a countersort array
       
	 CounterSort[] array = new CounterSort[SIZE];
	
	// input string array to CounterSort
	 	
	for( int i =0; i < SIZE; i++)
	{
		 String a = keyboard.nextLine();
		 
		 
		 if (a.equalsIgnoreCase("quit"))
		{
		 
			break;
		}
		 
		 array[i] = new CounterSort(a);
		 				
	}	
		
	System.out.println("sort SORTED!");	
	
	
	// begin sort
	mergeSort(array);
	
	for(CounterSort st : array)
	{		
	   
		 
		if(st != null)            
		  System.out.println(st.getSt());	  		  
	}
	
	System.out.println("Would you like to sort more Strings? \n---y or n---");
	
	}while(keyboard.nextLine().equalsIgnoreCase("y"));
	
	System.out.println("Goodbye");		
}
	
	public static void mergeSort(CounterSort[] a)
	{
		int size = a.length;
		if(size < 2)
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		CounterSort[] left = new CounterSort[leftSize];
		CounterSort[] right = new CounterSort[rightSize];
		for(int i=0; i<mid; i++)
			left[i]=a[i];
		for(int i=mid; i<size;i++)
			right[i-mid]=a[i];
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
	}
	
	public static void merge(CounterSort[] left, CounterSort[] right, CounterSort[] a)
	{
		int leftSize=left.length;
		int rightSize = right.length;
		int i =0;// left array's index
		int j =0 ; //right arrau's index
		int k= 0;// metged array's (a) index
		while(i<leftSize && j< rightSize)
			
		{
			// if null, break
			if(left[i] == null || right[j] == null)
               break;
			
			
			if(left[i].getNum() <= right[j].getNum())
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i<leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		
		while(j<rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
}
