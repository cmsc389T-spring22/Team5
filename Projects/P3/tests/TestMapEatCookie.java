import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase{
	
	public void testMapEatCookie() {
		NoFrame nf = new NoFrame();

		Map m = nf.getMap();

		Location loc = new Location(1, 1);

		assertFalse(m.getLoc(loc).contains(Map.Type.COOKIE));

		PacMan pc = nf.addPacMan(loc);
		m.eatCookie(pc.myName);

		assertFalse(m.getLoc(loc).contains(Map.Type.COOKIE));
	}
}
