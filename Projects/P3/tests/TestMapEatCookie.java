import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie {
	
	public void testMapEatCookie() {
		NoFrame frame = new NoFrame();

		// Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 0));

		// Start The Game
		frame.startGame();

		if ((frame.getMap().getLoc(new Location(1, 0))).contains(Map.Type.COOKIE)) {
			assertTrue(frame.getMap().eatCookie("pacman") != null);
		} else {
			assertTrue(frame.getMap().eatCookie("pacman") == null);
		}
	}
}
