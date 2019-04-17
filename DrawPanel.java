import java.util.ArrayList;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
/**
 * Extends JPanel, holds and draws all drawable objects.
 * 
 * @author jayciethaemert
 *
 */
public class DrawPanel extends JPanel {
	
	private ArrayList<Shape> shapeList;
	
	public void addShape(Shape shape)
	{
		shapeList.add(shape);
	}
	
	protected void paintComponent(Graphics graphics)
	{
  
  }
 }
