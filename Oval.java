
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * Simple class to create oval shape, using upper left point and both diameters.
 * 
 * @author jayciethaemert
 *
 */
public class Oval extends Shape {
	
	private int diameter1;
	private int diameter2;
	
	public Oval(Point pointUL, int diameter1, int diameter2, Color color, boolean filled)
	{
		super(color, filled);
		location = new Point[] {pointUL};
		this.diameter1 = diameter1;
		this.diameter2 = diameter2;
	}
	
	public int getDiameter1()
	{
		return diameter1;
	}
	
	public int getDiameter2()
	{
		return diameter2;
	}

	public void draw(Graphics graphics)
	{
		Graphics2D g2d = (Graphics2D) graphics;
		g2d.setColor(this.getColor());
		g2d.drawOval((int) location[0].getX(), (int) location[0].getY(), getDiameter1(), getDiameter2());
		if(isFilled())
		{
			g2d.fillOval((int) location[0].getX(), (int) location[0].getY(), getDiameter1(), getDiameter2());
		}
	}
}
