
public class RightTriangle extends Shape{
	
	public double base;
	public double height;
		
		// constructor
		
		public RightTriangle()
		{
			super();
			this.base = 0.0;
			this.height = 0.0;
		}
		
		//
		public RightTriangle(double aB, double aH)
		{
			super();
			
			this.setBase(aB);
			this.setHeight(aH);
			super.shape = "Right Triangle";
			super.area = 1.0 / 2.0 *this.base * this.height;
									
		}
		//  accessors
		
		public double getBase()
		{
			return this.base;
		}
		
		public double getHeight()
		{
			return this.height;
		}
				
				
		public void setBase(double aB) 
		{
			if(aB != 0)
				this.base = aB;
			else
				this.base = 0.0;
			
		}
		
		public void setHeight(double aH) 
		{
			if(aH != 0)
				this.height = aH;
			else
				this.height = 0.0;
			
		}
		// to string
		public String toString()
		{
	        return super.toString()+" Base: "+this.base +" Height: "+ this.height ;
	    }

}
