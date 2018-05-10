import java.util.ArrayList;
import javax.swing.JPanel; 	
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
import java.awt.Color;

public class Panel extends JPanel {
	private Color pointerColor = Color.RED;
	private String pointerType = "ROND";
	private int posX = -10;
	private int oldX = -10;
	private int posY = -10;
	private int oldY = -10;
	private boolean erasing = true;
	private int pointerSize = 15;
	private ArrayList<Point> points = new ArrayList<Point>();

	public Panel() {
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				points.add(new Point(event.getX() - pointerSize / 2, event.getY() - pointerSize / 2, pointerSize, pointerColor, pointerType));
				repaint();
			}
		});
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent event) {}
			public void mouseDragged(MouseEvent event) {
				points.add(new Point(event.getX() - pointerSize / 2, event.getY() - pointerSize / 2, pointerSize, pointerColor, pointerType));
			}
		});
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		if(this.erasing) {
			this.erasing = false;
		} 
		else { 
			for(Point p : points) {
				g.setColor(p.getColor());

				if(p.getType().equals("CARRÉ")) {
					g.fillRect(p.getX(), p.getY(), p.getSize(), p.getSize());
				}
				else {
					g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
				}
			}

		}
	}
	public void erase() {
		this.erasing = true;
		this.points = new ArrayList<Point>();
		this.repaint();
	}

	public void setPointerColor(Color pointerColor) {
		this.pointerColor = pointerColor;
	}
	public void setPointerType(String pointerType) {
		this.pointerType = pointerType;
	}
}