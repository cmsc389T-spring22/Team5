import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
		NoFrame nf = new NoFrame();

		PacMan pacman = nf.addPacMan(new Location(1, 1));

		Ghost blinky = nf.addGhost(new Location(1, 2), "Blinky", Color.red);
		Ghost clyde = nf.addGhost(new Location(1, 3), "Clyde", Color.orange);

		assertTrue(blinky.attack());
		assertTrue(clyde.attack());

	}
}
