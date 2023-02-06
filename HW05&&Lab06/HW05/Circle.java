/*
 * Lili wang
 * 2022.3
 * csce146
 */

public class Circle extends Shape{
	
	public double radius;
	
	// constructor
	
	public Circle()
	{
		super();
		this.radius = 0.0;
	}
	
	//
	public Circle(double aC)
	{
		super();
		
		this.setRadius(aC);
		this.shape = "Circle";
		
		super.area = this.radius * this.radius * Math.PI;
		
		
		
	}
	//  accessors
	
	
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double aC) 
	{
		if(aC != 0)
			this.radius = aC;
		else
			this.radius = 0.0;
		
	}
	// to string
	public String toString()
	{
        return super.toString()+ " Circle radius: "+this.radius;
    }
	
	

}
