import junit.framework.*;
import java.awt.Color;
import org.junit.Test;
import java.io.*;


public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = null;

		try {
			frame = new NoFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Ghost ghost = frame.addGhost(new Location(0, 1), "blue", Color.blue);
		ghost.move();
		assertFalse(new Location(0,1) == ghost.myLoc); 
		
	}
}
