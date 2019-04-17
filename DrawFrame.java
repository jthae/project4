import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 * Simple class to draw frame for output. Main entry point of the program.
 * 
 * @author jayciethaemert
 *
 */
public class DrawFrame extends JFrame {
	
	private static DrawPanel drawPanel;
	private static final int SIZE = 700;
	
	public DrawFrame(String title)
	{
		JFrame frame = new JFrame(title);
		drawPanel = new DrawPanel();
	}
	
	public static void main(String[] args)
	{
  
	}
	
}
