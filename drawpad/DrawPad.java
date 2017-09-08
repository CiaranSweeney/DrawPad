package drawpad;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DrawPad extends JFrame{
	private Canvas canvas;
	public DrawPad(){
		//making out the layout of the window
		super(" JAVA Application!");
		setLocation(300,200);
		setSize(800,500);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setContentPane(createPad());
		setVisible(true);
	}
	//the layout which contains all the button,menu bar and listeners
	private Container createPad(){
		//setting up the layout
		Container pane = new JPanel(new BorderLayout());
		canvas = new Canvas("");
		pane.add(canvas, BorderLayout.NORTH);
		//the buttons and listeners for the shapes
		//line
		JMenuBar bar = new JMenuBar(); 
		JButton line = new JButton ("Line");
		line.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {;
	        	canvas.setShape("Line"); 
	            }
        });
		//circle
		JButton circle = new JButton ("Circle");
		circle.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {;
	        	canvas.setShape("Circle"); 
	            }
        });
		//triangle
		JButton triangle = new JButton ("Triangle");
		triangle.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {;
	        	canvas.setShape("Triangle"); 
	            }
        });
		//square
		JButton square = new JButton ("Square");
		square.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {;
	        	canvas.setShape("Square"); 
	            }
        });
		//rectangle
		JButton rectangle = new JButton ("Rectangle");
		rectangle.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {;
	        	canvas.setShape("Rectangle"); 
	            }
        });
		//setting up the drop down menu for colours and the listeners
		JMenu colour = new JMenu ("Colour");
		JMenuItem red=new JMenuItem("Red");
		red.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(1);
		        }
	     });
		JMenuItem blue=new JMenuItem("Blue");
		blue.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(2);
		        }
	     });
		JMenuItem yellow=new JMenuItem("Yellow");
		yellow.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(3);
		        }
	     });
		JMenuItem green=new JMenuItem("Green");
		green.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(4);
		        }
	     });
		JMenuItem pink=new JMenuItem("Pink");
		pink.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(5);
		        }
	     });
		JMenuItem orange=new JMenuItem("Orange");
		orange.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(6);
		        }
	     });
		JMenuItem gray=new JMenuItem("Gray");
		gray.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(7);
		        }
	     });
		JMenuItem darkGray=new JMenuItem("Dark Gray");
		darkGray.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(8);
		        }
	     });
		JMenuItem lightGray=new JMenuItem("Light Gray");
		lightGray.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(9);
		        }
	     });
		JMenuItem cyan=new JMenuItem("Cyan");
		cyan.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(10);
		        }
	     });
		JMenuItem white=new JMenuItem("White");
		white.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(11);
		        }
	     });
		JMenuItem black=new JMenuItem("Black");
		black.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.setColour(12);
		        }
	     });
		colour.add(red);
		colour.add(blue);
		colour.add(yellow);
		colour.add(green);
		colour.add(pink);
		colour.add(orange);
		colour.add(gray);
		colour.add(darkGray);
		colour.add(lightGray);
		colour.add(cyan);
		colour.add(white);
		colour.add(black);
		// buttons and event listeners
		JButton undo = new JButton ("Undo");
		undo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.undo();
		        }
	     });
		JButton reset = new JButton ("Reset");
		reset.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.reset();
		        }
	     });
		JButton save = new JButton ("Save");
		save.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.save();
		        }
	     });
		JButton load = new JButton ("Load");
		load.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {;
		        canvas.load();
		        }
	     });
		bar.add(line);
		bar.add(circle);
		bar.add(triangle);
		bar.add(square);
		bar.add(rectangle);
		bar.add(colour);
		bar.add(undo);
		bar.add(reset);
		bar.add(save);
		bar.add(load);
		pane.add(bar,BorderLayout.PAGE_START);
		canvas.setBackground(Color.white);
		pane.add(canvas,BorderLayout.CENTER);
		return pane;
	}
	//main method
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new DrawPad();
			}
		});
	}
}
