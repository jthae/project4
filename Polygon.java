import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Class to draw polygon from given points. Extends Shape,
 * extended by Triangle, Rectangle, Diamond, and PolyLine.
 * 
 * @author jayciethaemert
 *
 */
public class Polygon extends Shape {
	
	public Polygon(Color color, boolean filled)
	{
		super(color, filled);
	}
	
	public void draw(Graphics graphics)
	{
		Graphics2D g2d = (Graphics2D) graphics;
		g2d.setColor(this.getColor());
		int[] xCoords = new int[location.length];
		for(int i = 0; i < location.length; ++i)
		{
			xCoords[i] = (int) location[i].getX();
		}
		int[] yCoords = new int[location.length];
		for(int j = 0; j < location.length; ++j)
		{
			yCoords[j] = (int) location[j].getY();
		}
		g2d.drawPolygon(xCoords, yCoords, location.length);
		if(isFilled())
		{
			g2d.fillPolygon(xCoords, yCoords, location.length);
		}

	}

}
