/*
 * Lili wang
 * csce146
 * 2022.3
 */
public class Rectangle extends Shape{
	
public double length;
public double width;
	
	// constructor
	
	public Rectangle()
	{
		super();
		this.length = 0.0;
		this.width = 0.0;
	}
	
	//
	public Rectangle(double aL, double aW)
	{
		super();
		
		this.setLength(aL);
		this.setWidth(aW);
		super.shape = "Rectangle";
		super.area = this.length * this.width;
		
		
	}
	//  accessors
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public void setLength(double aL) 
	{
		if(aL != 0)
			this.length = aL;
		else
			this.length = 0.0;
		
	}
	
	public void setWidth(double aW) 
	{
		if(aW != 0)
			this.width = aW;
		else
			this.width = 0.0;
		
	}
	// to string
	public String toString()
	{
        //return super.shape+ ": Area: "+super.area +" Rectangle-length: "+this.length +" Rectangle-width: "+ this.width ;
    
		return super.toString()+" Length: "+this.length +" Width: "+ this.width ;
	}
	
	

}
