
public class CounterSort {
	
	private String st;
	private int num;
	
	// constructor
	public CounterSort(String aS)

	{
		this.st=aS;
		this.counter(aS);
	}	
	public int getNum()
	{
		return this.num;
	}
		
	public String getSt()
	{
		return this.st;
	}
	
	// count how many sort in each string

	public void counter(String aS)
	{
		 this.num=0;
		 aS = aS.toUpperCase();
		 
		 if(aS.length()>=4)
		 {
		 
		 for( int i =0; i < aS.length()-3; i++)
			 
			{					
			 if(aS.charAt(i) =='S' && aS.charAt(i+1) =='O'&& aS.charAt(i+2)=='R'&& aS.charAt(i+3)=='T')
					
				this.num ++;
			 
			}
		 }
		// else
		//	 System.out.println("Please input string length more than 3!");
				
	}	
}
