/*
 * Lili wang
 * 2022.3
 * csce146
 * hw5
 */

import java.util.Scanner;
// Import the FileWriter class
// Import the IOException class to handle errors
import java.io.*;
import java.math.RoundingMode;

public class ShapeTreeTest {
	public static final String T = "\t";

	public static void main(String[] args) 
	{
		
		// create a shape binary tree link
		LinkedBST<Shape> shape = new LinkedBST<Shape>();
			
		Scanner keyboard = new Scanner(System.in);
		
		do {
		System.out.println("Please enter the name of your txt file you want to print and delete:");
		
		String filename = keyboard.nextLine();
				
		
		// read file
		try
		{
			Scanner fileScanner = new Scanner(new File(filename));
			while(fileScanner.hasNextLine())
			{
				String f = fileScanner.nextLine();
				System.out.println(f);
				
				String[] split = f.split(T);
				// case circle
				if(split[0].equalsIgnoreCase("circle"))
				{					
					Circle c = new Circle(Double.parseDouble(split[1]));
					shape.add(c);					
				}
				
				// case rectangle
				
				if(split[0].equalsIgnoreCase("Rectangle"))
				{					
					Rectangle r = new Rectangle(Double.parseDouble(split[1]),Double.parseDouble(split[2]));
					shape.add(r);
					
				}
				
				// case right triangle
				
				if(split[0].equalsIgnoreCase("right triangle"))
				{					
					RightTriangle t = new RightTriangle(Double.parseDouble(split[1]),Double.parseDouble(split[2]));
					shape.add(t);					
				}
				
											
			}fileScanner.close();
		}
		catch (Exception e) 
		{
            e.printStackTrace();
        }
				
		// print results
		System.out.println("\n---Print the in-order result---");
        shape.printInorder();
        System.out.println("\n---Print the pre-order result---");
        shape.printPreorder();
        System.out.println("\n---Print the post-order result---");
        shape.printPostorder();
        
        // search 
        
        System.out.println("\n---Search \'Circle, area: 153.93804002589985\'---");
        System.out.println(shape.search(new Shape("Circle",153.93804002589985)));
        
        System.out.println("\n---Search \'Rectangle, area: 20\'---");
        System.out.println(shape.search(new Shape("Rectangle",20)));
        
        System.out.println("\n---Search \'right-triangle, area: 20\'---");
        System.out.println(shape.search(new Shape("Right Triangle",20)));
      
        
        // delete
        System.out.println("\nDelete \'Rectangle 20\'");
        shape.remove(new Shape("Rectangle",20));
        
        System.out.println("\n---Print pre-order---");
        shape.printInorder();
        
        
        // findMax area
        System.out.println("\n---Max Area---");
        System.out.println(shape.findMaxInTree());
		
        // Remove greater than
        System.out.println("\n---Remove area greater than 200 ---");
        shape.deleteAreaGreaterThan(200.0);
        System.out.println("\n---Print pre-order---");
        shape.printInorder();
        
        // write a file
        
        System.out.println("\n---Please create a txt file name---:");
        String filename1 = keyboard.nextLine();
        
        System.out.println("\n---How many shapes do you want to create?---");
		int num = keyboard.nextInt();
		boolean append = true;						       
        try
        {
        	BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename1, append));
        	
        	
        	System.out.println("\n---Please input data into your new file---");
  
        	System.out.println("\nThe format should be <Circle \'\t\'radius> or <rectangle\'\t\'length\'\t\'width> or <righttriangle\'\t\'base\'\t\'height>");
        	for(int i = 0; i < num+1 ; i++) {
        		String s = keyboard.nextLine();
        		 myWriter.write(s);
        		 myWriter.newLine(); // help write line by line shape
         	
        	String[] split = s.split(T);
			// case circle
			if(split[0].equalsIgnoreCase("circle"))
			{					
				Circle c = new Circle(Double.parseDouble(split[1]));
				shape.add(c);	
				
			}
			
			// case rectangle
			
			if(split[0].equalsIgnoreCase("Rectangle"))
			{					
				Rectangle r = new Rectangle(Double.parseDouble(split[1]),Double.parseDouble(split[2]));
				shape.add(r);						
			}			
			// case right triangle
			
			if(split[0].equalsIgnoreCase("right triangle"))
			{					
				RightTriangle t = new RightTriangle(Double.parseDouble(split[1]),Double.parseDouble(split[2]));
				shape.add(t);					
			} 
        	} System.out.println("now, I finished my writting!, you can use this file later");
        	            
        	
        	myWriter.close();
        	
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          } 
        
        
        System.out.println("\n do you want to play again? input yes to play again");
		}while(keyboard.nextLine().equalsIgnoreCase("yes"));
		
		 System.out.println("BEYBEY");
	}
}
