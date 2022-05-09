import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		try{
			NoFrame frame = new NoFrame();
			Ghost inky = frame.addGhost(new Location(2,2), "Inky", Color.red);
			PacMan pacman = frame.addPacMan(new Location(2, 3));
			assertTrue(pacman.is_ghost_in_range());
		} catch (FileNotFoundException e){
			System.out.println(e);
			return;
		}
	}
}

