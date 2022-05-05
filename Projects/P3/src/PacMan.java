import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 


	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> loc = new ArrayList<Location>();

		Location loc_up = myLoc.shift(1, 0);
		Location loc_down = myLoc.shift(-1, 0);
		Location loc_right = myLoc.shift(0, 1);
		Location loc_left = myLoc.shift(0, -1);

		HashSet<Map.Type> hash1 = myMap.getLoc(loc_up);
		HashSet<Map.Type> hash2 = myMap.getLoc(loc_down);
		HashSet<Map.Type> hash3 = myMap.getLoc(loc_right);
		HashSet<Map.Type> hash4 = myMap.getLoc(loc_left);

		if (!hash1.contains(Map.Type.WALL)) {
			loc.add(loc_up);
		}

		if (!hash2.contains(Map.Type.WALL)) {
			loc.add(loc_down);
		}

		if (!hash3.contains(Map.Type.WALL)) {
			loc.add(loc_right);
		}

		if (!hash4.contains(Map.Type.WALL)) {
			loc.add(loc_left);
		}

		return loc;	
	}

	public boolean move() {
		ArrayList<Location> loc = new ArrayList<Location>();
		loc = this.get_valid_moves();
		if(loc.isEmpty()){
			return false;
		}

		return true;

	}
	
	public boolean is_ghost_in_range() { 
		Location loc_up = myLoc.shift(1, 0);
		Location loc_down = myLoc.shift(-1, 0);
		Location loc_right = myLoc.shift(0, 1);
		Location loc_left = myLoc.shift(0, -1);

		HashSet<Map.Type> hash1 = myMap.getLoc(loc_up);
		HashSet<Map.Type> hash2 = myMap.getLoc(loc_down);
		HashSet<Map.Type> hash3 = myMap.getLoc(loc_right);
		HashSet<Map.Type> hash4 = myMap.getLoc(loc_left);
        if (hash1.contains(Map.Type.GHOST) || hash2.contains(Map.Type.GHOST) || hash3.contains(Map.Type.GHOST) || hash4.contains(Map.Type.GHOST)) {
			return true;
		}

		return false;
	}

	public JComponent consume() { 
		return myMap.eatCookie("pacman");
	}
}
