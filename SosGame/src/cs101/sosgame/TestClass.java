package cs101.sosgame;
import java.awt.BorderLayout;

import javax.swing.*;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dim = Integer.parseInt(JOptionPane.showInputDialog("Choose dimension"));;
		JFrame f = new JFrame();
		f.setSize(100 * ( dim + 2 ), 100 *( dim + 2 ));
		f.setLayout( new BorderLayout() );
		SOS s  = new SOS( dim );
		SOSCanvas sc = new SOSCanvas( s );
		SOSGUIPanel gui = new SOSGUIPanel( sc, s );
		
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		f.add(sc, BorderLayout.CENTER);
		f.add(gui, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
