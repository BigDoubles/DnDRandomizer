package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.IClasses;

public class Cleric implements IClasses {

	@Override
	public String toString() {
		return "Cleric";
	}
	
	enum subclasses{
		Knowledge("Knowledge"),
		Life("Life"),
		Light("Light"),
		Nature("Nature"),
		Tempest("Tempest"),
		Trickery("Trickery"),
		War("War");

		private String title;
		
		private subclasses(String s) {
			title = "Domain of " + s;
		}
		
		public String toString() {
			return title;
		}
	}

	@Override
	public List<String> getSubClasses() {
		List<String> subs = new ArrayList<String>();
		for(subclasses s : subclasses.values()) {
			subs.add(s.toString());
		}
		return subs;
	}

	
}
