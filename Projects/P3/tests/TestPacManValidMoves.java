import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		PacMan pacman = frame.addPacMan(new Location(2, 2));

		assert(pacman.is_pacman_in_range() == false);
	}
}
