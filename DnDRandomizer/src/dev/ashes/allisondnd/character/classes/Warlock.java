package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Warlock extends DndClass implements IClasses {

	public Warlock() {
		addBackground(Backgrounds.Acolyte, 1);
		addBackground(Backgrounds.AcolyteBG, 2);
		addBackground(Backgrounds.Charlatan, 3);
		addBackground(Backgrounds.CharlatanBG, 4);
		addBackground(Backgrounds.Criminal, 5);
		addBackground(Backgrounds.CriminalBG, 6);
		addBackground(Backgrounds.Faceless, 8);
		addBackground(Backgrounds.Grinner, 9);
		addBackground(Backgrounds.Hermit, 11);
		addBackground(Backgrounds.HermitBG, 13);
		addBackground(Backgrounds.Knight, 14);
		addBackground(Backgrounds.Noble, 15);
		addBackground(Backgrounds.NobleBG, 16);
		addBackground(Backgrounds.Sage, 18);
		addBackground(Backgrounds.SageBG, 20);
		addBackground(Backgrounds.Soldier, 21);
		addBackground(Backgrounds.SoldierBG, 22);
		addBackground(Backgrounds.Spy, 23);
		addBackground(Backgrounds.VolstruckerAgent, 24);
		addBackground(Backgrounds.Haunted, 26);
	}
	
	@Override
	public String toString() {
		return "Warlock";
	}

	static enum subclasses{
		C1("The Archfey"),
		G1("The Fiend"),
		S1("The Great Old One");

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
