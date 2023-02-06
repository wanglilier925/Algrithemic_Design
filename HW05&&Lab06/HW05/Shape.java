/*
 * Lili csce146
 * 2022.3
 * 
 */
public class Shape implements Comparable<Shape>
{
	public String shape;
	public double area;
	
	// constructor
	public Shape()
	{
		this.shape = " ";
		this.area = 0.0;
	}
	// parameter constructor
	public Shape(String aS, double aA)
	{
		this.setShape(aS);
		this.setArea(aA);
	}
	
	// method
	// accessor
	
	public String getShape()
	{
		return this.shape;
	}
	
	public double getArea()
	{
		return this.area;
	}
	
	public void setShape(String aS)
	{
		if(aS != null && (aS.equalsIgnoreCase("Circle") || aS.equalsIgnoreCase("Rectangle") || aS.equalsIgnoreCase("Right Triangle")))
		this.shape = aS;
		
	}
	
	public void setArea(double aA)
	{
		if(aA!= 0)
			this.area = aA;
		else
			this.area = 0.0;
	}
	
	// to string
	public String toString()
	{
        return  "Shape: " + this.shape +" Area: " + this.area;
    }
	
	// compare
	
	public int compareTo(Shape aShape)
	{
		if(aShape == null)
			return -1;
		
		else if(aShape.getArea() < this.area)
			return 1;
		
		else if(aShape.getArea() > this.area)
			return -1;
		
		else 
			return this.shape.compareTo(aShape.getShape());
		
	}
	
	
}
