import java.awt.Point;
import java.awt.Color;
/**
 * Class to create rectangle from upper left point, width, and height.
 * 
 * @author jayciethaemert
 *
 */
public class Rectangle extends Polygon {
	
	Rectangle(Point pointUL, int width, int height, Color color, boolean filled)
	{
		super(color, filled);
		Point upperLeft = new Point(pointUL);
		Point upperRight = new Point((int) (pointUL.getX() + width), (int) pointUL.getY());
		Point lowerLeft = new Point((int) pointUL.getX(), (int) (pointUL.getY() + height));
		Point lowerRight = new Point((int) (pointUL.getX() + width), (int) (pointUL.getY() + height));
		
		location = new Point[] {upperLeft, upperRight, lowerRight, lowerLeft};	
	}

}
