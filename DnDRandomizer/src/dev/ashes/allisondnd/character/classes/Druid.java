package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.IClasses;

public class Druid implements IClasses {

	@Override
	public String toString() {
		return "Druid";
	}
	
	enum subclasses{
		Land("Circle of the Land"),
		Moon("Circle of the Moon");

		private String title;
		
		private subclasses(String s) {
			title = s;
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
