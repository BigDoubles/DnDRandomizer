package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Ranger extends DndClass implements IClasses {

	public Ranger() {
		addBackground(Backgrounds.Acolyte, 1);
		addBackground(Backgrounds.AcolyteBG, 2);
		addBackground(Backgrounds.Criminal, 3);
		addBackground(Backgrounds.CriminalBG, 4);
		addBackground(Backgrounds.FolkH, 6);
		addBackground(Backgrounds.FolkHBG, 8);
		addBackground(Backgrounds.GuildArt, 9);
		addBackground(Backgrounds.GuildArtBG, 10);
		addBackground(Backgrounds.GuildMerch, 11);
		addBackground(Backgrounds.Outlander, 13);
		addBackground(Backgrounds.OutlanderBG, 15);
		addBackground(Backgrounds.Pirate, 17);
		addBackground(Backgrounds.Sailor, 19);
		addBackground(Backgrounds.SailorBG, 21);
		addBackground(Backgrounds.Soldier, 22);
		addBackground(Backgrounds.SoldierBG, 23);
		addBackground(Backgrounds.Spy, 24);
		addBackground(Backgrounds.Urchin, 25);
		addBackground(Backgrounds.UrchinBG, 26);
		addBackground(Backgrounds.VolstruckerAgent, 27);
	}
	
	@Override
	public String toString() {
		return "Ranger";
	}
	
	static enum subclasses{
		BeastMaster("Beast Master"),
		Hunter("Hunter");

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
