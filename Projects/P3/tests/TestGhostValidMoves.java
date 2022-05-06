import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();

		Ghost ghost = frame.addGhost(new Location(9,11),"test",Color.blue);
		frame.startGame();

		ArrayList<Location> moves = ghost.get_valid_moves();
		System.out.println(moves);

		assertTrue(moves.contains(new Location(9,12)));
		assertTrue(moves.contains(new Location(10,11)));
		assertFalse(moves.contains(new Location(10,12)));
	}
}
