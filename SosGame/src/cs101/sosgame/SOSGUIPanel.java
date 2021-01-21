package cs101.sosgame;

import cs101.sosgame.SOS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SOSGUIPanel extends JPanel {

	// properties
	SOS sgame;
	SOSCanvas panel;
	JRadioButton butt1;
	JRadioButton butt2;
	JLabel p1;
	JLabel p2;
	String pp1;
	String pp2;
	int dimen;
	MouseListener click;
	ButtonGroup buttongroup;

	// constructor
	/**
	 * Takes input of names
	 * intializes JLabels, MouseListener, JRadioButtons
	 * sets Background of labels the turns
	 * adds RadioButtons
	 * @param can
	 * @param g
	 */
	public SOSGUIPanel(SOSCanvas can, SOS g) {
		sgame = g;
		panel = can;
		click = new Click();
		dimen = g.getDimension();
		//dimen = Integer.parseInt(JOptionPane.showInputDialog("Choose dimension"));
		pp1 = JOptionPane.showInputDialog( "Player 1 Name" );
		pp2 = JOptionPane.showInputDialog( "Player 2 Name" );
		buttongroup = new ButtonGroup();
		p1 = new JLabel();
		p1.setText( pp1 + ":" + sgame.getPlayerScore1() + "   " );
		p1.setOpaque(true);
		p1.setBackground(Color.green);
		butt1 = new JRadioButton( "s" );
		butt2 = new JRadioButton( "o" );
		buttongroup.add( butt1 ); // adding the radio buttons to the group
		buttongroup.add( butt2 );
		add(p1);
		add(butt1);
		p2 = new JLabel();
		p2.setText( "   " + pp2 + ":" + sgame.getPlayerScore2() );
		p2.setOpaque(true);
		p2.setBackground( Color.white );
		add( butt2 );
		add( p2 );
		panel.addMouseListener( click );
	}

	/**
	 * generating a method to get the value of Radio Button
	 * 
	 * @return 's' or 'o'
	 */
	public String GetRadioButton() {
		if ( butt1.isSelected() ) {
			return butt1.getText();
		}
		if ( butt2.isSelected() ) {
			return butt2.getText();
		}
		return null;
	}
	
	/**
	 * Allows access to dimension
	 * @returns dimen
	 *
	 */
	public int getDimen() {
		return dimen;
	}
	
	// Inner Class

	public class Click implements MouseListener {
		/**
		 * @param Mouseevent 
		 * Does almost everything
		 */
		public void mousePressed(MouseEvent e) {

			if ( GetRadioButton() != null ) // only carries out the action if the button isn't null
			{
				for ( int i = 0; i < dimen * dimen; i++ ) // running the loop through all the buttons
				{
					if ( panel.getRecs().get(i).contains(e.getX(), e.getY( ) ) ) // checking if the rectangles(buttons
																				// contains the x,y
					{
						if ( panel.getLabels().get(i).getText().equals(".") ) // only changes the dots
						{
							panel.getLabels().get(i).setText( GetRadioButton() ); // sets the button to radio button char
							sgame.play( GetRadioButton().charAt(0), panel.getRecs().get(i).getRow(),
									panel.getRecs().get(i).getColumn() ); // plays
							buttongroup.clearSelection();
							// for changing the colors of the labels
							if ( sgame.getTurn() == 1 ) {
								p2.setBackground( Color.white );
								p1.setBackground( Color.green );
							} else {
								p1.setBackground( Color.white );
								p2.setBackground( Color.green );
							}
							p1.setText(pp1 + ":" + sgame.getPlayerScore1() + "   "); // updates the labels
							p2.setText("   " + pp2 + ":" + sgame.getPlayerScore2());
							if (sgame.isGameOver()) // displays results if game is over
							{
								String winner;
								if (sgame.getPlayerScore1() > sgame.getPlayerScore2()) {
									winner = pp1 + " Won!";
								} else if (sgame.getPlayerScore1() < sgame.getPlayerScore2()) {
									winner = pp2 + " Won!";
								} else {
									winner = "It is a draw";
								}
								JOptionPane.showMessageDialog(null, winner + "\n Press Okay to exit.");
								System.exit( 0 );
							}
						}
					}
				}
			}
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}
	}
}
