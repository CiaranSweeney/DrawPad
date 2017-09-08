package drawpad;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public Circle(Color c,int x1, int y1,int x2, int y2){
		super(c);
		this.x1=x1; 
		this.y1=y1; 
		this.x2=x2; 
		this.y2=y2;
	}
	//draws out circle
	public void draw(Graphics g){
		g.setColor(colour);
		g.drawOval(x1-(distance()/2),y1-(distance()/2),distance(),distance());
	}
	//distance formula
	public int distance(){
		double x= Math.pow(x1-x2,2);
		double y= Math.pow(y1-y2,2);
		double distance=Math.sqrt(x+y);
		distance=Math.round(distance);
		return (int)distance;
	}
}
