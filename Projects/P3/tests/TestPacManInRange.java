import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		Ghost ghost = frame.addGhost(new Location(4, 7), "Blinky", Color.red);

		assert(ghost.get_valid_moves() == "{(2,3), (3,2)}");
	}
}
