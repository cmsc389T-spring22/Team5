import junit.framework.*;
import java.util.HashSet;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc extends TestCase{
	
	public void testMapGetLoc() {
		try{
			NoFrame frame = new NoFrame();
			Ghost inky = frame.addGhost(new Location(2,2), "Inky", Color.red);
			HashSet<Map.Type> set = frame.getMap().getLoc(new Location(2,2));
			assertTrue(set.contains(Map.Type.COOKIE));
		} catch (FileNotFoundException e){
			System.out.println(e);
			return;
		}

	}
}
