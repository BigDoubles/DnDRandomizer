package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Bard extends DndClass implements IClasses {

	public Bard() {
		int x = 2;
		for(Backgrounds bg : Backgrounds.values()) {
			addBackground(bg, x);
			x += 2;
		}
	}
	
	@Override
	public String toString() {
		return "Bard";
	}
	
	static enum subclasses{
		CollegeofLore("College of Lore"),
		CollegeofValor("College of Valor");

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
