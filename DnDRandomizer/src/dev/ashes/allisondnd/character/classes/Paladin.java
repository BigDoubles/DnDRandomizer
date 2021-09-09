package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Paladin extends DndClass implements IClasses {

	public Paladin() {
		addBackground(Backgrounds.Acolyte, 2);
		addBackground(Backgrounds.AcolyteBG, 4);
		addBackground(Backgrounds.Faceless, 5);
		addBackground(Backgrounds.GuildArt, 7);
		addBackground(Backgrounds.GuildArtBG, 9);
		addBackground(Backgrounds.GuildMerch, 11);
		addBackground(Backgrounds.Hermit, 13);
		addBackground(Backgrounds.HermitBG, 15);
		addBackground(Backgrounds.Knight, 16);
		addBackground(Backgrounds.Noble, 17);
		addBackground(Backgrounds.NobleBG, 18);
		addBackground(Backgrounds.Outlander, 19);
		addBackground(Backgrounds.OutlanderBG, 20);
		addBackground(Backgrounds.Pirate, 21);
		addBackground(Backgrounds.Sailor, 22);
		addBackground(Backgrounds.SailorBG, 23);
		addBackground(Backgrounds.Soldier, 25);
		addBackground(Backgrounds.SoldierBG, 27);
		addBackground(Backgrounds.Haunted, 29);
	}
	@Override
	public String toString() {
		return "Paladin";
	}
	
	static enum subclasses{
		Devotion("Oath of Devotion"),
		Ancients("Oath of the Ancients"),
		Vengeance("Oath of Vengeance");

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
