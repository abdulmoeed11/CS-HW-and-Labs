package cs101.sosgame;
import cs101.sosgame.SOS;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SOS x = new SOS(5);
		
		x.printBoard();
		x.getCellContents(3,3);
		System.out.println(x.getPlayerScore1());
		x.play('s',3,4);
		x.printBoard();
	}
}
