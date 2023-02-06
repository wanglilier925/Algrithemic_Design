 /* 
 * 2022 spring 
 * lab04
 * Lili Wang
 */

import java.util.Scanner;
public class ReversePolishCalculator {
	
	// Value Stack: A instance variable stack of integers that stores the operands and current total.
	private StackI<Integer> ValueStack;
	
	// default constructor
	public ReversePolishCalculator()
	{
		ValueStack = new LLStack<Integer>();
	}	
	public int calculate(String input) {
		
		Scanner express = new Scanner(input);
		while(express.hasNext())
		{
			// get current line operator
			String operator = express.next();			
			// use switch to acquire current operation
			switch(operator) 
			{
			// 3,2,+
			case "+":
				if(ValueStack.size() < 2 )
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers");
					return 0;
				}
				int a = ValueStack.pop();  // a=2
				int b = ValueStack.pop(); // b=3
				// return the add result to the stack
				ValueStack.push(b+a);
				break;
			// 3,2,-
			case "-":
				if(ValueStack.size() < 2 )
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers");
					return 0;
				}
				int c = ValueStack.pop();  // c = 2
				int d = ValueStack.pop(); // d = 3
				// return the "-" result to the stack
				ValueStack.push(d-c);
				break;	
			// 3,2,*	
			case "*":
				if(ValueStack.size() < 2 )
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers");
					return 0;
				}
				int e = ValueStack.pop();  // e = 2
				int f = ValueStack.pop(); //  f = 3
				// return the * result to the stack
				ValueStack.push(f*e);
				break;
			// 3,2,/	
			case "/":
				if(ValueStack.size() < 2 )
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers");
					return 0;
				}
				
				int g = ValueStack.pop();  // g = 2
				int h = ValueStack.pop(); // h = 3 
				
				if(g==0)
				{
					System.out.println("Cannot devid by 0");
					return 0;
				}
				// return the divid result to the stack
				else
				{
				ValueStack.push(h/g);
				}
				break;
				
			default:
				// check whether a integer
				if(isInteger(operator) == true)
				{
					ValueStack.push(Integer.parseInt(operator));
				}
				// 
				if(isInteger(operator) == false)
				{
					System.out.println("Not a valid operator");
				}			
			}
		}
		// checks size (whether only one size)
				if (ValueStack.size() == 1)
				{
					return ValueStack.pop(); 	
				}
				
				if(ValueStack.size() > 1)
				{
					System.out.println("This was not properly formatted. There were too many numbers and not enough operators.");
					
				}
				return 0;
				
								
	}
// if a value is or is not a number
	public boolean isInteger(String operator) {
		try
		{
			Integer.parseInt(operator);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
		
	}

}
