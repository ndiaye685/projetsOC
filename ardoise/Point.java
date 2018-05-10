import java.awt.Color;

public class Point {
	private Color color = Color.RED ;
	private int size = 10;
	private int x = -10;
	private int y = -10;
	private String type = "ROND";

	public Point() {}
	public Point(int x, int y, int size, Color color, String type) {
		this.color = color;
		this.size = size;
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public Color getColor() {
		return this.color;
	}
	public int getSize() {
		return this.size;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public String getType() {
		return this.type;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setType(String type) {
		this.type = type;
	}
}