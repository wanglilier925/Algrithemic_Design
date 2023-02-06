import java.util.Scanner;
import java.util.Random;
public class BubbleSorter {
	
	public static final int ARRAY_SIZE=10;

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter " +ARRAY_SIZE+ " numbers and I'll sort them");
		int[] array= new int[ARRAY_SIZE];
		
		//input arrays
		
		for(int i=0; i<array.length;i++) 
		{
			System.out.println("Enter value "+i);
			array[i]=keyboard.nextInt();
		}
		//bobble sort
		int temp = 0;
		boolean hasSwapped =true;
		while(hasSwapped)
		{
			hasSwapped=false;
		  
			for(int i=0; i<array.length-1;i++) 
				
				{
				if(array[i]>array[i+1])
				{
					//swap
			
			    temp = array[i]; 
				array[i] = array[i+1];
				array[i+1] =temp;
				hasSwapped = true;
			
				
				}
				}
		}
		
		//print the array
		
		for(int i=0; i<array.length; i++) 
		{
			System.out.println(array[i]);
		}
		

	}

}
