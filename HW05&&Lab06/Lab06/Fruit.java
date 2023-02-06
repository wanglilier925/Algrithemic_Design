/*
 * Lili wang
 * 2022.3.28
 */
public class Fruit implements Comparable<Fruit>
{
	String type;
	double weight;
	
	// default constructor
	
	public Fruit()
	{
		this.type = "apple";
		this.weight = 1.0;
	}
	
	// parameter constructor
	
	public Fruit(String aT, double aW)
	
	{
		this.setType(aT);
		this.setWeight(aW);
	}
	
	// methods
	
	// accessors
	
	public String getType()
	{
		return this.type;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	// mutators
	
	public void setType(String aT)
	{
		if(aT!=null && aT.equalsIgnoreCase("apple")||aT.equalsIgnoreCase("orange")|| aT.equalsIgnoreCase("banana")||aT.equalsIgnoreCase("kiwi") || aT.equalsIgnoreCase("tomato"))
			this.type=aT;
		else this.type="apple";
	}
	public void setWeight(double aW)
	{
		if(aW>0)
			this.weight=aW;
		else this.weight=1.0;
	}
	
	// to string
	
	public String toString()
	{
		return "Type: "+ this.type+ " Weight: "+this.weight;
	}
	
	// to compareTo
	
	public int compareTo(Fruit aF)
	{
		if(aF == null)
			return -1;
	    else if(this.weight > aF.weight)
			return 1;
		
		else if(this.weight < aF.weight)
			return -1;
		else 
			return this.type.compareTo(aF.getType());
				
		
	}	
	
}
