package drawpad;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Line {
	private int x3;
	private int y3;
	public Triangle(Color c,int x1, int y1,int x2, int y2,int x3, int y3){
		super(c,x1,y1,x2,y2);
		this.x3=x3; 
		this.y3=y3;
	}
	//drawing out a triangle
	public void draw(Graphics g){
		g.setColor(colour);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x1, y1, x3, y3);
	}

}
