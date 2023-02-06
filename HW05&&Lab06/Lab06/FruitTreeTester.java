/*
 * Lili wang
 * 2022.3.28
 */

import java.util.Scanner;
import java.util.*;
import java.io.*;
public class FruitTreeTester {

	public static void main(String[] args) {
		
		// linked list of fruit
		
		LinkedBST<Fruit> fruitTree = new LinkedBST<Fruit>();
		
		System.out.println("Welcome to the fruit tree!");
		System.out.println("Please enter a Fruit File Name");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.nextLine();
				
			try 
			{
				Scanner fileScanner = new Scanner(new File(fileName));
				while(fileScanner.hasNextLine()) 
				{
					String currentLine = fileScanner.nextLine();
	                String[] splitLine = currentLine.split("\t");
	                if(splitLine.length == 2)
	                {
	                	Fruit fruit = new Fruit(splitLine[0], Double.parseDouble(splitLine[1]));
	                    fruitTree.add(fruit);					 
				    }
				}
				fileScanner.close();
			
			}
            catch(Exception e) 
			{
				e.printStackTrace();
			}
			
			 System.out.println("Printing the in-order traversal");
		        fruitTree.printInorder();
		        System.out.println("\n---Printing the pre-order traversal---");
		        fruitTree.printPreorder();
		        System.out.println("\n---Printing the post-order traversal---");
		        fruitTree.printPostorder();
		        System.out.println(fruitTree.search(new Fruit("Apple",0.4859853412170728)));
		        System.out.println("\nDeleting Apple 0.4859853412170728");
		        fruitTree.remove(new Fruit("Apple",0.4859853412170728));
		        System.out.println("Printing in-order traversal");
		        fruitTree.printInorder();
	

}
}
