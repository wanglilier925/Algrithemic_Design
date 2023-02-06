/*
 * Lili Wang 2022.3.15 csce146
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class TrianglesOhFractals extends Canvas {
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Triangles_Oh_Fractals");
		// define canvas size;
		frame.setSize(900,900);
		TrianglesOhFractals sp = new TrianglesOhFractals();
		frame.add(sp);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	
	// paint tri
	public void paint(Graphics g)
	{
		// define the three points of the biggest triangle
		Point top = new Point(400, 0);
		Point left = new Point(0, 800);
		Point right = new Point(800, 800);
		
		// design tri, we need to get the middle point of the upper length
		// inside tri
		//set the biggest triangle
		Polygon t = new Polygon();
		t.addPoint(top.x, top.y);
		t.addPoint(left.x, left.y);
		t.addPoint(right.x, right.y);				
		g.fillPolygon(t);
		g.setColor(Color.white);
		drawCarpet(top, left, right, 425, g);		
	}
	
	public void drawCarpet(Point top, Point left, Point right, int side, Graphics g)
	{
		int sub = side / 2;
		
		if(sub > 100) 
		{
            // decond large tri 
			Point p1 = middlepoint(top, left);
			Point p2 = middlepoint(left, right);
			Point p3 = middlepoint(right, top);
						
			// desing  the second and more tri
			Polygon T = new Polygon();
			T.addPoint(p1.x, p1.y);
			T.addPoint(p2.x, p2.y);
			T.addPoint(p3.x, p3.y);
			
			g.fillPolygon(T);
			g.setColor(Color.orange);
			drawCarpet(top, p1, p3, sub, g);
			g.setColor(Color.orange);
			drawCarpet(p1, left, p2, sub, g);
			g.setColor(Color.orange);
			drawCarpet(p3, p2, right, sub, g);
					
		}
		
		if(sub > 50 && sub < 100) 
		{
			// third large tri 
			
			Point p1 = middlepoint(top, left);
			Point p2 = middlepoint(left, right);
			Point p3 = middlepoint(right, top);
						
			// desing  the second and more tri
			Polygon T = new Polygon();
			T.addPoint(p1.x, p1.y);
			T.addPoint(p2.x, p2.y);
			T.addPoint(p3.x, p3.y);
			g.setColor(Color.green);
			g.fillPolygon(T);
			
			drawCarpet(top, p1, p3, sub, g);	
			drawCarpet(p1, left, p2, sub, g);			
			drawCarpet(p3, p2, right, sub, g);
		}
		if(sub > 20 && sub < 40) 
		{
           // smallest tri 
			Point p1 = middlepoint(top, left);
			Point p2 = middlepoint(left, right);
			Point p3 = middlepoint(right, top);
						
			// desing  the second and more tri
			Polygon T = new Polygon();
			T.addPoint(p1.x, p1.y);
			T.addPoint(p2.x, p2.y);
			T.addPoint(p3.x, p3.y);
			g.setColor(Color.red);
			g.fillPolygon(T);			
			drawCarpet(top, p1, p3, sub, g);			
			drawCarpet(p1, left, p2, sub, g);
			drawCarpet(p3, p2, right, sub, g);
		}
				
	}
	//midpoint
	public static Point middlepoint(Point p1, Point p2)
	{
		
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2); // midpoint
	}

}
