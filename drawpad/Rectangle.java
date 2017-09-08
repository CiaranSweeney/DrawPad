package drawpad;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Line {
	private int x3;
	private int y3;
	public Rectangle(Color c,int x1, int y1,int x2, int y2,int x3,int y3){
		super(c,x1,y1,x2,x2);
		this.x3=x3; 
		this.y3=y3;
	}
	//drawing out a rectangle
	public void draw(Graphics g){
		g.setColor(colour);
		g.drawLine(x1, y1, x1, y2);
		g.drawLine(x1, y1, x3, y1);
		g.drawLine(x1, y2, x3, y2);
		g.drawLine(x3, y1, x3, y2);
	}
}
