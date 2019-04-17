import java.awt.Point;
import java.awt.Color;

/**
 * Class to create an isosceles triangle, using given lower bound point, base, and height.
 * @author jayciethaemert
 *
 */
public class IsoscelesTriangle extends Triangle {
	
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled)
	{
		super(pointLB, color, filled);
		Point pointLL = new Point((int) (pointLB.getX() + base), (int) pointLB.getY());
		Point top = new Point((int) (pointLB.getX() + base/2), (int) (pointLB.getY() + height));
		
		location[1] = pointLL;
		location[2] = top;
	}

}
