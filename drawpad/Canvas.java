package drawpad;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.Serializable;

import javax.swing.JPanel;

public class Canvas extends JPanel{
	private String shape="";
	private Line line;
	//instance of the shape objects
	private Triangle triangle;
	private Square square;
	private Circle circle;
	private Rectangle rectangle;
	//used saves the mouse position
	private int mouseX1;
	private int mouseY1;
	private int mouseX2;
	private int mouseY2;
	private int mouseX3;
	private int mouseY3;
	//used to count the amount of times the mouse is used
	private int clike=0;
	//the default colour is black 
	private Color colour=Color.black;
	//an array of shapes
	private ArrayList<Shape> shapes=new ArrayList<Shape>();
	
	public Canvas(String shape){
		this.setShape(shape);
	    addMouseMotionListener(new MouseAdapter(){
	    	//used to keep track of the cursors position
	    	public void mouseMoved(MouseEvent e) {
	    		//used for the dynamically display with the mouse cursor
	    		//line
	    		if(getShape().equals("Line") && clike==1){
		    		mouseX2=e.getX();
	        		mouseY2=e.getY();
	    		}
	    		//Triangle
	    		else if(getShape().equals("Triangle") && clike==1){
		    		mouseX2=e.getX();
	        		mouseY2=e.getY();
	        		mouseX3=e.getX();
	        		mouseY3=e.getY();
	    		}
	    		else if(getShape().equals("Triangle") && clike==2){
	    			mouseX3=e.getX();
	        		mouseY3=e.getY();
	    		}
	    		//Square
	    		else if(getShape().equals("Square") && clike==1){
		    		mouseX2=e.getX();
	        		mouseY2=e.getY();
	    		}
	    		//Circle
	    		else if(getShape().equals("Circle") && clike==1){
		    		mouseX2=e.getX();
	        		mouseY2=e.getY();
	    		}
	    		//Rectangle
	    		else if(getShape().equals("Rectangle") && clike==1){
		    		mouseX2=e.getX();
	        		mouseY2=e.getY();
	    		}
	    		else if(getShape().equals("Rectangle") && clike==2){
		    		mouseX3=e.getX();
	        		mouseY3=e.getY();
	    		}
	    		repaint();
	    	}
	    });
		addMouseListener(new MouseAdapter(){
			//this keeps track of the mouse being pressed, create my objects here and add them to the arraylist
            public void mousePressed(MouseEvent e){
            	//Line
            	if(getShape().equals("Line") && clike==0){
            		mouseX1=e.getX();
            		mouseY1=e.getY();
            		clike++;
            	}
            	//the shape is done so it will be save to shapes and painted
            	else if(getShape().equals("Line") && clike==1){
            		mouseX2=e.getX();
            		mouseY2=e.getY();
            		line=new Line(colour,mouseX1,mouseY1,mouseX2,mouseY2);
            		shapes.add(line);
            		repaint();
            		clike=0;
            	}
            	//the shape is done so it will be save to shapes and painted
            	else if(getShape().equals("Triangle") && clike==0){
            		mouseX1=e.getX();
            		mouseY1=e.getY();
            		clike++;
            		//repaint();
            	}
            	else if(getShape().equals("Triangle") && clike==1){
            		mouseX2=e.getX();
            		mouseY2=e.getY();
            		clike++;
            		//repaint();
            	}
            	//the shape is done so it will be save to shapes and painted
            	else if(getShape().equals("Triangle") && clike==2){
            		mouseX3=e.getX();
            		mouseY3=e.getY();
            		triangle=new Triangle(colour,mouseX1,mouseY1,mouseX2,mouseY2,mouseX3,mouseY3);
            		shapes.add(triangle);
            		clike=0;
            		repaint();
            	}
            	//Square
            	else if(getShape().equals("Square") && clike==0){
            		mouseX1=e.getX();
            		mouseY1=e.getY();
            		clike++;
            	}
            	//the shape is done so it will be save to shapes and painted
            	else if(getShape().equals("Square") && clike==1){
            		mouseX2=e.getX();
            		mouseY2=e.getY();
            		square=new Square(colour,mouseX1,mouseY1,mouseX2,mouseY2);
            		shapes.add(square);
            		repaint();
            		clike=0;
            	}
            	//Circle
            	else if(getShape().equals("Circle") && clike==0){
            		mouseX1=e.getX();
            		mouseY1=e.getY();
            		clike++;
            	}
            	//the shape is done so it will be save to shapes and painted
            	else if(getShape().equals("Circle") && clike==1){
            		mouseX2=e.getX();
            		mouseY2=e.getY();
            		circle=new Circle(colour,mouseX1,mouseY1,mouseX2,mouseY2);
            		shapes.add(circle);
            		repaint();
            		clike=0;
            	}
            	//Rectangle
            	else if(getShape().equals("Rectangle") && clike==0){
            		mouseX1=e.getX();
            		mouseY1=e.getY();
            		clike++;
            	}
            	else if(getShape().equals("Rectangle") && clike==1){
            		mouseX2=e.getX();
            		mouseY2=e.getY();
            		clike++;
            	}
            	//the shape is done so it will be save to shapes and painted
            	else if(getShape().equals("Rectangle") && clike==2){
            		mouseX3=e.getX();
            		mouseY3=e.getY();
            		rectangle=new Rectangle(colour,mouseX1,mouseY1,mouseX2,mouseY2,mouseX3,mouseY3);
            		shapes.add(rectangle);
            		repaint();
            		clike=0;
            	}
            }
            
        });
	}
	//paints my shapes to the screen
	public void paint(Graphics g){
		super.paint(g);
		//Line
		if(getShape().equals("Line") && clike==1){
			line=new Line(colour,mouseX1,mouseY1,mouseX2,mouseY2);
			line.draw(g);
		}
		//Triangle
		else if(getShape().equals("Triangle")&& clike>0){
			triangle=new Triangle(colour,mouseX1,mouseY1,mouseX2,mouseY2,mouseX3,mouseY3);
			triangle.draw(g);
		}
		//Square
		else if(getShape().equals("Square") && clike==1){
			square=new Square(colour,mouseX1,mouseY1,mouseX2,mouseY2);
			square.draw(g);
		}
		//Circle
		else if(getShape().equals("Circle") && clike==1){
			circle=new Circle(colour,mouseX1,mouseY1,mouseX2,mouseY2);
			circle.draw(g);
		}
		//Rectangle
		else if(getShape().equals("Rectangle") && clike>0){
			rectangle=new Rectangle(colour,mouseX1,mouseY1,mouseX2,mouseY2,mouseX3,mouseY3);
			rectangle.draw(g);
		}
		//go through the array to put the objects on the screeen
		for(Shape s:shapes)
			s.draw(g);
	}
	public String getShape() {
		return shape;
	}
	//used to change what shape to use
	public void setShape(String shape) {
		clike=0;
		this.shape = shape;
	}
	//clears all the shapes on screen by clearing the arraylist
	public void reset(){
		clike=0;
		shapes.clear();
		repaint();
	}
	//Removes the last element of the array which clears the last drawing
	public void undo(){
		if(shapes.size()>0)
			shapes.remove(shapes.size()-1);
		repaint();
	}
	//saves all the objects on a text file
	public void save(){
		try{
			FileOutputStream fout = new FileOutputStream("sava.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(shapes);
			oos.close();
        } 
        catch (IOException e) {
			e.printStackTrace();
		}
		repaint();
	}
	//Loads all the objects from a text file save.txt
	public void load(){
		try{
			FileInputStream fin = new FileInputStream("sava.txt");
			ObjectInputStream ois = new ObjectInputStream(fin);
			shapes = (ArrayList<Shape>) ois.readObject();
			ois.close();

		   }catch(Exception e){
			   e.printStackTrace();
		   }
		repaint();
	}
	//used to change the colour of the shapes
	public void setColour(int x){
		if(x==1)
			colour=Color.red;
		else if(x==2)
			colour=Color.blue;
		else if(x==3)
			colour=Color.yellow;
		else if(x==4)
			colour=Color.green;
		else if(x==5)
			colour=Color.pink;
		else if(x==6)
			colour=Color.orange;
		else if(x==7)
			colour=Color.gray;
		else if(x==8)
			colour=Color.darkGray;
		else if(x==9)
			colour=Color.lightGray;
		else if(x==10)
			colour=Color.cyan;
		else if(x==11)
			colour=Color.white;
		else if(x==12)
			colour=Color.black;
		repaint();
	}
}
