import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		try{
			NoFrame frame = new NoFrame();
			Ghost inky = frame.addGhost(new Location(2,2), "Inky", Color.red);
			// This method will always return false since the get valid moves was never completed
			assertFalse(inky.move());
		} catch (FileNotFoundException e){
			System.out.println(e);
			return;
		}
	}
	}
