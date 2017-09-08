package drawpad;

import java.awt.*;

public class Line extends Shape {
	protected int x1;
	protected int y1;
	protected int x2;
	protected int y2;
	public Line(Color c,int x1, int y1,int x2, int y2){
		super(c);
		this.x1=x1; 
		this.y1=y1; 
		this.x2=x2; 
		this.y2=y2;
	}
	public void draw(Graphics g){
		g.setColor(colour);
		g.drawLine(x1, y1, x2, y2);
	}
	
}
