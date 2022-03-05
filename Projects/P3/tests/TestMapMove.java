import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove {

	public void testMapMove() {
		Map map = frame.Map(30);

		assert(map.move("pacman", new Location (23,1), Map.Type.PACMAN) == true);
	}
}
