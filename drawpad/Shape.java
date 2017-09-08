package drawpad;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

import javax.swing.JPanel;
public abstract class Shape extends JPanel implements Serializable{
	//sends the colour to the other shapes
	protected Color colour;
	public Shape(Color c){
		colour=c;
	}
	public void draw(Graphics g){
	}
	public void draw(Graphics g, Color c){
	}
	
}
