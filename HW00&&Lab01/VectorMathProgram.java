/*
 * Lili
 * 2022.01.25
 */
import java.util.Scanner;

public class VectorMathProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to my Vector Math Program");
		Scanner input = new Scanner(System.in);
	
		do {
			System.out.println("--------------------------------\n which one do you want to play?\n--------------------------------\n 1. vector addition\n 2. vector Subtraction \n 3. vector magnitude\n--------------------------------");
		int number=input.nextInt();

		//do while recycle to determine the user whether want to play more time
		
		// judge the number correct or not and then define the size of each vector you want to manicule
		while(number<1 || number>3)
		{
			System.out.println("wpoos, the number you enter is not valid, please in put a number among 1-3");
			number=input.nextInt();
		} 
		
		
		if(number == 1)
		{
			boolean is_same=false;
			while(!is_same)
			{
			System.out.println("please enter the size of the first vector you want to add :");
			int size1= input.nextInt();
			input.nextLine();
			System.out.println("please enter the size of the second vector you want to add :");
			int size2= input.nextInt();
			input.nextLine();
			if(size1!=size2||size1<1||size2<1)
			{
				System.out.println("The sizes you enter should be same and positive, please enter again!!!\n-----");
				
			}is_same=false;
			
			
			
			
			if(size1==size2 && size1>0 && size2>0)
			{
				System.out.println("---Let's make the addition---");
				//define those array
				int[] array1=new int[size1];
				
				for(int i=0;i<size1;i++) {
					System.out.println("please enter the ["+i+"] number in ARRAY1 ");
					array1[i]=input.nextInt();
				}
				int[] array2=new int[size2];
				for(int i=0;i<size2;i++) {
					System.out.println("please enter the ["+i+"] number in ARRAY2");
					array2[i]=input.nextInt();
				}
				
				// add two array
				int[] arraySum= new int[size1];
				for(int i=0;i<size1;i++) {
					
				  arraySum[i]=array1[i]+array2[i];
				
				is_same=true;
				
			}
				// print the array
				System.out.println("(");
				for(int i=0;i<size1;i++) {
					System.out.println(array1[i]);
				}
				System.out.println(")");
				System.out.println("+");
				System.out.println("(");
				for(int i=0;i<size2;i++) {
					System.out.println(array2[i]);
				}
				System.out.println(")");
				System.out.println("=");
				System.out.println("(");
				for(int i=0;i<size1;i++) {
					System.out.println(arraySum[i]);
				}System.out.println(")");
				System.out.println("I am done");
				is_same=true;
			}
			
			}	
			
		}
		
		
		if(number == 2)
		{
			boolean is_same=false;
			while(!is_same)
			{
			System.out.println("please enter the size of the first vector you want to subtract:");
			int size3= input.nextInt();
			input.nextLine();
			System.out.println("please enter the size of the second vector you want to be subtract:");
			int size4= input.nextInt();
			input.nextLine();
			//judge the size is equal or not
			if(size3!=size4 ||size3<1||size4<1 ) {
				System.out.println("the sizes you enter should be same and positive, please enter again!!\n--------");
				
				is_same=false;
			}
			if(size3==size4 && size3>0 && size4>0)
			{
				System.out.println("---Let's make the subtraction---");
				//define those array
				int[] array3=new int[size3];
				
				for(int i=0;i<size3;i++) {
					System.out.println("please enter the ["+i+"] number in ARRAY3 ");
					array3[i]=input.nextInt();
				}
				int[] array4=new int[size4];
				for(int i=0;i<size4;i++) {
					System.out.println("please enter the ["+i+"] number in ARRAY4");
					array4[i]=input.nextInt();
				}
				// Subtract
				int[] arraySub= new int[size3];
				for(int i=0;i<size3;i++) {
					
				  arraySub[i]=array3[i]-array4[i];
				
				is_same=true;
				
			}
				// print the array
				System.out.println("(");
				for(int i=0;i<size3;i++) {
					System.out.println(array3[i]);
				}
				System.out.println(")");
				System.out.println("-");
				System.out.println("(");
				for(int i=0;i<size3;i++) {
					System.out.println(array4[i]);
				}
				System.out.println(")");
				System.out.println("=");
				System.out.println("(");
				for(int i=0;i<size3;i++) {
					System.out.println(arraySub[i]);
				}System.out.println(")");
				System.out.println("I am done");
				is_same=true;
			}
			}
			
			
		}
		if(number == 3)
		{
			boolean is_same=false;
			while(!is_same)
			{
			System.out.println("please enter the size of the vector that you want to magnitude  :");
			int size5= input.nextInt();
			input.nextLine();
			
			
			//judge the size is correct or not
			if(size5<1) {
				System.out.println("the sizes you enter should be positive, please enter again!!\n--------");
				
				is_same=false;
			}
			
			// assign the array
			if(size5>=1) {
				int[] array5= new int[size5];
			int sum=0;
			for(int i=0;i<size5;i++) {
				System.out.println("please enter the ["+i+"] number in ARRAY5 ");
				array5[i]=input.nextInt();
				sum+=(array5[i])*(array5[i]);
			}
			//calculate magnitude
			
			double magnitude =0;
			magnitude=(Math.sqrt(sum));
			
			//print the magnitude
			System.out.println("||");
			System.out.println("(");
			for(int i=0;i<size5;i++) {
				System.out.println(array5[i]);
			}
			System.out.println(")");
			System.out.println("||");
			
			System.out.println("=");
			System.out.println(magnitude);
			
			System.out.println("I am done");
			
			is_same=true;
			}
			
		}
		}
		System.out.println("Do you want to play again or quit?\n Y to continue \n N to quit?");
		input.nextLine();
		}while(input.nextLine().equalsIgnoreCase("Y"));
		
		System.out.println("BYE BYE");
		
			
		
		

}
}
