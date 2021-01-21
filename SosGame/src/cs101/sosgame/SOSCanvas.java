package cs101.sosgame;

import java.util.*;
import cs101.sosgame.SOS;
import javax.swing.*;
import java.awt.*;


public class SOSCanvas extends JComponent {

	// properties
	SOS game;
	int dim;
	ArrayList<MyRectangle> rec = new ArrayList<MyRectangle>();
	ArrayList<JLabel> lab = new ArrayList<JLabel>();
	//constansts
	final int heigth = 100;
	final int width = 100;
	final int XY = 100;
	// constructors
	
	public SOSCanvas(SOS sos) {
		// TODO Auto-generated constructor stub
		game = sos;
		dim = game.getDimension();
		// click = new Click();
		// addMouseListener(click);
	}

	/**
	 * overriding the paintComponent method
	 * 
	 * @param Graphics g creates a grid with the dimension in the constructor
	 */
	public void paintComponent(Graphics g) {

		// drawing rectangles
		for ( int j = 0; j < dim; j++ ) {
			for ( int i = 0; i < dim; i++ ) {
				MyRectangle r = new MyRectangle( i * width + XY, j * heigth + XY, width, heigth ); // storing the grid
																									// size in rectangle
																									// to use its
																									// contains method
				r.setRow( j + 1 );
				r.setColumn( i + 1 );
				rec.add( r ); // storing the rectangles in ArrayList to use their location
				g.drawRect( i * width + XY, j * heigth + XY, width, heigth ); // drawing grids
				JLabel dot = new JLabel( "." ); // adding labels in the grids
				dot.setBounds( i * width + 150, j * heigth + 100, width, heigth ); // assigniing the position of the dots
				add( dot ); // adding into the panel
				lab.add( dot ); // storing the labels in ArrayList to change their text later
			}
		}

	}

	/**
	 * using this method to access the rectangles in the SOSGUIPanel
	 * 
	 * @return rectangles ArrayList
	 */
	public ArrayList<MyRectangle> getRecs() {
		return rec;
	}

	/**
	 * using this method to access the labels in the SOSGUIPanel
	 * 
	 * @return labels ArrayList
	 */
	public ArrayList<JLabel> getLabels() {
		return lab;
	}

}
