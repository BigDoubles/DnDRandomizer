package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Rogue extends DndClass implements IClasses {

	public Rogue() {
		addBackground(Backgrounds.Acolyte, 1);
		addBackground(Backgrounds.AcolyteBG, 2);
		addBackground(Backgrounds.Charlatan, 4);
		addBackground(Backgrounds.CharlatanBG, 6);
		addBackground(Backgrounds.Criminal, 8);
		addBackground(Backgrounds.CriminalBG, 10);
		addBackground(Backgrounds.Entertainer, 12);
		addBackground(Backgrounds.EntertainerBG, 14);
		addBackground(Backgrounds.Faceless, 16);
		addBackground(Backgrounds.Grinner, 18);
		addBackground(Backgrounds.GuildArt, 20);
		addBackground(Backgrounds.GuildArtBG, 22);
		addBackground(Backgrounds.GuildMerch, 24);
		addBackground(Backgrounds.Knight, 25);
		addBackground(Backgrounds.Noble, 26);
		addBackground(Backgrounds.NobleBG, 27);
		addBackground(Backgrounds.Outlander, 28);
		addBackground(Backgrounds.OutlanderBG, 29);
		addBackground(Backgrounds.Pirate, 31);
		addBackground(Backgrounds.Sailor, 33);
		addBackground(Backgrounds.SailorBG, 35);
		addBackground(Backgrounds.Soldier, 37);
		addBackground(Backgrounds.SoldierBG, 39);
		addBackground(Backgrounds.Spy, 41);
		addBackground(Backgrounds.Urchin, 43);
		addBackground(Backgrounds.UrchinBG, 45);
		addBackground(Backgrounds.VolstruckerAgent, 47);
	}
	
	@Override
	public String toString() {
		return "Rogue";
	}
	
	static enum subclasses{
		C1("Arcane Trickster"),
		G1("Assassin"),
		S8("Thief");


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
