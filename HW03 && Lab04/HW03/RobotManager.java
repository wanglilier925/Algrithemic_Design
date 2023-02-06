/*
 * Lili Wang
 * csce 146
 * hw 03
 * 2022.03
 */

import java.util.Scanner;
import java.io.*;
public class RobotManager {
	// define a maze_size
	public static final int MAZE_SIZE = 10;
	
	private char[][] maze;//index 0 = y, index 1 = x
	public static final char EMPTY = '_';
	public static final char OBST = 'X';
	public static final char PLAYER = 'O';
	
	public static final String R = "Move Right";
	public static final String D = "Move Down"; 
	public static final String L = "Move Left"; 
	public static final String U = "Move Up"; 
	public static final String N = "";
	public static final String c = "CRASH"; 
	
	private int[] currLoc;

	// create a LLQueue 
	public LLQueue<String> locations;
		
	// constructor
	public RobotManager() 
	{
		this.init();
	}
	// reset 
	public void reset() {
		this.init();		
	}
	// initial data 
	private void init()
	{
			maze = new char[MAZE_SIZE][MAZE_SIZE];			
			locations = new LLQueue<String>();
			//	LLQueue<String > move = new LLQueue<String>();
			maze[0][0] = PLAYER;
			currLoc = new int[] {0,0};
	}
	
	// read file
	public void readFile(String file1) {
		 try{
	            Scanner fileScanner = new Scanner(new FileInputStream(file1));
	            
	            int i =0;
	            while(fileScanner.hasNext())
	            {	
	            	// adds each element one character at a time
	            	maze[i] = fileScanner.nextLine().toCharArray();	            	
	            	 i++;
	            		            	
	            }
	            printFullMaze();
	            fileScanner.close();
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }		
	}
	
	// read commands
	public void readCommands(String file2) {
		
		 	int num = 1;
	        int currX = currLoc[0];
	        int currY = currLoc[1];
	        
	        try
	        {
	            Scanner fileScanner = new Scanner(new FileInputStream(file2));
	            while(fileScanner.hasNextLine())	            
	            {
	            	// add each command to locations
	            locations.enqueue(fileScanner.nextLine());
	            System.out.println("Command " + num );
	                
	               //check move status
	               // move right
	                if(locations.peek().equals(R))
	                {
	                	System.out.println(R);
	                	//  if Right has not x
	                    if(isValid(currX+1) && maze[currY][currX+1] != OBST)
	                    {
	                    	num++; 	
	                         maze[currY][currX+1] = PLAYER; // location move to right
	                         maze[currY][currX] = EMPTY;
	                         // current location to empety
	                         currX++;	                        
	                        printFullMaze();
	                     // move current location out
	                        locations.dequeue();
	                        continue;
	                    }
	                    else{
	                        System.out.println(c);
	                        break;
	                    }
	                }
	             // move left
	                if(locations.peek().equals(L))
	                {
	                	System.out.println(L);
	                	num++;
	                    if(isValid(currX-1) && maze[currY][currX-1] != OBST){
	                        
	                        maze[currY][currX-1] = PLAYER;
	                        maze[currY][currX] = EMPTY;
	                        currX--;  	                        
	                        printFullMaze();
	                        locations.dequeue();
	                        continue;
	                    }
	                    else{
	                        System.out.println(c);
	                        break;
	                    }
	                }
	                // move up  north
	                if(locations.peek().equals(U))
	                {
	                	System.out.println(U);
	                	num++;
	                    // check up position is empety or not
	                    if(isValid(currY-1) && maze[currY-1][currX] != OBST){
	   
	                            maze[currY-1][currX] = PLAYER;
	                            maze[currY][currX] = EMPTY;
	                            currY--;
	                            printFullMaze();
	                            locations.dequeue();
	                            continue;
	                    }
	                    else{
	                        System.out.println(c);
	                        break;
	                    }
	                }
	                // move down
	                if(locations.peek().equals(D))
	                {
	                	System.out.println(D);
	                	num++;
	                    if(isValid(currY+1) && maze[currY+1][currX] != OBST){
	                        
	                        maze[currY+1][currX] = PLAYER;
	                        maze[currY][currX] = EMPTY; 
	                        currY++;                                                
	                        printFullMaze();
	                        locations.dequeue();
	                        continue;
	                    }
	                    else{
	                        System.out.println(c);
	                        break;
	                    }
	                }
	                // if the command is empty 
	                if(locations.peek().equals(N))
	                {
	                	System.out.println("This is a empty command, game over!");
	                	
	                        break;
	                }                
	            }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }	
	}
	
	// print result
		public void printFullMaze() {
			for(int i=0;i<maze.length;i++)
			{	
				 System.out.println(maze[i]);			         			        			
			}
		}	
	// isValid
	private boolean isValid(int index) 
	{
	return index >= 0 && index < maze.length; 
	}

}
