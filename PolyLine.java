import java.awt.Color;
import java.awt.Point;

/**
 * Class to construct parallelogram object using two points and a thickness.
 * 
 * @author jayciethaemert
 *
 */
public class PolyLine extends Polygon {
	
	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled)
	{
		super(color, filled);
		location = new Point[4];
		location[0] = pointUL;
		location[1] = pointUR;
		Point pointLL = new Point((int) pointUL.getX(), (int) (pointUL.getY() + thickness));
		Point pointLR = new Point((int) pointUR.getX(), (int) (pointUR.getY() + thickness));
		location[2] = pointLR;
		location[3] = pointLL;
	}

}
