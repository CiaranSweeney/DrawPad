package drawpad;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Line {
	public Square(Color c,int x1, int y1,int x2, int y2){
		super(c,x1,x1,x2,y2);
	}
	//Draws a square
	public void draw(Graphics g){
		g.setColor(colour);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x1, y1-distance(), x2, y2-distance());
		g.drawLine(x1, y1-distance(), x1, y1);
		g.drawLine(x2, y2, x2, y2-distance());
	}
	//The distance formula 
	public int distance(){
		double x= Math.pow(x1-x2,2);
		double y= Math.pow(y1-y2,2);
		double distance=Math.sqrt(x+y);
		distance=Math.round(distance);
		return (int)distance;
	}
}
